
package br.com.modelo;

public class Colaborador extends PessoaFisica {
    
    private int codigo;

    public Colaborador() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Colaborador{" + "codigo=" + codigo + '}';
    }
    
}
