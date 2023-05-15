package locadorafilmes;

import java.util.ArrayList;
import java.util.List;

// Classe locadorafilmes.ColecaoFilme que implementa a interface Locadora
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
