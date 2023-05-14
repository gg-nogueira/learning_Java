package listadetarefas;
import java.lang.*;
import java.util.*;

public class ListaDeTarefas {
    public static void adicionaLista (Scanner scan, ArrayList <Task> listaDeTarefas){
        while (true){
            Task t = new Task ();
        
            System.out.println("Digite o título da tarefa: ");
            t.setTitulo(scan.nextLine());
            
            System.out.println("Digite uma descrição da tarefa " + t.titulo);
            t.setDescricao(scan.nextLine());
            
            System.out.println("Digite quanto tempo essa tarefa durará, em dias: ");
            t.setDuracao(scan.nextInt());
            scan.nextLine();        //esse scan é necessário para receber o Enter do teclado
            
            listaDeTarefas.add(t);  // Adiciona na lista
            
            System.out.println("Deseja adicionar outra tarefa? (S/N)");
            String resposta = scan.nextLine();
            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        //criando lista para armazenar os objetos
        ArrayList<Task> listaDeTarefas = new ArrayList<Task>();
        Scanner scan = new Scanner(System.in);
        //apresentar menu
        boolean j = true;
        do {
            System.out.println("Bem vindo a sua lista de tarefas personalizada\nEscolha uma opcao");
            System.out.println("[1] - Mostrar tarefas\n[2] - Adicionar tarefas\n[3]- Remover tarefa\n[4] - Sair");
            int opcao = scan.nextInt();
            scan.nextLine();        //esse scan é necessário para receber o Enter do teclado

            switch (opcao){
                case 1:
                    System.out.println("\n\nTarefas cadastradas:");
                    for (Task elements : listaDeTarefas)
                        System.out.println("* "+elements.getTitulo());
                    break;
                case 2:
                    //adiciona um objeto na listaDeTarefas
                    adicionaLista(scan, listaDeTarefas);                  
                    break;
                case 3:
                    //remover um objeto na listaDeTarefas
                    break;
                case 4:
                    System.out.println("Obrigado por colaborar!");
                    break;
                default:
                    System.out.println("Ocorreu um erro. Tente novamente.");
                    break;
            }
        } while (j);
    }
}
