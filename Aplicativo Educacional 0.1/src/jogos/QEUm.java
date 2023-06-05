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
public class QEUm extends javax.swing.JFrame {
    private QEDois TelaQEDois;
    int pontosQE = PontosAluno.getPontosQE();
    String tipo="Qual é a cor";

    /**
     * Creates new form QEUm
     */
    public QEUm() {
        initComponents();
        TelaQEDois = new QEDois();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQEUm = new javax.swing.JPanel();
        jlQEUmA = new javax.swing.JLabel();
        jlQEUmB = new javax.swing.JLabel();
        btQEUmA = new javax.swing.JButton();
        btQEUmB = new javax.swing.JButton();
        btQEUmC = new javax.swing.JButton();
        btQEUmD = new javax.swing.JButton();
        btQEUmMenu = new javax.swing.JButton();
        btAvancarQE = new javax.swing.JButton();
        btPtDica2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PainelQEUm.setMaximumSize(new java.awt.Dimension(700, 400));
        PainelQEUm.setMinimumSize(new java.awt.Dimension(700, 400));
        PainelQEUm.setPreferredSize(new java.awt.Dimension(700, 400));

        jlQEUmA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQEUmA.setText("Qual é a cor do céu ");

        jlQEUmB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQEUmB.setText("em um dia ENSOLARADO?");

        btQEUmA.setBackground(new java.awt.Color(255, 255, 0));
        btQEUmA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEUmA.setMaximumSize(new java.awt.Dimension(121, 39));
        btQEUmA.setMinimumSize(new java.awt.Dimension(121, 39));
        btQEUmA.setPreferredSize(new java.awt.Dimension(121, 39));
        btQEUmA.setRequestFocusEnabled(false);
        btQEUmA.setRolloverEnabled(false);
        btQEUmA.setVerifyInputWhenFocusTarget(false);
        btQEUmA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEUmAActionPerformed(evt);
            }
        });

        btQEUmB.setBackground(new java.awt.Color(0, 204, 204));
        btQEUmB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEUmB.setForeground(new java.awt.Color(255, 255, 255));
        btQEUmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEUmBActionPerformed(evt);
            }
        });

        btQEUmC.setBackground(new java.awt.Color(0, 204, 0));
        btQEUmC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEUmC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEUmCActionPerformed(evt);
            }
        });

        btQEUmD.setBackground(new java.awt.Color(204, 204, 255));
        btQEUmD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEUmD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEUmDActionPerformed(evt);
            }
        });

        btQEUmMenu.setText("MENU");
        btQEUmMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEUmMenuActionPerformed(evt);
            }
        });

        btAvancarQE.setText("AVANÇAR");
        btAvancarQE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvancarQEActionPerformed(evt);
            }
        });

        btPtDica2.setText("?");
        btPtDica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDica2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelQEUmLayout = new javax.swing.GroupLayout(PainelQEUm);
        PainelQEUm.setLayout(PainelQEUmLayout);
        PainelQEUmLayout.setHorizontalGroup(
            PainelQEUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQEUmLayout.createSequentialGroup()
                .addGroup(PainelQEUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelQEUmLayout.createSequentialGroup()
                        .addGroup(PainelQEUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelQEUmLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jlQEUmA))
                            .addGroup(PainelQEUmLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jlQEUmB)))
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addGroup(PainelQEUmLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelQEUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelQEUmLayout.createSequentialGroup()
                                .addComponent(btQEUmMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btPtDica2))
                            .addGroup(PainelQEUmLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btAvancarQE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQEUmLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PainelQEUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btQEUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQEUmC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(PainelQEUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btQEUmB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQEUmD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );
        PainelQEUmLayout.setVerticalGroup(
            PainelQEUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQEUmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelQEUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQEUmMenu)
                    .addComponent(btPtDica2))
                .addGroup(PainelQEUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelQEUmLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jlQEUmA)
                        .addGap(2, 2, 2)
                        .addComponent(jlQEUmB)
                        .addGap(18, 18, 18)
                        .addGroup(PainelQEUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btQEUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQEUmB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(PainelQEUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btQEUmC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQEUmD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQEUmLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAvancarQE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQEUmAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEUmAActionPerformed
    pontosQE=pontosQE-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btQEUmAActionPerformed

    private void btQEUmDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEUmDActionPerformed
      pontosQE=pontosQE-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btQEUmDActionPerformed

    private void btQEUmBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEUmBActionPerformed
      pontosQE=pontosQE+20;
        System.out.println(""+pontosQE);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            stm.executeUpdate("INSERT into jogos (q1,q2,q3,q4,q5,q6,q7,q8,q9,q10) values ("+pontosQE+","+0+","+0+","+0+","+0+","+0+","+0+","+0+","+0+","+0+")");
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQEDois.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQEUmBActionPerformed

    private void btQEUmCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEUmCActionPerformed
    pontosQE=pontosQE-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQEUmCActionPerformed

    private void btQEUmMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEUmMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEUmMenuActionPerformed

    private void btAvancarQEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarQEActionPerformed
     TelaQEDois.setVisible(true);
      dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_btAvancarQEActionPerformed

    private void btPtDica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDica2ActionPerformed
        JOptionPane.showMessageDialog(null,"Essa cor é como a cor da água da piscina em um dia ensolarado!");
    }//GEN-LAST:event_btPtDica2ActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQEUm;
    private javax.swing.JButton btAvancarQE;
    private javax.swing.JButton btPtDica2;
    private javax.swing.JButton btQEUmA;
    private javax.swing.JButton btQEUmB;
    private javax.swing.JButton btQEUmC;
    private javax.swing.JButton btQEUmD;
    private javax.swing.JButton btQEUmMenu;
    private javax.swing.JLabel jlQEUmA;
    private javax.swing.JLabel jlQEUmB;
    // End of variables declaration//GEN-END:variables
}
