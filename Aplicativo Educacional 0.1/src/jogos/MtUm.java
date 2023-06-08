
package jogos;
import Dados.PontosAluno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import telas.menuPrincipal;
import javax.swing.JOptionPane;
/**
 *Classe responsável pelo jogo Matemática
 * @author Pedro
 *
 */
public class MtUm extends javax.swing.JFrame {
  private MtDois TelaMtDois;
  int pontosMt = PontosAluno.getPontosMt();
  String tipo="matematica";
  int q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
    
       int idAluno=0;
    /**
     * Método construtor da classe  MtUm
     */
    public MtUm() {
        initComponents();
        TelaMtDois = new MtDois();
        q1=q2=q3=q4=q5=q6=q7=q8=q9=q10=0; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtUm = new javax.swing.JPanel();
        jlMtUm = new javax.swing.JLabel();
        btMtUmA = new javax.swing.JButton();
        btMtUmB = new javax.swing.JButton();
        btMtUmC = new javax.swing.JButton();
        btMtUmD = new javax.swing.JButton();
        btMtMenu = new javax.swing.JButton();
        btMtDica = new javax.swing.JButton();
        btMtAvancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 420));

        PainelMtUm.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelMtUm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMtUm.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtUm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MtUm.png"))); // NOI18N
        jlMtUm.setFocusable(false);
        PainelMtUm.add(jlMtUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btMtUmA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtUmA.setText("10");
        btMtUmA.setContentAreaFilled(false);
        btMtUmA.setFocusable(false);
        btMtUmA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtUmAActionPerformed(evt);
            }
        });
        PainelMtUm.add(btMtUmA, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 145, 180, 70));

        btMtUmB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtUmB.setText("8");
        btMtUmB.setContentAreaFilled(false);
        btMtUmB.setFocusable(false);
        btMtUmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtUmBActionPerformed(evt);
            }
        });
        PainelMtUm.add(btMtUmB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 145, 170, 70));

        btMtUmC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtUmC.setText("2");
        btMtUmC.setContentAreaFilled(false);
        btMtUmC.setFocusable(false);
        btMtUmC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtUmCActionPerformed(evt);
            }
        });
        PainelMtUm.add(btMtUmC, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 265, 180, 80));

        btMtUmD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtUmD.setText("12");
        btMtUmD.setContentAreaFilled(false);
        btMtUmD.setFocusable(false);
        btMtUmD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtUmDActionPerformed(evt);
            }
        });
        PainelMtUm.add(btMtUmD, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 265, 170, 70));

        btMtMenu.setText("MENU");
        btMtMenu.setContentAreaFilled(false);
        btMtMenu.setFocusable(false);
        btMtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtMenuActionPerformed(evt);
            }
        });
        PainelMtUm.add(btMtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btMtDica.setText("?");
        btMtDica.setContentAreaFilled(false);
        btMtDica.setFocusable(false);
        btMtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDicaActionPerformed(evt);
            }
        });
        PainelMtUm.add(btMtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        btMtAvancar.setText("Avançar");
        btMtAvancar.setContentAreaFilled(false);
        btMtAvancar.setFocusable(false);
        btMtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtAvancarActionPerformed(evt);
            }
        });
        PainelMtUm.add(btMtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 344, 70, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtUmBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtUmBActionPerformed
pontosMt=pontosMt-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btMtUmBActionPerformed

    private void btMtUmDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtUmDActionPerformed
        pontosMt=pontosMt+20;
        System.out.println(""+pontosMt);
        iniciaPontuacaoMt();
        TelaMtDois.setVisible(true);
        dispose();
    }//GEN-LAST:event_btMtUmDActionPerformed

    private void btMtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtAvancarActionPerformed
        TelaMtDois.setVisible(true);
        dispose();
    }//GEN-LAST:event_btMtAvancarActionPerformed

    private void btMtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btMtMenuActionPerformed

    private void btMtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"A operação é soma ou seja conte cada unidade na mão!");
    }//GEN-LAST:event_btMtDicaActionPerformed

    private void btMtUmAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtUmAActionPerformed
pontosMt=pontosMt-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btMtUmAActionPerformed

    private void btMtUmCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtUmCActionPerformed
pontosMt=pontosMt-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btMtUmCActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMtUm;
    private javax.swing.JButton btMtAvancar;
    private javax.swing.JButton btMtDica;
    private javax.swing.JButton btMtMenu;
    private javax.swing.JButton btMtUmA;
    private javax.swing.JButton btMtUmB;
    private javax.swing.JButton btMtUmC;
    private javax.swing.JButton btMtUmD;
    private javax.swing.JLabel jlMtUm;
    // End of variables declaration//GEN-END:variables

    /**
         * Método que inicia a contagem dos pontos do jogo Matemática;
         * Insere os valores iniciais da pontuação no banco de dados
         */
          public void iniciaPontuacaoMt()
          {
              try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            stm.executeUpdate("INSERT into jogos (q1,q2,q3,q4,q5,q6,q7,q8,q9,q10) values ("+pontosMt+","+q2+","+q3+","+q4+","+q5+","+q6+","+q7+","+q8+","+q9+","+q10+")");
          
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
