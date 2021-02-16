public class Casa extends Imovel{
    private String patio;

    public Casa(String patio,Endereco endereco, double valor){
        super(endereco, valor);
        this.patio = patio;
    }

    public String getPatio() {
        return patio;
    }


    public double getValor() {
        return super.getValor();
    }
    @Override
    public String apresentacao(){
        super.apresentacao();
        String ispatio =super.apresentacao() + "\nPatio: "+ this.getPatio();
        return ispatio;
    }
}
