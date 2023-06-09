
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
public class QESeis extends javax.swing.JFrame {
    private QESete TelaQESete;
    int pontosQE = PontosAluno.getPontosQE();
      int idAluno=0;

    /**
     * Método construtor da classe QESeis
     */
    public QESeis() {
        initComponents();
        TelaQESete = new QESete();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQESeis = new javax.swing.JPanel();
        jlQESeis = new javax.swing.JLabel();
        btQESeisA = new javax.swing.JButton();
        btQESeisB = new javax.swing.JButton();
        btQESeisC = new javax.swing.JButton();
        btQESeisD = new javax.swing.JButton();
        btQEAvancar = new javax.swing.JButton();
        btQEMenu = new javax.swing.JButton();
        btQEVoltar = new javax.swing.JButton();
        btQEDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQESeis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQESeis.setBackground(new java.awt.Color(255, 255, 255));
        jlQESeis.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQESeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QESeis.png"))); // NOI18N
        PainelQESeis.add(jlQESeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQESeisA.setBackground(new java.awt.Color(255, 102, 153));
        btQESeisA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQESeisA.setContentAreaFilled(false);
        btQESeisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeisAActionPerformed(evt);
            }
        });
        PainelQESeis.add(btQESeisA, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 138, 190, 80));

        btQESeisB.setBackground(new java.awt.Color(255, 255, 153));
        btQESeisB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQESeisB.setContentAreaFilled(false);
        btQESeisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeisBActionPerformed(evt);
            }
        });
        PainelQESeis.add(btQESeisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 138, 180, 80));

        btQESeisC.setBackground(new java.awt.Color(153, 255, 204));
        btQESeisC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQESeisC.setContentAreaFilled(false);
        btQESeisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeisCActionPerformed(evt);
            }
        });
        PainelQESeis.add(btQESeisC, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 258, 190, 80));

        btQESeisD.setBackground(new java.awt.Color(255, 153, 102));
        btQESeisD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQESeisD.setContentAreaFilled(false);
        btQESeisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQESeisDActionPerformed(evt);
            }
        });
        PainelQESeis.add(btQESeisD, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 258, 180, 80));

        btQEAvancar.setText("AVANÇAR");
        btQEAvancar.setContentAreaFilled(false);
        btQEAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEAvancarActionPerformed(evt);
            }
        });
        PainelQESeis.add(btQEAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 344, -1, 50));

        btQEMenu.setText("MENU");
        btQEMenu.setContentAreaFilled(false);
        btQEMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEMenuActionPerformed(evt);
            }
        });
        PainelQESeis.add(btQEMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQEVoltar.setText("Voltar");
        btQEVoltar.setContentAreaFilled(false);
        btQEVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEVoltarActionPerformed(evt);
            }
        });
        PainelQESeis.add(btQEVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btQEDica.setText("?");
        btQEDica.setContentAreaFilled(false);
        btQEDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDicaActionPerformed(evt);
            }
        });
        PainelQESeis.add(btQEDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQESeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQESeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQESeisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeisAActionPerformed
    JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
    pontosQE=pontosQE-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btQESeisAActionPerformed

    private void btQESeisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeisDActionPerformed

     pontosQE=pontosQE+20;
        System.out.println(""+pontosQE);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * from jogos");
            while(res.next())
            {
                 
                idAluno= res.getInt("idAluno");
            }
            stm.executeUpdate("UPDATE jogos set q6="+pontosQE+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQESete.setVisible(true);
     dispose();  
    }//GEN-LAST:event_btQESeisDActionPerformed

    private void btQESeisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeisCActionPerformed
    JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
    pontosQE=pontosQE-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btQESeisCActionPerformed

    private void btQESeisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQESeisBActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
      pontosQE=pontosQE-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btQESeisBActionPerformed

    private void btQEAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEAvancarActionPerformed
         TelaQESete.setVisible(true);
     dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_btQEAvancarActionPerformed

    private void btQEMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEMenuActionPerformed

    private void btQEVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEVoltarActionPerformed
new QECinco().show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btQEVoltarActionPerformed

    private void btQEDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDicaActionPerformed
        JOptionPane.showMessageDialog(null,"É a cor do entardecer!");
    }//GEN-LAST:event_btQEDicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQESeis;
    private javax.swing.JButton btQEAvancar;
    private javax.swing.JButton btQEDica;
    private javax.swing.JButton btQEMenu;
    private javax.swing.JButton btQESeisA;
    private javax.swing.JButton btQESeisB;
    private javax.swing.JButton btQESeisC;
    private javax.swing.JButton btQESeisD;
    private javax.swing.JButton btQEVoltar;
    private javax.swing.JLabel jlQESeis;
    // End of variables declaration//GEN-END:variables
}
