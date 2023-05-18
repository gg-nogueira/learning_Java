package locadorafilmes;

import java.util.*;
import java.lang.*;

// Classe concreta ColecaoFilme que implementa a interface Locadora
class ColecaoFilme implements Locadora {
    // criação de lista para armazenar os dados do tipo "Filme"
    private List<Filme> Filme = new ArrayList<>();

    // chama o método da classe
    public void addFilme (Filme filme) {        // função criada para adicionar na lista "Filme" o objeto do tipo Filme
        Filme.add(filme);
    }

    @Override       // sobrescreve o método da Interface Locadora
    public void alugar() {
        for (Filme filmes : Filme) {
            String status = filmes.Alugado() ? "foi alugado" : " não foi alugado";
            System.out.println(filmes.getNome() + status );
        }
    }
}
