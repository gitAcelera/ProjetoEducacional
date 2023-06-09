
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
public class QENove extends javax.swing.JFrame {
    private QEDez TelaQEDez;
    int pontosQE = PontosAluno.getPontosQE();
      int idAluno=0;

    /**
     * Método construtor da classe QENove
     */
    public QENove() {
        initComponents();
        TelaQEDez = new QEDez();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQENove = new javax.swing.JPanel();
        jlQENove = new javax.swing.JLabel();
        btQENoveA = new javax.swing.JButton();
        btQENoveB = new javax.swing.JButton();
        btQENoveC = new javax.swing.JButton();
        btQENoveD = new javax.swing.JButton();
        btQEAvancar = new javax.swing.JButton();
        btQEMenu = new javax.swing.JButton();
        btQEVoltar = new javax.swing.JButton();
        btQEDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQENove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQENove.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQENove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QENove.png"))); // NOI18N
        PainelQENove.add(jlQENove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQENoveA.setBackground(new java.awt.Color(255, 51, 153));
        btQENoveA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQENoveA.setContentAreaFilled(false);
        btQENoveA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQENoveAActionPerformed(evt);
            }
        });
        PainelQENove.add(btQENoveA, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 138, 180, 80));

        btQENoveB.setBackground(new java.awt.Color(255, 255, 51));
        btQENoveB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQENoveB.setContentAreaFilled(false);
        btQENoveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQENoveBActionPerformed(evt);
            }
        });
        PainelQENove.add(btQENoveB, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 138, 180, 90));

        btQENoveC.setBackground(new java.awt.Color(102, 255, 102));
        btQENoveC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQENoveC.setContentAreaFilled(false);
        btQENoveC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQENoveCActionPerformed(evt);
            }
        });
        PainelQENove.add(btQENoveC, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 258, 190, 80));

        btQENoveD.setBackground(new java.awt.Color(0, 102, 204));
        btQENoveD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQENoveD.setContentAreaFilled(false);
        btQENoveD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQENoveDActionPerformed(evt);
            }
        });
        PainelQENove.add(btQENoveD, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 258, 180, 80));

        btQEAvancar.setText("AVANÇAR");
        btQEAvancar.setContentAreaFilled(false);
        btQEAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEAvancarActionPerformed(evt);
            }
        });
        PainelQENove.add(btQEAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 344, -1, 50));

        btQEMenu.setText("MENU");
        btQEMenu.setContentAreaFilled(false);
        btQEMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEMenuActionPerformed(evt);
            }
        });
        PainelQENove.add(btQEMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQEVoltar.setText("Voltar");
        btQEVoltar.setContentAreaFilled(false);
        btQEVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEVoltarActionPerformed(evt);
            }
        });
        PainelQENove.add(btQEVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btQEDica.setText("?");
        btQEDica.setContentAreaFilled(false);
        btQEDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDicaActionPerformed(evt);
            }
        });
        PainelQENove.add(btQEDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQENove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQENove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQENoveAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQENoveAActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q9="+pontosQE+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQEDez.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQENoveAActionPerformed

    private void btQENoveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQENoveBActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosQE=pontosQE-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQENoveBActionPerformed

    private void btQENoveDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQENoveDActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
      pontosQE=pontosQE-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btQENoveDActionPerformed

    private void btQENoveCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQENoveCActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosQE=pontosQE-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQENoveCActionPerformed

    private void btQEAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEAvancarActionPerformed
       TelaQEDez.setVisible(true);
      dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btQEAvancarActionPerformed

    private void btQEMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEMenuActionPerformed

    private void btQEVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEVoltarActionPerformed
new QEOito().show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btQEVoltarActionPerformed

    private void btQEDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Conhecida como a cor da feminilidade"
                + "");
    }//GEN-LAST:event_btQEDicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQENove;
    private javax.swing.JButton btQEAvancar;
    private javax.swing.JButton btQEDica;
    private javax.swing.JButton btQEMenu;
    private javax.swing.JButton btQENoveA;
    private javax.swing.JButton btQENoveB;
    private javax.swing.JButton btQENoveC;
    private javax.swing.JButton btQENoveD;
    private javax.swing.JButton btQEVoltar;
    private javax.swing.JLabel jlQENove;
    // End of variables declaration//GEN-END:variables
}
