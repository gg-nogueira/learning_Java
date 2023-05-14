package calculomdc;

import java.util.Scanner;

public class CalculoMDC {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Digite o primeiro número: ");
      int num1 = input.nextInt();

      System.out.print("Digite o segundo número: ");
      int num2 = input.nextInt();

      int mdc = calcularMDC(num1, num2);

      System.out.println("O MDC de " + num1 + " e " + num2 + " é " + mdc);
   }

   public static int calcularMDC(int num1, int num2) {
      int resto = num1 % num2;
       System.out.println("O resto é: " + resto);
      if (resto == 0) {
          System.out.println("Aaaa " + num2 + "bbb " + resto);
         return num2;
      } else {
          System.out.println("ccccc " + num2 + "ddddd " + resto);
         return calcularMDC(num2, resto);
      }
   }
}






