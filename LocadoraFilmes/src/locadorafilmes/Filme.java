package locadorafilmes;

// Classe abstrata locadorafilmes.Filme, que servirá como "pai" para as outras classes
abstract class Filme {
    protected String nome;
    protected int duration;

    public Filme(String nome, int duration) {
        this.nome = nome;
        this.duration=duration;
    }

    public abstract void playFilme();
}
