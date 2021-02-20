import java.time.LocalDate;

public class Diretor  extends Pessoa{


    private Integer quantidadeFilmesDirigidos;

    public Integer getQuantidadeFilmesDirigidos() {
        return quantidadeFilmesDirigidos;
    }

    public Diretor(String nome, LocalDate dataNascimento,
                   Integer quantidadeFilmesDirigidos, Genero genero) {
        super(nome,dataNascimento,genero);
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;

    }
    public void exibirCreditos(){
        super.imprimir();
        System.out.println(" Quantidade de filmes  dirigidos: " + this.quantidadeFilmesDirigidos);
    }
    @Override
    public String toString() {
       super.toString();
    String   a = "Diretor: "+ this.getNome();
         return     a;
    }





  @Override
    public void imprimir(){
super.imprimir();


    }
}