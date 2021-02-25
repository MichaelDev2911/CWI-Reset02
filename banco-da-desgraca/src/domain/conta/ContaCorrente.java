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

public class ContaCorrente extends Conta {
    public ContaCorrente(String donoConta,
                         InstituicaoBancaria instituicaoBancaria,
                         Integer numeroContaCorrente) {
        super(donoConta, instituicaoBancaria, numeroContaCorrente);
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
        this.setSaldo(this.getSaldo()+valor);

        System.out.println("Depositando valor R$ "+
                DecimalFormat.getCurrencyInstance().format(valor)+
                " na Conta Corrente " +
                this.getInstituicaoBancaria().getDescricao()+ "Número: " +
                this.getNumeroContaCorrente());


    }

    @Override
    public void sacar(Double valor) throws SaldoInsuficienteException, ValorMinimoException {
       super.sacar(valor);
        if (this.getSaldo()>= valor && (valor % 5 == 0)){

            this.setSaldo(this.getSaldo()-valor);

            System.out.println("Sacando valor R$ "+
                    DecimalFormat.getCurrencyInstance().format(valor)+
                    " na Conta Corrente " +
                    this.getInstituicaoBancaria().getDescricao()+ "Número: " +
                    this.getNumeroContaCorrente());

        }else{
          throw  new SaldoInsuficienteException("Saldo insuficiente/verifique se valor informado \n é" +
                    " divisivel por 5.");
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) throws SaldoInsuficienteException {
        super.transferir(valor, contaDestino);
        Double taxa = valor * 0.01;



        if(this.getSaldo() >= valor &&
                this.getInstituicaoBancaria()==this.getInstituicaoBancaria()) {

            System.out.println("Transferindo valor R$ "+
                    DecimalFormat.getCurrencyInstance().format(valor)+
                    " na Conta Corrente " +
                    this.getInstituicaoBancaria().getDescricao()+ "Número: " +
                    this.getNumeroContaCorrente());

           this.setSaldo(this.getSaldo()-valor);


        }else if(this.getSaldo() >= valor &&
        this.getInstituicaoBancaria() != this.getInstituicaoBancaria()){

            System.out.println("Transferindo valor R$ "+
                    DecimalFormat.getCurrencyInstance().format(valor)+
                    " na Conta Corrente " +
                    this.getInstituicaoBancaria().getDescricao()+ "Número: " +
                    this.getNumeroContaCorrente());

            this.setSaldo(this.getSaldo()-(valor-taxa));


        }else{


            throw  new SaldoInsuficienteException("Saldo insuficiente para transferir.");
        }

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        System.out.println("----- EXTRATO CONTA CORRENTE "+
                this.getInstituicaoBancaria() +" "+ this.getNumeroContaCorrente());
             super.exibirExtrato(inicio, fim);
        System.out.println("-----");
    }
    @Override
    public String toString() {
        System.out.println("---Conta Corrente--- ");
        return super.toString();
    }
}
