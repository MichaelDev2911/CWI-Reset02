package com.company.Main;

import com.company.domain.Editora;
import com.company.domain.Filme;
import com.company.enums.Genero;
import com.company.heranca.Diretor;

public class AplicacaoTeste {
    public static void main(String[] args) {
     Diretor diretor = new Diretor("Carlos",78,
             4, Genero.MASCULINO);
      /*  Editora editora = new Editora(" Marvel DC Comics",
                "Avenida Paulista");*/
                Editora editora = new Editora(" Marvel DC Comics",
                "Avenida Paulista");
        Filme filme = new Filme("Eragon","Dragões,Drama",120,
                2005,10,diretor,editora);

    }

}
