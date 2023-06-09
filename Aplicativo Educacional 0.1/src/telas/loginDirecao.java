
package telas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 * Inicia a classe loginDirecao
 * @author Mateus
 */
public class loginDirecao extends javax.swing.JFrame {
private menuPrincipalDirecao mpd;
String userAtual,senhaAtual,userBanco,senhaBanco;
    /**
     * Método construtor que instancia a classe loginDirecao
     */
    public loginDirecao() {
        initComponents();
        mpd = new menuPrincipalDirecao();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelloginDirecao = new javax.swing.JPanel();
        jlloginDirecao = new javax.swing.JLabel();
        loginDirecaoUsuario = new javax.swing.JTextField();
        loginDirecaoSenha = new javax.swing.JPasswordField();
        loginDirecaoMostrarSenha = new javax.swing.JCheckBox();
        btloginDirecaoEntrar = new javax.swing.JButton();
        btloginDirecaoVoltar = new javax.swing.JButton();
        btloginDirecaoInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);

        PainelloginDirecao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlloginDirecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/loginDirecao.png"))); // NOI18N
        PainelloginDirecao.add(jlloginDirecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        loginDirecaoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginDirecaoUsuarioActionPerformed(evt);
            }
        });
        PainelloginDirecao.add(loginDirecaoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 138, 280, 30));

        loginDirecaoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginDirecaoSenhaActionPerformed(evt);
            }
        });
        PainelloginDirecao.add(loginDirecaoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 207, 280, 30));

        loginDirecaoMostrarSenha.setText(" Mostrar senha ");
        loginDirecaoMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginDirecaoMostrarSenhaActionPerformed(evt);
            }
        });
        PainelloginDirecao.add(loginDirecaoMostrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 259, 130, 30));

        btloginDirecaoEntrar.setText("ENTRAR");
        btloginDirecaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginDirecaoEntrarActionPerformed(evt);
            }
        });
        PainelloginDirecao.add(btloginDirecaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 348, 80, 40));

        btloginDirecaoVoltar.setText("VOLTAR");
        btloginDirecaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginDirecaoVoltarActionPerformed(evt);
            }
        });
        PainelloginDirecao.add(btloginDirecaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 349, 80, 40));

        btloginDirecaoInformacao.setText("jButton1");
        PainelloginDirecao.add(btloginDirecaoInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelloginDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelloginDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginDirecaoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginDirecaoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginDirecaoUsuarioActionPerformed

    private void loginDirecaoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginDirecaoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginDirecaoSenhaActionPerformed

    private void loginDirecaoMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginDirecaoMostrarSenhaActionPerformed
        if(loginDirecaoMostrarSenha.isSelected())
        {
            loginDirecaoSenha.setEchoChar((char)0);
        }
        else
        {
            loginDirecaoSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_loginDirecaoMostrarSenhaActionPerformed

    private void btloginDirecaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginDirecaoEntrarActionPerformed
        direcaoLogin();
    }//GEN-LAST:event_btloginDirecaoEntrarActionPerformed

    private void btloginDirecaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginDirecaoVoltarActionPerformed
        new loginProfessor().show();
        dispose();
    }//GEN-LAST:event_btloginDirecaoVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelloginDirecao;
    private javax.swing.JButton btloginDirecaoEntrar;
    private javax.swing.JButton btloginDirecaoInformacao;
    private javax.swing.JButton btloginDirecaoVoltar;
    private javax.swing.JLabel jlloginDirecao;
    private javax.swing.JCheckBox loginDirecaoMostrarSenha;
    private javax.swing.JPasswordField loginDirecaoSenha;
    private javax.swing.JTextField loginDirecaoUsuario;
    // End of variables declaration//GEN-END:variables

     /**
      * Método responsável pela validação do login da direção
      */
   public void direcaoLogin()
   {
       int status;
        try
        {
                // conexão com o banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * from direcao");
              
            // pega os valores do usuário e senha digitadas pela direção
            
            userAtual = loginDirecaoUsuario.getText();
            senhaAtual = loginDirecaoSenha.getText();
            // os dados referentess a direção já são salvos no banco, sem a necessidade de cadastro

            status =0;
            while(res.next())

            {
         // pega os valores do usuário e senha do banco
                userBanco = res.getString("usuario");
                senhaBanco = res.getString("senha");
// faz a comparação dos valores digitados pela direção com as armazenadas no banco de dados
                if(userBanco.compareTo(userAtual)==0 && senhaBanco.compareTo(senhaAtual)==0 )

                {
                    status=1;
                }

            }

            if(status == 1)
            {
// se os dados estão de acordo, =o aluno vai para o menu principal da direção
                mpd.setVisible(true);
                dispose();

            }
            if(status == 0)
            {
                JOptionPane.showMessageDialog(null,"Erro nos dados informados!!!","Erro",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
   }










}
