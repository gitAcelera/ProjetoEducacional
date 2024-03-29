
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
public class MtNove extends javax.swing.JFrame {
private MtDez TelaMtDez;
int pontosMt = PontosAluno.getPontosMt();
     int idAluno=0;
    /**
     * Método construtor da classe  MtNove
     */
    public MtNove() {
        initComponents();
        TelaMtDez = new MtDez();
    }

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtNove = new javax.swing.JPanel();
        jlMtNove = new javax.swing.JLabel();
        btMtNoveA = new javax.swing.JButton();
        btMtNoveB = new javax.swing.JButton();
        btMtNoveC = new javax.swing.JButton();
        btMtNoveD = new javax.swing.JButton();
        btMtAvancar = new javax.swing.JButton();
        btMtMenu = new javax.swing.JButton();
        btMtVoltar = new javax.swing.JButton();
        btMtDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelMtNove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMtNove.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtNove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MtNove.png"))); // NOI18N
        PainelMtNove.add(jlMtNove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btMtNoveA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtNoveA.setText("5");
        btMtNoveA.setContentAreaFilled(false);
        btMtNoveA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtNoveAActionPerformed(evt);
            }
        });
        PainelMtNove.add(btMtNoveA, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 138, 180, 80));

        btMtNoveB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtNoveB.setText("7");
        btMtNoveB.setContentAreaFilled(false);
        btMtNoveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtNoveBActionPerformed(evt);
            }
        });
        PainelMtNove.add(btMtNoveB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 138, 190, 90));

        btMtNoveC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtNoveC.setText("11");
        btMtNoveC.setContentAreaFilled(false);
        btMtNoveC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtNoveCActionPerformed(evt);
            }
        });
        PainelMtNove.add(btMtNoveC, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 258, 180, 80));

        btMtNoveD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtNoveD.setText("2");
        btMtNoveD.setContentAreaFilled(false);
        btMtNoveD.setPreferredSize(new java.awt.Dimension(700, 420));
        btMtNoveD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtNoveDActionPerformed(evt);
            }
        });
        PainelMtNove.add(btMtNoveD, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 258, 190, 80));

        btMtAvancar.setText("Avançar");
        btMtAvancar.setContentAreaFilled(false);
        btMtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtAvancarActionPerformed(evt);
            }
        });
        PainelMtNove.add(btMtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 344, 90, 50));

        btMtMenu.setText(" MENU");
        btMtMenu.setContentAreaFilled(false);
        btMtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtMenuActionPerformed(evt);
            }
        });
        PainelMtNove.add(btMtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btMtVoltar.setText("Voltar");
        btMtVoltar.setContentAreaFilled(false);
        btMtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtVoltarActionPerformed(evt);
            }
        });
        PainelMtNove.add(btMtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 344, 80, 50));

        btMtDica.setText("?");
        btMtDica.setContentAreaFilled(false);
        btMtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDicaActionPerformed(evt);
            }
        });
        PainelMtNove.add(btMtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtNove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtNove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtNoveAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtNoveAActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosMt=pontosMt-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btMtNoveAActionPerformed

    private void btMtNoveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtNoveBActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosMt=pontosMt-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btMtNoveBActionPerformed

    private void btMtNoveCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtNoveCActionPerformed
    JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosMt=pontosMt-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btMtNoveCActionPerformed

    private void btMtNoveDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtNoveDActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q9="+pontosMt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }       
        TelaMtDez.setVisible(true);
           dispose();
    }//GEN-LAST:event_btMtNoveDActionPerformed

    private void btMtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtAvancarActionPerformed
         TelaMtDez.setVisible(true);
           dispose();
    }//GEN-LAST:event_btMtAvancarActionPerformed

    private void btMtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btMtMenuActionPerformed

    private void btMtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtVoltarActionPerformed
        new MtOito().show();
        dispose();
    }//GEN-LAST:event_btMtVoltarActionPerformed

    private void btMtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Todo numero par é dividido por 2!");
    }//GEN-LAST:event_btMtDicaActionPerformed

   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMtNove;
    private javax.swing.JButton btMtAvancar;
    private javax.swing.JButton btMtDica;
    private javax.swing.JButton btMtMenu;
    private javax.swing.JButton btMtNoveA;
    private javax.swing.JButton btMtNoveB;
    private javax.swing.JButton btMtNoveC;
    private javax.swing.JButton btMtNoveD;
    private javax.swing.JButton btMtVoltar;
    private javax.swing.JLabel jlMtNove;
    // End of variables declaration//GEN-END:variables
}
