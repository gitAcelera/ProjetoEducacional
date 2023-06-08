
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
public class QETres extends javax.swing.JFrame {
    private QEQuatro TelaQEQuatro;
    int pontosQE = PontosAluno.getPontosQE();
      int idAluno=0;

    /**
     * Método construtor da classe QETres
     */
    public QETres() {
        initComponents();
        TelaQEQuatro = new QEQuatro();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQETres = new javax.swing.JPanel();
        jlQETres = new javax.swing.JLabel();
        btQETresA = new javax.swing.JButton();
        btQETresB = new javax.swing.JButton();
        btQETresC = new javax.swing.JButton();
        btQETresD = new javax.swing.JButton();
        btQEAvancar = new javax.swing.JButton();
        btQEMenu = new javax.swing.JButton();
        btQEVoltar = new javax.swing.JButton();
        btQEDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PainelQETres.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelQETres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQETres.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQETres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QETres.png"))); // NOI18N
        PainelQETres.add(jlQETres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQETresA.setBackground(new java.awt.Color(102, 51, 255));
        btQETresA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQETresA.setContentAreaFilled(false);
        btQETresA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQETresAActionPerformed(evt);
            }
        });
        PainelQETres.add(btQETresA, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 135, 180, 90));

        btQETresB.setBackground(new java.awt.Color(153, 0, 153));
        btQETresB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQETresB.setContentAreaFilled(false);
        btQETresB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQETresBActionPerformed(evt);
            }
        });
        PainelQETres.add(btQETresB, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 135, 190, 90));

        btQETresC.setBackground(new java.awt.Color(0, 204, 0));
        btQETresC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQETresC.setContentAreaFilled(false);
        btQETresC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQETresCActionPerformed(evt);
            }
        });
        PainelQETres.add(btQETresC, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 255, 180, 90));

        btQETresD.setBackground(new java.awt.Color(255, 102, 102));
        btQETresD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQETresD.setContentAreaFilled(false);
        btQETresD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQETresDActionPerformed(evt);
            }
        });
        PainelQETres.add(btQETresD, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 255, 190, 90));

        btQEAvancar.setText("AVANÇAR");
        btQEAvancar.setContentAreaFilled(false);
        btQEAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEAvancarActionPerformed(evt);
            }
        });
        PainelQETres.add(btQEAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 348, 80, 40));

        btQEMenu.setText("MENU");
        btQEMenu.setContentAreaFilled(false);
        btQEMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEMenuActionPerformed(evt);
            }
        });
        PainelQETres.add(btQEMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQEVoltar.setText("Voltar");
        btQEVoltar.setContentAreaFilled(false);
        btQEVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEVoltarActionPerformed(evt);
            }
        });
        PainelQETres.add(btQEVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 348, 80, 50));

        btQEDica.setText("?");
        btQEDica.setContentAreaFilled(false);
        btQEDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDicaActionPerformed(evt);
            }
        });
        PainelQETres.add(btQEDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 6, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQETres, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQETres, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQETresCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQETresCActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q3="+pontosQE+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
      
        TelaQEQuatro.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQETresCActionPerformed

    private void btQETresAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQETresAActionPerformed
  pontosQE=pontosQE-5;       // TODO add your handling code here:
    }//GEN-LAST:event_btQETresAActionPerformed

    private void btQETresBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQETresBActionPerformed
  pontosQE=pontosQE-5;       // TODO add your handling code here:
    }//GEN-LAST:event_btQETresBActionPerformed

    private void btQETresDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQETresDActionPerformed
  pontosQE=pontosQE-5;       // TODO add your handling code here:
    }//GEN-LAST:event_btQETresDActionPerformed

    private void btQEMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEMenuActionPerformed

    private void btQEAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEAvancarActionPerformed
     TelaQEQuatro.setVisible(true);
      dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_btQEAvancarActionPerformed

    private void btQEVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEVoltarActionPerformed
        new QEDois().show();
        dispose();
    }//GEN-LAST:event_btQEVoltarActionPerformed

    private void btQEDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Tem na bandeira do Brasil!");
    }//GEN-LAST:event_btQEDicaActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQETres;
    private javax.swing.JButton btQEAvancar;
    private javax.swing.JButton btQEDica;
    private javax.swing.JButton btQEMenu;
    private javax.swing.JButton btQETresA;
    private javax.swing.JButton btQETresB;
    private javax.swing.JButton btQETresC;
    private javax.swing.JButton btQETresD;
    private javax.swing.JButton btQEVoltar;
    private javax.swing.JLabel jlQETres;
    // End of variables declaration//GEN-END:variables
  

}
