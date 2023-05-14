/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendendoclasses;

/**
 *
 * @author z004kz5h
 */
public class ContaPoupanca extends Conta{ //herança
    String datasAniversarios;
    
    void saqueConta(double valor){ //polimorfismo
        if ((saldo - valor)< 0){
            System.out.println("ERROR: Saldo ficará abaixo de 0.00");
        }
        else{
            saldo=saldo-valor;
        }
    }
}
