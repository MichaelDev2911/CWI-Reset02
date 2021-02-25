package domain.conta;

import br.com.reset.banco.da.desgraca.Data;
import domain.Transacao;
import enumerators.InstituicaoBancaria;
import enumerators.TipoTransacao;
import exception.SaldoInsuficienteException;
import exception.ValorMinimoException;
import interfaces.ContaBancaria;

import java.text.DecimalFormat;
import java.time.LocalDate;


public class ContaDigital extends Conta{
    public ContaDigital(String donoConta,
                        InstituicaoBancaria instituicaoBancaria,
                        Integer numeroContaCorrente) {
        super(donoConta, instituicaoBancaria, numeroContaCorrente);
        validacaoInstituicaoBancaria(instituicaoBancaria);
    }





    private void validacaoInstituicaoBancaria(InstituicaoBancaria instituicaoBancaria) {
        if (instituicaoBancaria==InstituicaoBancaria.NUBANK ||
                instituicaoBancaria == InstituicaoBancaria.ITAU) {
            this.setInstituicaoBancaria(instituicaoBancaria);
        }else{
            throw new IllegalMonitorStateException("Somente Itaú e Nubank aceitam contas digitais.");
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
