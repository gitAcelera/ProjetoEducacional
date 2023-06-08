
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
 * Classe responsável pelo jogo Português
 */
public class PtQuatro extends javax.swing.JFrame {
    private PtCinco TelaPtCinco;
    int pontosPt = PontosAluno.getPontosPt();
      int idAluno=0;
    /**
     * Método construtor da classe PtQuatro
     */
    public PtQuatro() {
        initComponents();
        TelaPtCinco = new PtCinco();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        PainelPtQuatro = new javax.swing.JPanel();
        jlPtQuatro = new javax.swing.JLabel();
        btPtQuatroA = new javax.swing.JButton();
        btPtQuatroB = new javax.swing.JButton();
        btPtQuatroC = new javax.swing.JButton();
        btPtQuatroD = new javax.swing.JButton();
        btPtMenu = new javax.swing.JButton();
        btPtDica = new javax.swing.JButton();
        btPtAvancar = new javax.swing.JButton();
        btPtVoltar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelPtQuatro.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelPtQuatro.setRequestFocusEnabled(false);
        PainelPtQuatro.setVerifyInputWhenFocusTarget(false);
        PainelPtQuatro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPtQuatro.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtQuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PtQuatro.png"))); // NOI18N
        PainelPtQuatro.add(jlPtQuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btPtQuatroA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtQuatroA.setText("GRANDE ");
        btPtQuatroA.setContentAreaFilled(false);
        btPtQuatroA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtQuatroAActionPerformed(evt);
            }
        });
        PainelPtQuatro.add(btPtQuatroA, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 140, 190, 80));

        btPtQuatroB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtQuatroB.setText("BELO");
        btPtQuatroB.setContentAreaFilled(false);
        btPtQuatroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtQuatroBActionPerformed(evt);
            }
        });
        PainelPtQuatro.add(btPtQuatroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 140, 190, 80));

        btPtQuatroC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtQuatroC.setText("PEQUENINO");
        btPtQuatroC.setContentAreaFilled(false);
        btPtQuatroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtQuatroCActionPerformed(evt);
            }
        });
        PainelPtQuatro.add(btPtQuatroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 260, 180, 80));

        btPtQuatroD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtQuatroD.setText("NORMAL");
        btPtQuatroD.setContentAreaFilled(false);
        btPtQuatroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtQuatroDActionPerformed(evt);
            }
        });
        PainelPtQuatro.add(btPtQuatroD, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 260, 180, 80));

        btPtMenu.setText("MENU");
        btPtMenu.setContentAreaFilled(false);
        btPtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtMenuActionPerformed(evt);
            }
        });
        PainelPtQuatro.add(btPtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btPtDica.setText("?");
        btPtDica.setContentAreaFilled(false);
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });
        PainelPtQuatro.add(btPtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        btPtAvancar.setText("Avançar");
        btPtAvancar.setContentAreaFilled(false);
        btPtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtAvancarActionPerformed(evt);
            }
        });
        PainelPtQuatro.add(btPtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 344, 90, 50));

        btPtVoltar.setText("Voltar");
        btPtVoltar.setContentAreaFilled(false);
        btPtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtVoltarActionPerformed(evt);
            }
        });
        PainelPtQuatro.add(btPtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 344, 80, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtQuatroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtQuatroCActionPerformed
pontosPt=pontosPt-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btPtQuatroCActionPerformed

    private void btPtQuatroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtQuatroBActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q4="+pontosPt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        
        TelaPtCinco.setVisible(true);
      dispose();
    }//GEN-LAST:event_btPtQuatroBActionPerformed

    private void btPtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btPtMenuActionPerformed

    private void btPtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Algo idêntico ou semelhante, exemplo: o semelhante de ruim é mal");
    }//GEN-LAST:event_btPtDicaActionPerformed

    private void btPtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtAvancarActionPerformed
          pontosPt=0;
        System.out.println(""+pontosPt);
        TelaPtCinco.setVisible(true);
        dispose();
    }//GEN-LAST:event_btPtAvancarActionPerformed

    private void btPtQuatroAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtQuatroAActionPerformed
pontosPt=pontosPt-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btPtQuatroAActionPerformed

    private void btPtQuatroDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtQuatroDActionPerformed
pontosPt=pontosPt-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btPtQuatroDActionPerformed

    private void btPtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtVoltarActionPerformed
        new PtTres ().show();
        dispose();
    }//GEN-LAST:event_btPtVoltarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtQuatro;
    private javax.swing.JButton btPtAvancar;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btPtMenu;
    private javax.swing.JButton btPtQuatroA;
    private javax.swing.JButton btPtQuatroB;
    private javax.swing.JButton btPtQuatroC;
    private javax.swing.JButton btPtQuatroD;
    private javax.swing.JButton btPtVoltar;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlPtQuatro;
    // End of variables declaration//GEN-END:variables
}
