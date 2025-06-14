package Entidades;

import java.util.Date;

public class Estoquista extends Funcionario {

    private int idEstoque;
    private String responsavel;
    private String email;

    public Estoquista() {
    }

    public Estoquista(String email, String senha, int idFuncionario, String dataAdmissao, String cargo, double salario, String nome, String cpf, int idEstoque, String responsavel, String email1) {
        super(email, senha, idFuncionario, dataAdmissao, cargo, salario, nome, cpf);
        this.idEstoque = idEstoque;
        this.responsavel = responsavel;
        this.email = email1;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
