
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MenuTurma {
    Scanner leitor = new Scanner(System.in);
    Map<String, Aluno> alunos = new HashMap<>();

    public void menuPrincipal() {
        System.out.println("------GERENCIADOR DE TURMA------");
        System.out.println(
                "1 - Incluir Aluno\n2 - Visualizar Registros\n3 - Excluir Aluno\n4 - Atualizar Registro\n0 - Encerrar Programa");

        int opcao = leitor.nextInt();
        while (opcao != 0) {
            switch (opcao) {
            case 0:
                break;
            case 1:
                incluirAluno();
                break;
            case 2:
                System.out.println("1 - Visualizar todos os registros\n2 - Visualizar aluno específico");
                int escolha = leitor.nextInt();
                if (escolha == 1) {
                    imprimirTodos();
                } else if (escolha == 2) {
                    imprimirEspecifico();
                } else {
                    System.out.println("Opção inválida!");
                }
                break;
            case 3:
                excluirAluno();
                break;
            default:
                break;
        }
        }
        
    }
    
    public void incluirAluno() {
        System.out.print("Insira o nome: ");
        String nome = leitor.next();

        System.out.print("Insira a nota p1: ");
        double p1 = leitor.nextDouble();

        System.out.print("Insira a nota p2: ");
        double p2 = leitor.nextDouble();

        Aluno aluno = new Aluno(nome, p1, p2);
        alunos.put(nome, aluno);
    }

    public void imprimirTodos() {
        if (alunos.isEmpty()) {
            System.out.println("\n\n################################");
            System.out.println("Nenhum registro encontrado!");
            System.out.println("################################\n\n");
        } else {
            for (String nome : alunos.keySet()) {
                Aluno aluno = alunos.get(nome);
                aluno.imprimeAluno();
            }
        }
    }

    public void imprimirEspecifico() {
        leitor.nextLine();
        System.out.print("Digite o nome: ");
        String nome = leitor.nextLine();
        if (alunos.containsKey(nome)) {
            Aluno aluno = alunos.get(nome);
            aluno.imprimeAluno();
        }
        else {
            System.out.println("\n\n################################");
            System.out.println("Aluno não encontrado!");
            System.out.println("################################\n\n");
        }
    }

    public void excluirAluno(){
        leitor.nextLine();
        System.out.println("Digite o nome do aluno a ser excluido:");
        String nome = leitor.next();
        if(alunos.containsKey(nome)){
            alunos.remove(nome);
            System.out.println(".................................");
            System.out.println("ALUNO EXCLUIDO!");
        } else {
            System.out.println("\n\n################################");
            System.out.println("Aluno não encontrado!");
            System.out.println("################################\n\n");
        }
    }

}