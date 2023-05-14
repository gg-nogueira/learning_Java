/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendendoclasses;

import java.util.Scanner;

/**
 *
 * @author z004kz5h
 */
public class TestaExemploDeClasses {
    public static void main(String[] args){        //método main permite que a classe seja executada
        //
        double tira=0;
        Scanner scan = new Scanner(System.in);
        
        ContaPoupanca cp = new ContaPoupanca();    //objeto cp para conta poupança
        
        System.out.println("Saldo em poupança atual: "+ cp.saldo);
        System.out.print("Quanto você quer retirar agora?: ");
        cp.saqueConta(scan.nextDouble()); //tira = scan.nextDouble();
        System.out.println("Saldo em poupança pós saque:" + cp.saldo);
        
        System.out.println("\n"); //pulando linhas
        
        ContaCorrente cr = new ContaCorrente(); //instancia da classe ContaCorrente no objeto cr
        
        System.out.println("Saldo em conta corrente atual: "+ cr.saldo);
        System.out.print("Quanto você quer retirar agora?: ");
        cr.saqueConta(scan.nextDouble()); //tira = scan.nextDouble();
        System.out.println("Saldo em pconta corrente pós saque:" + cr.saldo);
    }
}
