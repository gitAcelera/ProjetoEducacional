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
        btPtDica = new javax.swing.JButton();

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

        btPtDica.setText("?");
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelQAUmLayout = new javax.swing.GroupLayout(PainelQAUm);
        PainelQAUm.setLayout(PainelQAUmLayout);
        PainelQAUmLayout.setHorizontalGroup(
            PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQAUmLayout.createSequentialGroup()
                .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQAUmLayout.createSequentialGroup()
                        .addContainerGap(129, Short.MAX_VALUE)
                        .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btQAUmC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQAUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btQAUmD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQAUmB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123))
                    .addGroup(PainelQAUmLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelQAUmLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btAvanvarQA))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQAUmLayout.createSequentialGroup()
                                .addComponent(btQAUmMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btPtDica)))))
                .addContainerGap())
            .addGroup(PainelQAUmLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlQAUmA)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQAUmLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jlQAUmB)
                        .addGap(105, 105, 105)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelQAUmLayout.setVerticalGroup(
            PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQAUmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPtDica)
                    .addComponent(btQAUmMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlQAUmA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlQAUmB)
                .addGap(18, 18, 18)
                .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQAUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQAUmD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQAUmC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQAUmB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btAvanvarQA)
                .addContainerGap())
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

    private void btPtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Esse animal vive em uma colmeia");
    }//GEN-LAST:event_btPtDicaActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQAUm;
    private javax.swing.JButton btAvanvarQA;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btQAUmA;
    private javax.swing.JButton btQAUmB;
    private javax.swing.JButton btQAUmC;
    private javax.swing.JButton btQAUmD;
    private javax.swing.JButton btQAUmMenu;
    private javax.swing.JLabel jlQAUmA;
    private javax.swing.JLabel jlQAUmB;
    // End of variables declaration//GEN-END:variables
}
