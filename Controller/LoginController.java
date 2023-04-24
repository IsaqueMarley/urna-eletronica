package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.EleitorDAO;
import Model.Eleitor;
import Viwer.Login;

public class LoginController {
//definindo parametros
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entarNoSistema(){
    //Pegar usuario e senha da view
    Eleitor eleitor = helper.obterModelo();
    
    //Pesquisar usuario no banco
    EleitorDAO eleitorDAO = new EleitorDAO();
    Eleitor eleitorAutenticado = eleitorDAO.selectPorIDeSenha(eleitor);
    
    
    //Se usuario e senha da view for o mrsmo que o do banco, redirecionar para pagina
    if(eleitorAutenticado != null){
    //Redirecionar para o menu principal 
    }else{
        view.exibirMensagem("Usuario ou senha invalido");
    }
 
    }
    
    public void entrar(){
        System.out.println("Buscar no banco de dados");
        
        this.view.exibirMensagem("executei");
    }

    public void entrarNoSistema() {
        Eleitor eleitor = helper.obterModelo();

        EleitorDAO eleitorDAO = new EleitorDAO();
        Eleitor eleitorAutenticado = eleitorDAO.selectPorIDeSenha();


        if(eleitorAutenticado != null){
            view.exibirMensagem("Entrar no sistema");
        }else {
            view.exibirMensagem("Usuario ou senha invalidos");
        }

    }
    
    
    
}
