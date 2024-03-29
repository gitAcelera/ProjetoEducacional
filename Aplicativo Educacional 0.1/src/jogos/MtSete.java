
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
public class MtSete extends javax.swing.JFrame {
 
     MtOito TelaMtOito;
     int pontosMt = PontosAluno.getPontosMt();
     int idAluno=0;
    /**
     * Método construtor da classe MtSete
     */
    public MtSete() {

        initComponents();
        TelaMtOito = new MtOito();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtSete = new javax.swing.JPanel();
        jlMtSete = new javax.swing.JLabel();
        btMtSeteA = new javax.swing.JButton();
        btMtSeteB = new javax.swing.JButton();
        btMtSeteC = new javax.swing.JButton();
        btMtSeteD = new javax.swing.JButton();
        btMtAvancar = new javax.swing.JButton();
        btMtMenu = new javax.swing.JButton();
        btMtVoltar = new javax.swing.JButton();
        btMtDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelMtSete.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelMtSete.setRequestFocusEnabled(false);
        PainelMtSete.setVerifyInputWhenFocusTarget(false);
        PainelMtSete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMtSete.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtSete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MtSete.png"))); // NOI18N
        PainelMtSete.add(jlMtSete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btMtSeteA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeteA.setText("5");
        btMtSeteA.setContentAreaFilled(false);
        btMtSeteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeteAActionPerformed(evt);
            }
        });
        PainelMtSete.add(btMtSeteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 133, 180, 90));

        btMtSeteB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeteB.setText("1");
        btMtSeteB.setContentAreaFilled(false);
        btMtSeteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeteBActionPerformed(evt);
            }
        });
        PainelMtSete.add(btMtSeteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 143, 180, 80));

        btMtSeteC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeteC.setText("6");
        btMtSeteC.setContentAreaFilled(false);
        btMtSeteC.setPreferredSize(new java.awt.Dimension(700, 420));
        btMtSeteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeteCActionPerformed(evt);
            }
        });
        PainelMtSete.add(btMtSeteC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 263, 180, 80));

        btMtSeteD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeteD.setText("8");
        btMtSeteD.setContentAreaFilled(false);
        btMtSeteD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeteDActionPerformed(evt);
            }
        });
        PainelMtSete.add(btMtSeteD, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 263, 180, 80));

        btMtAvancar.setText("Avançar");
        btMtAvancar.setContentAreaFilled(false);
        btMtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtAvancarActionPerformed(evt);
            }
        });
        PainelMtSete.add(btMtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 344, 90, 50));

        btMtMenu.setText(" MENU");
        btMtMenu.setContentAreaFilled(false);
        btMtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtMenuActionPerformed(evt);
            }
        });
        PainelMtSete.add(btMtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 50));

        btMtVoltar.setText("Voltar");
        btMtVoltar.setContentAreaFilled(false);
        btMtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtVoltarActionPerformed(evt);
            }
        });
        PainelMtSete.add(btMtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btMtDica.setText("?");
        btMtDica.setContentAreaFilled(false);
        btMtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDicaActionPerformed(evt);
            }
        });
        PainelMtSete.add(btMtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtSete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtSete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtSeteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeteAActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
      pontosMt=pontosMt-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btMtSeteAActionPerformed

    private void btMtSeteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeteBActionPerformed
        JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosMt=pontosMt-5; // TODO add your handling code here:
    }//GEN-LAST:event_btMtSeteBActionPerformed

    private void btMtSeteDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeteDActionPerformed
        JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosMt=pontosMt-5; // TODO add your handling code here:
    }//GEN-LAST:event_btMtSeteDActionPerformed

    private void btMtSeteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeteCActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q7="+pontosMt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaMtOito.setVisible(true);
        dispose();
    }//GEN-LAST:event_btMtSeteCActionPerformed

    private void btMtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtAvancarActionPerformed
        TelaMtOito.setVisible(true);
        dispose();
    }//GEN-LAST:event_btMtAvancarActionPerformed

    private void btMtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtMenuActionPerformed
         new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btMtMenuActionPerformed

    private void btMtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtVoltarActionPerformed
        new MtSeis ().show();
        dispose();
    }//GEN-LAST:event_btMtVoltarActionPerformed

    private void btMtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"uma dica é entender que 2x3 é a mesma que 2+2+2...");
    }//GEN-LAST:event_btMtDicaActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMtSete;
    private javax.swing.JButton btMtAvancar;
    private javax.swing.JButton btMtDica;
    private javax.swing.JButton btMtMenu;
    private javax.swing.JButton btMtSeteA;
    private javax.swing.JButton btMtSeteB;
    private javax.swing.JButton btMtSeteC;
    private javax.swing.JButton btMtSeteD;
    private javax.swing.JButton btMtVoltar;
    private javax.swing.JLabel jlMtSete;
    // End of variables declaration//GEN-END:variables
}
