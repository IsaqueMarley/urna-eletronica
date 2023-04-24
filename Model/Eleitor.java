package Model;

public class Eleitor extends Pessoa{
    private String rg;
    private String cpf;
    private String cep;
    private String senha;

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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Eleitor(String rg, String cpf, String cep, String senha) {
        this.rg = rg;
        this.cpf = cpf;
        this.cep = cep;
        this.senha = senha;
    }

    public Eleitor(String id, String senha) {
        this.id = id;
        this.senha = senha;
    }


}
