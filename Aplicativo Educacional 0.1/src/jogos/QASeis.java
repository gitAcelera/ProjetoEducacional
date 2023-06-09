
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
public class QASeis extends javax.swing.JFrame {
    private QASete TelaQASete;
int pontosQA = PontosAluno.getPontosQA();
      int idAluno=0;
    /**
     * Método construtor da classe QASeis
     */
    public QASeis() {
        initComponents();
        TelaQASete = new QASete();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQASeis = new javax.swing.JPanel();
        jlQASeis = new javax.swing.JLabel();
        btQASeisA = new javax.swing.JButton();
        btQASeisB = new javax.swing.JButton();
        btQASeisC = new javax.swing.JButton();
        btQASeisD = new javax.swing.JButton();
        btQAMenu = new javax.swing.JButton();
        btQAAvancar = new javax.swing.JButton();
        btQAVoltar = new javax.swing.JButton();
        btQADica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setResizable(false);

        PainelQASeis.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelQASeis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQASeis.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQASeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QASeis.png"))); // NOI18N
        PainelQASeis.add(jlQASeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQASeisA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQASeisA.setText("BARATA");
        btQASeisA.setContentAreaFilled(false);
        btQASeisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQASeisAActionPerformed(evt);
            }
        });
        PainelQASeis.add(btQASeisA, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 141, 180, 80));

        btQASeisB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQASeisB.setText("PATO");
        btQASeisB.setContentAreaFilled(false);
        btQASeisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQASeisBActionPerformed(evt);
            }
        });
        PainelQASeis.add(btQASeisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 141, 180, 80));

        btQASeisC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQASeisC.setText("RATO");
        btQASeisC.setContentAreaFilled(false);
        btQASeisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQASeisCActionPerformed(evt);
            }
        });
        PainelQASeis.add(btQASeisC, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 261, 180, 80));

        btQASeisD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQASeisD.setText("COBRA");
        btQASeisD.setContentAreaFilled(false);
        btQASeisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQASeisDActionPerformed(evt);
            }
        });
        PainelQASeis.add(btQASeisD, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 261, 180, 80));

        btQAMenu.setText("MENU");
        btQAMenu.setContentAreaFilled(false);
        btQAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAMenuActionPerformed(evt);
            }
        });
        PainelQASeis.add(btQAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQAAvancar.setText("AVANÇAR");
        btQAAvancar.setContentAreaFilled(false);
        btQAAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAAvancarActionPerformed(evt);
            }
        });
        PainelQASeis.add(btQAAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 344, -1, 50));

        btQAVoltar.setText("Voltar");
        btQAVoltar.setContentAreaFilled(false);
        btQAVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAVoltarActionPerformed(evt);
            }
        });
        PainelQASeis.add(btQAVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btQADica.setText("?");
        btQADica.setContentAreaFilled(false);
        btQADica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADicaActionPerformed(evt);
            }
        });
        PainelQASeis.add(btQADica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQASeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQASeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQASeisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQASeisDActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q6="+pontosQA+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQASete.setVisible(true);
     dispose();
    }//GEN-LAST:event_btQASeisDActionPerformed

    private void btQASeisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQASeisAActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosQA=pontosQA-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQASeisAActionPerformed

    private void btQASeisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQASeisBActionPerformed
    JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
    pontosQA=pontosQA-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btQASeisBActionPerformed

    private void btQASeisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQASeisCActionPerformed
  JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
  pontosQA=pontosQA-5;           // TODO add your handling code here:
    }//GEN-LAST:event_btQASeisCActionPerformed

    private void btQAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQAMenuActionPerformed

    private void btQAAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAAvancarActionPerformed
       TelaQASete.setVisible(true);
     dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btQAAvancarActionPerformed

    private void btQAVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAVoltarActionPerformed
        new QACinco().show();
        dispose();
    }//GEN-LAST:event_btQAVoltarActionPerformed

    private void btQADicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADicaActionPerformed
        JOptionPane.showMessageDialog(null,"Esse animal NÃO possui patas e pálpebras, e a pele é coberta de escamas!");
    }//GEN-LAST:event_btQADicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQASeis;
    private javax.swing.JButton btQAAvancar;
    private javax.swing.JButton btQADica;
    private javax.swing.JButton btQAMenu;
    private javax.swing.JButton btQASeisA;
    private javax.swing.JButton btQASeisB;
    private javax.swing.JButton btQASeisC;
    private javax.swing.JButton btQASeisD;
    private javax.swing.JButton btQAVoltar;
    private javax.swing.JLabel jlQASeis;
    // End of variables declaration//GEN-END:variables
}
