public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    NAO_BINARIO("Não Binario");
    private String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }
}
