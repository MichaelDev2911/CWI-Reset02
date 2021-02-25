package enumerators;

public enum TipoTransacao {
    SAQUE(" - "),
    DEPOSITO (" + "),
    TRANSFERENCIA (" - ");
private String simbolo;

    TipoTransacao(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}