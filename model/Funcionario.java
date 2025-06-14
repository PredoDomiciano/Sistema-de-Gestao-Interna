package Entidades;

public class Funcionario extends Usuario {
    private int idFuncionario;
    private String dataAdmissao;
    private String cargo;
    private double salario;
    private String nome;
    private String cpf;

    public Funcionario() {
    }

    public Funcionario(String email, String senha, int idFuncionario, String dataAdmissao, String cargo, double salario, String nome, String cpf) {
        super(email, senha);
        this.idFuncionario = idFuncionario;
        this.dataAdmissao = dataAdmissao;

        this.cargo = cargo;
        this.salario = salario;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String cargoParaString(int cargo) {
        return switch (cargo) {
            case 1 -> "Gerente";
            case 2 -> "RH";
            case 3 -> "Financeiro";
            default -> "Desconhecido";
        };
    }

    public String toString() {
        return "Funcionário {" +
                "ID: " + idFuncionario +
                ", Nome: '" + nome + '\'' +
                ", CPF: '" + cpf + '\'' +
                ", Cargo: " + cargo +
                ", Salário: R$ " + String.format("%.2f", salario) +
                ", Admissão: '" + dataAdmissao + '\'' +
                '}';
    }
}
