package Viwe;

import Controller.Helper.LoginHelper;
import Controller.LoginController;
import Model.DAO.Banco;
import Model.DAO.EleitorDAO;
import Model.Eleitor;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.util.List;
import java.io.*;
import java.security.*;
import java.security.MessageDigest;
import java.io.File;
//import javax.xml.bind.DatatypeConverter;




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
    private LoginHelper helper;

    //construtor da classe Login
    public Login(){

        this.helper = new LoginHelper (this);

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



    //metodo que executa a ação do botão entrar
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Entrar")){

            Eleitor eleitor = helper.obterModelo();
            EleitorDAO eleitorDAO = new EleitorDAO();
            Eleitor eleitorAutenticado = eleitorDAO.selectPorIDeSenha(eleitor);
            if (eleitorAutenticado == null){
                exibeMensagem("O eleitor já fez uso do voto");
            }else{
                this.controller.entrarNoSistema();
            }


        }
        

        if(e.getActionCommand().equals("Finalizar Votação")){
            try {
                // Gerar o hash do arquivo de votos
                FileInputStream fis = new FileInputStream("votos.txt");
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] buffer = new byte[8192];
                int read = 0;
                while ((read = fis.read(buffer)) > 0) {
                    digest.update(buffer, 0, read);
                }
                byte[] hashBytes = digest.digest();
                fis.close();
                
                // Converter o hash em uma string hexadecimal
                StringBuilder hexString = new StringBuilder();
                for (byte b : hashBytes) {
                    String hex = Integer.toHexString(0xff & b);
                    if (hex.length() == 1) hexString.append('0');
                    hexString.append(hex);
                }
                String hashDeLogin = hexString.toString();
                
                // Escrever o hash no console
                System.out.println("Hash SHA256 do arquivo de votos: " + hashDeLogin);
                
                // Encerrar o programa
                dispose();
                System.exit(0);
            } catch (IOException | NoSuchAlgorithmException e1) {
                e1.printStackTrace();
            }
        }
        


        if(e.getActionCommand().equals("Finalizar Votação")){

            dispose();
            System.exit(0);
        }
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
