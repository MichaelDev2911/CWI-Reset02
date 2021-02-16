public enum UnidadeFederativa {
    AC("Acre"),
    AL("Alagoas"),
    AP("Amapá"),
    AM("Amazonas"),
    BA("Bahia"),
    CE("Ceará"),
    DF("Distrito Federal"),
    ES("Espírito Santo"),
    GO("Goiás"),
    MA("Maranhão"),
    MT("Mato Grosso"),
    MS("Mato Grosso Do Sul"),
    MG("Minas Gerais"),
    PA("Pará"),
    PB("Paráiba"),
    PR("Paraná"),
    PE("Pernanbuco"),
    PI("Piauí"),
    RJ("Rio De Janeiro"),
    RN("Rio Grande Do Norte"),
    RS("Rio Grande Do Sul"),
    RO("Rondônia"),
    RR("Roraima"),
    SC("Santa Catarina"),
    SP("São Paulo"),
    SE("Sergipe"),
    TO("Tocantins");
    private String descricao;

    UnidadeFederativa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
