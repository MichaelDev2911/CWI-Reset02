package br.com.cwi.resetflix.service;



import br.com.cwi.resetflix.entity.SerieEntity;

import br.com.cwi.resetflix.mapper.ConsultarDetalhesFilmeResponseMapper;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesSerieResponseMapper;
import br.com.cwi.resetflix.mapper.SerieEntityMapper;

import br.com.cwi.resetflix.repository.SerieRepository;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesService {
    @Autowired
    private SerieRepository serieRepository;

    static ConsultarDetalhesSerieResponseMapper MAPPER_DETALHES_SERIES = new ConsultarDetalhesSerieResponseMapper();
    static SerieEntityMapper MAPPER_ENTITY_SERIE = new SerieEntityMapper();

    public List<SerieResponse> acharSeriesGenero() {
        return null;
    }

    public ConsultarDetalhesSerieResponse detalhesSerie() {


        return null;
    }

    public Long criarSerie(CriarSerieRequest request) {

        SerieEntity serieSalvar = MAPPER_ENTITY_SERIE.mapear(request);
        return serieRepository.criarSerie(serieSalvar);


    }

    public List<SerieResponse> acharSeriesId() {
        return null;
    }

    public void AssistirSerie() {

    }
}
