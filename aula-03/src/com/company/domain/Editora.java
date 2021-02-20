package com.company.domain;

import com.company.exceptions.EsseNomeNaoException;

public class Editora {
    private String nomeEditora;
    private String localizacao;

    public Editora(String nomeEditora, String localizacao) {
        validacaoNome(nomeEditora);
        this.localizacao = localizacao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }
    private void validacaoNome(String nomeEditora){
        if(nomeEditora.equals("DC Comics")){
            throw new EsseNomeNaoException("Esse nome não pode.Não viaja");
        }else{
            this.nomeEditora= nomeEditora;
        }
    }
}
