
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        raLoginAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        senhaLoginAluno = new javax.swing.JPasswordField();
        mostrarSenha = new javax.swing.JCheckBox();
        btRecuperarSenhaAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 420));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 420));

        jLabel1.setText("RA");

        raLoginAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raLoginAlunoActionPerformed(evt);
            }
        });

        jLabel2.setText("SENHA");

        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        senhaLoginAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaLoginAlunoActionPerformed(evt);
            }
        });

        mostrarSenha.setText(" Mostrar senha ");
        mostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenhaActionPerformed(evt);
            }
        });

        btRecuperarSenhaAluno.setText("Esqueci a Senha");
        btRecuperarSenhaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecuperarSenhaAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senhaLoginAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raLoginAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarSenha)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btRecuperarSenhaAluno)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(raLoginAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaLoginAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btRecuperarSenhaAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(mostrarSenha)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new telaAluno().show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        verificaLoginAluno();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void raLoginAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raLoginAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raLoginAlunoActionPerformed

    private void mostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenhaActionPerformed
if(mostrarSenha.isSelected()) 
{
    senhaLoginAluno.setEchoChar((char)0);
}
else 
{
 senhaLoginAluno.setEchoChar('*');   
}
    }//GEN-LAST:event_mostrarSenhaActionPerformed

    private void senhaLoginAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaLoginAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaLoginAlunoActionPerformed

    private void btRecuperarSenhaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecuperarSenhaAlunoActionPerformed
        
        rs.setVisible(true); 
        dispose();
    }//GEN-LAST:event_btRecuperarSenhaAlunoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRecuperarSenhaAluno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox mostrarSenha;
    private javax.swing.JTextField raLoginAluno;
    private javax.swing.JPasswordField senhaLoginAluno;
    // End of variables declaration//GEN-END:variables

     /**
      * Método responsável pela validação do login
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
            raAtual = raLoginAluno.getText();
            senhaAtual = senhaLoginAluno.getText();

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
