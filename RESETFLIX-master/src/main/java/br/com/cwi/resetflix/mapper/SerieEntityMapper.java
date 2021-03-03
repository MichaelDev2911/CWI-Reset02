package br.com.cwi.resetflix.mapper;


import br.com.cwi.resetflix.entity.SerieEntity;

import br.com.cwi.resetflix.request.CriarSerieRequest;

public class SerieEntityMapper {
    public SerieEntity mapear(final CriarSerieRequest request) {
        return new SerieEntity(request.getId(), request.getNome(),
                request.getGenero(), request.getIdsAtores(),
                request.getQuantidadeTemporadas(), request.getQuantidadeEpisodios() );

    }
}
