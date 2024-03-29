
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
public class MtSeis extends javax.swing.JFrame {
  private MtSete TelaMtSete;
  int pontosMt = PontosAluno.getPontosMt();
     int idAluno=0;
    /**
     * Método construtor da classe  MtSeis
     */
    public MtSeis() {
        initComponents();
        TelaMtSete = new MtSete ();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtSeis = new javax.swing.JPanel();
        jlMtSeis = new javax.swing.JLabel();
        btMtSeisA = new javax.swing.JButton();
        btMtSeisB = new javax.swing.JButton();
        btMtSeisC = new javax.swing.JButton();
        btMtSeisD = new javax.swing.JButton();
        btMtAvancar = new javax.swing.JButton();
        btMtMenu = new javax.swing.JButton();
        btMtVoltar = new javax.swing.JButton();
        btMtDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelMtSeis.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelMtSeis.setRequestFocusEnabled(false);
        PainelMtSeis.setVerifyInputWhenFocusTarget(false);
        PainelMtSeis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMtSeis.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MtSeis.png"))); // NOI18N
        jlMtSeis.setText("15");
        PainelMtSeis.add(jlMtSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btMtSeisA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeisA.setText("15");
        btMtSeisA.setContentAreaFilled(false);
        btMtSeisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeisAActionPerformed(evt);
            }
        });
        PainelMtSeis.add(btMtSeisA, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 135, 190, 90));

        btMtSeisB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeisB.setText("5");
        btMtSeisB.setContentAreaFilled(false);
        btMtSeisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeisBActionPerformed(evt);
            }
        });
        PainelMtSeis.add(btMtSeisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 135, 190, 90));

        btMtSeisC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeisC.setText("9");
        btMtSeisC.setContentAreaFilled(false);
        btMtSeisC.setPreferredSize(new java.awt.Dimension(700, 420));
        btMtSeisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeisCActionPerformed(evt);
            }
        });
        PainelMtSeis.add(btMtSeisC, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 255, 190, 90));

        btMtSeisD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeisD.setText("10");
        btMtSeisD.setContentAreaFilled(false);
        btMtSeisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeisDActionPerformed(evt);
            }
        });
        PainelMtSeis.add(btMtSeisD, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 255, 180, 90));

        btMtAvancar.setText("Avançar");
        btMtAvancar.setContentAreaFilled(false);
        btMtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtAvancarActionPerformed(evt);
            }
        });
        PainelMtSeis.add(btMtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 345, 90, 50));

        btMtMenu.setText(" MENU");
        btMtMenu.setContentAreaFilled(false);
        btMtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtMenuActionPerformed(evt);
            }
        });
        PainelMtSeis.add(btMtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 90, 40));

        btMtVoltar.setText("Voltar");
        btMtVoltar.setContentAreaFilled(false);
        btMtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtVoltarActionPerformed(evt);
            }
        });
        PainelMtSeis.add(btMtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 345, 80, 50));

        btMtDica.setText("?");
        btMtDica.setContentAreaFilled(false);
        btMtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDicaActionPerformed(evt);
            }
        });
        PainelMtSeis.add(btMtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtSeisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeisAActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
      pontosMt=pontosMt-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btMtSeisAActionPerformed

    private void btMtSeisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeisBActionPerformed
    JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
    pontosMt=pontosMt-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btMtSeisBActionPerformed

    private void btMtSeisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeisCActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q6="+pontosMt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaMtSete.setVisible(true);
        dispose();
    }//GEN-LAST:event_btMtSeisCActionPerformed

    private void btMtSeisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeisDActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosMt=pontosMt-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btMtSeisDActionPerformed

    private void btMtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtAvancarActionPerformed
         TelaMtSete.setVisible(true);
        dispose();
    }//GEN-LAST:event_btMtAvancarActionPerformed

    private void btMtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btMtMenuActionPerformed

    private void btMtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtVoltarActionPerformed
        new MtCinco ().show();
        dispose();
    }//GEN-LAST:event_btMtVoltarActionPerformed

    private void btMtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"A operação é subtração ou seja, se você tem 5 laranjas e deu 2, você tem 3 laranjas agora!");
    }//GEN-LAST:event_btMtDicaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMtSeis;
    private javax.swing.JButton btMtAvancar;
    private javax.swing.JButton btMtDica;
    private javax.swing.JButton btMtMenu;
    private javax.swing.JButton btMtSeisA;
    private javax.swing.JButton btMtSeisB;
    private javax.swing.JButton btMtSeisC;
    private javax.swing.JButton btMtSeisD;
    private javax.swing.JButton btMtVoltar;
    private javax.swing.JLabel jlMtSeis;
    // End of variables declaration//GEN-END:variables
}
