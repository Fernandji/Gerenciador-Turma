


import java.util.LinkedHashMap;
import java.util.Map;

public class AcoesTurma {

    
    Map<String, Aluno> alunos = new LinkedHashMap<>();

    public void incluirAluno(String nome, double p1, double p2) {
        Aluno aluno = new Aluno(nome, p1, p2);
        alunos.put(nome, aluno);
        System.out.println("\nAluno adicionado com sucesso!\n");
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

    public void imprimirEspecifico(String nome) {
        if (alunos.containsKey(nome)) {
            Aluno aluno = alunos.get(nome);
            aluno.imprimeAluno();
        } else {
            System.out.println("\n\n################################");
            System.out.println("Aluno não encontrado!");
            System.out.println("################################\n\n");
        }
    }

    public void excluirAluno(String nome) {
        if (alunos.containsKey(nome)) {
            alunos.remove(nome);
            System.out.println("\n\n################################");
            System.out.println("Aluno excluído!");
            System.out.println("################################\n\n");
        } else {
            System.out.println("\n\n################################");
            System.out.println("Aluno não encontrado!");
            System.out.println("################################\n\n");
        }
    }

    public void atualizarAluno(String nome, String nome2, double p1, double p2) {
        if (alunos.containsKey(nome)) {
            Aluno aluno = alunos.get(nome);
            aluno.imprimeAluno();
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
