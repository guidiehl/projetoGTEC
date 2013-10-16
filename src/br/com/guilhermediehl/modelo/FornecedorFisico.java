
package br.com.guilhermediehl.modelo;

public class FornecedorFisico extends PessoaFisica {
    
    private int codigo;

    public FornecedorFisico() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "FornecedorFisico{" + "codigo=" + codigo + '}';
    }
    
}
