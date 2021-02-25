package br.com.reset.banco.da.desgraca;

import domain.Transacao;
import domain.conta.ContaCorrente;
import domain.conta.ContaDigital;
import domain.conta.ContaPoupanca;
import enumerators.InstituicaoBancaria;
import enumerators.TipoTransacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

       ContaCorrente cc1 = new ContaCorrente("Michael",
         InstituicaoBancaria.NUBANK,514);


       ContaDigital cd1 = new ContaDigital("Michael",
                InstituicaoBancaria.NUBANK,155 );

        cd1.toString();
        cd1.depositar(500.00);
        cd1.transferir(200.00,cc1);


cd1.exibirExtrato(LocalDate.of(2019,11,20),LocalDate.of(2021,01,01));

    }
}