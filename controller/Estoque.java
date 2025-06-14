package Utils;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Produto;

import java.util.List;

public class Estoque {
    static Scanner sc = new Scanner(System.in);
    static List<Produto> produto = new ArrayList<Produto>();

    public static void adicionarProduto() {

        System.out.print("Digite o id do produto: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Digite a descrição do produto: ");
        String descricao = sc.nextLine();
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();
        System.out.print("Digite o valor unitario do produto: ");
        double valorUnitario = sc.nextDouble();

        produto.add(new Produto(id, nome, descricao, quantidade, valorUnitario));
    }

    public static void editarProduto() {
        System.out.println("------------------------Lista de produtos------------------------");
        for (Produto p : produto) {
            System.out.println(p);
        }

        System.out.print("Digite o id do produto que deseja editar: ");
        int idP = sc.nextInt();
        sc.nextLine();
        Produto encontrado = null;
        for (Produto p : produto) {
            if (p.getIdProduto() == idP) {
                encontrado = p;
                break;
            }
        }
        if (encontrado == null) {
            System.out.println("Produto com ID " + idP + " não encontrado.");
            return;
        }
        boolean continuar = true;
        while (continuar) {
            System.out.print("Oque deseja editar" +
                    " \n1-Nome do Produto" +
                    "\n2-Descrição do Produto" +
                    "\n3-Quantidade" +
                    "\n4-Preço Unitário :");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Editar Nome do produto: ");
                    encontrado.setNomeProduto(sc.nextLine());
                    sc.nextLine();
                    break;
                case 2:
                    System.out.print("Editar descrição do produto:");
                    encontrado.setDescricaoProduto(sc.nextLine());
                    sc.nextLine();
                    break;
                case 3:
                    System.out.print("Editar quantidade do produto:");
                    encontrado.setQuantidadeProduto(sc.nextInt());
                    sc.nextLine();
                    break;
                case 4:
                    System.out.print("Editar valorUnitario do produto:");
                    encontrado.setPrecoUnitario(sc.nextDouble());
                    sc.nextLine();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Finalizado com sucesso!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void removerProduto() {
        if (produto.isEmpty()) {
            System.out.println("-----------------Opção Invalida-----------------");
        } else {
            System.out.print("Digite o id do produto que deseja remover: ");
            int id = sc.nextInt();
            produto.remove(id);
        }
    }
}
