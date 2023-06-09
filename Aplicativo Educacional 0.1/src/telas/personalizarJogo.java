
package telas;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Inicia a classe personalizarJogo
 * @author Pedro
 */
public class personalizarJogo extends javax.swing.JFrame {
    private String novoCodigo, novaQuestao,novaDisciplina, novoAltA,novoAltB,novoAltC,novoAltD;
 private String consultaCodigos= " ";
 private String consultaDisciplina = " ";

    /**
     * Método construtor da classe personalizarJogo
     */
    public personalizarJogo() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPersonalizarJogo = new javax.swing.JPanel();
        jlpersonalizarJogo = new javax.swing.JLabel();
        personalizarJogoDisciplina = new javax.swing.JTextField();
        personalizarJogoQuestao = new javax.swing.JTextField();
        personalizarJogoQuestaoCJ = new javax.swing.JTextField();
        personalizarJogoA = new javax.swing.JTextField();
        personalizarJogoB = new javax.swing.JTextField();
        personalizarJogoC = new javax.swing.JTextField();
        personalizarJogoD = new javax.swing.JTextField();
        personalizarJogoConfirmar = new javax.swing.JButton();
        personalizarJogoVoltar = new javax.swing.JButton();
        PersonalizarJogoInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelPersonalizarJogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlpersonalizarJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/personalizarJogo.png"))); // NOI18N
        PainelPersonalizarJogo.add(jlpersonalizarJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        personalizarJogoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalizarJogoDisciplinaActionPerformed(evt);
            }
        });
        PainelPersonalizarJogo.add(personalizarJogoDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 36, 170, 40));
        PainelPersonalizarJogo.add(personalizarJogoQuestao, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 150, 380, 40));
        PainelPersonalizarJogo.add(personalizarJogoQuestaoCJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 37, 150, 40));
        PainelPersonalizarJogo.add(personalizarJogoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 250, 130, 40));

        personalizarJogoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalizarJogoBActionPerformed(evt);
            }
        });
        PainelPersonalizarJogo.add(personalizarJogoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 250, 140, 40));

        personalizarJogoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalizarJogoCActionPerformed(evt);
            }
        });
        PainelPersonalizarJogo.add(personalizarJogoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 330, 130, 40));
        PainelPersonalizarJogo.add(personalizarJogoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 325, 140, 40));

        personalizarJogoConfirmar.setText("confirmar");
        personalizarJogoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalizarJogoConfirmarActionPerformed(evt);
            }
        });
        PainelPersonalizarJogo.add(personalizarJogoConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 80, 40));

        personalizarJogoVoltar.setText("voltar");
        personalizarJogoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalizarJogoVoltarActionPerformed(evt);
            }
        });
        PainelPersonalizarJogo.add(personalizarJogoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, 40));

        PersonalizarJogoInformacao.setText("jButton1");
        PainelPersonalizarJogo.add(PersonalizarJogoInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPersonalizarJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPersonalizarJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personalizarJogoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalizarJogoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personalizarJogoCActionPerformed

    private void personalizarJogoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalizarJogoConfirmarActionPerformed

        criarJogo();
    }//GEN-LAST:event_personalizarJogoConfirmarActionPerformed

    private void personalizarJogoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalizarJogoVoltarActionPerformed
        new menuPrincipalProfessor().show();
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_personalizarJogoVoltarActionPerformed

    private void personalizarJogoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalizarJogoDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personalizarJogoDisciplinaActionPerformed

    private void personalizarJogoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalizarJogoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personalizarJogoBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPersonalizarJogo;
    private javax.swing.JButton PersonalizarJogoInformacao;
    private javax.swing.JLabel jlpersonalizarJogo;
    private javax.swing.JTextField personalizarJogoA;
    private javax.swing.JTextField personalizarJogoB;
    private javax.swing.JTextField personalizarJogoC;
    private javax.swing.JButton personalizarJogoConfirmar;
    private javax.swing.JTextField personalizarJogoD;
    private javax.swing.JTextField personalizarJogoDisciplina;
    private javax.swing.JTextField personalizarJogoQuestao;
    private javax.swing.JTextField personalizarJogoQuestaoCJ;
    private javax.swing.JButton personalizarJogoVoltar;
    // End of variables declaration//GEN-END:variables

    
    /**
     * Método que permite o professor criar um jogo personalizado
     */
    public void criarJogo()
    {
        novoCodigo=personalizarJogoQuestaoCJ.getText();
        novaQuestao = personalizarJogoQuestao.getText();  
        novaDisciplina = personalizarJogoDisciplina.getText();
        novoAltA=personalizarJogoA.getText();
        novoAltB=personalizarJogoB.getText();
        novoAltC=personalizarJogoC.getText();
        novoAltD=personalizarJogoD.getText();
        
        try {
            // conexão com o banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            
            // Condição para a criação do jogo e inserção do jogo no banco de dados
     if(stm.executeUpdate("INSERT into questoes values('"+novoCodigo+"','"+novaDisciplina+"','"+novaQuestao+"','"+novoAltA+"','"+novoAltB+"','"+novoAltC+"','"+novoAltD+"')")!=0)
            {
                // se o jogo foi criado, limpeza dos campos e mensagem de retorno.
                JOptionPane.showMessageDialog(null,"Jogo Criado com sucesso!!!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
                personalizarJogoQuestaoCJ.setText("");
                personalizarJogoDisciplina.setText("");
                personalizarJogoQuestao.setText("");
                personalizarJogoA.setText("");
                personalizarJogoB.setText("");
                personalizarJogoD.setText("");
            } else{
                JOptionPane.showMessageDialog(null,"Erro para realizar a alteração!!!","Erro",JOptionPane.ERROR_MESSAGE);   
            }
            
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }

}
