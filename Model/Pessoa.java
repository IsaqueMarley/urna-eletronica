package Model;

abstract public class Pessoa {

    //declarando atributos
    protected String id;
    protected String nome;

    //metos get e set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
