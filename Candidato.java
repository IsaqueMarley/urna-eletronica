package Classes;

public class Candidato extends Pessoa {
    private String filmeDestaque;
    private String nacionalidade;
    private String genero;

    //construtor
    public Candidato() {
    }

    //metodos
    public String getFilmeDestaque() {
        return filmeDestaque;
    }

    public void setFilmeDestaque(String filmeDestaque) {
        this.filmeDestaque = filmeDestaque;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
