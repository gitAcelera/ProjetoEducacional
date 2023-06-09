
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
public class PtOito extends javax.swing.JFrame {
    private PtNove TelaPtNove;
     int pontosPt = PontosAluno.getPontosPt();
       int idAluno=0;
    /**
     * Método construtor da classe PtOito
     */
    public PtOito() {
        initComponents();
        TelaPtNove = new PtNove();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPtOito = new javax.swing.JPanel();
        jlPtOito = new javax.swing.JLabel();
        btPtOitoA = new javax.swing.JButton();
        btPtOitoB = new javax.swing.JButton();
        btPtOitoC = new javax.swing.JButton();
        btPtOitoD = new javax.swing.JButton();
        btPtMenu = new javax.swing.JButton();
        btPtDica = new javax.swing.JButton();
        btPtAvancar = new javax.swing.JButton();
        btPtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);

        PainelPtOito.setRequestFocusEnabled(false);
        PainelPtOito.setVerifyInputWhenFocusTarget(false);
        PainelPtOito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPtOito.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtOito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PtOito.png"))); // NOI18N
        PainelPtOito.add(jlPtOito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btPtOitoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtOitoA.setText("CABELELEIRO");
        btPtOitoA.setContentAreaFilled(false);
        btPtOitoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtOitoAActionPerformed(evt);
            }
        });
        PainelPtOito.add(btPtOitoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 135, 180, 90));

        btPtOitoB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtOitoB.setText("CROCANTE");
        btPtOitoB.setContentAreaFilled(false);
        btPtOitoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtOitoBActionPerformed(evt);
            }
        });
        PainelPtOito.add(btPtOitoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 135, 190, 90));

        btPtOitoC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtOitoC.setText("OMEM");
        btPtOitoC.setContentAreaFilled(false);
        btPtOitoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtOitoCActionPerformed(evt);
            }
        });
        PainelPtOito.add(btPtOitoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 255, 180, 90));

        btPtOitoD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtOitoD.setText("ABITATI");
        btPtOitoD.setContentAreaFilled(false);
        btPtOitoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtOitoDActionPerformed(evt);
            }
        });
        PainelPtOito.add(btPtOitoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 255, 180, 90));

        btPtMenu.setText("MENU");
        btPtMenu.setContentAreaFilled(false);
        btPtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtMenuActionPerformed(evt);
            }
        });
        PainelPtOito.add(btPtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btPtDica.setText("?");
        btPtDica.setContentAreaFilled(false);
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });
        PainelPtOito.add(btPtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        btPtAvancar.setText("Avançar");
        btPtAvancar.setContentAreaFilled(false);
        btPtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtAvancarActionPerformed(evt);
            }
        });
        PainelPtOito.add(btPtAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 345, 90, 50));

        btPtVoltar.setText("Voltar");
        btPtVoltar.setContentAreaFilled(false);
        btPtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtVoltarActionPerformed(evt);
            }
        });
        PainelPtOito.add(btPtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 355, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(PainelPtOito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtOito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtOitoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtOitoBActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q8="+pontosPt+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaPtNove.setVisible(true);
      dispose();
    }//GEN-LAST:event_btPtOitoBActionPerformed

    private void btPtOitoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtOitoAActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosPt=pontosPt-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btPtOitoAActionPerformed

    private void btPtOitoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtOitoCActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
      pontosPt=pontosPt-5;  // TODO add your handling code here:
    }//GEN-LAST:event_btPtOitoCActionPerformed

    private void btPtOitoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtOitoDActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosPt=pontosPt-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btPtOitoDActionPerformed

    private void btPtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btPtMenuActionPerformed

    private void btPtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Olhe atentamente e veja se a palavra possui um erro de escrita");
    }//GEN-LAST:event_btPtDicaActionPerformed

    private void btPtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtAvancarActionPerformed
  pontosPt=0;
        System.out.println(""+pontosPt);
        TelaPtNove.setVisible(true);
        dispose();
    }//GEN-LAST:event_btPtAvancarActionPerformed

    private void btPtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtVoltarActionPerformed
        new PtSete ().show();
        dispose();
    }//GEN-LAST:event_btPtVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtOito;
    private javax.swing.JButton btPtAvancar;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btPtMenu;
    private javax.swing.JButton btPtOitoA;
    private javax.swing.JButton btPtOitoB;
    private javax.swing.JButton btPtOitoC;
    private javax.swing.JButton btPtOitoD;
    private javax.swing.JButton btPtVoltar;
    private javax.swing.JLabel jlPtOito;
    // End of variables declaration//GEN-END:variables
}
