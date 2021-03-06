package br.com.cwi.resetflix.mapper;

import java.util.Collections;

import org.springframework.stereotype.Component;

import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.request.CriarDiretorRequest;

@Component
public class DiretorEntityMapper {

//    @Autowired
//    private FilmeRepository filmeRepository;

    public DiretorEntity mapear(final CriarDiretorRequest request) {
        return new DiretorEntity(request.getNome(), Collections.emptyList()
//            filmeRepository.metodoBuscarTodosPorId(request.getIdFilmes()));
        );
    }
}
