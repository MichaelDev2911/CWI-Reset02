package br.com.cwi.resetflix.web;

import static java.util.Arrays.asList;

import java.util.List;

import br.com.cwi.resetflix.repository.GeneroRepository;
import br.com.cwi.resetflix.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cwi.resetflix.domain.Genero;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/genero")
public class GeneroController {
    @Autowired
    private GeneroService generoService;

    @GetMapping
    @ApiOperation(value = "Obter todos os gêneros.", notes = "Obtém todos os gêneros cadastrados no sistema.")
    public List<Genero> getGeneros() {
    return    generoService.listarGeneros();

    }
}
