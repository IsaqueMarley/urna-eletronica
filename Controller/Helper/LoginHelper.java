package Controller.Helper;

import Model.Eleitor;
import Viwe.Login;

public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view){
        this.view = view;
    }

    public Eleitor obterModelo() {
        String id = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        Eleitor modelo = new Eleitor(id,senha);
        return modelo;
    }

    public void setarModelo(Eleitor modelo){
        String id = modelo.getId();
        String senha = modelo.getSenha();

        view.getTextUsuario().setText(id);
        view.getTextSenha().setText(senha);
    }

    public void limpar(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
}
