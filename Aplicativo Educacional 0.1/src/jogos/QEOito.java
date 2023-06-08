
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
 * @author Felipe
 *  Classe responsável pelo jogo Qual é a cor 
 */
public class QEOito extends javax.swing.JFrame {
    private QENove TelaQENove;
    int pontosQE = PontosAluno.getPontosQE();
      int idAluno=0;

    /**
     * Creates new form QEOito
     */
    public QEOito() {
        initComponents();
        TelaQENove = new QENove();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQEOito = new javax.swing.JPanel();
        jlQEOito = new javax.swing.JLabel();
        btQEOitoA = new javax.swing.JButton();
        btQEOitoB = new javax.swing.JButton();
        btQEOitoC = new javax.swing.JButton();
        btQEOitoD = new javax.swing.JButton();
        btQEAvancar = new javax.swing.JButton();
        btQEMenu = new javax.swing.JButton();
        btQEVoltar = new javax.swing.JButton();
        btQEDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setFocusableWindowState(false);
        setResizable(false);

        PainelQEOito.setMaximumSize(new java.awt.Dimension(700, 400));
        PainelQEOito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQEOito.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQEOito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QEOito.png"))); // NOI18N
        PainelQEOito.add(jlQEOito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btQEOitoA.setBackground(new java.awt.Color(204, 204, 255));
        btQEOitoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEOitoA.setContentAreaFilled(false);
        btQEOitoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEOitoAActionPerformed(evt);
            }
        });
        PainelQEOito.add(btQEOitoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 143, 190, 80));

        btQEOitoB.setBackground(new java.awt.Color(0, 0, 204));
        btQEOitoB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEOitoB.setContentAreaFilled(false);
        btQEOitoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEOitoBActionPerformed(evt);
            }
        });
        PainelQEOito.add(btQEOitoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 143, 180, 80));

        btQEOitoC.setBackground(new java.awt.Color(153, 153, 255));
        btQEOitoC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEOitoC.setContentAreaFilled(false);
        btQEOitoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEOitoCActionPerformed(evt);
            }
        });
        PainelQEOito.add(btQEOitoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 263, 190, 80));

        btQEOitoD.setBackground(new java.awt.Color(0, 0, 51));
        btQEOitoD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEOitoD.setContentAreaFilled(false);
        btQEOitoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEOitoDActionPerformed(evt);
            }
        });
        PainelQEOito.add(btQEOitoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 263, 180, 80));

        btQEAvancar.setText("AVANÇAR");
        btQEAvancar.setContentAreaFilled(false);
        btQEAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEAvancarActionPerformed(evt);
            }
        });
        PainelQEOito.add(btQEAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 344, -1, 50));

        btQEMenu.setText("MENU");
        btQEMenu.setContentAreaFilled(false);
        btQEMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEMenuActionPerformed(evt);
            }
        });
        PainelQEOito.add(btQEMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQEVoltar.setText("Voltar");
        btQEVoltar.setContentAreaFilled(false);
        btQEVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEVoltarActionPerformed(evt);
            }
        });
        PainelQEOito.add(btQEVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btQEDica.setText("?");
        btQEDica.setContentAreaFilled(false);
        btQEDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDicaActionPerformed(evt);
            }
        });
        PainelQEOito.add(btQEDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEOito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEOito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQEOitoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEOitoDActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q8="+pontosQE+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQENove.setVisible(true);
     dispose();
    }//GEN-LAST:event_btQEOitoDActionPerformed

    private void btQEOitoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEOitoBActionPerformed
      pontosQE=pontosQE-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btQEOitoBActionPerformed

    private void btQEOitoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEOitoCActionPerformed
     pontosQE=pontosQE-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQEOitoCActionPerformed

    private void btQEOitoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEOitoAActionPerformed
    pontosQE=pontosQE-5;       // TODO add your handling code here:
    }//GEN-LAST:event_btQEOitoAActionPerformed

    private void btQEAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEAvancarActionPerformed
       TelaQENove.setVisible(true);
     dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_btQEAvancarActionPerformed

    private void btQEMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEMenuActionPerformed

    private void btQEVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEVoltarActionPerformed
new QESete().show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btQEVoltarActionPerformed

    private void btQEDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDicaActionPerformed
        JOptionPane.showMessageDialog(null,"É uma cor escura...");
    }//GEN-LAST:event_btQEDicaActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQEOito;
    private javax.swing.JButton btQEAvancar;
    private javax.swing.JButton btQEDica;
    private javax.swing.JButton btQEMenu;
    private javax.swing.JButton btQEOitoA;
    private javax.swing.JButton btQEOitoB;
    private javax.swing.JButton btQEOitoC;
    private javax.swing.JButton btQEOitoD;
    private javax.swing.JButton btQEVoltar;
    private javax.swing.JLabel jlQEOito;
    // End of variables declaration//GEN-END:variables
}
