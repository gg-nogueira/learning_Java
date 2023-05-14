/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;

import java.util.Scanner;

/**
 *
 * @author z004kz5h
 */
public class Tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que você quer saber a tabuada: ");  
        int num = scan.nextInt();

        for (int i=0;i<=10;i++){
            System.out.println(num + "X" + i + "=" + (i * num));
        }
    }
}
