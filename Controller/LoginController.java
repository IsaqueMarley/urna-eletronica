package Controller;
import Controller.Helper.LoginHelper;
import Model.DAO.EleitorDAO;
import Model.Eleitor;
import Viwe.Login;
import Viwe.UrnaDeVotacao;

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
            UrnaDeVotacao urna = new UrnaDeVotacao();
            urna.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("ID ou senha invalidos");
        }
    }
}
