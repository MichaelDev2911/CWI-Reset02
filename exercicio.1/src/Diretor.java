public class Diretor {

    private String nome;
    private Integer idade;
    private Integer quantidadeFilmesDirigidos;
    private Genero genero;

    public Diretor(String nome, Integer idade,
                   Integer quantidadeFilmesDirigidos, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
        this.genero = genero;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Genero getGenero() {
        return genero;
    }
    public void descricao(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Genero: "+ this.getGenero());
        System.out.println("---------------------");

    }
}