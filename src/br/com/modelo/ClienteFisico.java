
package br.com.modelo;

public class ClienteFisico extends PessoaFisica {
    
    private int codigo; 

    public ClienteFisico() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "ClienteFisico{" + "codigo=" + codigo + '}';
    }    
    
}
