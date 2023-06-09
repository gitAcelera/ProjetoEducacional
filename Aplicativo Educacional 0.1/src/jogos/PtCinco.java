
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
public class PtCinco extends javax.swing.JFrame {
    private PtSeis TelaPtSeis;
    int pontosPt = PontosAluno.getPontosPt();
       int idAluno=0;
    /**
     * Método construtor da classe PtCinco
     */
    public PtCinco() {
        initComponents();
        TelaPtSeis = new PtSeis();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPtCinco = new javax.swing.JPanel();
        jlPtCinco = new javax.swing.JLabel();
        btPtCincoA = new javax.swing.JButton();
        btPtCincoB = new javax.swing.JButton();
        btPtCincoC = new javax.swing.JButton();
        btPtCincoD = new javax.swing.JButton();
        btPtMenu = new javax.swing.JButton();
        btPtDica = new javax.swing.JButton();
        btPtAvancar = new javax.swing.JButton();
        btPtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelPtCinco.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelPtCinco.setRequestFocusEnabled(false);
        PainelPtCinco.setVerifyInputWhenFocusTarget(false);
        PainelPtCinco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPtCinco.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PtCinco.png"))); // NOI18N
        PainelPtCinco.add(jlPtCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btPtCincoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtCincoA.setText("FO");
        btPtCincoA.setContentAreaFilled(false);
        btPtCincoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtCincoAActionPerformed(evt);
            }
        });
        PainelPtCinco.add(btPtCincoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 141, 180, 80));

        btPtCincoB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtCincoB.setText("LE");
        btPtCincoB.setContentAreaFilled(false);
        btPtCincoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtCincoBActionPerformed(evt);
            }
        });
        PainelPtCinco.add(btPtCincoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 141, 180, 80));

        btPtCincoC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtCincoC.setText("NE");
        btPtCincoC.setContentAreaFilled(false);
        btPtCincoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtCincoCActionPerformed(evt);
            }
        });
        PainelPtCinco.add(btPtCincoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 263, 180, 80));

        btPtCincoD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtCincoD.setText("TE");
        btPtCincoD.setContentAreaFilled(false);
        btPtCincoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtCincoDActionPerformed(evt);
            }
        });
        PainelPtCinco.add(btPtCincoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 263, 180, 80));

        btPtMenu.setText("MENU");
        btPtMenu.setContentAreaFilled(false);
        btPtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtMenuActionPerformed(evt);
            }
        });
        PainelPtCinco.add(btPtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btPtDica.setText("?");
        btPtDica.setContentAreaFilled(false);
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });
        PainelPtCinco.add(btPtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        btPtAvancar.setText("Avançar");
        btPtAvancar.setContentAreaFilled(false);
        btPtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtAvancarActionPerformed(evt);
            }
        });
        PainelPtCinco.add(btPtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 344, 90, 50));

        btPtVoltar.setText("Voltar");
        btPtVoltar.setContentAreaFilled(false);
        btPtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtVoltarActionPerformed(evt);
            }
        });
        PainelPtCinco.add(btPtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtCincoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtCincoAActionPerformed
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
           stm.executeUpdate("UPDATE jogos set q5="+pontosPt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaPtSeis.setVisible(true);
      dispose();
    }//GEN-LAST:event_btPtCincoAActionPerformed

    private void btPtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btPtMenuActionPerformed

    private void btPtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Uma dica é voce tentar gritar a palavra em sua cabeça, a silaba que tiver mais ênfase é a sílaba tónica, exemplo: Abacaxiiii!");
    }//GEN-LAST:event_btPtDicaActionPerformed

    private void btPtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtAvancarActionPerformed
          pontosPt=0;  
        TelaPtSeis.setVisible(true);
        dispose();
        System.out.println(""+pontosPt);
    }//GEN-LAST:event_btPtAvancarActionPerformed

    private void btPtCincoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtCincoCActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosPt=pontosPt-5;      // TODO add your handling code here:
    }//GEN-LAST:event_btPtCincoCActionPerformed

    private void btPtCincoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtCincoBActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosPt=pontosPt-5;       // TODO add your handling code here:
    }//GEN-LAST:event_btPtCincoBActionPerformed

    private void btPtCincoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtCincoDActionPerformed
       JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosPt=pontosPt-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btPtCincoDActionPerformed

    private void btPtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtVoltarActionPerformed
        new PtQuatro ().show();
        dispose();
    }//GEN-LAST:event_btPtVoltarActionPerformed

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtCinco;
    private javax.swing.JButton btPtAvancar;
    private javax.swing.JButton btPtCincoA;
    private javax.swing.JButton btPtCincoB;
    private javax.swing.JButton btPtCincoC;
    private javax.swing.JButton btPtCincoD;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btPtMenu;
    private javax.swing.JButton btPtVoltar;
    private javax.swing.JLabel jlPtCinco;
    // End of variables declaration//GEN-END:variables
}
