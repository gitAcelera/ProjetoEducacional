
package jogos;

import Dados.PontosAluno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import telas.menuPrincipal;
/**
 *Classe responsável pelo jogo Qual é a cor 
 *@author Felipe
 * 
 */
public class QASete extends javax.swing.JFrame {
    private QAOito TelaQAOito;
    int pontosQA = PontosAluno.getPontosQA();
      int idAluno=0;
    /**
     * Método construtor da classe QASete
     */
    public QASete() {
        initComponents();
        TelaQAOito = new QAOito();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQASete = new javax.swing.JPanel();
        jlQASete = new javax.swing.JLabel();
        btQASeteA = new javax.swing.JButton();
        btQASeteB = new javax.swing.JButton();
        btQASeteC = new javax.swing.JButton();
        btQASeteD = new javax.swing.JButton();
        btQAMenu = new javax.swing.JButton();
        btQAAvancar = new javax.swing.JButton();
        btQAVoltar = new javax.swing.JButton();
        btQADica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQASete.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelQASete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQASete.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQASete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QASete.png"))); // NOI18N
        PainelQASete.add(jlQASete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQASeteA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQASeteA.setText("GATO");
        btQASeteA.setContentAreaFilled(false);
        btQASeteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQASeteAActionPerformed(evt);
            }
        });
        PainelQASete.add(btQASeteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 140, 180, 80));

        btQASeteB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQASeteB.setText("ONÇA");
        btQASeteB.setContentAreaFilled(false);
        btQASeteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQASeteBActionPerformed(evt);
            }
        });
        PainelQASete.add(btQASeteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 140, 190, 80));

        btQASeteC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQASeteC.setText("CAVALO");
        btQASeteC.setContentAreaFilled(false);
        btQASeteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQASeteCActionPerformed(evt);
            }
        });
        PainelQASete.add(btQASeteC, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 260, 180, 80));

        btQASeteD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQASeteD.setText("PATO");
        btQASeteD.setContentAreaFilled(false);
        btQASeteD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQASeteDActionPerformed(evt);
            }
        });
        PainelQASete.add(btQASeteD, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 260, 190, 80));

        btQAMenu.setText("MENU");
        btQAMenu.setContentAreaFilled(false);
        btQAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAMenuActionPerformed(evt);
            }
        });
        PainelQASete.add(btQAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQAAvancar.setText("AVANÇAR");
        btQAAvancar.setContentAreaFilled(false);
        btQAAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAAvancarActionPerformed(evt);
            }
        });
        PainelQASete.add(btQAAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 347, -1, 40));

        btQAVoltar.setText("Voltar");
        btQAVoltar.setContentAreaFilled(false);
        btQAVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAVoltarActionPerformed(evt);
            }
        });
        PainelQASete.add(btQAVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btQADica.setText("?");
        btQADica.setContentAreaFilled(false);
        btQADica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADicaActionPerformed(evt);
            }
        });
        PainelQASete.add(btQADica, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 6, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQASete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQASete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQASeteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQASeteCActionPerformed
pontosQA=pontosQA-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btQASeteCActionPerformed

    private void btQASeteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQASeteBActionPerformed
     pontosQA=pontosQA+20;
        System.out.println(""+pontosQA);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * from jogos");
            while(res.next())
            {
                 
                idAluno= res.getInt("idAluno");
            }
            stm.executeUpdate("UPDATE jogos set q7="+pontosQA+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQAOito.setVisible(true);
     dispose();
    }//GEN-LAST:event_btQASeteBActionPerformed

    private void btQASeteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQASeteAActionPerformed
    pontosQA=pontosQA-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btQASeteAActionPerformed

    private void btQASeteDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQASeteDActionPerformed
    pontosQA=pontosQA-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btQASeteDActionPerformed

    private void btQAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQAMenuActionPerformed

    private void btQAAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAAvancarActionPerformed
        TelaQAOito.setVisible(true);
     dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btQAAvancarActionPerformed

    private void btQAVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAVoltarActionPerformed
        new QASeis().show();
        dispose();
    }//GEN-LAST:event_btQAVoltarActionPerformed

    private void btQADicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADicaActionPerformed
        JOptionPane.showMessageDialog(null,"Os animais que NÃO podem ser de estimação, não podem viver dentro de casa mas sim em seu habitat natural!");
    }//GEN-LAST:event_btQADicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQASete;
    private javax.swing.JButton btQAAvancar;
    private javax.swing.JButton btQADica;
    private javax.swing.JButton btQAMenu;
    private javax.swing.JButton btQASeteA;
    private javax.swing.JButton btQASeteB;
    private javax.swing.JButton btQASeteC;
    private javax.swing.JButton btQASeteD;
    private javax.swing.JButton btQAVoltar;
    private javax.swing.JLabel jlQASete;
    // End of variables declaration//GEN-END:variables
}
