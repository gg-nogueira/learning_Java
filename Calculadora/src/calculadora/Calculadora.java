/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.lang.*;
import java.util.Scanner;

/**
 *
 * @author z004kz5h
 */
public class Calculadora {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Programa de Calculadora");
        
        float a,b;
        String operador;
        
        System.out.print("Digite o n1: ");
        a=scan.nextInt();
        
        System.out.print("Digite o operador (+, -, * ou /) : ");
        operador=scan.next();
        
        System.out.print("Digte o n2: ");
        b=scan.nextInt();
       
        switch(operador) {
            case ("+"):
                System.out.println("A soma dos dois numeros e: "+ (a+b));
                break;
            case ("-"):
                System.out.println("A subtracao dos dois numeros e: " + (a-b));
                break;
            case ("*"):
                System.out.println("A multiplicacao dos dois numeros e: " +(a*b));
                break;
            case ("/"):
                System.out.println("A divisao dos dois numeros e: " + (a/b));
                break;
            default:
                System.out.println("A entrada está errada.");
        }
    }
    
}
