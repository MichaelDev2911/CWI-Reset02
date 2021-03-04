package br.com.cwi.resetflix.mapper;


import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.*;

import java.util.List;

public class ConsultarDetalhesFilmeResponseMapper {
    public ConsultarDetalhesFilmeResponse mapear(final List<FilmeEntity> filmesResponse,
                                                 final DiretorEntity diretorSalvo, final List<AtorEntity> atorSalvo) {
        List<FilmeResponse> filmes = new FilmeResponseMapper().mapear(filmesResponse);

        return new ConsultarDetalhesFilmeResponse(filmes, diretorSalvo.getId(),
                diretorSalvo.getNome(), atorSalvo);
    }

}


