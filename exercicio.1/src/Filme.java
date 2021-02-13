public class Filme {
    private String nome,descricao;
    private int tempoDuracaoFilme,anoLancamento,avaliacao;
    private String nomeDiretor;
    private Diretor idadeDiretor;
    private Diretor numeroFilmesDirigidos;

    public Filme(String nome, String descricao, int tempoDuracaoFilme, String nomeDiretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.tempoDuracaoFilme = tempoDuracaoFilme;
        this.nomeDiretor = nomeDiretor;
    }

    public void reproduzir(){
        System.out.println("Reproduzindo");
        System.out.println("Filme: "+this.nome+ " Descrição: "+ this.descricao+
                " Diretor: "+ this.nomeDiretor+ " Duração filme: "
                + this.tempoDuracaoFilme + " minutos");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTempoDuracaoFilme() {
        return tempoDuracaoFilme;
    }

    public void setTempoDuracaoFilme(int tempoDuracaoFilme) {
        this.tempoDuracaoFilme = tempoDuracaoFilme;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public Diretor getIdadeDiretor() {
        return idadeDiretor;
    }

    public void setIdadeDiretor(Diretor idadeDiretor) {
        this.idadeDiretor = idadeDiretor;
    }

    public Diretor getNumeroFilmesDirigidos() {
        return numeroFilmesDirigidos;
    }

    public void setNumeroFilmesDirigidos(Diretor numeroFilmesDirigidos) {
        this.numeroFilmesDirigidos = numeroFilmesDirigidos;
    }
}
