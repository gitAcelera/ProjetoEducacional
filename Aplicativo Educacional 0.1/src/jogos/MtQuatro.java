
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
public class MtQuatro extends javax.swing.JFrame {
 private MtCinco TelaMtCinco;
 int pontosMt = PontosAluno.getPontosMt();
     int idAluno=0;
    /**
     * Método construtor da classe MtQuatro
     */
    public MtQuatro() {
        initComponents();
        TelaMtCinco = new MtCinco ();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtQuatro = new javax.swing.JPanel();
        jlMtQuatro = new javax.swing.JLabel();
        btMtQuatroA = new javax.swing.JButton();
        btMtQuatroB = new javax.swing.JButton();
        btMtQuatroC = new javax.swing.JButton();
        btMtQuatroD = new javax.swing.JButton();
        btMtAvancar = new javax.swing.JButton();
        btMtMenu = new javax.swing.JButton();
        btMtVoltar = new javax.swing.JButton();
        btMtDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelMtQuatro.setPreferredSize(new java.awt.Dimension(700, 420));
        PainelMtQuatro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMtQuatro.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtQuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MtQuatro.png"))); // NOI18N
        PainelMtQuatro.add(jlMtQuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btMtQuatroA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtQuatroA.setText("3");
        btMtQuatroA.setContentAreaFilled(false);
        btMtQuatroA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtQuatroAActionPerformed(evt);
            }
        });
        PainelMtQuatro.add(btMtQuatroA, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 139, 190, 80));

        btMtQuatroB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtQuatroB.setText("13");
        btMtQuatroB.setContentAreaFilled(false);
        btMtQuatroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtQuatroBActionPerformed(evt);
            }
        });
        PainelMtQuatro.add(btMtQuatroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 139, 180, 80));

        btMtQuatroC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtQuatroC.setText("4");
        btMtQuatroC.setContentAreaFilled(false);
        btMtQuatroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtQuatroCActionPerformed(evt);
            }
        });
        PainelMtQuatro.add(btMtQuatroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 259, 180, 80));

        btMtQuatroD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtQuatroD.setText("7");
        btMtQuatroD.setContentAreaFilled(false);
        btMtQuatroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtQuatroDActionPerformed(evt);
            }
        });
        PainelMtQuatro.add(btMtQuatroD, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 259, 180, 80));

        btMtAvancar.setText("Avançar");
        btMtAvancar.setContentAreaFilled(false);
        btMtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtAvancarActionPerformed(evt);
            }
        });
        PainelMtQuatro.add(btMtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 344, 90, 50));

        btMtMenu.setText(" MENU");
        btMtMenu.setContentAreaFilled(false);
        btMtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtMenuActionPerformed(evt);
            }
        });
        PainelMtQuatro.add(btMtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 90, 40));

        btMtVoltar.setText("Voltar");
        btMtVoltar.setContentAreaFilled(false);
        btMtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtVoltarActionPerformed(evt);
            }
        });
        PainelMtQuatro.add(btMtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 90, 40));

        btMtDica.setText("?");
        btMtDica.setContentAreaFilled(false);
        btMtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDicaActionPerformed(evt);
            }
        });
        PainelMtQuatro.add(btMtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtQuatroAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtQuatroAActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q4="+pontosMt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }     
        TelaMtCinco.setVisible(true);
         dispose();
    }//GEN-LAST:event_btMtQuatroAActionPerformed

    private void btMtQuatroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtQuatroCActionPerformed
   pontosMt=pontosMt-5;       // TODO add your handling code here:
    }//GEN-LAST:event_btMtQuatroCActionPerformed

    private void btMtQuatroDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtQuatroDActionPerformed
  pontosMt=pontosMt-5;  
    }//GEN-LAST:event_btMtQuatroDActionPerformed

    private void btMtQuatroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtQuatroBActionPerformed
     pontosMt=pontosMt-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btMtQuatroBActionPerformed

    private void btMtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtAvancarActionPerformed
        TelaMtCinco.setVisible(true);
         dispose();
    }//GEN-LAST:event_btMtAvancarActionPerformed

    private void btMtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtMenuActionPerformed
         new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btMtMenuActionPerformed

    private void btMtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtVoltarActionPerformed
        new MtTres ().show();
        dispose();
    }//GEN-LAST:event_btMtVoltarActionPerformed

    private void btMtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"A operação é subtração ou seja, se você tem 5 laranjas e deu 2, você tem 3 laranjas agora!");
    }//GEN-LAST:event_btMtDicaActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMtQuatro;
    private javax.swing.JButton btMtAvancar;
    private javax.swing.JButton btMtDica;
    private javax.swing.JButton btMtMenu;
    private javax.swing.JButton btMtQuatroA;
    private javax.swing.JButton btMtQuatroB;
    private javax.swing.JButton btMtQuatroC;
    private javax.swing.JButton btMtQuatroD;
    private javax.swing.JButton btMtVoltar;
    private javax.swing.JLabel jlMtQuatro;
    // End of variables declaration//GEN-END:variables
}
