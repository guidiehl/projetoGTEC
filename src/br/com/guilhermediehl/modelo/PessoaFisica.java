
package br.com.guilhermediehl.modelo;

public class PessoaFisica {
    
    private String nome;
    private String rg;
    private String cpf;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String conta;

    public PessoaFisica() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", conta=" + conta + '}';
    }
    
}
