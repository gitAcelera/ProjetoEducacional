
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
public class QANove extends javax.swing.JFrame {
  private QADez TelaQADez;
    int pontosQA = PontosAluno.getPontosQA();
      int idAluno=0;

    /**
     * Método construtor da classe QANove
     */
    public QANove() {
        initComponents();
        TelaQADez = new QADez();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQANove = new javax.swing.JPanel();
        jlQANove = new javax.swing.JLabel();
        btQANoveA = new javax.swing.JButton();
        btQANoveB = new javax.swing.JButton();
        btQANoveC = new javax.swing.JButton();
        btQANoveD = new javax.swing.JButton();
        btQAMenu = new javax.swing.JButton();
        btQAAvancar = new javax.swing.JButton();
        btQAVoltar = new javax.swing.JButton();
        btQADica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQANove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQANove.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQANove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QANove.png"))); // NOI18N
        PainelQANove.add(jlQANove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btQANoveA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQANoveA.setText("PINTINHO");
        btQANoveA.setContentAreaFilled(false);
        btQANoveA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQANoveAActionPerformed(evt);
            }
        });
        PainelQANove.add(btQANoveA, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 135, 190, 90));

        btQANoveB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQANoveB.setText("GALO");
        btQANoveB.setContentAreaFilled(false);
        btQANoveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQANoveBActionPerformed(evt);
            }
        });
        PainelQANove.add(btQANoveB, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 135, 180, 90));

        btQANoveC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQANoveC.setText("GALINHO");
        btQANoveC.setContentAreaFilled(false);
        btQANoveC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQANoveCActionPerformed(evt);
            }
        });
        PainelQANove.add(btQANoveC, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 255, 180, 90));

        btQANoveD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQANoveD.setText("POMBINHO");
        btQANoveD.setContentAreaFilled(false);
        btQANoveD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQANoveDActionPerformed(evt);
            }
        });
        PainelQANove.add(btQANoveD, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 255, 180, 90));

        btQAMenu.setText("MENU");
        btQAMenu.setContentAreaFilled(false);
        btQAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAMenuActionPerformed(evt);
            }
        });
        PainelQANove.add(btQAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQAAvancar.setText("AVANÇAR");
        btQAAvancar.setContentAreaFilled(false);
        btQAAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAAvancarActionPerformed(evt);
            }
        });
        PainelQANove.add(btQAAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 344, -1, 50));

        btQAVoltar.setText("Voltar");
        btQAVoltar.setContentAreaFilled(false);
        btQAVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAVoltarActionPerformed(evt);
            }
        });
        PainelQANove.add(btQAVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btQADica.setText("?");
        btQADica.setContentAreaFilled(false);
        btQADica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADicaActionPerformed(evt);
            }
        });
        PainelQANove.add(btQADica, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 6, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQANove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQANove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQANoveAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQANoveAActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q9="+pontosQA+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQADez.setVisible(true);
     dispose();
    }//GEN-LAST:event_btQANoveAActionPerformed

    private void btQANoveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQANoveBActionPerformed
    pontosQA=pontosQA-5;       // TODO add your handling code here:
    }//GEN-LAST:event_btQANoveBActionPerformed

    private void btQANoveDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQANoveDActionPerformed
    pontosQA=pontosQA-5;       // TODO add your handling code here:
    }//GEN-LAST:event_btQANoveDActionPerformed

    private void btQANoveCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQANoveCActionPerformed
     pontosQA=pontosQA-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQANoveCActionPerformed

    private void btQAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQAMenuActionPerformed

    private void btQAAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAAvancarActionPerformed
         TelaQADez.setVisible(true);
     dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btQAAvancarActionPerformed

    private void btQAVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAVoltarActionPerformed
        new QAOito().show();
        dispose();
    }//GEN-LAST:event_btQAVoltarActionPerformed

    private void btQADicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADicaActionPerformed
        JOptionPane.showMessageDialog(null,"Ele NÃO começa com a letra G");
    }//GEN-LAST:event_btQADicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQANove;
    private javax.swing.JButton btQAAvancar;
    private javax.swing.JButton btQADica;
    private javax.swing.JButton btQAMenu;
    private javax.swing.JButton btQANoveA;
    private javax.swing.JButton btQANoveB;
    private javax.swing.JButton btQANoveC;
    private javax.swing.JButton btQANoveD;
    private javax.swing.JButton btQAVoltar;
    private javax.swing.JLabel jlQANove;
    // End of variables declaration//GEN-END:variables
}
