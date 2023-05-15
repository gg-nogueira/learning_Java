package locadorafilmes;
import java.lang.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Criação de objetos

        FilmeComedia comedia = new FilmeComedia("Trapalhões", 150);
        FilmeAcao acao = new FilmeAcao("Velozes", 240);
        ColecaoFilme colecao = new ColecaoFilme();

        // Chamada de métodos
        comedia.playFilme();
        acao.playFilme();
        colecao.addFilme (comedia);
        colecao.addFilme(acao);
        colecao.alugar();
    }
}
