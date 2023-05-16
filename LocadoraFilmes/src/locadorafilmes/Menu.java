package locadorafilmes;
import java.lang.*;
import java.util.*;

public class Menu {
    public void Menu (){
        Scanner scan = new Scanner(System.in);
        // para o filme de Comedia
        System.out.println("Digite um filme de comedia para ser adicionado: ");
        String film_comedy = scan.nextLine();
        System.out.println("Digite a duracao desse filme, em minutos: ");
        int duration_comedy = scan.nextInt();
        scan.nextLine();    //recebe o Enter do usuário

        // para o filme de Ação
        System.out.println("Digite um filme de comedia para ser adicionado: ");
        String film_action = scan.nextLine();
        System.out.println("Digite a duracao desse filme, em minutos: ");
        int duration_action = scan.nextInt();
        scan.nextLine();



    }
}
