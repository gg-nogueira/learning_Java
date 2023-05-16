package locadorafilmes;

// Classe abstrata Filme, que servirá como "pai" para outras classes e não poderá ser instanciada
abstract class Filme {
    // atributos da classe pai
    protected String nome;
    protected int duration;

    // construtor da classe pai
    public Filme(String nome, int duration) {
        this.nome = nome;
        this.duration=duration;
    }
    // método da classe pai
    public abstract void playFilme();
}
