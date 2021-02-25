package domain;


import enumerators.TipoTransacao;

import java.time.LocalDate;


public  class Transacao  {
    private TipoTransacao tipoTransacao;
    private LocalDate datatransacao;
    private Double valor;

    public Transacao(TipoTransacao tipoTransacao, LocalDate datatransacao, Double valor) {
        this.tipoTransacao = tipoTransacao;
        this.datatransacao = datatransacao;
        this.valor = valor;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public LocalDate getDatatransacao() {
        return datatransacao;
    }

    public Double getValor() {
        return valor;
    }
}
