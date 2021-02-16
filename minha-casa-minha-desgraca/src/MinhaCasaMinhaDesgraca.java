
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MinhaCasaMinhaDesgraca {

    public static void main(String[] args) throws Exception {

        System.out.println("\n ### Olá, seja bem vindo ao magnífico programa Minha Casa - Minha Desgraça ###\n");

        ImoveisParaFinanciamento opcoesParaFinanciamento = new ImoveisParaFinanciamento();
        Endereco endereco1 = new Endereco("Rua parobe","Casa10", "Solidão","Lindas Rosas",555,UnidadeFederativa.SP);
        Imovel  imovel1 = new Casa("Sim",endereco1,70000);
        Endereco endereco2 = new Endereco("Rua Das Rosas","Vermelha",
                "Jardin","Novo Mundo", 50,UnidadeFederativa.RJ);
        Imovel imovel2 = new Casa("Não",endereco2,600000);
        Endereco endereco3 = new Endereco("Rua CWI-Reset","Meu objetico",
                "Convicção","Realização",1,UnidadeFederativa.RS);
       Imovel imovel3 = new Casa("Não",endereco3,999999);
        Endereco endereco4 = new Endereco("Rua Jesus","Salva",
                "compaixão","Jerusalém",7,UnidadeFederativa.DF);
        Imovel imovel4 = new Casa("Sim,bem grandão",endereco4,50000);
        Endereco endereco5 = new Endereco("Rua Angra dos Reis", "casa 3", "" +
                "Parque Ipiranga", "Gravataí",342,UnidadeFederativa.RS);
        Imovel imovel5 = new Apartamento(" 3°",endereco5, 180000);
        Endereco endereco6 = new Endereco("Rua da Praia", "mole",
                "ilha", "floripa", 111, UnidadeFederativa.SC);
        Imovel imovel6 = new Apartamento(" 1°",endereco6,500000);
        Endereco endereco7 = new Endereco("Rua dos Ingleses", "Santinho",
                "Ingleses", "Florianópolis",100,UnidadeFederativa.SC);
        Imovel imovel7 = new Apartamento(" 10°",endereco7,150000);
        Endereco endereco8 = new Endereco("Rua da Ferrugem","australinha",
                "Ferrugem","Garopada",900, UnidadeFederativa.SP);
        Imovel imovel8 = new Apartamento("33°",endereco8,650000);
        Endereco endereco9 = new Endereco("Ruas das Cavernas", "morcegos",
                "Perdido","Matinhos",24,UnidadeFederativa.MS);
        Imovel imovel9 = new Apartamento("7°",endereco9,600000);
        opcoesParaFinanciamento.registrarImovel(imovel1);
        opcoesParaFinanciamento.registrarImovel(imovel2);
        opcoesParaFinanciamento.registrarImovel(imovel3);
        opcoesParaFinanciamento.registrarImovel(imovel4);
        opcoesParaFinanciamento.registrarImovel(imovel5);
        opcoesParaFinanciamento.registrarImovel(imovel6);
        opcoesParaFinanciamento.registrarImovel(imovel7);
        opcoesParaFinanciamento.registrarImovel(imovel8);
        opcoesParaFinanciamento.registrarImovel(imovel9);








        List<Imovel> todasAsOpcoes = opcoesParaFinanciamento.buscarOpcoes(Double.MAX_VALUE);
        if (todasAsOpcoes == null || todasAsOpcoes.isEmpty()) {
            throw new RuntimeException("\n\nAtenção! Você precisa registrar opções de financiamento antes de começar a usar o programa.\n"
                    + "Use o método 'registrarImovel', do objeto 'opcoesParaFinanciamento', para incluir algumas opções.\n");
        }

        System.out.println("\nVamos lá, preciso de algumas respostas...\n");
        Thread.sleep(1000);

        System.out.println(" Qual é o teu nome?");
        String nomeBeneficiario = new Scanner(System.in).next();
        Thread.sleep(500);

        System.out.println(" Agora eu preciso saber sobre a mascada, "+ nomeBeneficiario +". Qual é o teu salário?");
        double salarioBeneficiario = new Scanner(System.in).nextDouble();
        Thread.sleep(500);

        Beneficiario beneficiario = new Beneficiario(nomeBeneficiario, salarioBeneficiario);

        System.out.println(" Hummmm, tá grandão hein. E qual é o limite do valor de imóveis que você procura?");
        double valorParaPesquisa = new Scanner(System.in).nextDouble();
        Thread.sleep(500);

        System.out.println("\nTá, deixa eu ver aqui o que eu tenho de opções até "+ DecimalFormat.getCurrencyInstance().format(valorParaPesquisa) +"...");
        Thread.sleep(new Random().nextInt(4000) + 1000);

        List<Imovel> opcoesViaveis = opcoesParaFinanciamento.buscarOpcoes(valorParaPesquisa);
        if (opcoesViaveis == null || opcoesViaveis.isEmpty()) {
            throw new RuntimeException("\n\nPQP! Essa desgraça de programa não tem casas neste valor! Comece uma nova simulação.");
        }

        System.out.println("\nCerto! Encontrei "+ opcoesViaveis.size() + " opções aqui. Dá uma olhada:");
        int index = 0;
        for (Imovel imovel : opcoesViaveis) {
            System.out.printf(" [%d] %s\n", ++index, imovel.apresentacao());
            Thread.sleep(250);
        }

        Imovel imovelEscolhido = null;
        while (imovelEscolhido == null) {

            Thread.sleep(250);

            System.out.println("\nQual a opção que mais te agrada? (Me diz apenas o número.)");
            int opcaoEscolhida = new Scanner(System.in).nextInt();

            Thread.sleep(250);

            if (opcaoEscolhida < 1 || opcaoEscolhida > opcoesViaveis.size()) {
                System.out.println(" > Opção inválida!");
            } else {
                imovelEscolhido = opcoesViaveis.get(opcaoEscolhida - 1);
            }
        }

        System.out.println("\nShow de bola! Agora me diz em quantos meses você quer pagar essa tranqueira:");
        int mesesParaPagamento = new Scanner(System.in).nextInt();

        System.out.printf("\nHumm, certo %s. Você ganha %s e quer financiar um imóvel de %s, no estado %s, pagando em %d meses. Deixa eu ver se é possível...\n\n",
                beneficiario.getNome(),
                DecimalFormat.getCurrencyInstance().format(beneficiario.getSalario()),
                DecimalFormat.getCurrencyInstance().format(imovelEscolhido.getValor()),
                imovelEscolhido.getEndereco().getEstado(),
                mesesParaPagamento);
        Thread.sleep(new Random().nextInt(4000) + 1000);

        PropostaFinanciamento financiamento = new PropostaFinanciamento(beneficiario, imovelEscolhido, mesesParaPagamento);
        financiamento.validarProposta();
    }
}

