
public class Imovel {
    private Endereco endereco;
    private double valor;

    public Imovel(Endereco endereco, double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }
    public String apresentacao(){
        String retorno="Imóvel localizado no lagradouro "+ this.endereco.getLogradouro()+
                "\nBairro: "+ this.endereco.getBairro()+ " - Cidade: "+ this.endereco.getCidade()+
                "\nEstado: "+ this.endereco.getEstado()+
                " - Valor R$: "+ Double.toString(valor);
        return retorno;
    }
}
