/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogos;

import dados.PontosAluno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import telas.menuPrincipal;

/**
 *
 * @author fellr
 */
public class QEDois extends javax.swing.JFrame {
    private QETres TelaQETres;
    int pontosQE = PontosAluno.getPontosQE();
      int idAluno=0;

    /**
     * Creates new form QEDois
     */
    public QEDois() {
        initComponents();
        TelaQETres = new QETres();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQEDois = new javax.swing.JPanel();
        jlQEDoisA = new javax.swing.JLabel();
        btQEDoisA = new javax.swing.JButton();
        btQEDoisB = new javax.swing.JButton();
        btQEDoisC = new javax.swing.JButton();
        btQEDoisD = new javax.swing.JButton();
        btavncarQE = new javax.swing.JButton();
        btQEDoisMenu = new javax.swing.JButton();
        btVoltarQE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlQEDoisA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQEDoisA.setText("Qual é a cor do sol?");

        btQEDoisA.setBackground(new java.awt.Color(255, 0, 0));
        btQEDoisA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDoisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDoisAActionPerformed(evt);
            }
        });

        btQEDoisB.setBackground(new java.awt.Color(255, 255, 0));
        btQEDoisB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDoisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDoisBActionPerformed(evt);
            }
        });

        btQEDoisC.setBackground(new java.awt.Color(0, 102, 255));
        btQEDoisC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDoisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDoisCActionPerformed(evt);
            }
        });

        btQEDoisD.setBackground(new java.awt.Color(0, 153, 0));
        btQEDoisD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDoisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDoisDActionPerformed(evt);
            }
        });

        btavncarQE.setText("AVANÇAR");
        btavncarQE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btavncarQEActionPerformed(evt);
            }
        });

        btQEDoisMenu.setText("MENU");
        btQEDoisMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDoisMenuActionPerformed(evt);
            }
        });

        btVoltarQE.setText("Voltar");
        btVoltarQE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarQEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelQEDoisLayout = new javax.swing.GroupLayout(PainelQEDois);
        PainelQEDois.setLayout(PainelQEDoisLayout);
        PainelQEDoisLayout.setHorizontalGroup(
            PainelQEDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQEDoisLayout.createSequentialGroup()
                .addGroup(PainelQEDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQEDoisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btVoltarQE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(PainelQEDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PainelQEDoisLayout.createSequentialGroup()
                                .addComponent(btQEDoisC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btQEDoisD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelQEDoisLayout.createSequentialGroup()
                                .addComponent(btQEDoisA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btQEDoisB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(btavncarQE))
                    .addGroup(PainelQEDoisLayout.createSequentialGroup()
                        .addGroup(PainelQEDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelQEDoisLayout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jlQEDoisA))
                            .addGroup(PainelQEDoisLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btQEDoisMenu)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelQEDoisLayout.setVerticalGroup(
            PainelQEDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQEDoisLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(btQEDoisMenu)
                .addGap(18, 18, 18)
                .addComponent(jlQEDoisA)
                .addGap(47, 47, 47)
                .addGroup(PainelQEDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQEDoisA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQEDoisB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PainelQEDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelQEDoisLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(PainelQEDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btQEDoisC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQEDoisD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQEDoisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelQEDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btavncarQE)
                            .addComponent(btVoltarQE))
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQEDoisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDoisBActionPerformed
     pontosQE=pontosQE+20;
        System.out.println(""+pontosQE);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * from jogos");
            while(res.next())
            {
                 
                idAluno= res.getInt("idAluno");
            }
            stm.executeUpdate("UPDATE jogos set q2="+pontosQE+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQETres.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQEDoisBActionPerformed

    private void btQEDoisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDoisAActionPerformed
  pontosQE=pontosQE-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btQEDoisAActionPerformed

    private void btQEDoisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDoisCActionPerformed
  pontosQE=pontosQE-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btQEDoisCActionPerformed

    private void btQEDoisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDoisDActionPerformed
pontosQE=pontosQE-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btQEDoisDActionPerformed

    private void btQEDoisMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDoisMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEDoisMenuActionPerformed

    private void btavncarQEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btavncarQEActionPerformed
       TelaQETres.setVisible(true);
      dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btavncarQEActionPerformed

    private void btVoltarQEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarQEActionPerformed
        new QEUm().show();
        dispose();
    }//GEN-LAST:event_btVoltarQEActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQEDois;
    private javax.swing.JButton btQEDoisA;
    private javax.swing.JButton btQEDoisB;
    private javax.swing.JButton btQEDoisC;
    private javax.swing.JButton btQEDoisD;
    private javax.swing.JButton btQEDoisMenu;
    private javax.swing.JButton btVoltarQE;
    private javax.swing.JButton btavncarQE;
    private javax.swing.JLabel jlQEDoisA;
    // End of variables declaration//GEN-END:variables
}
