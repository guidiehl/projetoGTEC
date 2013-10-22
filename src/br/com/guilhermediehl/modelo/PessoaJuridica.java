
package br.com.guilhermediehl.modelo;

public class PessoaJuridica {
    
    private String nomeFantasia;
    private String cnpj;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String website;
    private String conta;

    public PessoaJuridica() {
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
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

    public String getEmailGeral() {
        return emailGeral;
    }

    public void setEmailGeral(String emailGeral) {
        this.emailGeral = emailGeral;
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
        return "PessoaJuridica{" + "nomeFantasia=" + nomeFantasia + ", cnpj=" + cnpj + ", endereco=" + endereco + ", telefone=" + telefone + ", emailGeral=" + emailGeral + ", website=" + website + ", conta=" + conta + '}';
    }
    
}
