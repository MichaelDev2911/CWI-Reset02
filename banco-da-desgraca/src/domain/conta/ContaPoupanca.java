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
import java.util.List;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String donoConta, InstituicaoBancaria instituicaoBancaria, Integer numeroContaCorrente) {
        super(donoConta, instituicaoBancaria, numeroContaCorrente);
        validacaoInstituicaoBancaria(instituicaoBancaria);
    }

    private void validacaoInstituicaoBancaria(InstituicaoBancaria instituicaoBancaria) {
        if (instituicaoBancaria != InstituicaoBancaria.NUBANK) {
            this.setInstituicaoBancaria(instituicaoBancaria);
        }else{
            throw new IllegalMonitorStateException("Nubank não permite este tipo de conta.");
        }
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return this.getInstituicaoBancaria();
    }

    @Override
    public Double consultarSaldo() {
        return this.getSaldo();
    }

    @Override
    public void depositar(Double valor) {
        super.depositar(valor);
        this.setSaldo(this.getSaldo()+ valor);

        System.out.println("Depositando valor R$ "+
                DecimalFormat.getCurrencyInstance().format(valor)+
                " na Conta Poupanca " +
                this.getInstituicaoBancaria().getDescricao()+ "Número: " +
                this.getNumeroContaCorrente());

    }

    @Override
    public void sacar(Double valor) throws ValorMinimoException, SaldoInsuficienteException {
        super.sacar(valor);
        Double taxaSaque = valor *0.02;
        Double valorMinimo = 50.00;

        if(this.getSaldo() >=valor && valor >= valorMinimo){


            System.out.println("Sacando valor R$ "+
                    DecimalFormat.getCurrencyInstance().format(valor)+
                    " na Conta Digital " +
                    this.getInstituicaoBancaria().getDescricao()+ "Número: " +
                    this.getNumeroContaCorrente());
            this.setSaldo(this.getSaldo()-(valor-taxaSaque));
        }else{
            throw new ValorMinimoException("Somente saques acima de R$ 50.00 ou \n" +
                    " saldo insuficiente");
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) throws SaldoInsuficienteException {
        super.transferir(valor,contaDestino);
        Double taxaMesmaInstituicao = valor * 0.005;
        Double taxaDiferenteInstituicao = valor * 0.01;


        if (this.getSaldo()>= valor &&
                this.getInstituicaoBancaria()==this.getInstituicaoBancaria()){

            System.out.println("Transferindo valor R$ "+
                    DecimalFormat.getCurrencyInstance().format(valor)+
                    " na Conta Poupanca " +
                    this.getInstituicaoBancaria().getDescricao()+ "Número: " +
                    this.getNumeroContaCorrente());

            this.setSaldo(this.getSaldo()-(valor-taxaMesmaInstituicao));

        }else if (this.getSaldo() >=valor &&
        this.getInstituicaoBancaria()!=this.getInstituicaoBancaria()){


            this.setSaldo(this.getSaldo()-(valor-taxaDiferenteInstituicao));
        }else{
            throw  new SaldoInsuficienteException("Sem saldo para transferir");
        }

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        System.out.println("----- EXTRATO CONTA POUPANÇA "+
                this.getInstituicaoBancaria() +" "+ this.getNumeroContaCorrente());
        super.exibirExtrato(inicio, fim);
        System.out.println("-----");

    }
    @Override
    public String toString() {
        System.out.println("---Conta Poupança--- ");
        return super.toString();
    }

}
