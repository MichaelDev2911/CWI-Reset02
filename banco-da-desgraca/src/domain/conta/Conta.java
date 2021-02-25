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
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
// implementação da interface conta bancaria.
public abstract class Conta implements ContaBancaria {
    private String donoConta;
    private double saldo;
    private InstituicaoBancaria instituicaoBancaria;
    private Integer numeroContaCorrente;
   protected List<Transacao> transacaos;

    public Conta(List<Transacao> transacaos) {
        this.transacaos = transacaos;
    }

    public Conta(String donoConta, InstituicaoBancaria instituicaoBancaria,
                 Integer numeroContaCorrente) {
        this.donoConta = donoConta;
        this.saldo = 0;
        this.instituicaoBancaria = instituicaoBancaria;
        this.numeroContaCorrente = numeroContaCorrente;
        this.transacaos = new ArrayList<>();

    }

    public List<Transacao> getTransacaos() {
        return transacaos;
    }


    public void setTransacaos(List<Transacao> transacaos) {
        this.transacaos = transacaos;
    }




    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public Integer getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setInstituicaoBancaria(InstituicaoBancaria instituicaoBancaria) {
        this.instituicaoBancaria = instituicaoBancaria;
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return this.instituicaoBancaria;
    }

    @Override
    public Double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(Double valor) {
        /* no primeiro momento esqueci o new e me gerou um nuulPoiterException que
         * que fez da um looping na cabeça, mais com ajuda dos colegas e do you tube
         * saiu o nee no lugar correto acredito eu.
         */
        transacaos.add (new Transacao(TipoTransacao.DEPOSITO,Data.getDataTransacao(),valor));


    }

    @Override
    public void sacar(Double valor) throws SaldoInsuficienteException, ValorMinimoException {
        transacaos.add (new Transacao(TipoTransacao.SAQUE,Data.getDataTransacao(),valor));


    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) throws SaldoInsuficienteException {
        transacaos.add (new Transacao(TipoTransacao.TRANSFERENCIA,Data.getDataTransacao(),valor));


    }


    @Override
    public String toString() {

        String a = "Nome:" + donoConta +
                "\nInstituicao Bancaria " + instituicaoBancaria.getDescricao() +
                "\nConta Corrente número: " + numeroContaCorrente +
                ".\n-------------------";
      System.out.println(a);
      return a;
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for(Transacao transacao: transacaos){
            // Para cada transação faça =>


            System.out.println(transacao.getTipoTransacao().getSimbolo()+
                    " R$ "+
                    DecimalFormat.getCurrencyInstance().format(transacao.getValor()) +
                    " "+ formatter.format(Data.getDataTransacao()));


        }



    }

}
