package br.com.cwi.reset.exemploreset;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nome")
public class NomeController {

    private static String nome = "Robson";

    @GetMapping
    public String getNome(){
        return nome;
    }

    @PutMapping("/{nome}")
    public String putNome(@PathVariable("nome") String novoNome){
        this.nome = novoNome;
        return this.nome;
    }

    @DeleteMapping
    public void deleteNome(){
        this.nome = null;
    }
}