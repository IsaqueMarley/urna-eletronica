package Controller.Helper;

import Model.Eleitor;
import Viwer.Login;

public class LoginHelper {
    private final Login viwer;

public LoginHelper(Login viwer){
    this.viwer = viwer;
}

//Pegar Infrmaçõe do campo de ID e senha 
public Eleitor obterModelo(){
    String id = viwer.getTextUsuario().getText();
    String senha = viwer.getTextSenha().getText();
    Eleitor modelo = new Eleitor(id,senha);
    return modelo;
}

//Setar um Modelo 
public void setarModelo (Eleitor modelo){
    String id = modelo.getId();
    String senha = modelo.getSenha();
    
    viwer.getTextUsuario().setText(id);
    viwer.getTextSenha().setText(senha);
}

//Limpar campos 
public void limparTela(){
    viwer.getTextUsuario().setText("");
    viwer.getTextSenha().setText("");
} 
   
    
}
