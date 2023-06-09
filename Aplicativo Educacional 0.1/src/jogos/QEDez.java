
package jogos;

import Dados.PontosAluno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class QEDez extends javax.swing.JFrame {
    int pontosQE = PontosAluno.getPontosQE();
      int idAluno=0;
       Integer total=null;
    
    /**
     * Método construtor da classe "QEDez"
     */
    public QEDez() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQEDez = new javax.swing.JPanel();
        jlQEDez = new javax.swing.JLabel();
        btQEDezA = new javax.swing.JButton();
        btQEDezB = new javax.swing.JButton();
        btQEDezC = new javax.swing.JButton();
        btQEDezD = new javax.swing.JButton();
        btQEMenu = new javax.swing.JButton();
        btQEVoltar = new javax.swing.JButton();
        btQEDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PainelQEDez.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelQEDez.setRequestFocusEnabled(false);
        PainelQEDez.setVerifyInputWhenFocusTarget(false);
        PainelQEDez.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlQEDez.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQEDez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QEDez.png"))); // NOI18N
        PainelQEDez.add(jlQEDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btQEDezA.setBackground(new java.awt.Color(255, 102, 153));
        btQEDezA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDezA.setContentAreaFilled(false);
        btQEDezA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDezAActionPerformed(evt);
            }
        });
        PainelQEDez.add(btQEDezA, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 135, 180, 90));

        btQEDezB.setBackground(new java.awt.Color(51, 153, 255));
        btQEDezB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDezB.setContentAreaFilled(false);
        btQEDezB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDezBActionPerformed(evt);
            }
        });
        PainelQEDez.add(btQEDezB, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 135, 190, 90));

        btQEDezC.setBackground(new java.awt.Color(255, 102, 255));
        btQEDezC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDezC.setContentAreaFilled(false);
        btQEDezC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDezCActionPerformed(evt);
            }
        });
        PainelQEDez.add(btQEDezC, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 255, 190, 90));

        btQEDezD.setBackground(new java.awt.Color(153, 255, 153));
        btQEDezD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDezD.setContentAreaFilled(false);
        btQEDezD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDezDActionPerformed(evt);
            }
        });
        PainelQEDez.add(btQEDezD, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 255, 180, 90));

        btQEMenu.setText("MENU");
        btQEMenu.setContentAreaFilled(false);
        btQEMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEMenuActionPerformed(evt);
            }
        });
        PainelQEDez.add(btQEMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btQEVoltar.setText("Voltar");
        btQEVoltar.setContentAreaFilled(false);
        btQEVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEVoltarActionPerformed(evt);
            }
        });
        PainelQEDez.add(btQEVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

        btQEDica.setText("?");
        btQEDica.setContentAreaFilled(false);
        btQEDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDicaActionPerformed(evt);
            }
        });
        PainelQEDez.add(btQEDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEDez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEDez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQEDezBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDezBActionPerformed
pontosQE=pontosQE+20;
        System.out.println(""+pontosQE);
        somarPontuacaoQE();
        new menuPrincipal().show();
        dispose();       
    }//GEN-LAST:event_btQEDezBActionPerformed

    private void btQEDezAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDezAActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
      pontosQE=pontosQE-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btQEDezAActionPerformed

    private void btQEDezCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDezCActionPerformed
      JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
      pontosQE=pontosQE-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btQEDezCActionPerformed

    private void btQEDezDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDezDActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
     pontosQE=pontosQE-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btQEDezDActionPerformed

    private void btQEMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEMenuActionPerformed

    private void btQEVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEVoltarActionPerformed
new QENove().show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btQEVoltarActionPerformed

    private void btQEDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDicaActionPerformed
        JOptionPane.showMessageDialog(null,"É a mesma cor da água da piscina em um dia ensolarado!");
    }//GEN-LAST:event_btQEDicaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQEDez;
    private javax.swing.JButton btQEDezA;
    private javax.swing.JButton btQEDezB;
    private javax.swing.JButton btQEDezC;
    private javax.swing.JButton btQEDezD;
    private javax.swing.JButton btQEDica;
    private javax.swing.JButton btQEMenu;
    private javax.swing.JButton btQEVoltar;
    private javax.swing.JLabel jlQEDez;
    // End of variables declaration//GEN-END:variables
 
    /**
     * Método responsável pela soma de pontuação do jogo Qual é a cor;
     * Ocorre a soma de todas as questões, é salva no banco e apresentada ao aluno
     */ 
    
    
    public void somarPontuacaoQE()
    {
        System.out.println(""+pontosQE);
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
           stm.executeUpdate("UPDATE jogos set q10="+pontosQE+" WHERE idAluno="+idAluno);
          
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
