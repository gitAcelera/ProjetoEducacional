
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
 * Classe responsável pelo jogo Qual é a cor 
 * @author Felipe
 *  
 */
public class QECinco extends javax.swing.JFrame {
    private QESeis TelaQESeis;
     int pontosQE = PontosAluno.getPontosQE();
      int idAluno=0;
     

    /**
     * Método construtor da classe  QECinco
     */
    public QECinco() {
        initComponents();
        TelaQESeis = new QESeis();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQECinco = new javax.swing.JPanel();
        jlQECinco = new javax.swing.JLabel();
        btQECincoA = new javax.swing.JButton();
        btQECincoB = new javax.swing.JButton();
        btQECincoC = new javax.swing.JButton();
        btQECincoD = new javax.swing.JButton();
        btQEAvancar = new javax.swing.JButton();
        btQEMenu = new javax.swing.JButton();
        btQEVoltar = new javax.swing.JButton();
        btQEDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQECinco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQECinco.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQECinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QECinco.png"))); // NOI18N
        PainelQECinco.add(jlQECinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQECincoA.setBackground(new java.awt.Color(255, 51, 51));
        btQECincoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQECincoA.setContentAreaFilled(false);
        btQECincoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQECincoAActionPerformed(evt);
            }
        });
        PainelQECinco.add(btQECincoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 143, 190, 80));

        btQECincoB.setBackground(new java.awt.Color(255, 204, 102));
        btQECincoB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQECincoB.setContentAreaFilled(false);
        btQECincoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQECincoBActionPerformed(evt);
            }
        });
        PainelQECinco.add(btQECincoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 143, 180, 80));

        btQECincoC.setBackground(new java.awt.Color(153, 51, 255));
        btQECincoC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQECincoC.setContentAreaFilled(false);
        btQECincoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQECincoCActionPerformed(evt);
            }
        });
        PainelQECinco.add(btQECincoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 263, 190, 80));

        btQECincoD.setBackground(new java.awt.Color(255, 0, 153));
        btQECincoD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQECincoD.setContentAreaFilled(false);
        btQECincoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQECincoDActionPerformed(evt);
            }
        });
        PainelQECinco.add(btQECincoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 263, 180, 80));

        btQEAvancar.setText("AVANÇAR");
        btQEAvancar.setContentAreaFilled(false);
        btQEAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEAvancarActionPerformed(evt);
            }
        });
        PainelQECinco.add(btQEAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 348, 90, 40));

        btQEMenu.setText("MENU");
        btQEMenu.setContentAreaFilled(false);
        btQEMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEMenuActionPerformed(evt);
            }
        });
        PainelQECinco.add(btQEMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQEVoltar.setText("Voltar");
        btQEVoltar.setContentAreaFilled(false);
        btQEVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEVoltarActionPerformed(evt);
            }
        });
        PainelQECinco.add(btQEVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 348, 80, 40));

        btQEDica.setText("?");
        btQEDica.setContentAreaFilled(false);
        btQEDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDicaActionPerformed(evt);
            }
        });
        PainelQECinco.add(btQEDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQECinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQECinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQECincoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQECincoAActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q5="+pontosQE+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQESeis.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQECincoAActionPerformed

    private void btQECincoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQECincoBActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosQE=pontosQE-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btQECincoBActionPerformed

    private void btQECincoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQECincoDActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosQE=pontosQE-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btQECincoDActionPerformed

    private void btQECincoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQECincoCActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
      pontosQE=pontosQE-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btQECincoCActionPerformed

    private void btQEMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEMenuActionPerformed

    private void btQEAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEAvancarActionPerformed
     TelaQESeis.setVisible(true);
      dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btQEAvancarActionPerformed

    private void btQEVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEVoltarActionPerformed
        new QEQuatro().show();
        dispose();
    }//GEN-LAST:event_btQEVoltarActionPerformed

    private void btQEDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDicaActionPerformed
        JOptionPane.showMessageDialog(null,"A melancia por dentro tem a mesma cor!");
    }//GEN-LAST:event_btQEDicaActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQECinco;
    private javax.swing.JButton btQEAvancar;
    private javax.swing.JButton btQECincoA;
    private javax.swing.JButton btQECincoB;
    private javax.swing.JButton btQECincoC;
    private javax.swing.JButton btQECincoD;
    private javax.swing.JButton btQEDica;
    private javax.swing.JButton btQEMenu;
    private javax.swing.JButton btQEVoltar;
    private javax.swing.JLabel jlQECinco;
    // End of variables declaration//GEN-END:variables
}
