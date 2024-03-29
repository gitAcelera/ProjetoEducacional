
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
 *Classe responsável pelo jogo Matemática
 * @author Pedro
 *
 */
public class MtDez extends javax.swing.JFrame {
int pontosMt = PontosAluno.getPontosMt();
     int idAluno=0;
     //int novoidAluno=idAluno-1;
     Integer total=null;
    /**
     * Método construtor da classe MtDez
     */
    public MtDez() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtDez = new javax.swing.JPanel();
        jlMtDez = new javax.swing.JLabel();
        btMtDezA = new javax.swing.JButton();
        btMtDezB = new javax.swing.JButton();
        btMtDezC = new javax.swing.JButton();
        btMtDezD = new javax.swing.JButton();
        btMtMenu = new javax.swing.JButton();
        btMtVoltar = new javax.swing.JButton();
        btMtDica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelMtDez.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMtDez.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtDez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MtDez.png"))); // NOI18N
        PainelMtDez.add(jlMtDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btMtDezA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtDezA.setText("2");
        btMtDezA.setContentAreaFilled(false);
        btMtDezA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDezAActionPerformed(evt);
            }
        });
        PainelMtDez.add(btMtDezA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 135, 180, 90));

        btMtDezB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtDezB.setText("6");
        btMtDezB.setContentAreaFilled(false);
        btMtDezB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDezBActionPerformed(evt);
            }
        });
        PainelMtDez.add(btMtDezB, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 135, 180, 90));

        btMtDezC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtDezC.setText("5");
        btMtDezC.setContentAreaFilled(false);
        btMtDezC.setPreferredSize(new java.awt.Dimension(700, 420));
        btMtDezC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDezCActionPerformed(evt);
            }
        });
        PainelMtDez.add(btMtDezC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 255, 180, 90));

        btMtDezD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtDezD.setText("8");
        btMtDezD.setContentAreaFilled(false);
        btMtDezD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDezDActionPerformed(evt);
            }
        });
        PainelMtDez.add(btMtDezD, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 255, 180, 90));

        btMtMenu.setText(" MENU");
        btMtMenu.setContentAreaFilled(false);
        btMtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtMenuActionPerformed(evt);
            }
        });
        PainelMtDez.add(btMtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        btMtVoltar.setText("Voltar");
        btMtVoltar.setContentAreaFilled(false);
        btMtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtVoltarActionPerformed(evt);
            }
        });
        PainelMtDez.add(btMtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 349, 80, 50));

        btMtDica.setText("?");
        btMtDica.setContentAreaFilled(false);
        btMtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDicaActionPerformed(evt);
            }
        });
        PainelMtDez.add(btMtDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PainelMtDez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtDez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtDezAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDezAActionPerformed
         JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  ); 
         pontosMt=pontosMt-5;     
    }//GEN-LAST:event_btMtDezAActionPerformed

    private void btMtDezBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDezBActionPerformed
     JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosMt=pontosMt-5;      
    }//GEN-LAST:event_btMtDezBActionPerformed

    private void btMtDezCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDezCActionPerformed
        pontosMt=pontosMt+20;
        System.out.println(""+pontosMt);
        somarPontuacaoMt();
        
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btMtDezCActionPerformed

    private void btMtDezDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDezDActionPerformed
    JOptionPane.showMessageDialog(null,"OOPS!!! Resposta errada ^⁠_⁠^ \nQue tal dar uma olhada na Dica?"  );
        pontosMt=pontosMt-5;     
    }//GEN-LAST:event_btMtDezDActionPerformed

    private void btMtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtVoltarActionPerformed
        new MtNove().show();
        dispose();
    }//GEN-LAST:event_btMtVoltarActionPerformed

    private void btMtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Todo numero ímpar NÃO é dividido por 2!");
    }//GEN-LAST:event_btMtDicaActionPerformed

    private void btMtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtMenuActionPerformed
        
    }//GEN-LAST:event_btMtMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMtDez;
    private javax.swing.JButton btMtDezA;
    private javax.swing.JButton btMtDezB;
    private javax.swing.JButton btMtDezC;
    private javax.swing.JButton btMtDezD;
    private javax.swing.JButton btMtDica;
    private javax.swing.JButton btMtMenu;
    private javax.swing.JButton btMtVoltar;
    private javax.swing.JLabel jlMtDez;
    // End of variables declaration//GEN-END:variables

   
    /**
     * Método responsável pela soma de pontuação do jogo Matemáttica;
     * Ocorre a soma de todas as questões, é salva no banco e apresentada ao aluno
     */
    public void somarPontuacaoMt()
   {
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
             System.out.println(" id aluno no q10:"+idAluno);
           stm.executeUpdate("UPDATE jogos SET q10="+pontosMt+" WHERE idAluno="+idAluno);
          
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
               // novoidAluno=idAluno-1;
                 //System.out.println("id aluno soma"+idAluno);
                Statement stm = con.createStatement();
                  stm.executeUpdate("UPDATE jogos SET total ="+total+" WHERE idAluno="+idAluno);
                   stm.executeUpdate("UPDATE  aluno SET total="+total+" WHERE idAluno="+idAluno);
        JOptionPane.showMessageDialog(null,"SUA PONTUAÇÃO FOI: "+total+"PONTOS" );
          
        }
        
        
        catch(Exception ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
	}
	
   }
}
