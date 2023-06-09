
package jogos;

import Dados.PontosAluno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import telas.menuPrincipal;
/**
 *Classe responsável pelo jogo Qual é a cor 
 *@author Felipe
 * 
 */
public class QAUm extends javax.swing.JFrame {
    private QADois TelaQADois;
     int pontosQA = PontosAluno.getPontosQA();
     String tipo ="Qual é o animal";

    /**
     * Método construtor da classe QAUm
     */
    public QAUm() {
        initComponents();
        TelaQADois = new QADois();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQAUm = new javax.swing.JPanel();
        jlQAUm = new javax.swing.JLabel();
        btQAUmA = new javax.swing.JButton();
        btQAUmB = new javax.swing.JButton();
        btQAUmC = new javax.swing.JButton();
        btQAUmD = new javax.swing.JButton();
        btQAMenu = new javax.swing.JButton();
        btQAAvancar = new javax.swing.JButton();
        btQADica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQAUm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQAUm.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQAUm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QAUm.png"))); // NOI18N
        PainelQAUm.add(jlQAUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQAUmA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAUmA.setText("MOSQUITO");
        btQAUmA.setContentAreaFilled(false);
        btQAUmA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAUmAActionPerformed(evt);
            }
        });
        PainelQAUm.add(btQAUmA, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 135, 180, 90));

        btQAUmB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAUmB.setText("BEIJA-FLOR");
        btQAUmB.setContentAreaFilled(false);
        btQAUmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAUmBActionPerformed(evt);
            }
        });
        PainelQAUm.add(btQAUmB, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 255, 190, 90));

        btQAUmC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAUmC.setText("ABELHA");
        btQAUmC.setContentAreaFilled(false);
        btQAUmC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAUmCActionPerformed(evt);
            }
        });
        PainelQAUm.add(btQAUmC, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 255, 180, 90));

        btQAUmD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAUmD.setText("BESOURO");
        btQAUmD.setContentAreaFilled(false);
        btQAUmD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAUmDActionPerformed(evt);
            }
        });
        PainelQAUm.add(btQAUmD, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 135, 190, 90));

        btQAMenu.setText("MENU");
        btQAMenu.setContentAreaFilled(false);
        btQAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAMenuActionPerformed(evt);
            }
        });
        PainelQAUm.add(btQAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQAAvancar.setText("AVANÇAR");
        btQAAvancar.setContentAreaFilled(false);
        btQAAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAAvancarActionPerformed(evt);
            }
        });
        PainelQAUm.add(btQAAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 344, 90, 50));

        btQADica.setText("?");
        btQADica.setContentAreaFilled(false);
        btQADica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADicaActionPerformed(evt);
            }
        });
        PainelQAUm.add(btQADica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

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
        iniciaPontuacaoQA();
        TelaQADois.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQAUmCActionPerformed

    private void btQAUmAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAUmAActionPerformed
        JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosQA=pontosQA-5;  // TODO add your handling code here:
    }//GEN-LAST:event_btQAUmAActionPerformed

    private void btQAUmDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAUmDActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
      pontosQA=pontosQA-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btQAUmDActionPerformed

    private void btQAUmBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAUmBActionPerformed
        JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosQA=pontosQA-5;  // TODO add your handling code here:
    }//GEN-LAST:event_btQAUmBActionPerformed

    private void btQAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQAMenuActionPerformed

    private void btQAAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAAvancarActionPerformed
         TelaQADois.setVisible(true);
      dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btQAAvancarActionPerformed

    private void btQADicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADicaActionPerformed
        JOptionPane.showMessageDialog(null,"Esse animal vive em uma colmeia");
    }//GEN-LAST:event_btQADicaActionPerformed


   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQAUm;
    private javax.swing.JButton btQAAvancar;
    private javax.swing.JButton btQADica;
    private javax.swing.JButton btQAMenu;
    private javax.swing.JButton btQAUmA;
    private javax.swing.JButton btQAUmB;
    private javax.swing.JButton btQAUmC;
    private javax.swing.JButton btQAUmD;
    private javax.swing.JLabel jlQAUm;
    // End of variables declaration//GEN-END:variables
 /**
         * Método que inicia a contagem dos pontos do jogo Qual é o animal;
         * Insere os valores iniciais da pontuação no banco de dados
         */
 public void iniciaPontuacaoQA()
 {
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

}
 
}
