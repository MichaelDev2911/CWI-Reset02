package br.com.cwi.resetflix.repository;


import br.com.cwi.resetflix.entity.SerieEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SerieRepository {

    static List<SerieEntity> series = new ArrayList<>();
    static Long contadorIdsSeries = 1l;
    public List<SerieEntity> getFilmes(){
        return series;
    }


    public Long criarSerie(SerieEntity serieSalvar) {
        if(serieSalvar.getId() == null){
            serieSalvar.setId(contadorIdsSeries);
            contadorIdsSeries++;
        }
        series.add(serieSalvar);

        return serieSalvar.getId();

    }
}
