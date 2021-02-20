import java.time.LocalDate;

public class Ator extends Pessoa {

    private int orcarsVencidos;


    public Ator(String nome, LocalDate dataNascimento, Genero genero, int orcarsVencidos) {
        super(nome,dataNascimento,genero);
        this.orcarsVencidos = orcarsVencidos;
    }


    public int getOrcarsVencidos() {
        return orcarsVencidos;
    }
    public void exibirCreditos(){
        super.imprimir();
        System.out.println(" Quantidade de oscar vencidos: " + this.orcarsVencidos);
    }

    @Override
    public void imprimir(){
        super.imprimir();
    }

    @Override
    public String toString() {
        super.toString();
        String   a = "Ator: "+ this.getNome();
        return     a;
    }
}
