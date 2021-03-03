package br.com.cwi.resetflix.service;


import br.com.cwi.resetflix.domain.Genero;


import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.mapper.*;
import br.com.cwi.resetflix.repository.AtoresRepository;
import br.com.cwi.resetflix.repository.DiretoresRepository;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesService {
    @Autowired
    private AtoresRepository atoresRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private DiretoresRepository diretoresRepository;
    static FilmeEntityMapper MAPPER_ENTITY_FILME = new FilmeEntityMapper();
    static ConsultarDetalhesFilmeResponseMapper MAPPER_DETALHES_FILME = new ConsultarDetalhesFilmeResponseMapper();
    static FilmeResponseMapper MAPPER_FILME_GENERO = new FilmeResponseMapper();

    public ConsultarDetalhesFilmeResponse consultarDetalhesFilmes(Long id) {


        final List<AtorEntity> atores = atoresRepository.getAtores();
        DiretorEntity diretorSalvo = diretoresRepository.acharDiretorPorId(id);
        List<FilmeEntity> filmes = filmeRepository.acharFilmes(id);
        return MAPPER_DETALHES_FILME.mapear(filmes,diretorSalvo,atores);

    }

    public Long criarFilme(CriarFilmeRequest request) {

        FilmeEntity filmeSalvar = MAPPER_ENTITY_FILME.mapear(request);
        return filmeRepository.criarFilme(filmeSalvar);
    }

    public void assistirFilme(Long id) {

    }

    public List<FilmeResponse> filmesPorGenero(Genero genero) {
        List<FilmeEntity> filmes = filmeRepository.acharFilmesGenero(genero);
            return MAPPER_FILME_GENERO.mapear(filmes);
    }

    public List<FilmeResponse> recomendacoes() {
        return null;
    }
}
