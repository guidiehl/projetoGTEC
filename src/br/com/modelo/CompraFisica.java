
package br.com.modelo;

public class CompraFisica {
    
    private int codigo;
    private Veiculos carro;
    private FornecedorFisico fornecedor;
    private Colaborador comprador;
    private String dataCompra;

    public CompraFisica() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Veiculos getCarro() {
        return carro;
    }

    public void setCarro(Veiculos carro) {
        this.carro = carro;
    }

    public FornecedorFisico getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorFisico fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Colaborador getComprador() {
        return comprador;
    }

    public void setComprador(Colaborador comprador) {
        this.comprador = comprador;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    @Override
    public String toString() {
        return "CompraFisica{" + "codigo=" + codigo + ", carro=" + carro + ", fornecedor=" + fornecedor + ", comprador=" + comprador + ", dataCompra=" + dataCompra + '}';
    }
        
}
