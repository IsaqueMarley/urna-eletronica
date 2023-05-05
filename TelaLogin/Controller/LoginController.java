package Controller;
import Controller.Helper.LoginHelper;
import Model.DAO.EleitorDAO;
import Model.Eleitor;
import Viwe.Login;
public class LoginController {
    private final Login view;
    private LoginHelper helper;
    public LoginController(Login view) {

        this.view = view;
        this.helper = new LoginHelper (view);
    }

    public void entrarNoSistema(){

        //pegar um Eleitor da View
        Eleitor eleitor = helper.obterModelo();

        //Pesquisar Usuario no Banco
        EleitorDAO eleitorDAO = new EleitorDAO();
        Eleitor eleitorAutenticado = eleitorDAO.selectPorIDeSenha(eleitor);

        //se usuario da view estiver no banco, redirecina para pagina principal, senão exibe mensagem de erro
        if (eleitorAutenticado != null){
            view.exibeMensagem("Direcionando para o menu principal");
        }else{
            view.exibeMensagem("ID ou senha invalidos");
        }
    }
}
