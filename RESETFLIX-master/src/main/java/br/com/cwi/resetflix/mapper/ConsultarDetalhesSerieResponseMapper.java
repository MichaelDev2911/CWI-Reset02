package br.com.cwi.resetflix.mapper;


import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;


import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.*;

import java.util.List;

public class ConsultarDetalhesSerieResponseMapper {


    public ConsultarDetalhesSerieResponse mapear(List<AtorEntity> atores, List<SerieEntity> serie) {
        List<SerieResponse> series = new SerieResponseMapper().mapear(serie);

        return new ConsultarDetalhesSerieResponse(series,atores);
    }
}
