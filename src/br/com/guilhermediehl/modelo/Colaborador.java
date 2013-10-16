
package br.com.guilhermediehl.modelo;

public class Colaborador extends PessoaFisica {
    
    private int codigo;
    private String login;
    private String senha;
    private double salario;

    public Colaborador() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Colaborador{" + "codigo=" + codigo + ", login=" + login + ", senha=" + senha + ", salario=" + salario + '}';
    }    
}