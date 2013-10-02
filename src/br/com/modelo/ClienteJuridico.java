
package br.com.modelo;

public class ClienteJuridico extends PessoaJuridica {
    
    private int codigo;

    public ClienteJuridico() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" + "codigo=" + codigo + '}';
    }
        
}
