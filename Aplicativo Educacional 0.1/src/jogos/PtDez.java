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
public class PtDez extends javax.swing.JFrame {
int pontosPt = PontosAluno.getPontosPt();
       int idAluno=0;
      
    Integer total=null;
    /**
     * Creates new form PtDez
     */
    public PtDez() {
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

        PainelPtDez = new javax.swing.JPanel();
        jlPtDezA = new javax.swing.JLabel();
        jlPtDezB = new javax.swing.JLabel();
        btPtDezA = new javax.swing.JButton();
        btPtDezB = new javax.swing.JButton();
        btPtDezC = new javax.swing.JButton();
        btPtDezD = new javax.swing.JButton();
        btMtUmMenu = new javax.swing.JButton();
        btPtDica = new javax.swing.JButton();
        btVoltarPt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlPtDezA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtDezA.setText("Qual é o semelhante da palavra");

        jlPtDezB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtDezB.setText("\"ALEGRIA\" ?");

        btPtDezA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtDezA.setText("RAIVA");
        btPtDezA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDezAActionPerformed(evt);
            }
        });

        btPtDezB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtDezB.setText("TRISTEZA");
        btPtDezB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDezBActionPerformed(evt);
            }
        });

        btPtDezC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtDezC.setText("FELICIDADE");
        btPtDezC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDezCActionPerformed(evt);
            }
        });

        btPtDezD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtDezD.setText("MEDO");
        btPtDezD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDezDActionPerformed(evt);
            }
        });

        btMtUmMenu.setText("MENU");
        btMtUmMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtUmMenuActionPerformed(evt);
            }
        });

        btPtDica.setText("?");
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });

        btVoltarPt.setText("Voltar");
        btVoltarPt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarPtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelPtDezLayout = new javax.swing.GroupLayout(PainelPtDez);
        PainelPtDez.setLayout(PainelPtDezLayout);
        PainelPtDezLayout.setHorizontalGroup(
            PainelPtDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPtDezLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltarPt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(PainelPtDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPtDezC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPtDezA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(PainelPtDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPtDezB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPtDezD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
            .addGroup(PainelPtDezLayout.createSequentialGroup()
                .addGroup(PainelPtDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPtDezLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jlPtDezB))
                    .addGroup(PainelPtDezLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jlPtDezA)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelPtDezLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btMtUmMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPtDica)
                .addGap(14, 14, 14))
        );
        PainelPtDezLayout.setVerticalGroup(
            PainelPtDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPtDezLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(PainelPtDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMtUmMenu)
                    .addComponent(btPtDica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPtDezA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlPtDezB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(PainelPtDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPtDezB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPtDezA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PainelPtDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPtDezLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(PainelPtDezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btPtDezC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPtDezD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPtDezLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVoltarPt)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtDez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtDez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtDezCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDezCActionPerformed
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
           stm.executeUpdate("UPDATE jogos set q10="+pontosPt+" WHERE idAluno="+idAluno);
          
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
           
    }//GEN-LAST:event_btPtDezCActionPerformed

    private void btMtUmMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtUmMenuActionPerformed
       
    }//GEN-LAST:event_btMtUmMenuActionPerformed

    private void btPtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Algo idêntico ou próximo, exemplo: o semelhante de ruim é mal");
    }//GEN-LAST:event_btPtDicaActionPerformed

    private void btPtDezAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDezAActionPerformed
pontosPt=pontosPt-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btPtDezAActionPerformed

    private void btPtDezBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDezBActionPerformed
pontosPt=pontosPt-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btPtDezBActionPerformed

    private void btPtDezDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDezDActionPerformed
pontosPt=pontosPt-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btPtDezDActionPerformed

    private void btVoltarPtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarPtActionPerformed
        new PtNove ().show();
        dispose();
    }//GEN-LAST:event_btVoltarPtActionPerformed

    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtDez;
    private javax.swing.JButton btMtUmMenu;
    private javax.swing.JButton btPtDezA;
    private javax.swing.JButton btPtDezB;
    private javax.swing.JButton btPtDezC;
    private javax.swing.JButton btPtDezD;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btVoltarPt;
    private javax.swing.JLabel jlPtDezA;
    private javax.swing.JLabel jlPtDezB;
    // End of variables declaration//GEN-END:variables
}
