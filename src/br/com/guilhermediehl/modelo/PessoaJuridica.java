
package br.com.guilhermediehl.modelo;

public abstract class PessoaJuridica {
    
    private String nome;
    private String cnpj;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String website;
    private String conta;

    public PessoaJuridica() {
    }

    public String getNome() {
        return nome;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nome = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "nome=" + nome + ", cnpj=" + cnpj + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", website=" + website + ", conta=" + conta + '}';
    }
    
}
