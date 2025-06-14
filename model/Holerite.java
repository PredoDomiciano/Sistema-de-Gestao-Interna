package Entidades;

public class Holerite extends Documento {
    private int idHolerite;
    private int mesReferencia;
    private int AnoReferencia;
    private double salarioBruto;
    private double descontos;
    private double salarioLiquido;

    public Holerite() {
    }

    public Holerite(int idDocumento, int tipoDocumento, String dataCriacao, int idEmpregado, int idHolerite, int mesReferencia, double salarioBruto, int anoReferencia, double descontos, double salarioLiquido) {
        super(idDocumento, tipoDocumento, dataCriacao, idEmpregado);
        this.idHolerite = idHolerite;
        this.mesReferencia = mesReferencia;
        this.salarioBruto = salarioBruto;
        AnoReferencia = anoReferencia;
        this.descontos = descontos;
        this.salarioLiquido = salarioLiquido;
    }

    public int getIdHolerite() {
        return idHolerite;
    }

    public void setIdHolerite(int idHolerite) {
        this.idHolerite = idHolerite;
    }

    public int getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(int mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public int getAnoReferencia() {
        return AnoReferencia;
    }

    public void setAnoReferencia(int anoReferencia) {
        AnoReferencia = anoReferencia;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
}
