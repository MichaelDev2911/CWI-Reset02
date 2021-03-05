package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.domain.Genero;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GeneroRepository {

    static List<Genero> genero = new ArrayList<>();

    public static List<Genero> getGenero() {
        for(Genero  list : genero){

        }
        return genero;

    }
}
