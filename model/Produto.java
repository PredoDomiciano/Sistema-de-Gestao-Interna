package Entidades;

public class Produto {
    private int idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private int quantidadeProduto;
    private double precoUnitario;

    public Produto() {
    }

    public Produto(int idProduto, String nomeProduto, String descricaoProduto, int quantidadeProduto, double precoUnitario) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoUnitario = precoUnitario;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return "Produto " +
                "ID do Produto = " + idProduto +
                ", Nome Do Produto = " + nomeProduto +
                ", Descrição do Produto = " + descricaoProduto +
                ", Quantidade de Produtos = " + quantidadeProduto +
                ", Preço Unitário = " + precoUnitario
                ;
    }
}
