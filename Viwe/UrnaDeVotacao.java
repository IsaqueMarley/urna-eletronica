package Viwe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

import Controller.Helper.LoginHelper;

public class UrnaDeVotacao extends JFrame implements ActionListener {
    private Login view;
    private LoginHelper helper;
  // private final LoginController controller; 
  // private final LoginHelper helper;

   //public LoginHelper(Login view){
	//this.view = view;	
  // }
	
    // Definindo os atores
    private  String[] atores = {"Javier Bardem", "Benedict Cumberbatch", "Andrew Garfield", "Will Smith", "Denzel Washington"};

    // Definindo os componentes da interface
    private JLabel labelTitulo = new JLabel("Urna de Votação");
    private JLabel labelInstrucoes = new JLabel("Selecione o ator que você deseja votar:");
    private JRadioButton[] radioAtores = new JRadioButton[atores.length]; //
    private JButton botaoVotar = new JButton("Votar");

    // Construtor da classe
    public UrnaDeVotacao() {

        // Definindo as configurações da janela
        this.setTitle("Urna de Votação");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null); // localizacao relativa = NULL :  para aparecer no centro da tela
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // encerrar programa ao fechar

        // Definindo o layout da interface
        this.setLayout(new GridLayout(7, 1));

        // Adicionando os componentes à janela
        add(labelTitulo); // adicionando o titulo
        add(labelInstrucoes); // adicionando as instrucoes
        ButtonGroup grupoAtores = new ButtonGroup();
        for (int i = 0; i < atores.length; i++) {
            radioAtores[i] = new JRadioButton(atores[i]);
            grupoAtores.add(radioAtores[i]);
            add(radioAtores[i]);
        }
        add(botaoVotar);
        //add(labelResultado);

        // Adicionando o listener ao botão de votar
        botaoVotar.addActionListener(this); /* eh um evento de acao que ocorre ao clicar em votar
                                               , que no caso seria abrir uma janela de confirmacao*/


        
        // Exibindo a janela
        this.setVisible(true);
    }

    // Método que é chamado quando o botão de votar é clicado
    public void actionPerformed(ActionEvent e) {
        // Verificando qual ator foi selecionado
        String atorSelecionado = "";

        //dentre os botoes dos atores eh feito um laco para que ator selecionado receba o nome do ator na lista de atores
        for (int i = 0; i < radioAtores.length; i++) {
            if (radioAtores[i].isSelected()) { // isSelected-> seleciona o ator que foi clicado
                atorSelecionado = atores[i];
                break;
            }
        }

        // Verificando se um ator foi selecionado
        if (atorSelecionado.equals("")) {
            JOptionPane.showMessageDialog(this, "Selecione um ator para votar!");
            return;
        }

        // Abrindo uma nova janela de confirmação de voto
        int opcao = JOptionPane.showConfirmDialog(this, "Você deseja votar em " + atorSelecionado + "?", "Confirmação de Voto", JOptionPane.YES_NO_OPTION);

        // Verificando se o usuário confirmou o voto
        if (opcao == JOptionPane.YES_OPTION) {
            // Atualizando o resultado da votação na interface
            // labelResultado.setText("Você votou em " + atorSelecionado);

            // Salvando o voto em um arquivo de texto
            try {
                FileWriter arquivo = new FileWriter("votos.txt", true);
                arquivo.write(atorSelecionado + "\n");
                arquivo.close();

            } catch (IOException ex) {
                ex.printStackTrace(); // escrever no console qual foi o erro
            }

    		// mensagem de votação finalizada
   	 	JOptionPane.showMessageDialog(this, "Votação finalizada");
    	   //  }/

        }
	    

        // Finalizando o programa após o usuário votar
        Login login = new Login();
        login.setVisible(true);
        dispose(); // funcao da awt que libera os recursos usados nessa janela
    }

}