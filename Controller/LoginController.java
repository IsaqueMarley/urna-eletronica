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

        //se usuario va view estiver no banco, redirecinar para pagina principal
        if (eleitorAutenticado != null){
            view.exibeMensagem("Direcionando para o menu principal");
        }else{
            view.exibeMensagem("Usuario ou senha invalidos");
        }
    }


    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
}
