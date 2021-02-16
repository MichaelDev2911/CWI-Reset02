public class Endereco {
    private String logradouro,complemento,bairro,cidade;
    private Integer numero;
    private UnidadeFederativa estado;

    public Endereco(String logradouro, String complemento, String bairro,
                    String cidade, Integer numero, UnidadeFederativa estado) {

        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public UnidadeFederativa getEstado() {
        return estado;
    }

}
