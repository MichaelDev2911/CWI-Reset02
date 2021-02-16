public class Apartamento extends Imovel {
    private String andar;

    public Apartamento(String andar,Endereco endereco, double valor) {
        super(endereco, valor);
        this.andar = andar;
    }

    public String getAndar() {
        return andar;
    }


    public double getValor() {
        return super.getValor();
    }
    @Override
    public String apresentacao(){
        super.apresentacao();
       String andarApe =super.apresentacao() + "\nAndar: "+ this.getAndar();

        return andarApe ;
    }
}
