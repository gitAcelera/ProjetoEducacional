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
public class QESeis extends javax.swing.JFrame {
    private QESete TelaQESete;
    int pontosQE = PontosAluno.getPontosQE();
      int idAluno=0;

    /**
     * Creates new form QESeis
     */
    public QESeis() {
        initComponents();
        TelaQESete = new QESete();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQESeis = new javax.swing.JPanel();
        jlQESeisA = new javax.swing.JLabel();
        btQESeisA = new javax.swing.JButton();
        btQESeisB = new javax.swing.JButton();
        btQESeisC = new javax.swing.JButton();
        btQESeisD = new javax.swing.JButton();
        btAvancarQE = new javax.swing.JButton();
        btQESeisMenu = new javax.swing.JButton();
        btVoltarQE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlQESeisA.setBackground(new java.awt.Color(255, 255, 255));
        jlQESeisA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQESeisA.setText("Qual é a cor que tem nome de fruta?");

        btQESeisA.setBackground(new java.awt.Color(255, 102, 153));
        btQESeisA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQESeisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeisAActionPerformed(evt);
            }
        });

        btQESeisB.setBackground(new java.awt.Color(255, 255, 153));
        btQESeisB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQESeisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeisBActionPerformed(evt);
            }
        });

        btQESeisC.setBackground(new java.awt.Color(153, 255, 204));
        btQESeisC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQESeisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeisCActionPerformed(evt);
            }
        });

        btQESeisD.setBackground(new java.awt.Color(255, 153, 102));
        btQESeisD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQESeisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeisDActionPerformed(evt);
            }
        });

        btAvancarQE.setText("AVANÇAR");
        btAvancarQE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvancarQEActionPerformed(evt);
            }
        });

        btQESeisMenu.setText("MENU");
        btQESeisMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeisMenuActionPerformed(evt);
            }
        });

        btVoltarQE.setText("Voltar");
        btVoltarQE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarQEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelQESeisLayout = new javax.swing.GroupLayout(PainelQESeis);
        PainelQESeis.setLayout(PainelQESeisLayout);
        PainelQESeisLayout.setHorizontalGroup(
            PainelQESeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQESeisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelQESeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelQESeisLayout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addGroup(PainelQESeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQESeisLayout.createSequentialGroup()
                                .addGroup(PainelQESeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PainelQESeisLayout.createSequentialGroup()
                                        .addComponent(btQESeisC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btQESeisD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelQESeisLayout.createSequentialGroup()
                                        .addComponent(btQESeisA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(btQESeisB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(134, 134, 134))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQESeisLayout.createSequentialGroup()
                                .addComponent(jlQESeisA)
                                .addGap(53, 53, 53))))
                    .addGroup(PainelQESeisLayout.createSequentialGroup()
                        .addComponent(btQESeisMenu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQESeisLayout.createSequentialGroup()
                        .addComponent(btVoltarQE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAvancarQE)
                        .addContainerGap())))
        );
        PainelQESeisLayout.setVerticalGroup(
            PainelQESeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQESeisLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btQESeisMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlQESeisA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(PainelQESeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQESeisA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQESeisB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(PainelQESeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQESeisC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQESeisD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelQESeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAvancarQE)
                    .addComponent(btVoltarQE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQESeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQESeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQESeisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeisAActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q6="+pontosQE+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQESete.setVisible(true);
     dispose();
    }//GEN-LAST:event_btQESeisAActionPerformed

    private void btQESeisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeisDActionPerformed
     pontosQE=pontosQE-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btQESeisDActionPerformed

    private void btQESeisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeisCActionPerformed
   pontosQE=pontosQE-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btQESeisCActionPerformed

    private void btQESeisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeisBActionPerformed
       pontosQE=pontosQE-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btQESeisBActionPerformed

    private void btAvancarQEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarQEActionPerformed
         TelaQESete.setVisible(true);
     dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_btAvancarQEActionPerformed

    private void btQESeisMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeisMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQESeisMenuActionPerformed

    private void btVoltarQEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarQEActionPerformed
new QECinco().show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarQEActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQESeis;
    private javax.swing.JButton btAvancarQE;
    private javax.swing.JButton btQESeisA;
    private javax.swing.JButton btQESeisB;
    private javax.swing.JButton btQESeisC;
    private javax.swing.JButton btQESeisD;
    private javax.swing.JButton btQESeisMenu;
    private javax.swing.JButton btVoltarQE;
    private javax.swing.JLabel jlQESeisA;
    // End of variables declaration//GEN-END:variables
}
