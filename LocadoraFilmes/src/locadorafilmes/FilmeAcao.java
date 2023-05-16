package locadorafilmes;

// classe concreta FilmeAcao que herda da classe abstrata Filme
class FilmeAcao extends Filme {
    public FilmeAcao(String nome, int duration) {
        super(nome, duration);       //"super" serve para construir a classe pai com os parametros do filho
    }

    @Override       //sobrescreve o método da classe pai
    public void playFilme() {
        System.out.println("\nO filme " + nome + " está rodando");
    }
}