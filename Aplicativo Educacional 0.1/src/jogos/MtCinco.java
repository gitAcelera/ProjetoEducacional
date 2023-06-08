
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
 *Classe responsável pelo jogo Matemática
 * @author Pedro
 *
 */
public class MtCinco extends javax.swing.JFrame {
    MtSeis TelaMtSeis;
    int pontosMt = PontosAluno.getPontosMt();
     int idAluno=0;
    /**
     * Método construtor da classe  MtCinco
     */
    public MtCinco() {
        initComponents();
        TelaMtSeis = new MtSeis();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtCinco = new javax.swing.JPanel();
        jlMtCinco = new javax.swing.JLabel();
        btMtCincoA = new javax.swing.JButton();
        btMtCincoB = new javax.swing.JButton();
        btMtCincoC = new javax.swing.JButton();
        btMtCincoD = new javax.swing.JButton();
        btMtMenu = new javax.swing.JButton();
        btMtAvancar = new javax.swing.JButton();
        btMtVoltar = new javax.swing.JButton();
        btMtDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 420));

        PainelMtCinco.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelMtCinco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMtCinco.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MtCinco.png"))); // NOI18N
        PainelMtCinco.add(jlMtCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btMtCincoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtCincoA.setText("21");
        btMtCincoA.setContentAreaFilled(false);
        btMtCincoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtCincoAActionPerformed(evt);
            }
        });
        PainelMtCinco.add(btMtCincoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 143, 190, 80));

        btMtCincoB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtCincoB.setText("12");
        btMtCincoB.setContentAreaFilled(false);
        btMtCincoB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btMtCincoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtCincoBActionPerformed(evt);
            }
        });
        PainelMtCinco.add(btMtCincoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 134, 180, 90));

        btMtCincoC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtCincoC.setText("8");
        btMtCincoC.setContentAreaFilled(false);
        btMtCincoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtCincoCActionPerformed(evt);
            }
        });
        PainelMtCinco.add(btMtCincoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 255, 190, 90));

        btMtCincoD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtCincoD.setText("7");
        btMtCincoD.setContentAreaFilled(false);
        btMtCincoD.setPreferredSize(new java.awt.Dimension(700, 420));
        btMtCincoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtCincoDActionPerformed(evt);
            }
        });
        PainelMtCinco.add(btMtCincoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 255, 180, 90));

        btMtMenu.setText(" MENU");
        btMtMenu.setContentAreaFilled(false);
        btMtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtMenuActionPerformed(evt);
            }
        });
        PainelMtCinco.add(btMtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btMtAvancar.setText("Avançar");
        btMtAvancar.setContentAreaFilled(false);
        btMtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtAvancarActionPerformed(evt);
            }
        });
        PainelMtCinco.add(btMtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 344, 90, 50));

        btMtVoltar.setText("Voltar");
        btMtVoltar.setContentAreaFilled(false);
        btMtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtVoltarActionPerformed(evt);
            }
        });
        PainelMtCinco.add(btMtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btMtDica.setText("?");
        btMtDica.setContentAreaFilled(false);
        btMtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDicaActionPerformed(evt);
            }
        });
        PainelMtCinco.add(btMtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtCincoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtCincoAActionPerformed
     pontosMt=pontosMt-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btMtCincoAActionPerformed

    private void btMtCincoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtCincoBActionPerformed
    pontosMt=pontosMt-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btMtCincoBActionPerformed

    private void btMtCincoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtCincoCActionPerformed
        pontosMt=pontosMt+20;
        System.out.println(""+pontosMt);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * from jogos");
            while(res.next())
            {
                 
                idAluno= res.getInt("idAluno");
            }
            stm.executeUpdate("UPDATE jogos set q5="+pontosMt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaMtSeis.setVisible(true);
        dispose();
                       

    }//GEN-LAST:event_btMtCincoCActionPerformed

    private void btMtCincoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtCincoDActionPerformed
        pontosMt=pontosMt-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btMtCincoDActionPerformed

    private void btMtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtAvancarActionPerformed
        TelaMtSeis.setVisible(true);
        dispose();
    }//GEN-LAST:event_btMtAvancarActionPerformed

    private void btMtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btMtMenuActionPerformed

    private void btMtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtVoltarActionPerformed
        new MtQuatro ().show();
        dispose();
    }//GEN-LAST:event_btMtVoltarActionPerformed

    private void btMtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Uma dica é voce tentar gritar a palavra em sua cabeça, a silaba que tiver mais ênfase é a sílaba tónica, exemplo: Abacaxiiii!");
    }//GEN-LAST:event_btMtDicaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMtCinco;
    private javax.swing.JButton btMtAvancar;
    private javax.swing.JButton btMtCincoA;
    private javax.swing.JButton btMtCincoB;
    private javax.swing.JButton btMtCincoC;
    private javax.swing.JButton btMtCincoD;
    private javax.swing.JButton btMtDica;
    private javax.swing.JButton btMtMenu;
    private javax.swing.JButton btMtVoltar;
    private javax.swing.JLabel jlMtCinco;
    // End of variables declaration//GEN-END:variables
}
