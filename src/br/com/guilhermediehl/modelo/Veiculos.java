
package br.com.guilhermediehl.modelo;

public class Veiculos {
    
    private int codigo;
    private String modelo;
    private String marca;
    private String tipo;
    private String placa;
    private String renavan;
    private String chassi;
    private double precoCompra;
    private double precoVenda;

    public Veiculos() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        return "Veiculos{" + "codigo=" + codigo + ", modelo=" + modelo + ", marca=" + marca + ", tipo=" + tipo + ", placa=" + placa + ", renavan=" + renavan + ", chassi=" + chassi + ", precoCompra=" + precoCompra + ", precoVenda=" + precoVenda + '}';
    }
    
}
