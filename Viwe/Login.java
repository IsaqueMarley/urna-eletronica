package Viwe;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends javax.swing.JFrame implements ActionListener {

    private final LoginController controller;


    //Definindo componentes
    private JPanel panel1 = new JPanel();
    private JLabel id = new JLabel("Informe o ID");

    private JTextField textUsuario = new JTextField();
    private JLabel senha = new JLabel("Senha");

    private JPasswordField textSenha = new JPasswordField();
    private JButton entrar = new JButton("Entrar");
    private JButton finalizar = new JButton("Finalizar Votação");

    //construtor da classe Login
    public Login(){

        //Definindo as configurações da view
        controller = new LoginController(this);
        Banco.inicia();
        this.setTitle("Tela de Login");
        this.setSize(400,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.setLayout(new GridLayout(7,1));

        //adicionando os componentes
        add(panel1);
        add(id);
        add(textUsuario);
        add(senha);
        add(textSenha);
        add(entrar);
        add(finalizar);


        //adicinando uma ação ao botão entrar e finalizar
        entrar.addActionListener(this);
        finalizar.addActionListener(this);


        //tornando a tela visivel
        this.setVisible(true);


    }

    public void finalizarVot(ActionEvent f){
        
    }

    //metodo que executa a ação do botão entrar
    @Override
    public void actionPerformed(ActionEvent e) {
        this.controller.entrarNoSistema();
    }

    //metodo que exibe uma mensagem na tela
    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null,mensagem);
    }


    //metodos get e set
    public JTextField getTextUsuario() {
        return textUsuario;
    }

    public void setTextUsuario(JTextField textUsuario) {
        textUsuario = textUsuario;
    }

    public JPasswordField getTextSenha() {
        return textSenha;
    }

    public void setTextSenha(JPasswordField textSenha) {
        textSenha = textSenha;
    }


}
