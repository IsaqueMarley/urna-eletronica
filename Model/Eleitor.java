package Model;

public class Eleitor extends Pessoa {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    //Atributos
    private String rg;
    private String cpf;
    private String cep;
    private String senha;

    //Metodos

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
     //Construtor Padrão
     public Eleitor(String id, String senha) {
        this.id = id;
        this.senha = senha;
    }
}