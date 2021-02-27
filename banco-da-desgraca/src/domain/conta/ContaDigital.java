
package domain.conta;

import enumerators.InstituicaoBancaria;
import exception.SaldoInsuficienteException;
import exception.ValorMinimoException;
import interfaces.ContaBancaria;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class ContaDigital extends Conta {
    public ContaDigital(String donoConta, InstituicaoBancaria instituicaoBancaria, Integer numeroContaCorrente) {
        super(donoConta, instituicaoBancaria, numeroContaCorrente);
        this.validacaoInstituicaoBancaria(instituicaoBancaria);
    }

    private void validacaoInstituicaoBancaria(InstituicaoBancaria instituicaoBancaria) {
        if (instituicaoBancaria != InstituicaoBancaria.NUBANK && instituicaoBancaria != InstituicaoBancaria.ITAU) {
            throw new IllegalMonitorStateException("Somente Itaú e Nubank aceitam contas digitais.");
        } else {
            this.setInstituicaoBancaria(instituicaoBancaria);
        }
    }

    public Double consultarSaldo() {
        return this.getSaldo();
    }

    public void depositar(Double valor) {
        super.depositar(valor);
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Depositando valor R$ " + DecimalFormat.getCurrencyInstance().format(valor) + " na Conta Digital " + this.getInstituicaoBancaria().getDescricao() + " Número: " + this.getNumeroContaCorrente());
    }

    public void sacar(Double valor) throws SaldoInsuficienteException, ValorMinimoException {
        super.sacar(valor);
        if (valor >= 10.0D && valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Sacando valor R$ " + DecimalFormat.getCurrencyInstance().format(valor) + " na Conta Digital " + this.getInstituicaoBancaria().getDescricao() + " Número: " + this.getNumeroContaCorrente());
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente ou valor mínimo não atingido.");
        }
    }

    public void transferir(Double valor, ContaBancaria contaDestino) throws SaldoInsuficienteException {
        super.transferir(valor, contaDestino);
        if (this.getSaldo() >= valor) {
            System.out.println("Transferindo valor R$ " + DecimalFormat.getCurrencyInstance().format(valor) + " na Conta Digital " + this.getInstituicaoBancaria().getDescricao() + " Número: " + this.getNumeroContaCorrente());
            this.setSaldo(this.getSaldo() - valor);
            contaDestino.depositar(valor);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para transferir.");
        }
    }

    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        System.out.println("----- EXTRATO CONTA DIGITAL " + this.getInstituicaoBancaria() + " " + this.getNumeroContaCorrente());
        super.exibirExtrato(inicio, fim);
        System.out.println("-----");
    }

    public String toString() {
        System.out.println("---Conta Digital--- ");
        return super.toString();
    }
}