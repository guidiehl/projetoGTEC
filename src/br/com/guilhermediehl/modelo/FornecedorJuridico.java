
package br.com.guilhermediehl.modelo;

public class FornecedorJuridico extends PessoaJuridica {
    
    private int codigo;

    public FornecedorJuridico() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "FornecedorJuridico{" + "codigo=" + codigo + '}';
    }
    
}
