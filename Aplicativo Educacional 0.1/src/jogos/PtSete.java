
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
public class PtSete extends javax.swing.JFrame {
    private PtOito TelaPtOito;
    int pontosPt = PontosAluno.getPontosPt();
       int idAluno=0;
    /**
     * Método construtor da classe PtSete
     */
    public PtSete() {
        initComponents();
        TelaPtOito = new PtOito();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPtSete = new javax.swing.JPanel();
        jlPtSete = new javax.swing.JLabel();
        btPtSeteA = new javax.swing.JButton();
        btPtSeteB = new javax.swing.JButton();
        btPtSeteC = new javax.swing.JButton();
        btPtSeteD = new javax.swing.JButton();
        btPtMenu = new javax.swing.JButton();
        btPtAvancar = new javax.swing.JButton();
        btPtDica = new javax.swing.JButton();
        btPtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PainelPtSete.setMaximumSize(new java.awt.Dimension(700, 400));
        PainelPtSete.setMinimumSize(new java.awt.Dimension(700, 400));
        PainelPtSete.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelPtSete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPtSete.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtSete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PtSete.png"))); // NOI18N
        PainelPtSete.add(jlPtSete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btPtSeteA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtSeteA.setText("EU");
        btPtSeteA.setContentAreaFilled(false);
        btPtSeteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtSeteAActionPerformed(evt);
            }
        });
        PainelPtSete.add(btPtSeteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 142, 190, 80));

        btPtSeteB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtSeteB.setText("DEU");
        btPtSeteB.setContentAreaFilled(false);
        btPtSeteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtSeteBActionPerformed(evt);
            }
        });
        PainelPtSete.add(btPtSeteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 142, 180, 80));

        btPtSeteC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtSeteC.setText("NÓS");
        btPtSeteC.setContentAreaFilled(false);
        btPtSeteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtSeteCActionPerformed(evt);
            }
        });
        PainelPtSete.add(btPtSeteC, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 262, 180, 80));

        btPtSeteD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtSeteD.setText("TU");
        btPtSeteD.setContentAreaFilled(false);
        btPtSeteD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtSeteDActionPerformed(evt);
            }
        });
        PainelPtSete.add(btPtSeteD, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 262, 180, 80));

        btPtMenu.setText("MENU");
        btPtMenu.setContentAreaFilled(false);
        btPtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtMenuActionPerformed(evt);
            }
        });
        PainelPtSete.add(btPtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btPtAvancar.setText("Avançar");
        btPtAvancar.setContentAreaFilled(false);
        btPtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtAvancarActionPerformed(evt);
            }
        });
        PainelPtSete.add(btPtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 344, 90, 50));

        btPtDica.setText("?");
        btPtDica.setContentAreaFilled(false);
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });
        PainelPtSete.add(btPtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        btPtVoltar.setText("Voltar");
        btPtVoltar.setContentAreaFilled(false);
        btPtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtVoltarActionPerformed(evt);
            }
        });
        PainelPtSete.add(btPtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtSete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtSete, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtSeteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtSeteAActionPerformed
 JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
 pontosPt=pontosPt-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btPtSeteAActionPerformed

    private void btPtSeteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtSeteBActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q7="+pontosPt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaPtOito.setVisible(true);
      dispose();
    }//GEN-LAST:event_btPtSeteBActionPerformed

    private void btPtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btPtMenuActionPerformed

    private void btPtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtAvancarActionPerformed
  pontosPt=0;
        System.out.println(""+pontosPt);
        TelaPtOito.setVisible(true);
        dispose();
    }//GEN-LAST:event_btPtAvancarActionPerformed

    private void btPtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Exemplos: EU, TU, ELE, NÓS, VÓS, ELES");
    }//GEN-LAST:event_btPtDicaActionPerformed

    private void btPtSeteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtSeteCActionPerformed
 JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
 pontosPt=pontosPt-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btPtSeteCActionPerformed

    private void btPtSeteDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtSeteDActionPerformed
 JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
 pontosPt=pontosPt-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btPtSeteDActionPerformed

    private void btPtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtVoltarActionPerformed
        new PtSeis ().show();
        dispose();
    }//GEN-LAST:event_btPtVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtSete;
    private javax.swing.JButton btPtAvancar;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btPtMenu;
    private javax.swing.JButton btPtSeteA;
    private javax.swing.JButton btPtSeteB;
    private javax.swing.JButton btPtSeteC;
    private javax.swing.JButton btPtSeteD;
    private javax.swing.JButton btPtVoltar;
    private javax.swing.JLabel jlPtSete;
    // End of variables declaration//GEN-END:variables
}
