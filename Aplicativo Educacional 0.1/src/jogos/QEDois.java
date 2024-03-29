
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
public class QEDois extends javax.swing.JFrame {
    private QETres TelaQETres;
    int pontosQE = PontosAluno.getPontosQE();
      int idAluno=0;

    /**
     * Método construtor da classe QEDois
     */
    public QEDois() {
        initComponents();
        TelaQETres = new QETres();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQEDois = new javax.swing.JPanel();
        jlQEDois = new javax.swing.JLabel();
        btQEDoisA = new javax.swing.JButton();
        btQEDoisB = new javax.swing.JButton();
        btQEDoisC = new javax.swing.JButton();
        btQEDoisD = new javax.swing.JButton();
        btQEAvancar = new javax.swing.JButton();
        btQEMenu = new javax.swing.JButton();
        btQEVoltar = new javax.swing.JButton();
        btQEDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQEDois.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQEDois.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQEDois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QEDois.png"))); // NOI18N
        PainelQEDois.add(jlQEDois, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQEDoisA.setBackground(new java.awt.Color(255, 0, 0));
        btQEDoisA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDoisA.setContentAreaFilled(false);
        btQEDoisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDoisAActionPerformed(evt);
            }
        });
        PainelQEDois.add(btQEDoisA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 136, 180, 90));

        btQEDoisB.setBackground(new java.awt.Color(255, 255, 0));
        btQEDoisB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDoisB.setContentAreaFilled(false);
        btQEDoisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDoisBActionPerformed(evt);
            }
        });
        PainelQEDois.add(btQEDoisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 136, 180, 90));

        btQEDoisC.setBackground(new java.awt.Color(0, 102, 255));
        btQEDoisC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDoisC.setContentAreaFilled(false);
        btQEDoisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDoisCActionPerformed(evt);
            }
        });
        PainelQEDois.add(btQEDoisC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 256, 180, 90));

        btQEDoisD.setBackground(new java.awt.Color(0, 153, 0));
        btQEDoisD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDoisD.setContentAreaFilled(false);
        btQEDoisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDoisDActionPerformed(evt);
            }
        });
        PainelQEDois.add(btQEDoisD, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 256, 180, 90));

        btQEAvancar.setText("AVANÇAR");
        btQEAvancar.setContentAreaFilled(false);
        btQEAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEAvancarActionPerformed(evt);
            }
        });
        PainelQEDois.add(btQEAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 344, 80, 50));

        btQEMenu.setText("MENU");
        btQEMenu.setContentAreaFilled(false);
        btQEMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEMenuActionPerformed(evt);
            }
        });
        PainelQEDois.add(btQEMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQEVoltar.setText("Voltar");
        btQEVoltar.setContentAreaFilled(false);
        btQEVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEVoltarActionPerformed(evt);
            }
        });
        PainelQEDois.add(btQEVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btQEDica.setText("?");
        btQEDica.setContentAreaFilled(false);
        btQEDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDicaActionPerformed(evt);
            }
        });
        PainelQEDois.add(btQEDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQEDoisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDoisBActionPerformed
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
            stm.executeUpdate("UPDATE jogos set q2="+pontosQE+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }   
        TelaQETres.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQEDoisBActionPerformed

    private void btQEDoisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDoisAActionPerformed
  JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
  pontosQE=pontosQE-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btQEDoisAActionPerformed

    private void btQEDoisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDoisCActionPerformed
   JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
   pontosQE=pontosQE-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btQEDoisCActionPerformed

    private void btQEDoisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDoisDActionPerformed
 JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosQE=pontosQE-5;        // TODO add your handling code here:
    }//GEN-LAST:event_btQEDoisDActionPerformed

    private void btQEMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEMenuActionPerformed

    private void btQEAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEAvancarActionPerformed
       TelaQETres.setVisible(true);
      dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btQEAvancarActionPerformed

    private void btQEVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEVoltarActionPerformed
        new QEUm().show();
        dispose();
    }//GEN-LAST:event_btQEVoltarActionPerformed

    private void btQEDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Essa cor é uma cor clara e brilhante!");
    }//GEN-LAST:event_btQEDicaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQEDois;
    private javax.swing.JButton btQEAvancar;
    private javax.swing.JButton btQEDica;
    private javax.swing.JButton btQEDoisA;
    private javax.swing.JButton btQEDoisB;
    private javax.swing.JButton btQEDoisC;
    private javax.swing.JButton btQEDoisD;
    private javax.swing.JButton btQEMenu;
    private javax.swing.JButton btQEVoltar;
    private javax.swing.JLabel jlQEDois;
    // End of variables declaration//GEN-END:variables
}
