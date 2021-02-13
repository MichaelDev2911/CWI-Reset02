public class Aplicacao {

    public static void main(String[] args) {
        Diretor diretor = new Diretor("Michael", 33,
                100, Genero.MASCULINO);
        Ator ator = new Ator("Goku", 100, Genero.MASCULINO);

        Filme filme1 = new Filme("Lagoa Azul",
                "Mais visto na sessão da tarde",
                120, 2014, 5, diretor);
        Filme filme2 = new Filme("Dragon Ball", "Melhor dezenho",
                30, 1987, 5, diretor);

        filme1.reproduzir();
        filme2.reproduzir();
        diretor.descricao();
        ator.descricao();
    }
}