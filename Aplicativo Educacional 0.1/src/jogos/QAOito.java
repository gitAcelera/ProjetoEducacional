
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
public class QAOito extends javax.swing.JFrame {
    private QANove TelaQANove;
int pontosQA = PontosAluno.getPontosQA();
      int idAluno=0;
    /**
     * Método construtor da classe QAOito
     */
    public QAOito() {
        initComponents();
        TelaQANove = new QANove();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQAOito = new javax.swing.JPanel();
        jlQAOito = new javax.swing.JLabel();
        btQAOitoA = new javax.swing.JButton();
        btQAOitoB = new javax.swing.JButton();
        btQAOitoC = new javax.swing.JButton();
        btQAOitoD = new javax.swing.JButton();
        btQAMenu = new javax.swing.JButton();
        btQAAvancar = new javax.swing.JButton();
        btQAVoltar = new javax.swing.JButton();
        btQADica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQAOito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQAOito.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQAOito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QAOito.png"))); // NOI18N
        PainelQAOito.add(jlQAOito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btQAOitoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAOitoA.setText("TARTARUGA");
        btQAOitoA.setContentAreaFilled(false);
        btQAOitoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAOitoAActionPerformed(evt);
            }
        });
        PainelQAOito.add(btQAOitoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 139, 180, 80));

        btQAOitoB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAOitoB.setText("COELHO");
        btQAOitoB.setContentAreaFilled(false);
        btQAOitoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAOitoBActionPerformed(evt);
            }
        });
        PainelQAOito.add(btQAOitoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 139, 180, 80));

        btQAOitoC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAOitoC.setText("TUCANO");
        btQAOitoC.setContentAreaFilled(false);
        btQAOitoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAOitoCActionPerformed(evt);
            }
        });
        PainelQAOito.add(btQAOitoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 259, 180, 80));

        btQAOitoD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAOitoD.setText("MACACO");
        btQAOitoD.setContentAreaFilled(false);
        btQAOitoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAOitoDActionPerformed(evt);
            }
        });
        PainelQAOito.add(btQAOitoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 259, 190, 80));

        btQAMenu.setText("MENU");
        btQAMenu.setContentAreaFilled(false);
        btQAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAMenuActionPerformed(evt);
            }
        });
        PainelQAOito.add(btQAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQAAvancar.setText("AVANÇAR");
        btQAAvancar.setContentAreaFilled(false);
        btQAAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAAvancarActionPerformed(evt);
            }
        });
        PainelQAOito.add(btQAAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 344, -1, 50));

        btQAVoltar.setText("Voltar");
        btQAVoltar.setContentAreaFilled(false);
        btQAVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAVoltarActionPerformed(evt);
            }
        });
        PainelQAOito.add(btQAVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btQADica.setText("?");
        btQADica.setContentAreaFilled(false);
        btQADica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADicaActionPerformed(evt);
            }
        });
        PainelQAOito.add(btQADica, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQAOito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQAOito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQAOitoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAOitoDActionPerformed
    JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
    pontosQA=pontosQA-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btQAOitoDActionPerformed

    private void btQAOitoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAOitoBActionPerformed
  JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
  pontosQA=pontosQA-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btQAOitoBActionPerformed

    private void btQAOitoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAOitoCActionPerformed
 JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
 pontosQA=pontosQA-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btQAOitoCActionPerformed

    private void btQAOitoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAOitoAActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q8="+pontosQA+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQANove.setVisible(true);
     dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btQAOitoAActionPerformed

    private void btQAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQAMenuActionPerformed

    private void btQAAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAAvancarActionPerformed
        TelaQANove.setVisible(true);
     dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btQAAvancarActionPerformed

    private void btQAVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAVoltarActionPerformed
        new QASete().show();
        dispose();
    }//GEN-LAST:event_btQAVoltarActionPerformed

    private void btQADicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADicaActionPerformed
        JOptionPane.showMessageDialog(null,"Esse animal possui um casco em suas costas!");
    }//GEN-LAST:event_btQADicaActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQAOito;
    private javax.swing.JButton btQAAvancar;
    private javax.swing.JButton btQADica;
    private javax.swing.JButton btQAMenu;
    private javax.swing.JButton btQAOitoA;
    private javax.swing.JButton btQAOitoB;
    private javax.swing.JButton btQAOitoC;
    private javax.swing.JButton btQAOitoD;
    private javax.swing.JButton btQAVoltar;
    private javax.swing.JLabel jlQAOito;
    // End of variables declaration//GEN-END:variables
}
