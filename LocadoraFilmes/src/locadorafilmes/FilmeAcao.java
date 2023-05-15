package locadorafilmes;

// Classe concreta FilmeComédia que herda de locadorafilmes.Filme
class FilmeAcao extends Filme {
    public FilmeAcao(String nome, int duration) {
        super(nome, duration);
    }

    @Override
    public void playFilme() {
        System.out.println("\nO filme " + nome + " está rodando");
    }
}