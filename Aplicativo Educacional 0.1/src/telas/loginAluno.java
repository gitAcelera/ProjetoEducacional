
package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 * Inicia a classe loginAluno
 * @author Mateus
 */

public class loginAluno extends javax.swing.JFrame {
    
    private menuPrincipal mp;
    private recuperaSenhaAluno rs;
    String raAtual,senhaAtual,raBanco,senhaBanco;
     /**
     * Método construtor que instancia as classes
     */
    public loginAluno() {
        initComponents();
        mp = new menuPrincipal();
        rs = new recuperaSenhaAluno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelloginAluno = new javax.swing.JPanel();
        jlloginAluno = new javax.swing.JLabel();
        loginAlunoRA = new javax.swing.JTextField();
        loginAlunoSenha = new javax.swing.JPasswordField();
        loginAlunoMostrarSenha = new javax.swing.JCheckBox();
        btloginAlunoEntrar = new javax.swing.JButton();
        btloginAlunoVoltar = new javax.swing.JButton();
        btloginAlunoRecuperarSenha = new javax.swing.JButton();
        btloginAlunoInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelloginAluno.setPreferredSize(new java.awt.Dimension(700, 420));
        PainelloginAluno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlloginAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/loginAluno.png"))); // NOI18N
        jlloginAluno.setText("RA");
        PainelloginAluno.add(jlloginAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        loginAlunoRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAlunoRAActionPerformed(evt);
            }
        });
        PainelloginAluno.add(loginAlunoRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 138, 280, 30));

        loginAlunoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAlunoSenhaActionPerformed(evt);
            }
        });
        PainelloginAluno.add(loginAlunoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 207, 280, 30));

        loginAlunoMostrarSenha.setText(" Mostrar senha ");
        loginAlunoMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAlunoMostrarSenhaActionPerformed(evt);
            }
        });
        PainelloginAluno.add(loginAlunoMostrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 260, 130, 30));

        btloginAlunoEntrar.setText("ENTRAR");
        btloginAlunoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginAlunoEntrarActionPerformed(evt);
            }
        });
        PainelloginAluno.add(btloginAlunoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 349, 80, 40));

        btloginAlunoVoltar.setText("VOLTAR");
        btloginAlunoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginAlunoVoltarActionPerformed(evt);
            }
        });
        PainelloginAluno.add(btloginAlunoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 350, 80, 40));

        btloginAlunoRecuperarSenha.setText("Esqueci a Senha");
        btloginAlunoRecuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginAlunoRecuperarSenhaActionPerformed(evt);
            }
        });
        PainelloginAluno.add(btloginAlunoRecuperarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 160, 30));

        btloginAlunoInformacao.setText("jButton3");
        PainelloginAluno.add(btloginAlunoInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelloginAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelloginAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btloginAlunoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginAlunoVoltarActionPerformed
        new telaAluno().show();
        dispose();
    }//GEN-LAST:event_btloginAlunoVoltarActionPerformed

    private void btloginAlunoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginAlunoEntrarActionPerformed
        verificaLoginAluno();
    }//GEN-LAST:event_btloginAlunoEntrarActionPerformed

    private void loginAlunoRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAlunoRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAlunoRAActionPerformed

    private void loginAlunoMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAlunoMostrarSenhaActionPerformed
if(loginAlunoMostrarSenha.isSelected()) 
{
    loginAlunoSenha.setEchoChar((char)0);
}
else 
{
 loginAlunoSenha.setEchoChar('*');   
}
    }//GEN-LAST:event_loginAlunoMostrarSenhaActionPerformed

    private void loginAlunoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAlunoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginAlunoSenhaActionPerformed

    private void btloginAlunoRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginAlunoRecuperarSenhaActionPerformed
        
        rs.setVisible(true); 
        dispose();
    }//GEN-LAST:event_btloginAlunoRecuperarSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelloginAluno;
    private javax.swing.JButton btloginAlunoEntrar;
    private javax.swing.JButton btloginAlunoInformacao;
    private javax.swing.JButton btloginAlunoRecuperarSenha;
    private javax.swing.JButton btloginAlunoVoltar;
    private javax.swing.JLabel jlloginAluno;
    private javax.swing.JCheckBox loginAlunoMostrarSenha;
    private javax.swing.JTextField loginAlunoRA;
    private javax.swing.JPasswordField loginAlunoSenha;
    // End of variables declaration//GEN-END:variables

     /**
      * Método responsável pela validação do login do aluno
      */

public void verificaLoginAluno ()
{
    int status;
        try
        {
           // conexão com o banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * from aluno");
            
 // pega os valores do ra e senha digitadas pelo aluno
            raAtual = loginAlunoRA.getText();
            senhaAtual = loginAlunoSenha.getText();

            status =0;
            while(res.next())

            {
          // pega os valores do ra e senha do banco
                raBanco = res.getString("ra");
                senhaBanco = res.getString("senha");

                // faz a comparação dos valores digitados pelo aluno com as armazenadas no banco de dados
                if(raBanco.compareTo(raAtual)==0 && senhaBanco.compareTo(senhaAtual)==0 )
                

                {
                    status=1;
                }

            }

            if(status == 1)
            {
            // se os dados estão de acordo, o aluno vai para o menu principal
                mp.setVisible(true);
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
