/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogos;

import dados.PontosAluno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import telas.menuPrincipal;
/**
 *
 * @author fellr
 */
public class QAUm extends javax.swing.JFrame {
    private QADois TelaQADois;
     int pontosQA = PontosAluno.getPontosQA();
     String tipo ="Qual é o animal";

    /**
     * Creates new form QAUm
     */
    public QAUm() {
        initComponents();
        TelaQADois = new QADois();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQAUm = new javax.swing.JPanel();
        jlQAUmA = new javax.swing.JLabel();
        jlQAUmB = new javax.swing.JLabel();
        btQAUmA = new javax.swing.JButton();
        btQAUmB = new javax.swing.JButton();
        btQAUmC = new javax.swing.JButton();
        btQAUmD = new javax.swing.JButton();
        btQAUmMenu = new javax.swing.JButton();
        btAvanvarQA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlQAUmA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQAUmA.setText("Qual é o animal que voa e");

        jlQAUmB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQAUmB.setText("produz mel?");

        btQAUmA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAUmA.setText("MOSQUITO");
        btQAUmA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAUmAActionPerformed(evt);
            }
        });

        btQAUmB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAUmB.setText("BEIJA-FLOR");
        btQAUmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAUmBActionPerformed(evt);
            }
        });

        btQAUmC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAUmC.setText("ABELHA");
        btQAUmC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAUmCActionPerformed(evt);
            }
        });

        btQAUmD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAUmD.setText("BESOURO");
        btQAUmD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAUmDActionPerformed(evt);
            }
        });

        btQAUmMenu.setText("MENU");
        btQAUmMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAUmMenuActionPerformed(evt);
            }
        });

        btAvanvarQA.setText("AVANÇAR");
        btAvanvarQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvanvarQAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelQAUmLayout = new javax.swing.GroupLayout(PainelQAUm);
        PainelQAUm.setLayout(PainelQAUmLayout);
        PainelQAUmLayout.setHorizontalGroup(
            PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQAUmLayout.createSequentialGroup()
                .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelQAUmLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btQAUmC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQAUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btQAUmD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelQAUmLayout.createSequentialGroup()
                                .addComponent(btQAUmB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(btAvanvarQA))))
                    .addGroup(PainelQAUmLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btQAUmMenu)
                        .addGap(65, 65, 65)
                        .addComponent(jlQAUmA))
                    .addGroup(PainelQAUmLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jlQAUmB)))
                .addContainerGap())
        );
        PainelQAUmLayout.setVerticalGroup(
            PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQAUmLayout.createSequentialGroup()
                .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelQAUmLayout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addComponent(jlQAUmA)
                        .addGap(18, 18, 18))
                    .addGroup(PainelQAUmLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btQAUmMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jlQAUmB)
                .addGap(18, 18, 18)
                .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQAUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQAUmD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelQAUmLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btQAUmC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQAUmB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQAUmLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAvanvarQA)
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQAUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQAUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQAUmCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAUmCActionPerformed
      pontosQA=pontosQA+20;
        System.out.println(""+pontosQA);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            stm.executeUpdate("INSERT into jogos (q1,q2,q3,q4,q5,q6,q7,q8,q9,q10) values ("+pontosQA+","+0+","+0+","+0+","+0+","+0+","+0+","+0+","+0+","+0+")");
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        
        TelaQADois.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQAUmCActionPerformed

    private void btQAUmAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAUmAActionPerformed
        pontosQA=pontosQA-5;  // TODO add your handling code here:
    }//GEN-LAST:event_btQAUmAActionPerformed

    private void btQAUmDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAUmDActionPerformed
      pontosQA=pontosQA-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btQAUmDActionPerformed

    private void btQAUmBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAUmBActionPerformed
        pontosQA=pontosQA-5;  // TODO add your handling code here:
    }//GEN-LAST:event_btQAUmBActionPerformed

    private void btQAUmMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAUmMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQAUmMenuActionPerformed

    private void btAvanvarQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvanvarQAActionPerformed
         TelaQADois.setVisible(true);
      dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btAvanvarQAActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQAUm;
    private javax.swing.JButton btAvanvarQA;
    private javax.swing.JButton btQAUmA;
    private javax.swing.JButton btQAUmB;
    private javax.swing.JButton btQAUmC;
    private javax.swing.JButton btQAUmD;
    private javax.swing.JButton btQAUmMenu;
    private javax.swing.JButton btQEQuatroMenu;
    private javax.swing.JLabel jlQAUmA;
    private javax.swing.JLabel jlQAUmB;
    // End of variables declaration//GEN-END:variables
}
