
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
public class QEQuatro extends javax.swing.JFrame {
    private QECinco TelaQECinco;
     int pontosQE = PontosAluno.getPontosQE();
      int idAluno=0;

    /**
     * Método construtor da classe QEQuatro
     */
    public QEQuatro() {
        initComponents();
        TelaQECinco = new QECinco();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQEQuatro = new javax.swing.JPanel();
        jlQEQuatro = new javax.swing.JLabel();
        btQEQuatroA = new javax.swing.JButton();
        btQEQuatroB = new javax.swing.JButton();
        btQEQuatroC = new javax.swing.JButton();
        btQEQuatroD = new javax.swing.JButton();
        btQEAvancar = new javax.swing.JButton();
        btQEMenu = new javax.swing.JButton();
        btQEVoltar = new javax.swing.JButton();
        btQEDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQEQuatro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQEQuatro.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQEQuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QEQuatro.png"))); // NOI18N
        PainelQEQuatro.add(jlQEQuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQEQuatroA.setBackground(new java.awt.Color(0, 0, 0));
        btQEQuatroA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEQuatroA.setContentAreaFilled(false);
        btQEQuatroA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEQuatroAActionPerformed(evt);
            }
        });
        PainelQEQuatro.add(btQEQuatroA, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 138, 180, 80));

        btQEQuatroB.setBackground(new java.awt.Color(102, 153, 0));
        btQEQuatroB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEQuatroB.setContentAreaFilled(false);
        btQEQuatroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEQuatroBActionPerformed(evt);
            }
        });
        PainelQEQuatro.add(btQEQuatroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 138, 180, 80));

        btQEQuatroC.setBackground(new java.awt.Color(204, 102, 0));
        btQEQuatroC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEQuatroC.setContentAreaFilled(false);
        btQEQuatroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEQuatroCActionPerformed(evt);
            }
        });
        PainelQEQuatro.add(btQEQuatroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 258, 190, 80));

        btQEQuatroD.setBackground(new java.awt.Color(0, 102, 102));
        btQEQuatroD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEQuatroD.setContentAreaFilled(false);
        btQEQuatroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEQuatroDActionPerformed(evt);
            }
        });
        PainelQEQuatro.add(btQEQuatroD, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 258, 180, 80));

        btQEAvancar.setText("AVANÇAR");
        btQEAvancar.setContentAreaFilled(false);
        btQEAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEAvancarActionPerformed(evt);
            }
        });
        PainelQEQuatro.add(btQEAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 344, 90, 50));

        btQEMenu.setText("MENU");
        btQEMenu.setContentAreaFilled(false);
        btQEMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEMenuActionPerformed(evt);
            }
        });
        PainelQEQuatro.add(btQEMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQEVoltar.setText("Voltar");
        btQEVoltar.setContentAreaFilled(false);
        btQEVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEVoltarActionPerformed(evt);
            }
        });
        PainelQEQuatro.add(btQEVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 344, 80, 50));

        btQEDica.setText("?");
        btQEDica.setContentAreaFilled(false);
        btQEDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDicaActionPerformed(evt);
            }
        });
        PainelQEQuatro.add(btQEDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQEQuatroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEQuatroCActionPerformed
      
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
            stm.executeUpdate("UPDATE jogos set q4="+pontosQE+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            }
        TelaQECinco.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQEQuatroCActionPerformed

    private void btQEQuatroDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEQuatroDActionPerformed
   JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
   pontosQE=pontosQE-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQEQuatroDActionPerformed

    private void btQEQuatroAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEQuatroAActionPerformed
   JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
   pontosQE=pontosQE-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQEQuatroAActionPerformed

    private void btQEQuatroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEQuatroBActionPerformed
    JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
    pontosQE=pontosQE-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btQEQuatroBActionPerformed

    private void btQEMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEMenuActionPerformed

    private void btQEAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEAvancarActionPerformed
     TelaQECinco.setVisible(true);
      dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_btQEAvancarActionPerformed

    private void btQEVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEVoltarActionPerformed
        new QETres().show();
        dispose();
    }//GEN-LAST:event_btQEVoltarActionPerformed

    private void btQEDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Geralmente em determinados dias do ano, o pôr do sol é da mesma cor!");
    }//GEN-LAST:event_btQEDicaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQEQuatro;
    private javax.swing.JButton btQEAvancar;
    private javax.swing.JButton btQEDica;
    private javax.swing.JButton btQEMenu;
    private javax.swing.JButton btQEQuatroA;
    private javax.swing.JButton btQEQuatroB;
    private javax.swing.JButton btQEQuatroC;
    private javax.swing.JButton btQEQuatroD;
    private javax.swing.JButton btQEVoltar;
    private javax.swing.JLabel jlQEQuatro;
    // End of variables declaration//GEN-END:variables
}
