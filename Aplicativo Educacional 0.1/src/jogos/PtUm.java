
package jogos;
import Dados.PontosAluno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import telas.menuPrincipal;

/**
 *Classe responsável pelo jogo Qual é a cor 
 *@author Felipe
 * 
 */
public class PtUm extends javax.swing.JFrame {
    private PtDois TelaPtDois;
     int pontosPt = PontosAluno.getPontosPt();
     String tipo="portugues";

    /**
     * Método construtor da classe PtUm
     */
    public PtUm() {
        initComponents();
        TelaPtDois = new PtDois();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPtUm = new javax.swing.JPanel();
        jlPtUm = new javax.swing.JLabel();
        btPtUmA = new javax.swing.JButton();
        btPtUmB = new javax.swing.JButton();
        btPtUmC = new javax.swing.JButton();
        btPtUmD = new javax.swing.JButton();
        btPtDica = new javax.swing.JButton();
        btPtMenu = new javax.swing.JButton();
        btPtAvancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelPtUm.setPreferredSize(new java.awt.Dimension(700, 420));
        PainelPtUm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPtUm.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtUm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PtUm.png"))); // NOI18N
        PainelPtUm.add(jlPtUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btPtUmA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtUmA.setText("A");
        btPtUmA.setContentAreaFilled(false);
        btPtUmA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtUmAActionPerformed(evt);
            }
        });
        PainelPtUm.add(btPtUmA, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 136, 190, 90));

        btPtUmB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtUmB.setText("C");
        btPtUmB.setContentAreaFilled(false);
        btPtUmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtUmBActionPerformed(evt);
            }
        });
        PainelPtUm.add(btPtUmB, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 136, 180, 90));

        btPtUmC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtUmC.setText("S");
        btPtUmC.setContentAreaFilled(false);
        btPtUmC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtUmCActionPerformed(evt);
            }
        });
        PainelPtUm.add(btPtUmC, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 256, 190, 90));

        btPtUmD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtUmD.setText("O");
        btPtUmD.setContentAreaFilled(false);
        btPtUmD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtUmDActionPerformed(evt);
            }
        });
        PainelPtUm.add(btPtUmD, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 256, 180, 90));

        btPtDica.setText("?");
        btPtDica.setContentAreaFilled(false);
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });
        PainelPtUm.add(btPtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 6, 50, 40));

        btPtMenu.setText("MENU");
        btPtMenu.setContentAreaFilled(false);
        btPtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtMenuActionPerformed(evt);
            }
        });
        PainelPtUm.add(btPtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btPtAvancar.setText("Avançar");
        btPtAvancar.setContentAreaFilled(false);
        btPtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtAvancarActionPerformed(evt);
            }
        });
        PainelPtUm.add(btPtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 351, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelPtUm, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelPtUm, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtUmAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtUmAActionPerformed
         
        pontosPt=pontosPt+20;
         System.out.println(""+pontosPt);
        
   
        TelaPtDois.setVisible(true);
      dispose();
    }//GEN-LAST:event_btPtUmAActionPerformed

    private void btPtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDicaActionPerformed
      JOptionPane.showMessageDialog(null,"As vogais são A, E, I, O, U");
    }//GEN-LAST:event_btPtDicaActionPerformed

    private void btPtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btPtMenuActionPerformed

    private void btPtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtAvancarActionPerformed
        pontosPt=0;
        TelaPtDois.setVisible(true);
        dispose();
    }//GEN-LAST:event_btPtAvancarActionPerformed

    private void btPtUmBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtUmBActionPerformed
     pontosPt=pontosPt-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btPtUmBActionPerformed

    private void btPtUmDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtUmDActionPerformed
    pontosPt=pontosPt-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btPtUmDActionPerformed

    private void btPtUmCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtUmCActionPerformed
      pontosPt=pontosPt-5;  // TODO add your handling code here:
    }//GEN-LAST:event_btPtUmCActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtUm;
    private javax.swing.JButton btPtAvancar;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btPtMenu;
    private javax.swing.JButton btPtUmA;
    private javax.swing.JButton btPtUmB;
    private javax.swing.JButton btPtUmC;
    private javax.swing.JButton btPtUmD;
    private javax.swing.JLabel jlPtUm;
    // End of variables declaration//GEN-END:variables

/**
         * Método que inicia a contagem dos pontos do jogo Português;
         * Insere os valores iniciais da pontuação no banco de dados
         */
   public void iniciaPontuacaoPt()
   {
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            stm.executeUpdate("INSERT into jogos (q1,q2,q3,q4,q5,q6,q7,q8,q9,q10) values ("+pontosPt+","+0+","+0+","+0+","+0+","+0+","+0+","+0+","+0+","+0+")");
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
   }
}
