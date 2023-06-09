
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

        PainelrecuperarSenhaAluno = new javax.swing.JPanel();
        jlrecuperarSenhaAluno = new javax.swing.JLabel();
        recuperarSenhaAlunoRA = new javax.swing.JTextField();
        recuperarSenhaAlunoSenha = new javax.swing.JTextField();
        btrecuperarSenhaAlunoVoltar = new javax.swing.JButton();
        btrecuperarSenhaAlunoRecuperar = new javax.swing.JButton();
        btrecuperarSenhaAlunoInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));

        PainelrecuperarSenhaAluno.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelrecuperarSenhaAluno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlrecuperarSenhaAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/recuperarSenhaAluno.png"))); // NOI18N
        PainelrecuperarSenhaAluno.add(jlrecuperarSenhaAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        recuperarSenhaAlunoRA.setBackground(new java.awt.Color(184, 135, 191));
        recuperarSenhaAlunoRA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recuperarSenhaAlunoRA.setForeground(new java.awt.Color(255, 255, 255));
        recuperarSenhaAlunoRA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        recuperarSenhaAlunoRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarSenhaAlunoRAActionPerformed(evt);
            }
        });
        PainelrecuperarSenhaAluno.add(recuperarSenhaAlunoRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 144, 280, 20));

        recuperarSenhaAlunoSenha.setBackground(new java.awt.Color(184, 135, 191));
        recuperarSenhaAlunoSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recuperarSenhaAlunoSenha.setForeground(new java.awt.Color(255, 255, 255));
        recuperarSenhaAlunoSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        recuperarSenhaAlunoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarSenhaAlunoSenhaActionPerformed(evt);
            }
        });
        PainelrecuperarSenhaAluno.add(recuperarSenhaAlunoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 212, 280, 20));

        btrecuperarSenhaAlunoVoltar.setText("VOLTAR");
        btrecuperarSenhaAlunoVoltar.setContentAreaFilled(false);
        btrecuperarSenhaAlunoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrecuperarSenhaAlunoVoltarActionPerformed(evt);
            }
        });
        PainelrecuperarSenhaAluno.add(btrecuperarSenhaAlunoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 350, 80, 40));

        btrecuperarSenhaAlunoRecuperar.setText("Recuperar");
        btrecuperarSenhaAlunoRecuperar.setContentAreaFilled(false);
        btrecuperarSenhaAlunoRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrecuperarSenhaAlunoRecuperarActionPerformed(evt);
            }
        });
        PainelrecuperarSenhaAluno.add(btrecuperarSenhaAlunoRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 267, 150, 30));

        btrecuperarSenhaAlunoInformacao.setText("jButton1");
        btrecuperarSenhaAlunoInformacao.setContentAreaFilled(false);
        PainelrecuperarSenhaAluno.add(btrecuperarSenhaAlunoInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelrecuperarSenhaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelrecuperarSenhaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btrecuperarSenhaAlunoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrecuperarSenhaAlunoVoltarActionPerformed
        new loginAluno().show();
        dispose();
    }//GEN-LAST:event_btrecuperarSenhaAlunoVoltarActionPerformed

    private void recuperarSenhaAlunoRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarSenhaAlunoRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recuperarSenhaAlunoRAActionPerformed

    private void recuperarSenhaAlunoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarSenhaAlunoSenhaActionPerformed

    }//GEN-LAST:event_recuperarSenhaAlunoSenhaActionPerformed

    private void btrecuperarSenhaAlunoRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrecuperarSenhaAlunoRecuperarActionPerformed

       recuperarAluno();

    }//GEN-LAST:event_btrecuperarSenhaAlunoRecuperarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelrecuperarSenhaAluno;
    private javax.swing.JButton btrecuperarSenhaAlunoInformacao;
    private javax.swing.JButton btrecuperarSenhaAlunoRecuperar;
    private javax.swing.JButton btrecuperarSenhaAlunoVoltar;
    private javax.swing.JLabel jlrecuperarSenhaAluno;
    private javax.swing.JTextField recuperarSenhaAlunoRA;
    private javax.swing.JTextField recuperarSenhaAlunoSenha;
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
            consultaRa = recuperarSenhaAlunoRA.getText();
            consultaPergunta = recuperarSenhaAlunoSenha.getText();

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
