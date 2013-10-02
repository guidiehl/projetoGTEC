
package br.com.modelo;

public class CompraJuridica {
    
    private int codigo;
    private Veiculos carro;
    private FornecedorJuridico fornecedor;
    private Colaborador comprador;
    private String dataCompra;

    public CompraJuridica() {
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

    public FornecedorJuridico getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorJuridico fornecedor) {
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
        return "Compras{" + "codigo=" + codigo + ", produto=" + carro + ", fornecedor=" + fornecedor + ", comprador=" + comprador + ", dataCompra=" + dataCompra + '}';
    }
        
}
