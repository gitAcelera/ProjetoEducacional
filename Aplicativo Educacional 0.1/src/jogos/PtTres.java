
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
public class PtTres extends javax.swing.JFrame {
private PtQuatro TelaPtQuatro;
      int pontosPt = PontosAluno.getPontosPt();
      int idAluno=0;
    /**
     * Método construtor da classe PtTres
     */
    public PtTres() {
        initComponents();
        TelaPtQuatro = new PtQuatro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPtTres = new javax.swing.JPanel();
        jlPtTres = new javax.swing.JLabel();
        btPtTresA = new javax.swing.JButton();
        btPtTresB = new javax.swing.JButton();
        btPtTresC = new javax.swing.JButton();
        btPtTresD = new javax.swing.JButton();
        btPtMenu = new javax.swing.JButton();
        btPtDica = new javax.swing.JButton();
        btPtAvancar = new javax.swing.JButton();
        btPtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelPtTres.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelPtTres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPtTres.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PtTres.png"))); // NOI18N
        PainelPtTres.add(jlPtTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -5, 700, 410));

        btPtTresA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtTresA.setText("GRANDE");
        btPtTresA.setContentAreaFilled(false);
        btPtTresA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtTresAActionPerformed(evt);
            }
        });
        PainelPtTres.add(btPtTresA, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 143, 190, 80));

        btPtTresB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtTresB.setText("FORTE");
        btPtTresB.setContentAreaFilled(false);
        btPtTresB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtTresBActionPerformed(evt);
            }
        });
        PainelPtTres.add(btPtTresB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 143, 180, 80));

        btPtTresC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtTresC.setText("BAIXO");
        btPtTresC.setContentAreaFilled(false);
        btPtTresC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtTresCActionPerformed(evt);
            }
        });
        PainelPtTres.add(btPtTresC, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 253, 180, 90));

        btPtTresD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtTresD.setText("ELEVADO");
        btPtTresD.setContentAreaFilled(false);
        btPtTresD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtTresDActionPerformed(evt);
            }
        });
        PainelPtTres.add(btPtTresD, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 253, 180, 90));

        btPtMenu.setText("MENU");
        btPtMenu.setContentAreaFilled(false);
        btPtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtMenuActionPerformed(evt);
            }
        });
        PainelPtTres.add(btPtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btPtDica.setText("?");
        btPtDica.setContentAreaFilled(false);
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });
        PainelPtTres.add(btPtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 6, 40, 40));

        btPtAvancar.setText("Avançar");
        btPtAvancar.setContentAreaFilled(false);
        btPtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtAvancarActionPerformed(evt);
            }
        });
        PainelPtTres.add(btPtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 344, 80, 50));

        btPtVoltar.setText("Voltar");
        btPtVoltar.setContentAreaFilled(false);
        btPtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtVoltarActionPerformed(evt);
            }
        });
        PainelPtTres.add(btPtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtTresCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtTresCActionPerformed
        pontosPt=pontosPt+20;
        System.out.println(""+pontosPt);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
             ResultSet res = stm.executeQuery("SELECT * from jogos");
            while(res.next())
            {
                idAluno= res.getInt("idAluno");
            }
           stm.executeUpdate("UPDATE jogos set q3="+pontosPt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaPtQuatro.setVisible(true);
      dispose();
    }//GEN-LAST:event_btPtTresCActionPerformed

    private void btPtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btPtMenuActionPerformed

    private void btPtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Contrário é aquilo que é oposto, exemplo: o contrario de LEGAL é CHATO");
    }//GEN-LAST:event_btPtDicaActionPerformed

    private void btPtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtAvancarActionPerformed
          pontosPt=0;
        TelaPtQuatro.setVisible(true);
        dispose();
        System.out.println(""+pontosPt);
    }//GEN-LAST:event_btPtAvancarActionPerformed

    private void btPtTresAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtTresAActionPerformed
        pontosPt=pontosPt-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btPtTresAActionPerformed

    private void btPtTresDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtTresDActionPerformed
 pontosPt=pontosPt-5;           // TODO add your handling code here:
    }//GEN-LAST:event_btPtTresDActionPerformed

    private void btPtTresBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtTresBActionPerformed
 pontosPt=pontosPt-5;           // TODO add your handling code here:
    }//GEN-LAST:event_btPtTresBActionPerformed

    private void btPtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtVoltarActionPerformed
        new PtDois().show();
        dispose();
    }//GEN-LAST:event_btPtVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtTres;
    private javax.swing.JButton btPtAvancar;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btPtMenu;
    private javax.swing.JButton btPtTresA;
    private javax.swing.JButton btPtTresB;
    private javax.swing.JButton btPtTresC;
    private javax.swing.JButton btPtTresD;
    private javax.swing.JButton btPtVoltar;
    private javax.swing.JLabel jlPtTres;
    // End of variables declaration//GEN-END:variables
}
