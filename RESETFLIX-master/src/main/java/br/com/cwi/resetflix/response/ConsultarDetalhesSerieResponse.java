package br.com.cwi.resetflix.response;

import java.util.List;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.AtorEntity;

public class ConsultarDetalhesSerieResponse {
    private Long id;
    private String nome;
    private Genero genero;
    private List<Long> idsAtores;
    private Integer quantidadeTemporadas;
    private Integer quantidadeEpisodios;
    List<SerieResponse> serie;
    List<AtorEntity> atores;



    public ConsultarDetalhesSerieResponse(List<SerieResponse> series, List<AtorEntity> atores) {
        this.serie=series;
        this.atores=atores;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Long> getIdsAtores() {
        return idsAtores;
    }

    public void setIdsAtores(List<Long> idsAtores) {
        this.idsAtores = idsAtores;
    }

    public Integer getQuantidadeTemporadas() {
        return quantidadeTemporadas;
    }

    public void setQuantidadeTemporadas(Integer quantidadeTemporadas) {
        this.quantidadeTemporadas = quantidadeTemporadas;
    }

    public Integer getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public void setQuantidadeEpisodios(Integer quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }


}
