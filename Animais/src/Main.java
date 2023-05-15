import java.util.*;
import java.lang.*;

// Classe abstrata Filme, que servirá como "pai" para as outras classes
abstract class Filme {
    protected String nome;
    protected int duration;

    public Filme(String nome, int duration) {
        this.nome = nome;
        this.duration=duration;
    }

    public abstract void playFilme();
}

// Classe concreta FilmeComédia que herda de Filme
class FilmeComedia extends Filme {
    public FilmeComedia(String nome, int duration) {
        super(nome, duration);
    }

    @Override
    public void playFilme() {
        System.out.print("O filme " + nome + " está rodando");
    }
}

// Classe concreta FilmeComédia que herda de Filme
class FilmeAcao extends Filme {
    public FilmeAcao(String nome, int duration) {
        super(nome, duration);
    }

    @Override
    public void playFilme() {
        System.out.println("\nO filme " + nome + " está rodando");
    }
}

// Interface Comportamento
interface Locadora {
    void alugar();
}

// Classe ColecaoFilme que implementa a interface Locadora
class ColecaoFilme implements Locadora {
    private List<Filme> Filme = new ArrayList<>();

    public void addFilme (Filme filme) {
        Filme.add(filme);
    }

    @Override
    public void alugar() {
        for (Filme filmes : Filme) {
            System.out.println(filmes.nome + " foi alugado.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação de objetos
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Fale o nome do filme que você quer adicionar: ");
//
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


