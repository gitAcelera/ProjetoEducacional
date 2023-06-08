
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
public class PtDois extends javax.swing.JFrame {
     private PtTres TelaPtTres;
     int pontosPt = PontosAluno.getPontosPt();
     int idAluno=0;
    /**
     * Método construtor da classe PtDois
     */
    public PtDois() {
        initComponents();
        TelaPtTres = new PtTres();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPtDois = new javax.swing.JPanel();
        jlPtUm = new javax.swing.JLabel();
        btPtDoisA = new javax.swing.JButton();
        btPtDoisB = new javax.swing.JButton();
        btPtDoisC = new javax.swing.JButton();
        btPtDoisD = new javax.swing.JButton();
        btPtMenu = new javax.swing.JButton();
        btPtDica = new javax.swing.JButton();
        btPtAvancar = new javax.swing.JButton();
        btPtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 420));
        setResizable(false);

        PainelPtDois.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPtUm.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtUm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PtDois.png"))); // NOI18N
        jlPtUm.setRequestFocusEnabled(false);
        jlPtUm.setVerifyInputWhenFocusTarget(false);
        PainelPtDois.add(jlPtUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btPtDoisA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtDoisA.setText("CACHORRUZ");
        btPtDoisA.setContentAreaFilled(false);
        btPtDoisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDoisAActionPerformed(evt);
            }
        });
        PainelPtDois.add(btPtDoisA, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 139, 180, 80));

        btPtDoisB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtDoisB.setText("CACHORROZ");
        btPtDoisB.setContentAreaFilled(false);
        btPtDoisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDoisBActionPerformed(evt);
            }
        });
        PainelPtDois.add(btPtDoisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 139, 180, 80));

        btPtDoisC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtDoisC.setText("CACHORROS");
        btPtDoisC.setContentAreaFilled(false);
        btPtDoisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDoisCActionPerformed(evt);
            }
        });
        PainelPtDois.add(btPtDoisC, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 259, 180, 80));

        btPtDoisD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtDoisD.setText("CACHORRUS");
        btPtDoisD.setContentAreaFilled(false);
        btPtDoisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDoisDActionPerformed(evt);
            }
        });
        PainelPtDois.add(btPtDoisD, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 259, 190, 80));

        btPtMenu.setText("MENU");
        btPtMenu.setContentAreaFilled(false);
        btPtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtMenuActionPerformed(evt);
            }
        });
        PainelPtDois.add(btPtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btPtDica.setText("?");
        btPtDica.setContentAreaFilled(false);
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });
        PainelPtDois.add(btPtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        btPtAvancar.setText("Avançar");
        btPtAvancar.setContentAreaFilled(false);
        btPtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtAvancarActionPerformed(evt);
            }
        });
        PainelPtDois.add(btPtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 348, 90, 40));

        btPtVoltar.setText("Voltar");
        btPtVoltar.setContentAreaFilled(false);
        btPtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtVoltarActionPerformed(evt);
            }
        });
        PainelPtDois.add(btPtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 348, 80, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtDois, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelPtDois, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtDoisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDoisCActionPerformed
      pontosPt=pontosPt+20;
        System.out.println(""+pontosPt);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * from jogos");
            while(res.next())
            {
                 //idNew=("SELECT MAX(idAluno) AS idAluno FROM jogos");
                idAluno= res.getInt("idAluno");
            }
            stm.executeUpdate("UPDATE jogos set q2="+pontosPt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaPtTres.setVisible(true);
      dispose();
    }//GEN-LAST:event_btPtDoisCActionPerformed

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
        TelaPtTres.setVisible(true);
        dispose();
    }//GEN-LAST:event_btPtAvancarActionPerformed

    private void btPtDoisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDoisAActionPerformed
pontosPt=pontosPt-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btPtDoisAActionPerformed

    private void btPtDoisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDoisBActionPerformed
pontosPt=pontosPt-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btPtDoisBActionPerformed

    private void btPtDoisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDoisDActionPerformed
pontosPt=pontosPt-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btPtDoisDActionPerformed

    private void btPtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtVoltarActionPerformed
        new PtUm ().show();
        dispose();
    }//GEN-LAST:event_btPtVoltarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtDois;
    private javax.swing.JButton btPtAvancar;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btPtDoisA;
    private javax.swing.JButton btPtDoisB;
    private javax.swing.JButton btPtDoisC;
    private javax.swing.JButton btPtDoisD;
    private javax.swing.JButton btPtMenu;
    private javax.swing.JButton btPtVoltar;
    private javax.swing.JLabel jlPtUm;
    // End of variables declaration//GEN-END:variables
}
