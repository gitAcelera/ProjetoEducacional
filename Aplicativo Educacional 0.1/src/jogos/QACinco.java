
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
public class QACinco extends javax.swing.JFrame {
    private QASeis TelaQASeis;
int pontosQA = PontosAluno.getPontosQA();
      int idAluno=0;
    /**
     * Método construtor da classe QACinco
     */
    public QACinco() {
        initComponents();
        TelaQASeis = new QASeis();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQACinco = new javax.swing.JPanel();
        jlQACinco = new javax.swing.JLabel();
        btQACincoA = new javax.swing.JButton();
        btQACincoB = new javax.swing.JButton();
        btQACincoC = new javax.swing.JButton();
        btQACincoD = new javax.swing.JButton();
        btQAMenu = new javax.swing.JButton();
        btQAAvancar = new javax.swing.JButton();
        btQAVoltar = new javax.swing.JButton();
        btQADica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PainelQACinco.setMaximumSize(new java.awt.Dimension(700, 400));
        PainelQACinco.setMinimumSize(new java.awt.Dimension(700, 400));
        PainelQACinco.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelQACinco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQACinco.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQACinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QACinco.png"))); // NOI18N
        PainelQACinco.add(jlQACinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        btQACincoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQACincoA.setText("CACHORRO");
        btQACincoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQACincoAActionPerformed(evt);
            }
        });
        PainelQACinco.add(btQACincoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 133, 180, 90));

        btQACincoB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQACincoB.setText("MACACO");
        btQACincoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQACincoBActionPerformed(evt);
            }
        });
        PainelQACinco.add(btQACincoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 143, 180, 80));

        btQACincoC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQACincoC.setText("LEOPARDO");
        btQACincoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQACincoCActionPerformed(evt);
            }
        });
        PainelQACinco.add(btQACincoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 263, 190, 80));

        btQACincoD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQACincoD.setText("LEÃO");
        btQACincoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQACincoDActionPerformed(evt);
            }
        });
        PainelQACinco.add(btQACincoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 263, 180, 80));

        btQAMenu.setText("MENU");
        btQAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAMenuActionPerformed(evt);
            }
        });
        PainelQACinco.add(btQAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQAAvancar.setText("AVANÇAR");
        btQAAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAAvancarActionPerformed(evt);
            }
        });
        PainelQACinco.add(btQAAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 344, -1, 50));

        btQAVoltar.setText("Voltar");
        btQAVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAVoltarActionPerformed(evt);
            }
        });
        PainelQACinco.add(btQAVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btQADica.setText("?");
        btQADica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADicaActionPerformed(evt);
            }
        });
        PainelQACinco.add(btQADica, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 6, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQACinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQACinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQACincoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQACincoDActionPerformed
      pontosQA=pontosQA+20;
        System.out.println(""+pontosQA);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * from jogos");
            while(res.next())
            {
                 
                idAluno= res.getInt("idAluno");
            }
            stm.executeUpdate("UPDATE jogos set q5="+pontosQA+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQASeis.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQACincoDActionPerformed

    private void btQACincoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQACincoAActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
      pontosQA=pontosQA-5;       // TODO add your handling code here:
    }//GEN-LAST:event_btQACincoAActionPerformed

    private void btQACincoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQACincoBActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosQA=pontosQA-5;       // TODO add your handling code here:
    }//GEN-LAST:event_btQACincoBActionPerformed

    private void btQACincoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQACincoCActionPerformed
       JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
       pontosQA=pontosQA-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btQACincoCActionPerformed

    private void btQAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQAMenuActionPerformed

    private void btQAAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAAvancarActionPerformed
        TelaQASeis.setVisible(true);
      dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_btQAAvancarActionPerformed

    private void btQAVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAVoltarActionPerformed
        new QAQuatro().show();
        dispose();
    }//GEN-LAST:event_btQAVoltarActionPerformed

    private void btQADicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADicaActionPerformed
        JOptionPane.showMessageDialog(null,"Esse animal possui uma grande juba!");
    }//GEN-LAST:event_btQADicaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQACinco;
    private javax.swing.JButton btQAAvancar;
    private javax.swing.JButton btQACincoA;
    private javax.swing.JButton btQACincoB;
    private javax.swing.JButton btQACincoC;
    private javax.swing.JButton btQACincoD;
    private javax.swing.JButton btQADica;
    private javax.swing.JButton btQAMenu;
    private javax.swing.JButton btQAVoltar;
    private javax.swing.JLabel jlQACinco;
    // End of variables declaration//GEN-END:variables
}
