package br.com.cwi.resetflix.service;



import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.entity.SerieEntity;

import br.com.cwi.resetflix.mapper.*;

import br.com.cwi.resetflix.repository.AtoresRepository;
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
    @Autowired
    private AtoresRepository atoresRepository;

    static SerieResponseMapper MAPPER_RESPONSE_SERIE = new SerieResponseMapper();
    static ConsultarDetalhesSerieResponseMapper MAPPER_DETALHES_SERIES = new ConsultarDetalhesSerieResponseMapper();
    static SerieEntityMapper MAPPER_ENTITY_SERIE = new SerieEntityMapper();

    public List<SerieResponse> acharSeriesGenero() {
        return null;
    }

    public ConsultarDetalhesSerieResponse detalhesSerie(Long id) {

        final List<AtorEntity> atores = atoresRepository.getAtores();
        List<SerieEntity> serie = serieRepository.acharSeriesId(id);
        return MAPPER_DETALHES_SERIES.mapear(atores,serie);
    }

    public Long criarSerie(CriarSerieRequest request) {

        SerieEntity serieSalvar = MAPPER_ENTITY_SERIE.mapear(request);
        return serieRepository.criarSerie(serieSalvar);


    }

    public List<SerieResponse> acharSeriesId(Long id) {

        List<SerieEntity> serie = serieRepository.acharSeriesId(id);
        return MAPPER_RESPONSE_SERIE.mapear(serie);
    }

    public void AssistirSerie() {

    }

    public List<SerieResponse> getSerie() {
        // ajustar deposi
        return null;
    }
}
