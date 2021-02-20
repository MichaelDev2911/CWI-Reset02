
import java.util.List;

public class Filme  {

    private String nomeFilme;
    private String descricao;
    private Integer duracao;
    private Integer anoLancamento;
    private Integer avaliacao;
    private Diretor diretor;
    private List<Pessoa> elenco;



    public Filme(String nomeFilme, String descricao,
                 Integer duracao, Integer anoLancamento,
                 Integer avaliacao, Diretor diretor,List<Pessoa> elenco

                 ) {

        defineAvaliacao(avaliacao);
        validaNomeEDefineAvaliacao(nomeFilme);



        this.nomeFilme = nomeFilme;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.elenco = elenco;
    }




    public void reproduzir() {
        System.out.println("Nome Filme: " + this.nomeFilme);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Nome do Diretor: " + this.diretor.getNome());
        System.out.println("Elenco: " + this.elenco.toString());
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
    private void validaNomeEDefineAvaliacao(String nomeFilme){
        if("Batman vs SuperMan".equals(nomeFilme)){
            this.avaliacao=1;
        }else if("O clube da luta".equals(nomeFilme)){
            this.avaliacao= 5;
        }else{
            this.avaliacao=avaliacao;
        }
    }



    public void exibirCreditos(){
        System.out.println("------------" + this.nomeFilme);
        System.out.println(" Elenco:"+ elenco);
        for(Pessoa pessoa:elenco){
            pessoa.imprimir();
        }

    }





}
