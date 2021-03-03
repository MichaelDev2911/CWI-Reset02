package br.com.cwi.resetflix.request;

import br.com.cwi.resetflix.domain.Genero;

import java.util.List;

public class CriarSerieRequest {
    private Long id;
    private String nome;
    private Genero genero;
    private List<Long> idsAtores;
    private Integer quantidadeTemporadas;
    private Integer quantidadeEpisodios;

    public CriarSerieRequest(Long id, String nome, Genero genero,
                             List<Long> idsAtores,
                             Integer quantidadeTemporadas,
                             Integer quantidadeEpisodios) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.idsAtores = idsAtores;
        this.quantidadeTemporadas = quantidadeTemporadas;
        this.quantidadeEpisodios = quantidadeEpisodios;
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
