package br.com.cwi.resetflix.service;


import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.mapper.*;

import br.com.cwi.resetflix.repository.DiretoresRepository;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.request.CriarDiretorRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretoresService {
    @Autowired
    private DiretoresRepository diretoresRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    static DiretoresResponseMapper MAPPER_RESPONSE_DIRETOR = new DiretoresResponseMapper();
    static DiretorEntityMapper MAPPER_ENTITY_DIRETOR = new DiretorEntityMapper();
    static ConsultarDetalhesDiretorResponseMapper MAPPER_DETALHES_DIRETOR = new ConsultarDetalhesDiretorResponseMapper();


    public List<DiretoresResponse> getDiretores() {
        final List<DiretorEntity> diretores = diretoresRepository.getDiretores();
        return MAPPER_RESPONSE_DIRETOR.mapear(diretores);

    }

    public ConsultarDetalhesDiretorResponse consultarDetalhesDiretor(Long id) {

        DiretorEntity diretorSalvo = diretoresRepository.acharDiretorPorId(id);
        List<FilmeEntity> filmesDiretor = filmeRepository.acharFilmesDiretor(id);
        return MAPPER_DETALHES_DIRETOR.mapear(diretorSalvo, filmesDiretor);
    }

    public Long criarDiretor(CriarDiretorRequest request) {

        DiretorEntity diretorSalvar = MAPPER_ENTITY_DIRETOR.mapear(request);
        return diretoresRepository.criarDiretor(diretorSalvar);
    }
}
