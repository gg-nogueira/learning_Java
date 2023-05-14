/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoexemplo1;

import java.util.*;  
  
public class projetoexemplo1 {  
    
    public static void main (String args[]){ 
  
        //declarando as varíaveis  
        float opcao = 5;
        int n1;  
        int n2;  
        Scanner input1 = new Scanner(System.in);
        
        while (opcao != 0) {
        
            System.out.println("Qual o primeiro numero: ");  
            n1 = input1.nextInt();  
            System.out.println("Qual o segundo numero: ");  
            n2 = input1.nextInt();

            float conta=0;
        
            System.out.println("-Escolha uma opção-");  
            System.out.println("1. Soma");    
            System.out.println("2. Subtracao");    
            System.out.println("3. Multiplicacao");    
            System.out.println("4. Divisao");    
            System.out.println("0. Sair");    
            System.out.println("Operação: ");
            
            opcao = input1.nextFloat(); 
            
            if ( opcao == 1 ) {
                conta = n1+n2;
                System.out.printf("\nO resultado da soma é: " + conta + "\n");  
            }
    
            else if (opcao == 2) { 
                conta = n1-n2;
                System.out.printf("\nO resultado da subtracao é: " + conta + "\n");            
            }
 
            else if (opcao == 3){
                conta = n1*n2;
                System.out.printf("\nO resultado da multiplicacao é: " + conta + "\n");
            }
            
            else if (opcao == 4){
                conta = n1/n2;
                System.out.printf("\nO resultado da divisao é: " + conta + "\n"); 
            }
            
            else {
                break;
            }
        }      
    } 
}
  