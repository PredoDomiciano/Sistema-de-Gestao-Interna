package Utils;

import Entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodoFunc extends Funcionario {
    static Scanner sc = new Scanner(System.in);
    static List<Funcionario> colaboradores = new ArrayList<>();

    public static void adicionarFuncionario() {
        System.out.println("Digite o ID do Funcionario: ");
        int idFuncionario = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do funcionario: ");
        String nome = sc.nextLine();
        System.out.println("Digite o email do funcionario: ");
        String email = sc.nextLine();
        System.out.println("Digite o salario do funcionario: ");
        double salario = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o cpf do funcionario: ");
        String cpf = sc.nextLine();
        System.out.println("Digite o cargo do funcionario: ");
        String cargo = sc.nextLine();
        System.out.println("Digite a data de admissão do funcionario: ");
        String dataAdmissao = sc.nextLine();
        System.out.println("Digite a senha do funcionario: ");
        String senha = sc.nextLine();
        colaboradores.add(new Funcionario(email, senha, idFuncionario, dataAdmissao, cargo, salario, nome, cpf));
    }

    public static void removerFuncionarios() {
        System.out.println("Lista de funcionários:");
        for (Funcionario f : colaboradores) {
            System.out.println(f);
        }
        System.out.print("Digite o ID do funcionario que deseja remover: ");
        int ID = sc.nextInt();
        if (ID >= 0 && ID < colaboradores.size()) {
            Funcionario removido = colaboradores.remove(ID);
            System.out.println("Removido: " + removido);
        } else {
            System.out.println("ID inválido.");
        }
    }

    public static void editarFuncionario() {
        System.out.println("Lista de funcionários:");
        for (Funcionario f : colaboradores) {
            System.out.println(f);
        }
        System.out.print("Digite o ID do funcionário que deseja editar: ");
        int idProcurado = sc.nextInt();
        sc.nextLine();
        Funcionario encontrado = null;

        for (Funcionario f : colaboradores) {
            if (f.getIdFuncionario() == idProcurado) {
                encontrado = f;
                break;
            }
        }
        if (encontrado == null) {
            System.out.println("Funcionário com ID " + idProcurado + " não encontrado.");
            return;
        }
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEditar Funcionário: " + encontrado.getNome());
            System.out.println("1 - Nome");
            System.out.println("2 - CPF");
            System.out.println("3 - Cargo");
            System.out.println("4 - Salário");
            System.out.println("5 - Data de Admissão");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Novo nome: ");
                    encontrado.setNome(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Novo CPF: ");
                    encontrado.setCpf(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Novo cargo (número): ");
                    encontrado.setCargo(sc.nextLine());
                    sc.nextLine();
                    break;
                case 4:
                    System.out.print("Novo salário: ");
                    encontrado.setSalario(sc.nextDouble());
                    sc.nextLine();
                    break;
                case 5:
                    System.out.print("Nova data de admissão: ");
                    encontrado.setDataAdmissao(sc.nextLine());
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Edição finalizada.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        System.out.println("\nDados atualizados:");
        System.out.println(encontrado);
    }

    public static void holerite() {
        System.out.println("--- Gerar Holerite ---");
        System.out.println("Lista de funcionários:");
        // Verifica se há funcionários para evitar erro se a lista estiver vazia
        if (colaboradores.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado para gerar holerite.");
            return;
        }
        for (Funcionario f : colaboradores) {
            System.out.println("ID: " + f.getIdFuncionario() + " - Nome: " + f.getNome());
        }

        System.out.print("Digite o ID do funcionário para gerar o holerite: ");
        int idFuncionarioProcurado = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha

        Funcionario funcionarioEncontrado = null;
        for (Funcionario f : colaboradores) {
            if (f.getIdFuncionario() == idFuncionarioProcurado) {
                funcionarioEncontrado = f;
                break; // Encontrou o funcionário, pode sair do loop
            }
        }

        if (funcionarioEncontrado == null) {
            System.out.println("Funcionário com ID " + idFuncionarioProcurado + " não encontrado.");
            return; // Sai do método se o funcionário não for encontrado
        }

        // Se o funcionário foi encontrado, procede com o holerite
        System.out.print("Digite o mês de referência (ex: Janeiro): ");
        String mesReferente = sc.nextLine();

        System.out.print("Digite o ano de referência (ex: 2024): ");
        String anoReferente = sc.nextLine();

        System.out.println("\n--- HOLERITE ---");
        System.out.println("Funcionário: " + funcionarioEncontrado.getNome());
        System.out.println("CPF: " + funcionarioEncontrado.getCpf());
        System.out.println("Cargo: " + funcionarioEncontrado.getCargo()); // Supondo que cargo seja um número que pode ser interpretado
        System.out.println("Mês/Ano de Referência: " + mesReferente + "/" + anoReferente);
        System.out.printf("Salário Bruto: R$ %.2f%n", funcionarioEncontrado.getSalario());

        System.out.print("Digite o valor total dos descontos (ex: INSS, VT, etc.): ");
        double descontos = sc.nextDouble();
        sc.nextLine(); // Consome a quebra de linha

        double salarioLiquido = funcionarioEncontrado.getSalario() - descontos;
        System.out.printf("Total de Descontos: R$ %.2f%n", descontos);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
        System.out.println("----------------\n");
    }
}