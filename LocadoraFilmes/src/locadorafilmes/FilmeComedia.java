package locadorafilmes;

// Classe concreta FilmeComédia que herda de locadorafilmes.Filme
class FilmeComedia extends Filme {
    public FilmeComedia(String nome, int duration) {
        super(nome, duration);
    }

    @Override
    public void playFilme() {
        System.out.print("O filme " + nome + " está rodando");
    }
}
