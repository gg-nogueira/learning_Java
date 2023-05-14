package aprendendosettersgetters;
import java.util.ArrayList;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

public class aprendendosettersgetters {
    public static void adicionaPessoa(Scanner scanner, ArrayList <Pessoa> listaDePessoas){
        int cont = 1;
        while (true) {

        System.out.println("Digite o nome da " + cont + "a. pessoa (ou 'encerrar'): ");
        String nome = scanner.nextLine();
        if (nome.equals("encerrar")) {
            break;
        }
        cont = cont+1;
        
        System.out.println("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        Pessoa novaPessoa = new Pessoa(nome, idade);                //como o construtor é parametrizado, a instância também deverá ser

        //adiciona o Objeto pessoa na lista
        listaDePessoas.add(novaPessoa);
    }
}

    public static void main(String[] args) {
        //lista dos objetos Pessoa
        ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();

        Scanner scanner = new Scanner(System.in);
        
        adicionaPessoa(scanner, listaDePessoas);

        //mostrar as pesssoas da lista
        System.out.println("\n\nPessoas cadastradas:");
        for (Pessoa elements : listaDePessoas) {
            System.out.println(elements.getNome() + "\t-\t" + elements.getIdade() + " anos");
        }
    }
}
