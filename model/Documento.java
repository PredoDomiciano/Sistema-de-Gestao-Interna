package Entidades;

public class Documento {
    private int idDocumento;
    private int tipoDocumento;
    private String dataCriacao;
    private int idEmpregado;

    public Documento() {
    }

    public Documento(int idDocumento, int tipoDocumento, String dataCriacao, int idEmpregado) {
        this.idDocumento = idDocumento;
        this.tipoDocumento = tipoDocumento;
        this.dataCriacao = dataCriacao;
        this.idEmpregado = idEmpregado;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getIdEmpregado() {
        return idEmpregado;
    }

    public void setIdEmpregado(int idEmpregado) {
        this.idEmpregado = idEmpregado;
    }
}
