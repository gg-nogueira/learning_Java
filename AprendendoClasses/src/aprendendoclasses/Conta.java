/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendendoclasses;

/**
 *
 * @author z004kz5h
 */
public class Conta {
    //atributos
    int numeroConta;
    int numeroCliente;
    double saldo;
    String dataAbertura;
    
    //métodos
    void saqueConta(double valor){
        saldo=saldo-valor;
    }
    void depositoConta(double valor){
        saldo=saldo+valor;
    }
    
    //construtor
    public Conta(){
       this.saldo=100.0;   
    }
    
}
