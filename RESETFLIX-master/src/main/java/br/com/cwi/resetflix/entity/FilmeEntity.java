package br.com.cwi.resetflix.entity;

import java.util.List;

import br.com.cwi.resetflix.domain.Genero;

public class FilmeEntity {

    private Long id;
    private String nome;
    private Genero genero;
    private Long idDiretor;
    private List<Long> idsAtores;



    public FilmeEntity(String nome, Genero genero, Long idDiretor, List<Long> idsAtores) {
        this.nome = nome;
        this.genero = genero;
        this.idDiretor = idDiretor;
        this.idsAtores = idsAtores;
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

    public Long getIdDiretor() {
        return idDiretor;
    }

    public void setIdDiretor(final Long idDiretor) {
        this.idDiretor = idDiretor;
    }

    public List<Long> getIdsAtores() {
        return idsAtores;
    }

    public void setIdsAtores(final List<Long> idsAtores) {
        this.idsAtores = idsAtores;
    }
}
