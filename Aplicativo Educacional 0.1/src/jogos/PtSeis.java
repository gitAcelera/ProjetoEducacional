
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
public class PtSeis extends javax.swing.JFrame {
    private PtSete TelaPtSete;
    int pontosPt = PontosAluno.getPontosPt();
       int idAluno=0;
    /**
     * Método construtor da classe PtSeis
     */
    public PtSeis() {
        initComponents();
        TelaPtSete = new PtSete();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPtSeis = new javax.swing.JPanel();
        jlPtSeis = new javax.swing.JLabel();
        btPtSeisA = new javax.swing.JButton();
        btPtSeisB = new javax.swing.JButton();
        btPtSeisC = new javax.swing.JButton();
        btPtSeisD = new javax.swing.JButton();
        btPtMenu = new javax.swing.JButton();
        btPtDica = new javax.swing.JButton();
        btPtAvancar = new javax.swing.JButton();
        btPtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setFocusableWindowState(false);
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);

        PainelPtSeis.setMaximumSize(new java.awt.Dimension(700, 400));
        PainelPtSeis.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelPtSeis.setRequestFocusEnabled(false);
        PainelPtSeis.setVerifyInputWhenFocusTarget(false);
        PainelPtSeis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPtSeis.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PtSeis.png"))); // NOI18N
        PainelPtSeis.add(jlPtSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btPtSeisA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtSeisA.setText("BA-NANA");
        btPtSeisA.setContentAreaFilled(false);
        btPtSeisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtSeisAActionPerformed(evt);
            }
        });
        PainelPtSeis.add(btPtSeisA, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 140, 190, 80));

        btPtSeisB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtSeisB.setText("BA-NA-N-A");
        btPtSeisB.setContentAreaFilled(false);
        btPtSeisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtSeisBActionPerformed(evt);
            }
        });
        PainelPtSeis.add(btPtSeisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 140, 180, 80));

        btPtSeisC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtSeisC.setText("BA-NAN-A");
        btPtSeisC.setContentAreaFilled(false);
        btPtSeisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtSeisCActionPerformed(evt);
            }
        });
        PainelPtSeis.add(btPtSeisC, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 260, 180, 80));

        btPtSeisD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtSeisD.setText("BA-NA-NA");
        btPtSeisD.setContentAreaFilled(false);
        btPtSeisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtSeisDActionPerformed(evt);
            }
        });
        PainelPtSeis.add(btPtSeisD, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 260, 180, 80));

        btPtMenu.setText("MENU");
        btPtMenu.setContentAreaFilled(false);
        btPtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtMenuActionPerformed(evt);
            }
        });
        PainelPtSeis.add(btPtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        btPtDica.setText("?");
        btPtDica.setContentAreaFilled(false);
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });
        PainelPtSeis.add(btPtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 6, 40, 40));

        btPtAvancar.setText("Avançar");
        btPtAvancar.setContentAreaFilled(false);
        btPtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtAvancarActionPerformed(evt);
            }
        });
        PainelPtSeis.add(btPtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 354, -1, 40));

        btPtVoltar.setText("Voltar");
        btPtVoltar.setContentAreaFilled(false);
        btPtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtVoltarActionPerformed(evt);
            }
        });
        PainelPtSeis.add(btPtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(PainelPtSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(PainelPtSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtSeisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtSeisCActionPerformed

         JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
         pontosPt=pontosPt-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btPtSeisCActionPerformed

    private void btPtSeisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtSeisDActionPerformed
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
           stm.executeUpdate("UPDATE jogos set q6="+pontosPt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaPtSete.setVisible(true);
      dispose();
    }//GEN-LAST:event_btPtSeisDActionPerformed

    private void btPtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btPtMenuActionPerformed

    private void btPtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Exemplos de separação silábica: BO-CA,CO-RA-ÇÃO,A-MI-ZA-DE");
    }//GEN-LAST:event_btPtDicaActionPerformed

    private void btPtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtAvancarActionPerformed
  pontosPt=0;
        TelaPtSete.setVisible(true);
        dispose();
        System.out.println(""+pontosPt);
    }//GEN-LAST:event_btPtAvancarActionPerformed

    private void btPtSeisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtSeisAActionPerformed
 JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosPt=pontosPt-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btPtSeisAActionPerformed

    private void btPtSeisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtSeisBActionPerformed
 JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosPt=pontosPt-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btPtSeisBActionPerformed

    private void btPtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtVoltarActionPerformed
        new PtCinco().show();
        dispose();
    }//GEN-LAST:event_btPtVoltarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtSeis;
    private javax.swing.JButton btPtAvancar;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btPtMenu;
    private javax.swing.JButton btPtSeisA;
    private javax.swing.JButton btPtSeisB;
    private javax.swing.JButton btPtSeisC;
    private javax.swing.JButton btPtSeisD;
    private javax.swing.JButton btPtVoltar;
    private javax.swing.JLabel jlPtSeis;
    // End of variables declaration//GEN-END:variables
}
