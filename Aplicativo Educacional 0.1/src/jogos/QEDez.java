/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
 * @author fellr
 */
public class QEDez extends javax.swing.JFrame {
    int pontosQE = PontosAluno.getPontosQE();
      int idAluno=0;
       Integer total=null;
    
    /**
     * Creates new form QEDez
     */
    public QEDez() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQEDez = new javax.swing.JPanel();
        jlQEDezA = new javax.swing.JLabel();
        btQEDezA = new javax.swing.JButton();
        btQEDezB = new javax.swing.JButton();
        btQEDezC = new javax.swing.JButton();
        btQEDezD = new javax.swing.JButton();
        btQEDezMenu = new javax.swing.JButton();
        btVoltarQE = new javax.swing.JButton();
        btPtDica2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);

        PainelQEDez.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelQEDez.setRequestFocusEnabled(false);
        PainelQEDez.setVerifyInputWhenFocusTarget(false);

        jlQEDezA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQEDezA.setText("Qual é a cor do mar?");

        btQEDezA.setBackground(new java.awt.Color(255, 102, 153));
        btQEDezA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDezA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDezAActionPerformed(evt);
            }
        });

        btQEDezB.setBackground(new java.awt.Color(51, 153, 255));
        btQEDezB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDezB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDezBActionPerformed(evt);
            }
        });

        btQEDezC.setBackground(new java.awt.Color(255, 102, 255));
        btQEDezC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDezC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDezCActionPerformed(evt);
            }
        });

        btQEDezD.setBackground(new java.awt.Color(153, 255, 153));
        btQEDezD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEDezD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDezDActionPerformed(evt);
            }
        });

        btQEDezMenu.setText("MENU");
        btQEDezMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEDezMenuActionPerformed(evt);
            }
        });

        btVoltarQE.setText("Voltar");
        btVoltarQE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarQEActionPerformed(evt);
            }
        });

        btPtDica2.setText("?");
        btPtDica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDica2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelQEDezLayout = new javax.swing.GroupLayout(PainelQEDez);
        PainelQEDez.setLayout(PainelQEDezLayout);
        PainelQEDezLayout.setHorizontalGroup(
            PainelQEDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQEDezLayout.createSequentialGroup()
                .addGroup(PainelQEDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQEDezLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btQEDezMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btPtDica2))
                    .addGroup(PainelQEDezLayout.createSequentialGroup()
                        .addGroup(PainelQEDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelQEDezLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btVoltarQE))
                            .addGroup(PainelQEDezLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jlQEDezA)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQEDezLayout.createSequentialGroup()
                .addGap(0, 131, Short.MAX_VALUE)
                .addGroup(PainelQEDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PainelQEDezLayout.createSequentialGroup()
                        .addComponent(btQEDezC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btQEDezD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelQEDezLayout.createSequentialGroup()
                        .addComponent(btQEDezA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btQEDezB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(127, 127, 127))
        );
        PainelQEDezLayout.setVerticalGroup(
            PainelQEDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQEDezLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelQEDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPtDica2)
                    .addComponent(btQEDezMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jlQEDezA)
                .addGap(35, 35, 35)
                .addGroup(PainelQEDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQEDezA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQEDezB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelQEDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQEDezC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQEDezD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btVoltarQE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEDez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQEDez, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQEDezBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDezBActionPerformed
pontosQE=pontosQE+20;
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
        }
        
        
        catch(Exception ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
	}
	
        new menuPrincipal().show();
        dispose();       
    }//GEN-LAST:event_btQEDezBActionPerformed

    private void btQEDezAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDezAActionPerformed
      pontosQE=pontosQE-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btQEDezAActionPerformed

    private void btQEDezCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDezCActionPerformed
      pontosQE=pontosQE-5;   // TODO add your handling code here:
    }//GEN-LAST:event_btQEDezCActionPerformed

    private void btQEDezDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDezDActionPerformed
     pontosQE=pontosQE-5;    // TODO add your handling code here:
    }//GEN-LAST:event_btQEDezDActionPerformed

    private void btQEDezMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEDezMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btQEDezMenuActionPerformed

    private void btVoltarQEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarQEActionPerformed
new QENove().show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarQEActionPerformed

    private void btPtDica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDica2ActionPerformed
        JOptionPane.showMessageDialog(null,"É a mesma cor da água da piscina em um dia ensolarado!");
    }//GEN-LAST:event_btPtDica2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQEDez;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btPtDica1;
    private javax.swing.JButton btPtDica2;
    private javax.swing.JButton btQEDezA;
    private javax.swing.JButton btQEDezB;
    private javax.swing.JButton btQEDezC;
    private javax.swing.JButton btQEDezD;
    private javax.swing.JButton btQEDezMenu;
    private javax.swing.JButton btVoltarQE;
    private javax.swing.JLabel jlQEDezA;
    // End of variables declaration//GEN-END:variables
}
