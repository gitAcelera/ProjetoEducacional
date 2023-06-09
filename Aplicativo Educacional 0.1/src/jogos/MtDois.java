
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
public class MtDois extends javax.swing.JFrame {
 private MtTres TelaMtTres;
 int pontosMt = PontosAluno.getPontosMt();
     int idAluno=0;
    /**
     * Método construtor da classe MtDois
     */
    public MtDois() {
        initComponents();
        TelaMtTres = new MtTres();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtDois = new javax.swing.JPanel();
        jlMtDois = new javax.swing.JLabel();
        btMtDoisA = new javax.swing.JButton();
        btMDoisB = new javax.swing.JButton();
        btMtDoisC = new javax.swing.JButton();
        btMtDoisD = new javax.swing.JButton();
        btMtAvancar = new javax.swing.JButton();
        btMtMenu = new javax.swing.JButton();
        btMtDica = new javax.swing.JButton();
        btMtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelMtDois.setPreferredSize(new java.awt.Dimension(700, 420));
        PainelMtDois.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMtDois.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtDois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MtDois.png"))); // NOI18N
        PainelMtDois.add(jlMtDois, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btMtDoisA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtDoisA.setText("4");
        btMtDoisA.setContentAreaFilled(false);
        btMtDoisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDoisAActionPerformed(evt);
            }
        });
        PainelMtDois.add(btMtDoisA, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 143, 180, 80));

        btMDoisB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMDoisB.setText("16");
        btMDoisB.setContentAreaFilled(false);
        btMDoisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMDoisBActionPerformed(evt);
            }
        });
        PainelMtDois.add(btMDoisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 143, 180, 80));

        btMtDoisC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtDoisC.setText("7");
        btMtDoisC.setContentAreaFilled(false);
        btMtDoisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDoisCActionPerformed(evt);
            }
        });
        PainelMtDois.add(btMtDoisC, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 263, 180, 80));

        btMtDoisD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtDoisD.setText("14");
        btMtDoisD.setContentAreaFilled(false);
        btMtDoisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDoisDActionPerformed(evt);
            }
        });
        PainelMtDois.add(btMtDoisD, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 263, 180, 80));

        btMtAvancar.setText("Avançar");
        btMtAvancar.setContentAreaFilled(false);
        btMtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtAvancarActionPerformed(evt);
            }
        });
        PainelMtDois.add(btMtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 354, -1, 30));

        btMtMenu.setText("MENU");
        btMtMenu.setContentAreaFilled(false);
        btMtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtMenuActionPerformed(evt);
            }
        });
        PainelMtDois.add(btMtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btMtDica.setText("?");
        btMtDica.setContentAreaFilled(false);
        btMtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDicaActionPerformed(evt);
            }
        });
        PainelMtDois.add(btMtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        btMtVoltar.setText("Voltar");
        btMtVoltar.setContentAreaFilled(false);
        btMtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtVoltarActionPerformed(evt);
            }
        });
        PainelMtDois.add(btMtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtDois, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtDoisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDoisAActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosMt=pontosMt-5;   
    }//GEN-LAST:event_btMtDoisAActionPerformed

    private void btMDoisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMDoisBActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q2="+pontosMt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaMtTres.setVisible(true);  
     dispose();
    }//GEN-LAST:event_btMDoisBActionPerformed

    private void btMtDoisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDoisCActionPerformed
    JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosMt=pontosMt-5;   
    }//GEN-LAST:event_btMtDoisCActionPerformed

    private void btMtDoisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDoisDActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosMt=pontosMt-5;   
    }//GEN-LAST:event_btMtDoisDActionPerformed

    private void btMtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtAvancarActionPerformed
        TelaMtTres.setVisible(true);  
     dispose();
    }//GEN-LAST:event_btMtAvancarActionPerformed

    private void btMtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtMenuActionPerformed
         new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btMtMenuActionPerformed

    private void btMtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtVoltarActionPerformed
 new MtUm ().show();
   dispose();     
    }//GEN-LAST:event_btMtVoltarActionPerformed

    private void btMtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"A operação é soma ou seja conte cada unidade na mão!");
    }//GEN-LAST:event_btMtDicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMtDois;
    private javax.swing.JButton btMDoisB;
    private javax.swing.JButton btMtAvancar;
    private javax.swing.JButton btMtDica;
    private javax.swing.JButton btMtDoisA;
    private javax.swing.JButton btMtDoisC;
    private javax.swing.JButton btMtDoisD;
    private javax.swing.JButton btMtMenu;
    private javax.swing.JButton btMtVoltar;
    private javax.swing.JLabel jlMtDois;
    // End of variables declaration//GEN-END:variables
}
