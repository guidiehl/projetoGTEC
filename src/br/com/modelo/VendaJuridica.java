
package br.com.modelo;

public class VendaJuridica {
    
    private int codigo;
    private Veiculos produto;
    private Colaborador vendedor;
    private ClienteJuridico cliente;    
    private String dataCompra;

    public VendaJuridica() {
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

    public ClienteJuridico getCliente() {
        return cliente;
    }

    public void setCliente(ClienteJuridico cliente) {
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
        return "VendaJuridica{" + "codigo=" + codigo + ", produto=" + produto + ", vendedor=" + vendedor + ", cliente=" + cliente + ", dataCompra=" + dataCompra + '}';
    }
    
    
    
}
