package Classes;

public class Eleitor extends Pessoa {
    //Atributos
    private String rg;
    private String cpf;
    private String cep;

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

    //Construtor Padrão
    public Eleitor() {
    }
}
