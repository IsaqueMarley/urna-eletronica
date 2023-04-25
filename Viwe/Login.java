package Viwe;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;


public class Login extends javax.swing.JFrame {
    private final LoginController controller;
    public Login(){
        initComponents();
        controller = new LoginController(this);
        Banco.inicia();
        this.setTitle("Tela de Login");
        this.setSize(400,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.setLayout(new GridLayout(7,1));

        this.setVisible(true);


    }

    private void initComponents() {
        Entrar = new javax.swing.JButton();
        TextUsuario = new javax.swing.JTextField();
        TextSenha = new javax.swing.JPasswordField();
    }



    private JPanel panel1;
    private JTextField TextUsuario;
    private JPasswordField TextSenha;
    private JButton Entrar;

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void TextSenhaActionPerformed(java.awt.event.ActionEvent evt){

    }

    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt){
        //Executa quando clico no botão
        this.controller.entrarNoSistema();
    }


    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null,mensagem);
    }

    public JTextField getTextUsuario() {
        return TextUsuario;
    }

    public void setTextUsuario(JTextField textUsuario) {
        TextUsuario = textUsuario;
    }

    public JPasswordField getTextSenha() {
        return TextSenha;
    }

    public void setTextSenha(JPasswordField textSenha) {
        TextSenha = textSenha;
    }
}
