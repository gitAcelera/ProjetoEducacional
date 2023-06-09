
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
public class PtNove extends javax.swing.JFrame {
     private PtDez TelaPtDez;
     int pontosPt = PontosAluno.getPontosPt();
        int idAluno=0;
    /**
     * Método construtor da classe PtNove
     */
    public PtNove() {
        initComponents();
        TelaPtDez = new PtDez();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPtNove = new javax.swing.JPanel();
        jlPtNove = new javax.swing.JLabel();
        btPtNoveA = new javax.swing.JButton();
        btPtNoveB = new javax.swing.JButton();
        btPtNoveC = new javax.swing.JButton();
        btPtNoveD = new javax.swing.JButton();
        btPtMenu = new javax.swing.JButton();
        btPtDica = new javax.swing.JButton();
        btPtAvancar = new javax.swing.JButton();
        btPtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelPtNove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPtNove.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtNove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PtNove.png"))); // NOI18N
        PainelPtNove.add(jlPtNove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btPtNoveA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtNoveA.setText("CASOS");
        btPtNoveA.setContentAreaFilled(false);
        btPtNoveA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtNoveAActionPerformed(evt);
            }
        });
        PainelPtNove.add(btPtNoveA, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 139, 190, 80));

        btPtNoveB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtNoveB.setText("CANÇÕES");
        btPtNoveB.setContentAreaFilled(false);
        btPtNoveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtNoveBActionPerformed(evt);
            }
        });
        PainelPtNove.add(btPtNoveB, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 139, 180, 80));

        btPtNoveC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtNoveC.setText("CASÕES");
        btPtNoveC.setContentAreaFilled(false);
        btPtNoveC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtNoveCActionPerformed(evt);
            }
        });
        PainelPtNove.add(btPtNoveC, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 259, 180, 80));

        btPtNoveD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtNoveD.setText("CASAS");
        btPtNoveD.setContentAreaFilled(false);
        btPtNoveD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtNoveDActionPerformed(evt);
            }
        });
        PainelPtNove.add(btPtNoveD, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 259, 180, 80));

        btPtMenu.setText("MENU");
        btPtMenu.setContentAreaFilled(false);
        btPtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtMenuActionPerformed(evt);
            }
        });
        PainelPtNove.add(btPtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btPtDica.setText("?");
        btPtDica.setContentAreaFilled(false);
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });
        PainelPtNove.add(btPtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        btPtAvancar.setText("Avançar");
        btPtAvancar.setContentAreaFilled(false);
        btPtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtAvancarActionPerformed(evt);
            }
        });
        PainelPtNove.add(btPtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 351, 70, 40));

        btPtVoltar.setText("Voltar");
        btPtVoltar.setContentAreaFilled(false);
        btPtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtVoltarActionPerformed(evt);
            }
        });
        PainelPtNove.add(btPtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 351, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtNove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtNove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtNoveDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtNoveDActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q9="+pontosPt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaPtDez.setVisible(true);
      dispose();
    }//GEN-LAST:event_btPtNoveDActionPerformed

    private void btPtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btPtMenuActionPerformed

    private void btPtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Plural se refere a mais de um, exemplo: Os PASSARINHOS voam");
    }//GEN-LAST:event_btPtDicaActionPerformed

    private void btPtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtAvancarActionPerformed
  pontosPt=0;
        System.out.println(""+pontosPt);
        TelaPtDez.setVisible(true);
        dispose();
    }//GEN-LAST:event_btPtAvancarActionPerformed

    private void btPtNoveAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtNoveAActionPerformed

         JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
         pontosPt=pontosPt-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btPtNoveAActionPerformed

    private void btPtNoveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtNoveBActionPerformed
 JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosPt=pontosPt-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btPtNoveBActionPerformed

    private void btPtNoveCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtNoveCActionPerformed
 JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosPt=pontosPt-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btPtNoveCActionPerformed

    private void btPtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtVoltarActionPerformed
        new PtOito ().show();
        dispose();
    }//GEN-LAST:event_btPtVoltarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtNove;
    private javax.swing.JButton btPtAvancar;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btPtMenu;
    private javax.swing.JButton btPtNoveA;
    private javax.swing.JButton btPtNoveB;
    private javax.swing.JButton btPtNoveC;
    private javax.swing.JButton btPtNoveD;
    private javax.swing.JButton btPtVoltar;
    private javax.swing.JLabel jlPtNove;
    // End of variables declaration//GEN-END:variables
}
