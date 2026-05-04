

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTurma {
    Scanner leitor = new Scanner(System.in);
    AcoesTurma acoes = new AcoesTurma();

    public void menuPrincipal() {
        int opcao = -1;

        while (opcao != 0) {
            try {
                System.out.println("\n|------ GERENCIADOR DE TURMA ------|");
                System.out.println(
                        "1 - Incluir Aluno\n2 - Visualizar Registros\n3 - Excluir Aluno\n4 - Atualizar Registro\n0 - Encerrar Programa");

                opcao = leitor.nextInt();
                switch (opcao) {
                    case 0:
                        System.out.println("Encerrando...");
                        break;
                    case 1:
                        acoes.incluirAluno();
                        break;
                    case 2:
                        System.out.println("1 - Visualizar todos os registros\n2 - Visualizar aluno específico");
                        int escolha = leitor.nextInt();
                        if (escolha == 1) {
                            acoes.imprimirTodos();
                        } else if (escolha == 2) {
                            acoes.imprimirEspecifico();
                        } else {
                            System.out.println("Opção inválida!");
                        }
                        break;
                    case 3:
                        acoes.excluirAluno();
                        break;
                    case 4:
                        acoes.atualizarAluno();
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(
                        "#################################\nDigite uma opção válida!\n#################################");
                leitor.nextLine();
            }
        }

    }
}