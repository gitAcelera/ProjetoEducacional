
package telas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * Inicia a classe recuperaSenhaAluno
 * @author Izabelle
 */
public class recuperaSenhaAluno extends javax.swing.JFrame {
  private String consultaRa = " ";
  private String consultaPergunta = " ";
  private String raAtual, recuperaAtual,senhaAtual;
    /**
     * Método construtor da classe recuperaSenhaAluno
     */
    public recuperaSenhaAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoRaSenha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoRecuperaSenhaAluno = new javax.swing.JTextField();
        btRecuperar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(720, 420));

        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("DIGITE SEU RA");

        campoRaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRaSenhaActionPerformed(evt);
            }
        });

        jLabel2.setText("DIGITE A PALAVRA-CHAVE DE RECUPERAÇÃO DA SENHA");

        campoRecuperaSenhaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRecuperaSenhaAlunoActionPerformed(evt);
            }
        });

        btRecuperar.setText("Recuperar");
        btRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecuperarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoRaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(campoRecuperaSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(btRecuperar)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltar)
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoRaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoRecuperaSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btRecuperar)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new loginAluno().show();
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void campoRaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRaSenhaActionPerformed

    private void campoRecuperaSenhaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRecuperaSenhaAlunoActionPerformed

    }//GEN-LAST:event_campoRecuperaSenhaAlunoActionPerformed

    private void btRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecuperarActionPerformed

       recuperarAluno();

    }//GEN-LAST:event_btRecuperarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRecuperar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField campoRaSenha;
    private javax.swing.JTextField campoRecuperaSenhaAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   /**
      * Método responsável pela recuperação de senha do aluno
      */
     public void recuperarAluno()
     {
         int status;
        try
        {
           //conexão com o banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * from aluno");
           
              // pega os valores do ra e recuperação digitados pelo aluno
            consultaRa = campoRaSenha.getText();
            consultaPergunta = campoRecuperaSenhaAluno.getText();

            status =0;
            while(res.next())

            {
                // pega os valores do ra e de recuperação do banco
                raAtual = res.getString("ra");
                recuperaAtual = res.getString("recuperar");
                
                // faz a comparação dos valores digitados pelo aluno com as armazenadas no banco de dados
                if(recuperaAtual.compareTo(consultaPergunta)==0 && raAtual.compareTo(consultaRa)==0)
                

                {
                     // se os dados estão de acordo, é puxado a senha do aluno
                    raAtual = res.getString("ra");
                    senhaAtual = res.getString("senha");
                    status=1;
                    
                }

            }

            if(status == 1)
            { 
                  // mostra a senha do aluno
                JOptionPane.showMessageDialog(null,"Sua senha é: "+senhaAtual);
              
                new loginAluno().show();
                dispose();

            }
            if(status == 0)
            {
                JOptionPane.showMessageDialog(null,"RA: "+consultaRa+" não encontrado!!!","Erro",JOptionPane.ERROR_MESSAGE);
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
