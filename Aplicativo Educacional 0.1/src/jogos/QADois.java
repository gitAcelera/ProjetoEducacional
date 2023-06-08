
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
 *@author Felipe
 * Classe responsável pelo jogo Qual é o animal
 */
public class QADois extends javax.swing.JFrame {
    private QATres TelaQATres;
    int pontosQA = PontosAluno.getPontosQA();
      int idAluno=0;

    /**
     * Método construtor da classe QADois
     */
    public QADois() {
        initComponents();
        TelaQATres = new QATres();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQADois = new javax.swing.JPanel();
        jlQADois = new javax.swing.JLabel();
        btQADoisA = new javax.swing.JButton();
        btQADoisB = new javax.swing.JButton();
        btQADoisC = new javax.swing.JButton();
        btQADoisD = new javax.swing.JButton();
        btQAMenu = new javax.swing.JButton();
        btQAAvancar = new javax.swing.JButton();
        btQAVoltar = new javax.swing.JButton();
        btQADica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQADois.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQADois.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQADois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QADois.png"))); // NOI18N
        PainelQADois.add(jlQADois, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btQADoisA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQADoisA.setText("COELHO");
        btQADoisA.setContentAreaFilled(false);
        btQADoisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADoisAActionPerformed(evt);
            }
        });
        PainelQADois.add(btQADoisA, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 133, 180, 90));

        btQADoisB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQADoisB.setText("URSO");
        btQADoisB.setContentAreaFilled(false);
        btQADoisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADoisBActionPerformed(evt);
            }
        });
        PainelQADois.add(btQADoisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 133, 190, 90));

        btQADoisC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQADoisC.setText("GIRAFA");
        btQADoisC.setContentAreaFilled(false);
        btQADoisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADoisCActionPerformed(evt);
            }
        });
        PainelQADois.add(btQADoisC, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 263, 180, 80));

        btQADoisD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQADoisD.setText("CAVALO");
        btQADoisD.setContentAreaFilled(false);
        btQADoisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADoisDActionPerformed(evt);
            }
        });
        PainelQADois.add(btQADoisD, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 253, 190, 90));

        btQAMenu.setText("MENU");
        btQAMenu.setContentAreaFilled(false);
        btQAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAMenuActionPerformed(evt);
            }
        });
        PainelQADois.add(btQAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 90, 40));

        btQAAvancar.setText("AVANÇAR");
        btQAAvancar.setContentAreaFilled(false);
        btQAAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAAvancarActionPerformed(evt);
            }
        });
        PainelQADois.add(btQAAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 344, -1, 50));

        btQAVoltar.setText("Voltar");
        btQAVoltar.setContentAreaFilled(false);
        btQAVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAVoltarActionPerformed(evt);
            }
        });
        PainelQADois.add(btQAVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 354, 90, 40));

        btQADica.setText("?");
        btQADica.setContentAreaFilled(false);
        btQADica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADicaActionPerformed(evt);
            }
        });
        PainelQADois.add(btQADica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQADois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQADois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQADoisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADoisDActionPerformed
   pontosQA=pontosQA-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btQADoisDActionPerformed

    private void btQADoisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADoisCActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q2="+pontosQA+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQATres.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQADoisCActionPerformed

    private void btQADoisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADoisAActionPerformed
     pontosQA=pontosQA-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQADoisAActionPerformed

    private void btQADoisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADoisBActionPerformed
 pontosQA=pontosQA-5;          // TODO add your handling code here:
    }//GEN-LAST:event_btQADoisBActionPerformed

    private void btQAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQAMenuActionPerformed

    private void btQAAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAAvancarActionPerformed
        TelaQATres.setVisible(true);
      dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btQAAvancarActionPerformed

    private void btQAVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAVoltarActionPerformed
        new QAUm().show();
        dispose();
    }//GEN-LAST:event_btQAVoltarActionPerformed

    private void btQADicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADicaActionPerformed
        JOptionPane.showMessageDialog(null,"É o animal mais alto do mundo, todo o seu corpo é coberto por pelos que formam manchas grandes e marrons!");
    }//GEN-LAST:event_btQADicaActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQADois;
    private javax.swing.JButton btQAAvancar;
    private javax.swing.JButton btQADica;
    private javax.swing.JButton btQADoisA;
    private javax.swing.JButton btQADoisB;
    private javax.swing.JButton btQADoisC;
    private javax.swing.JButton btQADoisD;
    private javax.swing.JButton btQAMenu;
    private javax.swing.JButton btQAVoltar;
    private javax.swing.JLabel jlQADois;
    // End of variables declaration//GEN-END:variables
}
