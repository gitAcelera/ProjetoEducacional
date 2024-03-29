
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
public class MtTres extends javax.swing.JFrame {
  private MtQuatro  TelaMtQuatro;
  int pontosMt = PontosAluno.getPontosMt();
     int idAluno=0;
    /**
     * Método construtor da classe MtTres
     */
    public MtTres() {
        initComponents();
        TelaMtQuatro = new MtQuatro ();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtTres = new javax.swing.JPanel();
        jlMtTres = new javax.swing.JLabel();
        btMtTresA = new javax.swing.JButton();
        btMtTresB = new javax.swing.JButton();
        btMtTresC = new javax.swing.JButton();
        btMtTresD = new javax.swing.JButton();
        btMtAvancar = new javax.swing.JButton();
        btMtMenu = new javax.swing.JButton();
        btMtVoltar = new javax.swing.JButton();
        btMtDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelMtTres.setPreferredSize(new java.awt.Dimension(700, 420));
        PainelMtTres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMtTres.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MtTres.png"))); // NOI18N
        PainelMtTres.add(jlMtTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btMtTresA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtTresA.setText("20");
        btMtTresA.setContentAreaFilled(false);
        btMtTresA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtTresAActionPerformed(evt);
            }
        });
        PainelMtTres.add(btMtTresA, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 140, 190, 80));

        btMtTresB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtTresB.setText("17");
        btMtTresB.setContentAreaFilled(false);
        btMtTresB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtTresBActionPerformed(evt);
            }
        });
        PainelMtTres.add(btMtTresB, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 140, 180, 80));

        btMtTresC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtTresC.setText("18");
        btMtTresC.setContentAreaFilled(false);
        btMtTresC.setPreferredSize(new java.awt.Dimension(700, 420));
        btMtTresC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtTresCActionPerformed(evt);
            }
        });
        PainelMtTres.add(btMtTresC, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 260, 190, 80));

        btMtTresD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtTresD.setText("16");
        btMtTresD.setContentAreaFilled(false);
        btMtTresD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtTresDActionPerformed(evt);
            }
        });
        PainelMtTres.add(btMtTresD, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 260, 180, 80));

        btMtAvancar.setText("Avançar");
        btMtAvancar.setContentAreaFilled(false);
        btMtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtAvancarActionPerformed(evt);
            }
        });
        PainelMtTres.add(btMtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 344, 90, 50));

        btMtMenu.setText("MENU");
        btMtMenu.setContentAreaFilled(false);
        btMtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtMenuActionPerformed(evt);
            }
        });
        PainelMtTres.add(btMtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btMtVoltar.setText("Voltar");
        btMtVoltar.setContentAreaFilled(false);
        btMtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtVoltarActionPerformed(evt);
            }
        });
        PainelMtTres.add(btMtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btMtDica.setText("?");
        btMtDica.setContentAreaFilled(false);
        btMtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDicaActionPerformed(evt);
            }
        });
        PainelMtTres.add(btMtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtTres, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtTresAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtTresAActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosMt=pontosMt-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btMtTresAActionPerformed

    private void btMtTresBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtTresBActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosMt=pontosMt-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btMtTresBActionPerformed

    private void btMtTresCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtTresCActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q3="+pontosMt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        
        TelaMtQuatro.setVisible(true);
       dispose();
    }//GEN-LAST:event_btMtTresCActionPerformed

    private void btMtTresDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtTresDActionPerformed
    
         JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
         pontosMt=pontosMt-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btMtTresDActionPerformed

    private void btMtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtAvancarActionPerformed
        TelaMtQuatro.setVisible(true);
       dispose();
    }//GEN-LAST:event_btMtAvancarActionPerformed

    private void btMtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtMenuActionPerformed
         new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btMtMenuActionPerformed

    private void btMtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtVoltarActionPerformed
        new MtDois ().show();
        dispose();
    }//GEN-LAST:event_btMtVoltarActionPerformed

    private void btMtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"A operação é soma ou seja conte cada unidade na mão!");
    }//GEN-LAST:event_btMtDicaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMtTres;
    private javax.swing.JButton btMtAvancar;
    private javax.swing.JButton btMtDica;
    private javax.swing.JButton btMtMenu;
    private javax.swing.JButton btMtTresA;
    private javax.swing.JButton btMtTresB;
    private javax.swing.JButton btMtTresC;
    private javax.swing.JButton btMtTresD;
    private javax.swing.JButton btMtVoltar;
    private javax.swing.JLabel jlMtTres;
    // End of variables declaration//GEN-END:variables
}
