/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcmedia;

import java.lang.*;
import java.util.Scanner;

/**
 *
 * @author z004kz5h
 */
public class CalcMedia {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in); //instância de um objeto para leitura de teclado
        System.out.println("Cálculo de media");
        float a,b;
        
        System.out.print("Digite o numero 1: ");
        a=scan.nextInt();
        
        System.out.print("Digite o numero 2: ");
        b=scan.nextInt();
        
        System.out.println("A mééédia é: " + (a+b)/2);
 
    }
    
}
