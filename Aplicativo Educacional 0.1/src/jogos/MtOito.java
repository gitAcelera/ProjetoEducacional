
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
public class MtOito extends javax.swing.JFrame {
  private MtNove TelaMtNove;
   int pontosMt = PontosAluno.getPontosMt();
     int idAluno=0;
    /**
     *
     * Método construtor da classe MtOito
     */
    public MtOito() {
        initComponents();
        TelaMtNove = new MtNove();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtOito = new javax.swing.JPanel();
        jlMtOito = new javax.swing.JLabel();
        btMtOitoA = new javax.swing.JButton();
        btMtOitoB = new javax.swing.JButton();
        btMtOitoC = new javax.swing.JButton();
        btMtOitoD = new javax.swing.JButton();
        btMtAvancar = new javax.swing.JButton();
        btMtMenu = new javax.swing.JButton();
        btMtVoltar = new javax.swing.JButton();
        btMtDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelMtOito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMtOito.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtOito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MtOito.png"))); // NOI18N
        PainelMtOito.add(jlMtOito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btMtOitoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtOitoA.setText("8");
        btMtOitoA.setContentAreaFilled(false);
        btMtOitoA.setPreferredSize(new java.awt.Dimension(700, 420));
        btMtOitoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtOitoAActionPerformed(evt);
            }
        });
        PainelMtOito.add(btMtOitoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 141, 180, 80));

        btMtOitoB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtOitoB.setText("6");
        btMtOitoB.setContentAreaFilled(false);
        btMtOitoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtOitoBActionPerformed(evt);
            }
        });
        PainelMtOito.add(btMtOitoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 141, 180, 80));

        btMtOitoC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtOitoC.setText("10");
        btMtOitoC.setContentAreaFilled(false);
        btMtOitoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtOitoCActionPerformed(evt);
            }
        });
        PainelMtOito.add(btMtOitoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 263, 180, 80));

        btMtOitoD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtOitoD.setText("7");
        btMtOitoD.setContentAreaFilled(false);
        btMtOitoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtOitoDActionPerformed(evt);
            }
        });
        PainelMtOito.add(btMtOitoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 263, 180, 80));

        btMtAvancar.setText("Avançar");
        btMtAvancar.setContentAreaFilled(false);
        btMtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtAvancarActionPerformed(evt);
            }
        });
        PainelMtOito.add(btMtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 344, 90, 50));

        btMtMenu.setText("MENU");
        btMtMenu.setContentAreaFilled(false);
        btMtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtMenuActionPerformed(evt);
            }
        });
        PainelMtOito.add(btMtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btMtVoltar.setText("Voltar");
        btMtVoltar.setContentAreaFilled(false);
        btMtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtVoltarActionPerformed(evt);
            }
        });
        PainelMtOito.add(btMtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 371, -1, -1));

        btMtDica.setText("?");
        btMtDica.setContentAreaFilled(false);
        btMtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDicaActionPerformed(evt);
            }
        });
        PainelMtOito.add(btMtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtOito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtOito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtOitoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtOitoAActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q8="+pontosMt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaMtNove.setVisible(true);
       dispose();
    }//GEN-LAST:event_btMtOitoAActionPerformed

    private void btMtOitoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtOitoBActionPerformed
    JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosMt=pontosMt-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btMtOitoBActionPerformed

    private void btMtOitoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtOitoCActionPerformed
    JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
    pontosMt=pontosMt-5;  // TODO add your handling code here:
    }//GEN-LAST:event_btMtOitoCActionPerformed

    private void btMtOitoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtOitoDActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosMt=pontosMt-5;  // TODO add your handling code here:
    }//GEN-LAST:event_btMtOitoDActionPerformed

    private void btMtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtAvancarActionPerformed
        TelaMtNove.setVisible(true);
       dispose();
    }//GEN-LAST:event_btMtAvancarActionPerformed

    private void btMtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtMenuActionPerformed
         new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btMtMenuActionPerformed

    private void btMtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtVoltarActionPerformed
        new MtSete().show();
        dispose();
    }//GEN-LAST:event_btMtVoltarActionPerformed

    private void btMtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"uma dica é entender que 4x2 é a mesma que 4+4...");
    }//GEN-LAST:event_btMtDicaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMtOito;
    private javax.swing.JButton btMtAvancar;
    private javax.swing.JButton btMtDica;
    private javax.swing.JButton btMtMenu;
    private javax.swing.JButton btMtOitoA;
    private javax.swing.JButton btMtOitoB;
    private javax.swing.JButton btMtOitoC;
    private javax.swing.JButton btMtOitoD;
    private javax.swing.JButton btMtVoltar;
    private javax.swing.JLabel jlMtOito;
    // End of variables declaration//GEN-END:variables
}
