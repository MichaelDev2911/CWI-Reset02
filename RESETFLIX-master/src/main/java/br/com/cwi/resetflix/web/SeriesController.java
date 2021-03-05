package br.com.cwi.resetflix.web;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.SerieResponse;

import br.com.cwi.resetflix.service.GeneroService;
import br.com.cwi.resetflix.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/series")
public class SeriesController implements SeriesContract{
    @Autowired
    private SeriesService seriesService;
    @Autowired
    private GeneroService generoService;


    @Override
    @GetMapping("series/genero")
    public List<SerieResponse> getSeries(Genero genero) {
     return   seriesService.acharSeriesGenero();

    }

    @Override
    @GetMapping("/{id}")
    public ConsultarDetalhesSerieResponse getSerieById(Long id) {
        return seriesService.detalhesSerie(id);
    }

    @Override
    @PostMapping
    public Long criarSerie(CriarSerieRequest request) {
        return seriesService.criarSerie(request);
    }

    @Override

    public List<SerieResponse> getSeries() {
        return null;
    }


    @Override

    @GetMapping
    public List<SerieResponse> getSeries(Long id) {
        return seriesService.acharSeriesId(id);
    }

    @Override
    @PostMapping("/{id}/assistir")
    public void assistirSerie(Long id, Integer temporada, Integer episodio) {
             seriesService.AssistirSerie();
    }
}
