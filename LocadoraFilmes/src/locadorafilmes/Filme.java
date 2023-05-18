package locadorafilmes;

// Classe abstrata Filme, que servirá como "pai" para outras classes e não poderá ser instanciada
abstract class Filme {
    // atributos da classe pai
    private String nome;
    private int duration;
    private boolean alugado;

    // construtor da classe pai
    public Filme(String nome, int duration, boolean alugado) {
        this.nome = nome;
        this.duration = duration;
        this.alugado = alugado;
    }
	
	//métodos setters e getters da classe pai
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public boolean Alugado() {
        return alugado;
    }
    
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
	
    // método da classe pai
    public abstract void playFilme();
}
