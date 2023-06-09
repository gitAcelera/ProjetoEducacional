
package telas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Banco.PessoaBD;

/**
 * Inicia a classe JogoPersonalizado
 * @author Pedro
 */
public class JogoPersonalizado extends javax.swing.JFrame {
    private String codigoAtual,disciplinaAtual,questaoAtual;
 private String altA,altB,altC,altD;
 private String consultaCodigos= " ";
 private String consultaDisciplina = " ";

    /**
     * Método construtor da classe JogoPersonalizado
     */
    public JogoPersonalizado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoBuscaJogo = new javax.swing.JTextArea();
        BuscarJogos = new javax.swing.JButton();
        codigo = new javax.swing.JLabel();
        consultaCodigo = new javax.swing.JTextField();
        btConsult = new javax.swing.JButton();
        campoAltA = new javax.swing.JButton();
        campoAltC = new javax.swing.JButton();
        campoAltB = new javax.swing.JButton();
        campoAltD = new javax.swing.JButton();
        campoQuestao = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoBuscaJogo.setColumns(20);
        campoBuscaJogo.setRows(5);
        jScrollPane1.setViewportView(campoBuscaJogo);

        BuscarJogos.setText("Buscar Jogos");
        BuscarJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarJogosActionPerformed(evt);
            }
        });

        codigo.setText("Código");

        btConsult.setText("Jogar");
        btConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultActionPerformed(evt);
            }
        });

        campoAltA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAltAActionPerformed(evt);
            }
        });

        btVoltar.setText("voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuscarJogos)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(consultaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btConsult)
                                    .addComponent(codigo)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btVoltar)
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoAltC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoAltD, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoAltA, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(campoAltB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(campoQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btConsult)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarJogos)
                .addGap(55, 55, 55)
                .addComponent(campoQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoAltA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAltB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoAltD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoAltC, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarJogosActionPerformed
        PessoaBD pessoaBD = new PessoaBD();

        String jogo = pessoaBD.buscarJogo();

        campoBuscaJogo.setText(jogo);        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarJogosActionPerformed

    private void btConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultActionPerformed

        alterarJogo();
    }//GEN-LAST:event_btConsultActionPerformed

    private void campoAltAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAltAActionPerformed
JOptionPane.showMessageDialog(null," CERTA RESPOSTA !! !!!");
       campoQuestao.setText("");
			campoAltA.setText("");
                        campoAltB.setText("");
                        campoAltC.setText ("");
                        campoAltD.setText("");  
                        consultaCodigo.setText("");
    }//GEN-LAST:event_campoAltAActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new menuPrincipal().show();
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarJogos;
    private javax.swing.JButton btConsult;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton campoAltA;
    private javax.swing.JButton campoAltB;
    private javax.swing.JButton campoAltC;
    private javax.swing.JButton campoAltD;
    private javax.swing.JTextArea campoBuscaJogo;
    private javax.swing.JLabel campoQuestao;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField consultaCodigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
    /**
     * Método para o professor criar um jogo personalizado
     */
    public void alterarJogo()
 {
     
 

 int status;
				
				
	try
	{
            /**
             *  //conexão com o banco de dados
             */
            
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
               Statement stm = con.createStatement();
               ResultSet res = stm.executeQuery("SELECT * from questoes");
		
               /**
                * // pega os valores do codigo e discplina digitadas pelo aluno
                */
              
                consultaCodigos = consultaCodigo.getText();
                
                status = 0;
		while(res.next())
		{
                 /**
                  * // pega os valores do codigo e discplina do banco
                  */   
                    
		   codigoAtual = res.getString("codigo");
                   disciplinaAtual = res.getString("disciplina");


		  /**
                   *  // faz a comparação dos valores digitados pelo aluno com as armazenadas no banco de dados
                   */
                  
                   if(codigoAtual.compareTo(consultaCodigos)==0)
		   {
                       // se os dados estão de acordo, é pego a questão e suas alternativas
			  questaoAtual = res.getString("questao");
                          altA= res.getString("a");
                          altB=res.getString("b");
                          altC=res.getString("c");
                          altD=res.getString("d");
			
			  status = 1;						  
		   }					   			   
		}
		if(status == 1)
		{
                    /**
                     * // envia os valores pegos e envia aos respectivos campos
                     */
			campoQuestao.setText (questaoAtual);
			campoAltA.setText(altA);
                        campoAltB.setText(altB);
                        campoAltC.setText (altC);
                        campoAltD.setText(altD);
		}
		if(status == 0)
		{
			JOptionPane.showMessageDialog(null," "+consultaCodigo+" não encontrado!!!","Erro",JOptionPane.ERROR_MESSAGE);
		}
	}
	catch(ClassNotFoundException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
	}

        
 }        
 
}
