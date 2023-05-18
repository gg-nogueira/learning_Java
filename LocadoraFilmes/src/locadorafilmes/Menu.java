package locadorafilmes;

import java.lang.*;
import java.util.*;

public class Menu {
    public void exibirMenu (){
        try (Scanner scan = new Scanner(System.in)) {

            // para o filme de Comedia

            boolean alugado_comedia, alugado_acao;
            //criação de 2 variáveis que controlarão se o usário quer alugar ou não os filmes

            System.out.println("Digite um filme de comedia para ser adicionado: ");
            String film_comedy = scan.nextLine();
            System.out.println("Digite a duracao desse filme, em minutos: ");
            int duration_comedy = scan.nextInt();
            scan.nextLine();    //recebe o Enter do usuário
            do {
                System.out.println("Você deseja alugar esse filme? S/N");
                String option_comedia = scan.nextLine().toUpperCase();
                if (option_comedia.equals("S")) {
                    alugado_comedia = true;
                } else if (option_comedia.equals("N")) {
                    alugado_comedia = false;
                } else {
                    System.out.println("O valor digitado é inválido. Tente novamente.");
                    continue;
                }
                break;
            } while (true);



            // para o filme de Ação
            System.out.println("Digite um filme de acao para ser adicionado: ");
            String film_action = scan.nextLine();
            System.out.println("Digite a duracao desse filme, em minutos: ");
            int duration_action = scan.nextInt();
            scan.nextLine();

            do {
                System.out.println("Você deseja alugar esse filme? S/N");
                String option_acao = scan.nextLine().toUpperCase();
                if (option_acao.equals("S")) {
                    alugado_acao = true;
                } else if (option_acao.equals("N")) {
                    alugado_acao = false;
                } else {
                    System.out.println("O valor digitado é inválido. Tente novamente.");
                    continue;
                }
                break;
            } while (true);

            // criação dos objetos com base na entreda do usuário
            FilmeComedia comedia = new FilmeComedia(film_comedy, duration_comedy, alugado_comedia);
            FilmeAcao acao = new FilmeAcao(film_action, duration_action, alugado_acao);
            ColecaoFilme colecao = new ColecaoFilme();

            // chama os métodos declarados em outras classes
            colecao.addFilme (comedia);
            colecao.addFilme(acao);
            colecao.alugar();
            comedia.playFilme();
            acao.playFilme();
        }
    }
}
