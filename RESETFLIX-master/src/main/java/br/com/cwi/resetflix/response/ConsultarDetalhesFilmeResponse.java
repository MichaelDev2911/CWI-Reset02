package br.com.cwi.resetflix.response;

import java.util.List;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.mapper.AtoresResponseMapper;
import br.com.cwi.resetflix.mapper.FilmeResponseMapper;

public class ConsultarDetalhesFilmeResponse {

    private Long id;
    private String nome;
    private Genero genero;
    private DiretoresResponse diretor;
    private List<AtorEntity> atores;
    List<FilmeResponse> filmes;




    public ConsultarDetalhesFilmeResponse(List<FilmeResponse> filmes, Long id, String nome,List<AtorEntity> atores ) {
        this.filmes =filmes;
        this.diretor.id = id;
        this.diretor.nome = nome;
        this.atores= atores;
    }


    public List<FilmeResponse> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<FilmeResponse> filmes) {
        this.filmes = filmes;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(final Genero genero) {
        this.genero = genero;
    }

    public DiretoresResponse getDiretor() {
        return diretor;
    }

    public void setDiretor(final DiretoresResponse diretor) {
        this.diretor = diretor;
    }

    public List<AtorEntity> getAtores() {
        return atores;
    }

    public void setAtores(final List<AtorEntity> atores) {
        this.atores = atores;
    }

}
