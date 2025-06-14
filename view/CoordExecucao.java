package Aplicacao;

import Utils.Estoque;
import Utils.MetodoFunc;
import Entidades.Funcionario;
import java.util.Scanner;

public class CoordExecucao {
    static Scanner sc = new Scanner(System.in);
    static Funcionario funcionario;

    public static void executa() {
        int opcao = 0;
        int opcao02 = 0;
        try {
            do {
                System.out.println("Selecione a opção desejada\n" +
                        "1-FUNCIONÁRIOS OU DOCUMENTOS\n2-ESTOQUE \n10- SAIR DO SISTEMA ");
                opcao = sc.nextInt();
                if(opcao != 1 || opcao != 2 || opcao != 10) {
                    System.out.println("Opção Inválida!");
                }
                if (opcao == 1) {
                    System.out.println("Selecione a opção desejada\n" +
                            "1-REGISTRAR FUNCIONÁRIO\n2-EDITAR FUNCIONÁRIO\n3-EXCLUIR FUNCIONÁRIO \n4-HOLERITE");
                    opcao02 = sc.nextInt();
                    switch (opcao02) {
                        case 1:
                            MetodoFunc.adicionarFuncionario();
                            break;
                        case 2:
                            MetodoFunc.editarFuncionario();
                            break;
                        case 3:
                            MetodoFunc.removerFuncionarios();
                            break;
                        case 4:
                            MetodoFunc.holerite();
                            break;
                        case 10:
                            System.out.println("-------------------Sistema Finalizado-------------------");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opção invalida!");
                    }
                } else if (opcao02 == 2) {
                    System.out.println("Selecione a opção desejada\n" +
                            "1-REGISTRAR PRODUTO\n2-EDITAR PRODUTO\n3-EXCLUIR PRODUTO ");
                    opcao02 = sc.nextInt();
                    switch (opcao02) {
                        case 1:
                            Estoque.adicionarProduto();
                            break;
                        case 2:
                            Estoque.editarProduto();
                            break;
                        case 3:
                            Estoque.removerProduto();
                            break;
                        default:
                            System.out.println("Opção invalida!");
                    }
                }
            } while (opcao <= 10);

            }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}