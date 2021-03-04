package br.com.cwi.resetflix.repository;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.stereotype.Repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;

@Repository
public class FilmeRepository {

    static List<FilmeEntity> filmes = new ArrayList<>();
    static Long contadorIdsFilmes = 1l;
    public List<FilmeEntity> getFilmes(){
        return filmes;
    }

    public Long criarFilme(final FilmeEntity filmeSalvar) {
        if(filmeSalvar.getId() == null){
            filmeSalvar.setId(contadorIdsFilmes);
            contadorIdsFilmes++;
        }
        filmes.add(filmeSalvar);

        return filmeSalvar.getId();
    }
    public List<FilmeEntity> acharFilmesAtor(final Long id ){

        for(FilmeEntity filmeEntity : filmes){
            if(filmeEntity.getIdsAtores().equals(id)){
                return filmes ;
            }
        }
        return null;
    }

    public List<FilmeEntity> acharFilmesDiretor( final Long id) {


        for(FilmeEntity filmeEntity : filmes){
            if(filmeEntity.getIdDiretor().equals(id)){
                return filmes ;
            }
        }
        return null;
    }

    public List<FilmeEntity> acharFilmes(Long id) {

        for(FilmeEntity filmeEntity : filmes){
            if(filmeEntity.getId().equals(id)){
                return filmes;
            }
        }
        return null;
    }

    public List<FilmeEntity> acharFilmesGenero(Genero genero) {
        for(FilmeEntity filmeEntity : filmes){
            if(filmeEntity.getGenero().equals(genero)){
                return filmes;
            }
        }
        return null;
    }

    public void assistirFilme(Long id) {
// para cada filme visto add em usuario.  a lista o filme visto para ficar salvo
        //viu

    }

    public List<FilmeResponse> recomendacoes() {
        /* se  id lista de filmes vistos !=  id lista filme response
        *  listar para o usuario
        *
        * se == lançar exceção.
        * */

        return null;
    }
}
