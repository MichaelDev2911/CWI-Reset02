public class Ator {
    private String nome;
    private int idade;
    private int orcarsVencidos;
    private Genero genero;

    public Ator(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getOrcarsVencidos() {
        return orcarsVencidos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void descricao(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Genero: "+ this.getGenero());
        System.out.println("--------------------");
    }
}
