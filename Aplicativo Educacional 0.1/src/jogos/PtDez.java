
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
public class PtDez extends javax.swing.JFrame {
int pontosPt = PontosAluno.getPontosPt();
       int idAluno=0;
      
    Integer total=null;
    /**
     * Método construtor da classe PtDez
     */
    public PtDez() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPtDez = new javax.swing.JPanel();
        jlPtDez = new javax.swing.JLabel();
        btPtDezA = new javax.swing.JButton();
        btPtDezB = new javax.swing.JButton();
        btPtDezC = new javax.swing.JButton();
        btPtDezD = new javax.swing.JButton();
        btPtMenu = new javax.swing.JButton();
        btPtDica = new javax.swing.JButton();
        btPtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelPtDez.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPtDez.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtDez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PtDez.png"))); // NOI18N
        PainelPtDez.add(jlPtDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btPtDezA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtDezA.setText("RAIVA");
        btPtDezA.setContentAreaFilled(false);
        btPtDezA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDezAActionPerformed(evt);
            }
        });
        PainelPtDez.add(btPtDezA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, 80));

        btPtDezB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtDezB.setText("TRISTEZA");
        btPtDezB.setContentAreaFilled(false);
        btPtDezB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDezBActionPerformed(evt);
            }
        });
        PainelPtDez.add(btPtDezB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 190, 80));

        btPtDezC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtDezC.setText("FELICIDADE");
        btPtDezC.setContentAreaFilled(false);
        btPtDezC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDezCActionPerformed(evt);
            }
        });
        PainelPtDez.add(btPtDezC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 180, 80));

        btPtDezD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtDezD.setText("MEDO");
        btPtDezD.setContentAreaFilled(false);
        btPtDezD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDezDActionPerformed(evt);
            }
        });
        PainelPtDez.add(btPtDezD, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 190, 80));

        btPtMenu.setText("MENU");
        btPtMenu.setContentAreaFilled(false);
        btPtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtMenuActionPerformed(evt);
            }
        });
        PainelPtDez.add(btPtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btPtDica.setText("?");
        btPtDica.setContentAreaFilled(false);
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });
        PainelPtDez.add(btPtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 6, 40, 40));

        btPtVoltar.setText("Voltar");
        btPtVoltar.setContentAreaFilled(false);
        btPtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtVoltarActionPerformed(evt);
            }
        });
        PainelPtDez.add(btPtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 354, 80, 40));

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
        somarPontuacaoPt();
	new menuPrincipal().show();
        dispose();
           
    }//GEN-LAST:event_btPtDezCActionPerformed

    private void btPtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtMenuActionPerformed
       
    }//GEN-LAST:event_btPtMenuActionPerformed

    private void btPtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Algo idêntico ou próximo, exemplo: o semelhante de ruim é mal");
    }//GEN-LAST:event_btPtDicaActionPerformed

    private void btPtDezAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDezAActionPerformed
 JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosPt=pontosPt-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btPtDezAActionPerformed

    private void btPtDezBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDezBActionPerformed
 JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosPt=pontosPt-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btPtDezBActionPerformed

    private void btPtDezDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDezDActionPerformed
 JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosPt=pontosPt-5;         // TODO add your handling code here:
    }//GEN-LAST:event_btPtDezDActionPerformed

    private void btPtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtVoltarActionPerformed
        new PtNove ().show();
        dispose();
    }//GEN-LAST:event_btPtVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtDez;
    private javax.swing.JButton btPtDezA;
    private javax.swing.JButton btPtDezB;
    private javax.swing.JButton btPtDezC;
    private javax.swing.JButton btPtDezD;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btPtMenu;
    private javax.swing.JButton btPtVoltar;
    private javax.swing.JLabel jlPtDez;
    // End of variables declaration//GEN-END:variables

/**
     * Método responsável pela soma de pontuação do jogo Português;
     * Ocorre a soma de todas as questões, é salva no banco e apresentada ao aluno
     */
    public void somarPontuacaoPt()
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
         Statement stm = con.createStatement();
          stm.executeUpdate("INSERT into jogos (total) values ("+total+")");
        }
        
        
        catch(Exception ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
	}
    }

}
