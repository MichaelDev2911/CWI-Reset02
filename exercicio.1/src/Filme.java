public class Filme {

    private String nome;
    private String descricao;
    private Integer duracao;
    private Integer anoLancamento;
    private Integer avaliacao;
    private Diretor diretor;

    public Filme(String nome, String descricao, Integer duracao, Integer anoLancamento, Integer avaliacao, Diretor diretor) {
        defineAvaliacao(avaliacao);
        validaNomeEDefineAvaliacao(nome);


        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
    }

    public void reproduzir() {
        System.out.println("Nome Filme: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Nome do Diretor: " + this.diretor.getNome());
        System.out.println("Avaliação:" + this.avaliacao);
        System.out.println("-------------------");
    }
    private void defineAvaliacao(Integer avaliacao){
        if(avaliacao < 1 || avaliacao > 5){
            this.avaliacao = 3;
        }else{
            this.avaliacao =avaliacao;
        }
    }
    private void validaNomeEDefineAvaliacao(String nome){
        if("Batman vs SuperMan".equals(nome)){
            this.avaliacao=1;
        }else if("O clube da luta".equals(nome)){
            this.avaliacao= 5;
        }else{
            this.avaliacao=avaliacao;
        }
    }

}
