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

    private JPanel panel1 = new JPanel();
    private JLabel id = new JLabel("Informe o ID");

    private JTextField textUsuario = new JTextField();
    private JLabel senha = new JLabel("Senha");

    private JPasswordField textSenha = new JPasswordField();
    private JButton entrar = new JButton("Entrar");


    public Login(){
        controller = new LoginController(this);
        Banco.inicia();
        this.setTitle("Tela de Login");
        this.setSize(400,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.setLayout(new GridLayout(7,1));

        add(panel1);
        add(id);
        add(textUsuario);
        add(senha);
        add(textSenha);
        add(entrar);

        entrar.addActionListener(this);

        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.controller.entrarNoSistema();
    }


    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null,mensagem);
    }

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
