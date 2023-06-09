
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
public class QATres extends javax.swing.JFrame {
    private QAQuatro TelaQAQuatro;
int pontosQA = PontosAluno.getPontosQA();
      int idAluno=0;
    /**
     * Método construtor da classe QATres
     */
    public QATres() {
        initComponents();
        TelaQAQuatro = new QAQuatro();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQATres = new javax.swing.JPanel();
        jlQATres = new javax.swing.JLabel();
        btQATresA = new javax.swing.JButton();
        btQATresB = new javax.swing.JButton();
        btQATresC = new javax.swing.JButton();
        btQATresD = new javax.swing.JButton();
        btQAMenu = new javax.swing.JButton();
        btQAAvancar = new javax.swing.JButton();
        btQAVoltar = new javax.swing.JButton();
        btQADica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQATres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQATres.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQATres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QATres.png"))); // NOI18N
        PainelQATres.add(jlQATres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQATresA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQATresA.setText("ZEBRA");
        btQATresA.setContentAreaFilled(false);
        btQATresA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQATresAActionPerformed(evt);
            }
        });
        PainelQATres.add(btQATresA, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 142, 180, 80));

        btQATresB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQATresB.setText("GIRAFA");
        btQATresB.setContentAreaFilled(false);
        btQATresB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQATresBActionPerformed(evt);
            }
        });
        PainelQATres.add(btQATresB, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 142, 190, 80));

        btQATresC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQATresC.setText("TIGRE");
        btQATresC.setContentAreaFilled(false);
        btQATresC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQATresCActionPerformed(evt);
            }
        });
        PainelQATres.add(btQATresC, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 262, 190, 80));

        btQATresD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQATresD.setText("AVESTRUZ");
        btQATresD.setContentAreaFilled(false);
        btQATresD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQATresDActionPerformed(evt);
            }
        });
        PainelQATres.add(btQATresD, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 262, 190, 80));

        btQAMenu.setText("MENU");
        btQAMenu.setContentAreaFilled(false);
        btQAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAMenuActionPerformed(evt);
            }
        });
        PainelQATres.add(btQAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQAAvancar.setText("AVANÇAR");
        btQAAvancar.setContentAreaFilled(false);
        btQAAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAAvancarActionPerformed(evt);
            }
        });
        PainelQATres.add(btQAAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 345, 90, 50));

        btQAVoltar.setText("Voltar");
        btQAVoltar.setContentAreaFilled(false);
        btQAVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAVoltarActionPerformed(evt);
            }
        });
        PainelQATres.add(btQAVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 345, 80, 50));

        btQADica.setText("?");
        btQADica.setContentAreaFilled(false);
        btQADica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADicaActionPerformed(evt);
            }
        });
        PainelQATres.add(btQADica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQATres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQATres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQATresCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQATresCActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosQA=pontosQA-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQATresCActionPerformed

    private void btQATresBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQATresBActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );  
      pontosQA=pontosQA-5;   
    }//GEN-LAST:event_btQATresBActionPerformed

    private void btQATresAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQATresAActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q3="+pontosQA+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQAQuatro.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQATresAActionPerformed

    private void btQATresDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQATresDActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
      pontosQA=pontosQA-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQATresDActionPerformed

    private void btQAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQAMenuActionPerformed

    private void btQAAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAAvancarActionPerformed
         TelaQAQuatro.setVisible(true);
      dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btQAAvancarActionPerformed

    private void btQAVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAVoltarActionPerformed
        new QADois().show();
        dispose();
    }//GEN-LAST:event_btQAVoltarActionPerformed

    private void btQADicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADicaActionPerformed
        JOptionPane.showMessageDialog(null,"É parecido com o cavalo, tem crinas e uma cauda com tufos, mas ele possui listras no corpo inteiro!");
    }//GEN-LAST:event_btQADicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQATres;
    private javax.swing.JButton btQAAvancar;
    private javax.swing.JButton btQADica;
    private javax.swing.JButton btQAMenu;
    private javax.swing.JButton btQATresA;
    private javax.swing.JButton btQATresB;
    private javax.swing.JButton btQATresC;
    private javax.swing.JButton btQATresD;
    private javax.swing.JButton btQAVoltar;
    private javax.swing.JLabel jlQATres;
    // End of variables declaration//GEN-END:variables
}
