package Model;

abstract public class Pessoa {
    protected String id;
    protected String nome;

    public String getIp() {
        return id;
    }

    public void setIp(String ip) {
        this.id = ip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
