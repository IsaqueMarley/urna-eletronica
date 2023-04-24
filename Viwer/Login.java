
package Viwer;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    public Login() {
        initComponents();
        controller = new LoginController(this);
        Banco.inicia();
    }
    //Instanciando Campos, textos e botões 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Senha = new javax.swing.JLabel();
        IdEleitor = new javax.swing.JLabel();
        TextUsuario = new javax.swing.JTextField();
        TextSenha = new javax.swing.JPasswordField();
        Entrar = new javax.swing.JButton();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Senha.setBackground(new java.awt.Color(0, 0, 0));
        Senha.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Senha.setForeground(new java.awt.Color(0, 0, 0));
        Senha.setText("Senha ");
        getContentPane().add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        IdEleitor.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        IdEleitor.setForeground(new java.awt.Color(0, 0, 0));
        IdEleitor.setText("ID do Eleitor ");
        getContentPane().add(IdEleitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 220, 30));

        TextUsuario.setText("Informe o ID ");
        TextUsuario.setToolTipText("");
        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 200, 40));

        TextSenha.setText("jPasswordField1");
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 200, 40));

        Entrar.setBackground(new java.awt.Color(0, 51, 51));
        Entrar.setText("ENTRAR");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        Back.setBackground(new java.awt.Color(0, 153, 153));
        Back.setForeground(new java.awt.Color(102, 102, 102));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Viwer/imagens/back.jpg"))); // NOI18N
        Back.setText("jLabel1");
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -80, 1281, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed

    }//GEN-LAST:event_TextUsuarioActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
    //Executa quando clica no botão
    this.controller.entrarNoSistema();
    }//GEN-LAST:event_EntrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel IdEleitor;
    private javax.swing.JLabel Senha;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUsuario;
    // End of variables declaration//GEN-END:variables

    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null,mensagem );
    }
    
    //Metodos de acesso para os campos da tela de login

    public JPasswordField getTextSenha() {
        return TextSenha;
    }

    public void setTextSenha(JPasswordField TextSenha) {
        this.TextSenha = TextSenha;
    }

    public JTextField getTextUsuario() {
        return TextUsuario;
    }

    public void setTextUsuario(JTextField TextUsuario) {
        this.TextUsuario = TextUsuario;
    }
    
    
}
