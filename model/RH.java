package Entidades;

import java.util.Date;

public class RH extends Funcionario {
    private int idRH;
    private String nomeResponsavel;
    private String ramal;
    private String email;

    public RH() {
    }

    public RH(String email, String senha, int idFuncionario, String dataAdmissao, String cargo, double salario, String nome, String cpf, int idRH, String nomeResponsavel, String email1, String ramal) {
        super(email, senha, idFuncionario, dataAdmissao, cargo, salario, nome, cpf);
        this.idRH = idRH;
        this.nomeResponsavel = nomeResponsavel;
        this.email = email1;
        this.ramal = ramal;
    }

    public int getIdRH() {
        return idRH;
    }

    public void setIdRH(int idRH) {
        this.idRH = idRH;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
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
