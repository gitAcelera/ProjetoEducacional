
package jogos;

import dados.PontosAluno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import telas.menuPrincipal;

/**
 *
 * @author Felipe
 * Classe responsável pelo jogo Qual é o animal
 */
public class QADez extends javax.swing.JFrame {
int pontosQA = PontosAluno.getPontosQA();
      int idAluno=0;
       Integer total=null;
    /**
     * Método construtor da classe QADez
     */
    public QADez() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQADez = new javax.swing.JPanel();
        jlQADez = new javax.swing.JLabel();
        btQADezA = new javax.swing.JButton();
        btQADezB = new javax.swing.JButton();
        btQADezC = new javax.swing.JButton();
        btQADezD = new javax.swing.JButton();
        btQAMenu = new javax.swing.JButton();
        btQAVoltar = new javax.swing.JButton();
        btQADica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelQADez.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQADez.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQADez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QADez.png"))); // NOI18N
        PainelQADez.add(jlQADez, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQADezA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQADezA.setText("LAGARTO");
        btQADezA.setContentAreaFilled(false);
        btQADezA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADezAActionPerformed(evt);
            }
        });
        PainelQADez.add(btQADezA, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 138, 180, 80));

        btQADezB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQADezB.setText("PEIXE");
        btQADezB.setContentAreaFilled(false);
        btQADezB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADezBActionPerformed(evt);
            }
        });
        PainelQADez.add(btQADezB, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 138, 180, 90));

        btQADezC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQADezC.setText("CANGURU");
        btQADezC.setContentAreaFilled(false);
        btQADezC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADezCActionPerformed(evt);
            }
        });
        PainelQADez.add(btQADezC, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 258, 180, 80));

        btQADezD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQADezD.setText("CABRA");
        btQADezD.setContentAreaFilled(false);
        btQADezD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADezDActionPerformed(evt);
            }
        });
        PainelQADez.add(btQADezD, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 258, 190, 80));

        btQAMenu.setText("MENU");
        btQAMenu.setContentAreaFilled(false);
        btQAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAMenuActionPerformed(evt);
            }
        });
        PainelQADez.add(btQAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQAVoltar.setText("Voltar");
        btQAVoltar.setContentAreaFilled(false);
        btQAVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAVoltarActionPerformed(evt);
            }
        });
        PainelQADez.add(btQAVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 345, 80, 50));

        btQADica.setText("?");
        btQADica.setContentAreaFilled(false);
        btQADica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQADicaActionPerformed(evt);
            }
        });
        PainelQADez.add(btQADica, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 6, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQADez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQADez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQADezBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADezBActionPerformed
     pontosQA=pontosQA+20;
        System.out.println(""+pontosQA);
        somarPontuacaoQA();     
        new menuPrincipal().show();
        dispose();   
    }//GEN-LAST:event_btQADezBActionPerformed

    private void btQADezDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADezDActionPerformed
     pontosQA=pontosQA-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btQADezDActionPerformed

    private void btQADezCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADezCActionPerformed
     pontosQA=pontosQA-5;     // TODO add your handling code here:
    }//GEN-LAST:event_btQADezCActionPerformed

    private void btQADezAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADezAActionPerformed
       pontosQA=pontosQA-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btQADezAActionPerformed

    private void btQAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQAMenuActionPerformed

    private void btQAVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAVoltarActionPerformed
        new QANove().show();
        dispose();
    }//GEN-LAST:event_btQAVoltarActionPerformed

    private void btQADicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQADicaActionPerformed
        JOptionPane.showMessageDialog(null,"Esse animal possui escamas!");
    }//GEN-LAST:event_btQADicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQADez;
    private javax.swing.JButton btQADezA;
    private javax.swing.JButton btQADezB;
    private javax.swing.JButton btQADezC;
    private javax.swing.JButton btQADezD;
    private javax.swing.JButton btQADica;
    private javax.swing.JButton btQAMenu;
    private javax.swing.JButton btQAVoltar;
    private javax.swing.JLabel jlQADez;
    // End of variables declaration//GEN-END:variables

   /**
     * Método responsável pela soma de pontuação do jogo Qual é o animal
     */  
    public void somarPontuacaoQA()
    {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
             ResultSet res = stm.executeQuery("SELECT * from jogos");
            while(res.next())
            {
                
                idAluno= res.getInt("idAluno");
            }
           stm.executeUpdate("UPDATE jogos set q10="+pontosQA+" WHERE idAluno="+idAluno);
          
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }    
        
      
        try
	{
               Class.forName("com.mysql.cj.jdbc.Driver");
               
              
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
              String sql= ("SELECT SUM(q1+q2+q3+q4+q5+q6+q7+q8+q9+q10)FROM jogos WHERE idAluno="+idAluno); 
               PreparedStatement stmt = con.prepareStatement(sql);
               ResultSet res = stmt.executeQuery();
	
		while(res.next())
		{
		  total=res.getInt(1);
                }
        JOptionPane.showMessageDialog(null,"SUA PONTUAÇÃO FOI: "+total+ " PONTOS");
         Statement stm = con.createStatement();
          stm.executeUpdate("INSERT into jogos (total) values ("+total+")");
        }
        
        
        catch(Exception ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
	}
    }
}
