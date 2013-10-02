
package br.com.modelo;

public class VendaFisica {
    
    private int codigo;
    private Veiculos produto;
    private Colaborador vendedor;
    private ClienteFisico cliente;    
    private String dataCompra;

    public VendaFisica() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Veiculos getProduto() {
        return produto;
    }

    public void setProduto(Veiculos produto) {
        this.produto = produto;
    }

    public Colaborador getVendedor() {
        return vendedor;
    }

    public void setVendedor(Colaborador vendedor) {
        this.vendedor = vendedor;
    }

    public ClienteFisico getCliente() {
        return cliente;
    }

    public void setCliente(ClienteFisico cliente) {
        this.cliente = cliente;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    @Override
    public String toString() {
        return "VendaFisica{" + "codigo=" + codigo + ", produto=" + produto + ", vendedor=" + vendedor + ", cliente=" + cliente + ", dataCompra=" + dataCompra + '}';
    }
    
}
