package listadetarefas;
import java.lang.*;
import java.util.*;

public class Task { 
    String titulo;
    String descricao;
    int duracao;
    
    public Task(/*String titulo, String descricao, int duracao*/) {
//        this.titulo=titulo;
//        this.descricao=descricao;
//        this.duracao=duracao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }    

    public int getDuracao(){
        return duracao;
    }
    public void setDuracao(int duracao){
        this.duracao=duracao;
    }
}

