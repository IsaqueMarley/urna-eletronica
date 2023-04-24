package Model.DAO;
import Model.Eleitor;
import java.util.ArrayList;

public class EleitorDAO {
    
    // Insere um usuario dentro do banco de dado
    public void insert(Eleitor eleitor){
        Banco.eleitorList.add(eleitor);
    }
    
    //Atualiza um Objeto no banco de dados
    public boolean update(Eleitor eleitor){
        
        for (int i = 0; i < Banco.eleitorList.size(); i++) {
            if(idSaoIguais(Banco.eleitorList.get(i),eleitor)){
                Banco.eleitorList.set(i, eleitor);
                return true;
            }
        }
        return false;      

    }
    
    // Deleta um objeto do banco de dados pelo id do usuario passado
    public boolean delete(Eleitor usuario){
        for (Eleitor usuarioLista : Banco.eleitorList) {
            if(idSaoIguais(usuarioLista,usuario)){
                Banco.eleitorList.remove(usuarioLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Eleitor> selectAll(){
        return Banco.eleitorList;
    }
    
    /**
     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param usuario
     * @return Usuario encontrado no banco de dados
     */
    public Eleitor selectPorIDeSenha(Eleitor eleitor){
        for (Eleitor eleitorLista : Banco.eleitorList) {
            if(nomeESenhaSaoIguais(eleitorLista,eleitor)){
                return eleitorLista;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param usuario
     * @param usuarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeESenhaSaoIguais(Eleitor usuario, Eleitor usuarioAPesquisar) {
        return usuario.getNome().equals(usuarioAPesquisar.getNome()) && usuario.getSenha().equals(usuarioAPesquisar.getSenha());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param usuario
     * @param usuarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Eleitor usuario, Eleitor usuarioAComparar) {
        return usuario.getId() ==  usuarioAComparar.getId();
    }

    public Eleitor selectPorIDeSenha(Eleitor eleitor) {
        for (Eleitor eleitorLista : Banco.eleitorList) {
            if(nomeESenhaSaoIguais(eleitorLista,eleitor)){
                return eleitorLista;
            }
        }

    }



}