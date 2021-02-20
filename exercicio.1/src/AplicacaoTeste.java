import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AplicacaoTeste {

    public static void main(String[] args) {
        List<Pessoa> elenco = new ArrayList<Pessoa>();
        LocalDate idadeDiretor= LocalDate.of(1980,05,14);
        LocalDate idadeAtor1= LocalDate.of(1990,10,01);
        Diretor diretor = new Diretor("André",idadeDiretor,40,
                Genero.MASCULINO);
       elenco.add(diretor);
       elenco.add(new Ator("Miguel",idadeAtor1,Genero.MASCULINO,1));
       elenco.add(new Ator("Paula",idadeAtor1,Genero.FEMININO,5));
       elenco.add(new Ator("Renata",idadeAtor1,Genero.NAO_BINARIO,0));
       Filme novoMundo = new Filme("Novo Mundo", "Tempos atuais",
               115,2020,3,diretor,elenco);

       novoMundo.exibirCreditos();
       novoMundo.reproduzir();

    }
}
