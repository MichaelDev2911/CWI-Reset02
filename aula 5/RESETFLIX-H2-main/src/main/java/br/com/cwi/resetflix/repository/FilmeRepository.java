package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.domain.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cwi.resetflix.entity.FilmeEntity;

import java.util.ArrayList;
import java.util.List;

public interface FilmeRepository extends JpaRepository<FilmeEntity, Long> {


    public default List<FilmeEntity> findAllByGenero(Genero genero) {
        for(FilmeEntity filmeEntity : findAllByGenero(genero)){
            if(filmeEntity.getGenero().equals(genero)){
                return findAllByGenero(genero);
            }
        }
        return null;
    }



    public default List<FilmeEntity> findAll() {
        for(FilmeEntity filmeEntity : findAll()){

                return findAll();

        }
        return null;
    }
}
