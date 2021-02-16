public class PropostaFinanciamento {
    private Beneficiario beneficiario;
    private Imovel imovel;
    private Integer prazoDePagamento;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovel, Integer prazoDePagamento) {
        this.beneficiario = beneficiario;
        this.imovel = imovel;
        this.prazoDePagamento = prazoDePagamento;
    }

    public Beneficiario getBenificiario() {
        return beneficiario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public Integer getPrazoDePagamento() {
        return prazoDePagamento;
    }

    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */
    public void validarProposta() {
        if(this.beneficiario.getSalario()* this.prazoDePagamento >=
                this.imovel.getValor()/2){
            imprimirPropostaAprovada();

        }else if(this.imovel.getEndereco().getEstado().equals(UnidadeFederativa.SP) &&
                this.beneficiario.getSalario() * this.prazoDePagamento >=
                        (this.imovel.getValor()* 1.65)-this.imovel.getValor()){

            imprimirPropostaAprovada();
        }else if(this.imovel.getEndereco().getEstado().equals(UnidadeFederativa.RJ)
                && this.beneficiario.getSalario() * this.prazoDePagamento >=
                (this.imovel.getValor()* 1.60)-this.imovel.getValor()){

            imprimirPropostaAprovada();
        }else{
            imprimirPropostaNegada();
        }


    }
    public void imprimirPropostaAprovada(){
        System.out.println("Nome Benificiário: "+ beneficiario.getNome());
        System.out.println("Imovél: "+ imovel.apresentacao());
        System.out.println("Prazo: "+ prazoDePagamento+ " meses.");
        System.out.println("Parabéns! Pode comemorar, sua proposta foi aprovada.");

    }
    public void imprimirPropostaNegada(){
        System.out.println("Nome Benificiário: "+ beneficiario.getNome());
        System.out.println("Imovél: "+ imovel.apresentacao());
        System.out.println("Prazo: "+ prazoDePagamento + " meses.");
        System.out.println("sem noção! Sua propasta foi negada.");
    }

}
