package br.com.reset.banco.da.desgraca;

import domain.conta.ContaCorrente;
import domain.conta.ContaDigital;
import enumerators.InstituicaoBancaria;
import java.time.LocalDate;

public class BancoDaDesgraca {
    public BancoDaDesgraca() {
    }

    public static void main(String[] args) throws Exception {
        ContaCorrente cc1 = new ContaCorrente("Michael", InstituicaoBancaria.NUBANK, 514);
        ContaDigital cd1 = new ContaDigital("Michael", InstituicaoBancaria.NUBANK, 155);
        cd1.toString();
        cd1.depositar(500.0D);
        cd1.transferir(200.0D, cc1);
        cd1.exibirExtrato(LocalDate.of(2019, 11, 20), LocalDate.of(2021, 1, 1));
    }
}
