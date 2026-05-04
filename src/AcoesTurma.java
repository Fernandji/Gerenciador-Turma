

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class AcoesTurma {

    Scanner leitor = new Scanner(System.in);
    Map<String, Aluno> alunos = new LinkedHashMap<>();

    public void incluirAluno() {
        System.out.print("Insira o nome: ");
        String nome = leitor.next();

        System.out.print("Insira a nota P1: ");
        double p1 = leitor.nextDouble();

        System.out.print("Insira a nota P2: ");
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
        } else {
            System.out.println("\n\n################################");
            System.out.println("Aluno não encontrado!");
            System.out.println("################################\n\n");
        }
    }

    public void excluirAluno() {
        System.out.println("Digite o nome do aluno a ser excluido:");
        String nome = leitor.next();
        if (alunos.containsKey(nome)) {
            alunos.remove(nome);
            System.out.println("\n\n################################");
            System.out.println("ALUNO EXCLUIDO!");
            System.out.println("################################\n\n");
        } else {
            System.out.println("\n\n################################");
            System.out.println("Aluno não encontrado!");
            System.out.println("################################\n\n");
        }
    }

    public void atualizarAluno() {
        System.out.println("Digite o nome do aluno para atualizar cadastro:");
        String nome = leitor.next();

        if (alunos.containsKey(nome)) {
            Aluno aluno = alunos.get(nome);
            aluno.imprimeAluno();
            System.out.println("Sobrescreva as informações:");
            System.out.print("Insira o nome: ");
            String nome2 = leitor.next();

            System.out.print("Insira a nota P1: ");
            double p1 = leitor.nextDouble();

            System.out.print("Insira a nota P2: ");
            double p2 = leitor.nextDouble();
            Aluno aluno2 = new Aluno(nome2, p1, p2);
            alunos.remove(nome, aluno);
            alunos.put(nome2, aluno2);
            System.out.println("\n\n################################");
            System.out.println("Aluno Atualizado!");
            System.out.println("################################\n\n");

        } else {
            System.out.println("\n\n################################");
            System.out.println("Aluno não encontrado!");
            System.out.println("################################\n\n");
        }
    }
}
