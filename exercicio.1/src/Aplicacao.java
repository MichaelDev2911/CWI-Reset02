import java.time.LocalDate;

public class Aplicacao {

    public static void main(String[] args) {


      LocalDate minhaIdade;
        minhaIdade = LocalDate.of(1987,11,29);
        Diretor diretor = new Diretor("Michael",minhaIdade,
                100, Genero.MASCULINO);

        Ator ator = new Ator("Goku",minhaIdade, Genero.MASCULINO,1);

ator.exibirCreditos();

    }
}