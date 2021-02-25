package domain.conta;
import enumerators.InstituicaoBancaria;
import exception.InstituicaoBancariaException;
import exception.SaldoInsuficienteException;
import exception.ValorMinimoException;
import interfaces.ContaBancaria;

import java.text.DecimalFormat;
import java.time.LocalDate;

/* Conta digital extendendo Conta que uma classe abstrata
 * Não pode ser instanciada no main e classe Conta foi usada
 * para implementar interface ContaBancaria.
 */
public class ContaDigital extends Conta{
    public ContaDigital(String donoConta,
                        InstituicaoBancaria instituicaoBancaria,
                        Integer numeroContaCorrente) throws InstituicaoBancariaException {
        super(donoConta, instituicaoBancaria, numeroContaCorrente);
        validacaoInstituicaoBancaria(instituicaoBancaria);
    }
    /* somente Itaú e Nubank aceitam conta digital
     * a validação abaixo faz a comparação e lança
     *  uma exceção caso necessário.
     */
    private void validacaoInstituicaoBancaria(InstituicaoBancaria instituicaoBancaria) throws InstituicaoBancariaException {
        if (instituicaoBancaria==InstituicaoBancaria.NUBANK ||
                instituicaoBancaria == InstituicaoBancaria.ITAU) {
            this.setInstituicaoBancaria(instituicaoBancaria);
        }else{
            throw new InstituicaoBancariaException("Somente Itaú e Nubank aceitam contas digitais.");
        }
    }

    @Override
    public Double consultarSaldo() {
        return this.getSaldo();
    }

    @Override
    public void depositar(Double valor) {
     super.depositar(valor);


        this.setSaldo(this.getSaldo()+valor);

        System.out.println("Depositando valor R$ "+
                DecimalFormat.getCurrencyInstance().format(valor) +
                " na Conta Digital " +
                this.getInstituicaoBancaria().getDescricao()+ " Número: " +
                this.getNumeroContaCorrente());

    }


    @Override
    public void sacar(Double valor) throws SaldoInsuficienteException, ValorMinimoException {
     super.sacar(valor);
        if( valor >= 10.00 && valor <= this.getSaldo()){

            this.setSaldo(this.getSaldo()-valor);


            System.out.println("Sacando valor R$ "+
                    DecimalFormat.getCurrencyInstance().format(valor)+
                    " na Conta Digital " +
                    this.getInstituicaoBancaria().getDescricao()+ " Número: " +
                    this.getNumeroContaCorrente());
        }else{
            throw new SaldoInsuficienteException("Saldo insuficiente ou valor mínimo não atingido.");
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) throws SaldoInsuficienteException {
        // super para trasferir e adicionar a lista transacaos.
        super.transferir(valor, contaDestino);
        if(this.getSaldo()>= valor){

            System.out.println("Transferindo valor R$ "+
                    DecimalFormat.getCurrencyInstance().format(valor)+
                    " na Conta Digital " +
                    this.getInstituicaoBancaria().getDescricao()+ " Número: " +
                    this.getNumeroContaCorrente());

            this.setSaldo(this.getSaldo()- valor);
        }else{
            throw  new SaldoInsuficienteException("Saldo insuficiente para transferir.");
        }

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        System.out.println("----- EXTRATO CONTA DIGITAL "+
                this.getInstituicaoBancaria() +" "+ this.getNumeroContaCorrente());
        super.exibirExtrato(inicio, fim);
        System.out.println("-----");

    }
    @Override
    public String toString() {

        System.out.println("---Conta Digital--- ");
      return   super.toString();



    }

}
