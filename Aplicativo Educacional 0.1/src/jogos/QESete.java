
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
public class QESete extends javax.swing.JFrame {
    private QEOito TelaQEOito;
    int pontosQE = PontosAluno.getPontosQE();
      int idAluno=0;

    /**
     * Método construtor da classe QESete
     */
    public QESete() {
        initComponents();
        TelaQEOito = new QEOito();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQESete = new javax.swing.JPanel();
        jlQESete = new javax.swing.JLabel();
        btQESeteA = new javax.swing.JButton();
        btQESeteB = new javax.swing.JButton();
        btQESeteC = new javax.swing.JButton();
        btQESeteD = new javax.swing.JButton();
        btQEAvancar = new javax.swing.JButton();
        btQEMenu = new javax.swing.JButton();
        btQEVoltar = new javax.swing.JButton();
        btQEDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQESete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQESete.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQESete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QESete.png"))); // NOI18N
        PainelQESete.add(jlQESete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQESeteA.setBackground(new java.awt.Color(255, 153, 153));
        btQESeteA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQESeteA.setContentAreaFilled(false);
        btQESeteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeteAActionPerformed(evt);
            }
        });
        PainelQESete.add(btQESeteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 134, 190, 90));

        btQESeteB.setBackground(new java.awt.Color(153, 255, 153));
        btQESeteB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQESeteB.setContentAreaFilled(false);
        btQESeteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeteBActionPerformed(evt);
            }
        });
        PainelQESete.add(btQESeteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 134, 180, 90));

        btQESeteC.setBackground(new java.awt.Color(153, 153, 255));
        btQESeteC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQESeteC.setContentAreaFilled(false);
        btQESeteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeteCActionPerformed(evt);
            }
        });
        PainelQESete.add(btQESeteC, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 254, 180, 90));

        btQESeteD.setBackground(new java.awt.Color(102, 51, 0));
        btQESeteD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQESeteD.setContentAreaFilled(false);
        btQESeteD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeteDActionPerformed(evt);
            }
        });
        PainelQESete.add(btQESeteD, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 264, 180, 80));

        btQEAvancar.setText("AVANÇAR");
        btQEAvancar.setContentAreaFilled(false);
        btQEAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEAvancarActionPerformed(evt);
            }
        });
        PainelQESete.add(btQEAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 349, -1, 40));

        btQEMenu.setText("MENU");
        btQEMenu.setContentAreaFilled(false);
        btQEMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEMenuActionPerformed(evt);
            }
        });
        PainelQESete.add(btQEMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, 80, 40));

        btQEVoltar.setText("Voltar");
        btQEVoltar.setContentAreaFilled(false);
        btQEVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEVoltarActionPerformed(evt);
            }
        });
        PainelQESete.add(btQEVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 349, 80, 40));

        btQEDica.setText("?");
        btQEDica.setContentAreaFilled(false);
        btQEDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDicaActionPerformed(evt);
            }
        });
        PainelQESete.add(btQEDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQESete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQESete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQESeteDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeteDActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q7="+pontosQE+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQEOito.setVisible(true);
     dispose();
    }//GEN-LAST:event_btQESeteDActionPerformed

    private void btQESeteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeteAActionPerformed
  pontosQE=pontosQE-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btQESeteAActionPerformed

    private void btQESeteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeteBActionPerformed
     pontosQE=pontosQE-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btQESeteBActionPerformed

    private void btQESeteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeteCActionPerformed
      pontosQE=pontosQE-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btQESeteCActionPerformed

    private void btQEAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEAvancarActionPerformed
         TelaQEOito.setVisible(true);
     dispose();;    // TODO add your handling code here:
    }//GEN-LAST:event_btQEAvancarActionPerformed

    private void btQEMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEMenuActionPerformed

    private void btQEVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEVoltarActionPerformed
new QESeis().show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btQEVoltarActionPerformed

    private void btQEDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDicaActionPerformed
        JOptionPane.showMessageDialog(null,"O café tem a mesma cor!");
    }//GEN-LAST:event_btQEDicaActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQESete;
    private javax.swing.JButton btQEAvancar;
    private javax.swing.JButton btQEDica;
    private javax.swing.JButton btQEMenu;
    private javax.swing.JButton btQESeteA;
    private javax.swing.JButton btQESeteB;
    private javax.swing.JButton btQESeteC;
    private javax.swing.JButton btQESeteD;
    private javax.swing.JButton btQEVoltar;
    private javax.swing.JLabel jlQESete;
    // End of variables declaration//GEN-END:variables

}
