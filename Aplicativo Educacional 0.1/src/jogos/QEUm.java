
package jogos;

import Dados.PontosAluno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import telas.menuPrincipal;
/**
 * Classe responsável pelo jogo Qual é a cor 
 * @author Felipe
 *  
 */
public class QEUm extends javax.swing.JFrame {
    private QEDois TelaQEDois;
    int pontosQE = PontosAluno.getPontosQE();
    String tipo="Qual é a cor";

    /**
     *Método construtor da classe QEUm
     */
    public QEUm() {
        initComponents();
        TelaQEDois = new QEDois();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQEUm = new javax.swing.JPanel();
        jlQEUm = new javax.swing.JLabel();
        btQEUmA = new javax.swing.JButton();
        btQEUmB = new javax.swing.JButton();
        btQEUmC = new javax.swing.JButton();
        btQEUmD = new javax.swing.JButton();
        btQEMenu = new javax.swing.JButton();
        btQEAvancar = new javax.swing.JButton();
        btQEDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PainelQEUm.setMaximumSize(new java.awt.Dimension(700, 400));
        PainelQEUm.setMinimumSize(new java.awt.Dimension(700, 400));
        PainelQEUm.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelQEUm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQEUm.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQEUm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QEUm.png"))); // NOI18N
        PainelQEUm.add(jlQEUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQEUmA.setBackground(new java.awt.Color(255, 255, 0));
        btQEUmA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEUmA.setContentAreaFilled(false);
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
        PainelQEUm.add(btQEUmA, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 136, 180, 90));

        btQEUmB.setBackground(new java.awt.Color(0, 204, 204));
        btQEUmB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEUmB.setForeground(new java.awt.Color(255, 255, 255));
        btQEUmB.setContentAreaFilled(false);
        btQEUmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEUmBActionPerformed(evt);
            }
        });
        PainelQEUm.add(btQEUmB, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 136, 180, 90));

        btQEUmC.setBackground(new java.awt.Color(0, 204, 0));
        btQEUmC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEUmC.setContentAreaFilled(false);
        btQEUmC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEUmCActionPerformed(evt);
            }
        });
        PainelQEUm.add(btQEUmC, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 257, 180, 90));

        btQEUmD.setBackground(new java.awt.Color(204, 204, 255));
        btQEUmD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEUmD.setContentAreaFilled(false);
        btQEUmD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEUmDActionPerformed(evt);
            }
        });
        PainelQEUm.add(btQEUmD, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 257, 180, 90));

        btQEMenu.setText("MENU");
        btQEMenu.setContentAreaFilled(false);
        btQEMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEMenuActionPerformed(evt);
            }
        });
        PainelQEUm.add(btQEMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQEAvancar.setText("AVANÇAR");
        btQEAvancar.setContentAreaFilled(false);
        btQEAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEAvancarActionPerformed(evt);
            }
        });
        PainelQEUm.add(btQEAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 344, -1, 50));

        btQEDica.setText("?");
        btQEDica.setContentAreaFilled(false);
        btQEDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDicaActionPerformed(evt);
            }
        });
        PainelQEUm.add(btQEDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

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
       iniciaPontuacaoQE();
        TelaQEDois.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQEUmBActionPerformed

    private void btQEUmCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEUmCActionPerformed
    pontosQE=pontosQE-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQEUmCActionPerformed

    private void btQEMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEMenuActionPerformed

    private void btQEAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEAvancarActionPerformed
     TelaQEDois.setVisible(true);
      dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_btQEAvancarActionPerformed

    private void btQEDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Essa cor é como a cor da água da piscina em um dia ensolarado!");
    }//GEN-LAST:event_btQEDicaActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQEUm;
    private javax.swing.JButton btQEAvancar;
    private javax.swing.JButton btQEDica;
    private javax.swing.JButton btQEMenu;
    private javax.swing.JButton btQEUmA;
    private javax.swing.JButton btQEUmB;
    private javax.swing.JButton btQEUmC;
    private javax.swing.JButton btQEUmD;
    private javax.swing.JLabel jlQEUm;
    // End of variables declaration//GEN-END:variables
 
    /**
         * Método que inicia a contagem dos pontos do jogo Qual é a cor;
         * Insere os valores iniciais da pontuação no banco de dados
         */
 public void iniciaPontuacaoQE()
 {
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

}
 
}
