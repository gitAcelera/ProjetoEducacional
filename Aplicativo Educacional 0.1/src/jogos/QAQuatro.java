
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
public class QAQuatro extends javax.swing.JFrame {
    private QACinco TelaQACinco;
    int pontosQA = PontosAluno.getPontosQA();
      int idAluno=0;
    /**
     * Método construtor da classe QAQuatro
     */
    public QAQuatro() {
        initComponents();
        TelaQACinco = new QACinco();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQAQuatro = new javax.swing.JPanel();
        jlQAQuatro = new javax.swing.JLabel();
        btQAQuatroA = new javax.swing.JButton();
        btQAQuatroB = new javax.swing.JButton();
        btQAQuatroC = new javax.swing.JButton();
        btQAQuatroD = new javax.swing.JButton();
        btQAMenu = new javax.swing.JButton();
        btQAAvancar = new javax.swing.JButton();
        btQAVoltar = new javax.swing.JButton();
        btQADica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQAQuatro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQAQuatro.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQAQuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QAQuatro.png"))); // NOI18N
        PainelQAQuatro.add(jlQAQuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQAQuatroA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAQuatroA.setText("TUCANO");
        btQAQuatroA.setContentAreaFilled(false);
        btQAQuatroA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAQuatroAActionPerformed(evt);
            }
        });
        PainelQAQuatro.add(btQAQuatroA, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 136, 180, 90));

        btQAQuatroB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAQuatroB.setText("ELEFANTE");
        btQAQuatroB.setContentAreaFilled(false);
        btQAQuatroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAQuatroBActionPerformed(evt);
            }
        });
        PainelQAQuatro.add(btQAQuatroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 136, 190, 90));

        btQAQuatroC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAQuatroC.setText("CROCODILO");
        btQAQuatroC.setContentAreaFilled(false);
        btQAQuatroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAQuatroCActionPerformed(evt);
            }
        });
        PainelQAQuatro.add(btQAQuatroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 256, 180, 90));

        btQAQuatroD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAQuatroD.setText("GARÇA");
        btQAQuatroD.setContentAreaFilled(false);
        btQAQuatroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAQuatroDActionPerformed(evt);
            }
        });
        PainelQAQuatro.add(btQAQuatroD, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 256, 190, 90));

        btQAMenu.setText("MENU");
        btQAMenu.setContentAreaFilled(false);
        btQAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAMenuActionPerformed(evt);
            }
        });
        PainelQAQuatro.add(btQAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQAAvancar.setText("AVANÇAR");
        btQAAvancar.setContentAreaFilled(false);
        btQAAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAAvancarActionPerformed(evt);
            }
        });
        PainelQAQuatro.add(btQAAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 349, 90, 40));

        btQAVoltar.setText("Voltar");
        btQAVoltar.setContentAreaFilled(false);
        btQAVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAVoltarActionPerformed(evt);
            }
        });
        PainelQAQuatro.add(btQAVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 349, 80, 40));

        btQADica.setText("?");
        btQADica.setContentAreaFilled(false);
        btQADica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADicaActionPerformed(evt);
            }
        });
        PainelQAQuatro.add(btQADica, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 6, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQAQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQAQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQAQuatroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAQuatroBActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q4="+pontosQA+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQACinco.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQAQuatroBActionPerformed

    private void btQAQuatroDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAQuatroDActionPerformed
    pontosQA=pontosQA-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btQAQuatroDActionPerformed

    private void btQAQuatroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAQuatroCActionPerformed
    pontosQA=pontosQA-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btQAQuatroCActionPerformed

    private void btQAQuatroAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAQuatroAActionPerformed
      pontosQA=pontosQA-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQAQuatroAActionPerformed

    private void btQAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQAMenuActionPerformed

    private void btQAAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAAvancarActionPerformed
       TelaQACinco.setVisible(true);
      dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btQAAvancarActionPerformed

    private void btQAVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAVoltarActionPerformed
        new QATres().show();
        dispose();
    }//GEN-LAST:event_btQAVoltarActionPerformed

    private void btQADicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADicaActionPerformed
        JOptionPane.showMessageDialog(null,"É um animal muito grande e pesado!");
    }//GEN-LAST:event_btQADicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQAQuatro;
    private javax.swing.JButton btQAAvancar;
    private javax.swing.JButton btQADica;
    private javax.swing.JButton btQAMenu;
    private javax.swing.JButton btQAQuatroA;
    private javax.swing.JButton btQAQuatroB;
    private javax.swing.JButton btQAQuatroC;
    private javax.swing.JButton btQAQuatroD;
    private javax.swing.JButton btQAVoltar;
    private javax.swing.JLabel jlQAQuatro;
    // End of variables declaration//GEN-END:variables
}
