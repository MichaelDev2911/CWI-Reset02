package br.com.cwi.resetflix.mapper;


import br.com.cwi.resetflix.entity.DiretorEntity;


import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.*;

import java.util.List;

public class ConsultarDetalhesSerieResponseMapper {
    public ConsultarDetalhesSerieResponse mapear(final List<SerieEntity> serieResponse, final DiretorEntity diretorSalvo, final List<AtoresResponse>atorSalvo) {
        List<SerieResponse> series = new SerieResponseMapper().mapear(serieResponse);

        return new ConsultarDetalhesSerieResponse(series, diretorSalvo.getId(),
                diretorSalvo.getNome(),atorSalvo);
    }

}
