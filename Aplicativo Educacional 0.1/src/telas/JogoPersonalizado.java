
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

        jlJogoPersonalizado = new javax.swing.JLabel();
        PainelJogoPersonalizado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoBuscaJogo = new javax.swing.JTextArea();
        jlJogoPersnalizado = new javax.swing.JLabel();
        JogoPersonalizadoConsultarCodigo = new javax.swing.JTextField();
        JogoPersonalizadoQuestao = new javax.swing.JTextField();
        btJogoPersonalizadoBuscarJogo = new javax.swing.JButton();
        btJogoPersonalizadoJogar = new javax.swing.JButton();
        btJogoPersonalizadoA = new javax.swing.JButton();
        btJogoPersonalizadoB = new javax.swing.JButton();
        btJogoPersonalizadoC = new javax.swing.JButton();
        btJogoPersonalizadoD = new javax.swing.JButton();
        btJogoPersonalizadoVoltar = new javax.swing.JButton();
        btJogoPersonalizadoInformacao = new javax.swing.JButton();

        jlJogoPersonalizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/JogoPersonalizado.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelJogoPersonalizado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoBuscaJogo.setColumns(20);
        campoBuscaJogo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campoBuscaJogo.setRows(5);
        jScrollPane1.setViewportView(campoBuscaJogo);

        PainelJogoPersonalizado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 37, 300, 110));

        jlJogoPersnalizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/JogoPersonalizado.png"))); // NOI18N
        PainelJogoPersonalizado.add(jlJogoPersnalizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        JogoPersonalizadoConsultarCodigo.setBackground(new java.awt.Color(162, 96, 171));
        JogoPersonalizadoConsultarCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JogoPersonalizadoConsultarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        JogoPersonalizadoConsultarCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PainelJogoPersonalizado.add(JogoPersonalizadoConsultarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 130, 30));

        JogoPersonalizadoQuestao.setBackground(new java.awt.Color(162, 96, 171));
        JogoPersonalizadoQuestao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JogoPersonalizadoQuestao.setForeground(new java.awt.Color(255, 255, 255));
        JogoPersonalizadoQuestao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PainelJogoPersonalizado.add(JogoPersonalizadoQuestao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 123, 270, 30));

        btJogoPersonalizadoBuscarJogo.setText("Buscar Jogos");
        btJogoPersonalizadoBuscarJogo.setContentAreaFilled(false);
        btJogoPersonalizadoBuscarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogoPersonalizadoBuscarJogoActionPerformed(evt);
            }
        });
        PainelJogoPersonalizado.add(btJogoPersonalizadoBuscarJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 280, 40));

        btJogoPersonalizadoJogar.setText("Jogar");
        btJogoPersonalizadoJogar.setContentAreaFilled(false);
        btJogoPersonalizadoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogoPersonalizadoJogarActionPerformed(evt);
            }
        });
        PainelJogoPersonalizado.add(btJogoPersonalizadoJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 336, 210, 40));

        btJogoPersonalizadoA.setBackground(new java.awt.Color(162, 96, 171));
        btJogoPersonalizadoA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btJogoPersonalizadoA.setForeground(new java.awt.Color(255, 255, 255));
        btJogoPersonalizadoA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btJogoPersonalizadoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogoPersonalizadoAActionPerformed(evt);
            }
        });
        PainelJogoPersonalizado.add(btJogoPersonalizadoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 215, 100, 30));

        btJogoPersonalizadoB.setBackground(new java.awt.Color(162, 96, 171));
        btJogoPersonalizadoB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btJogoPersonalizadoB.setForeground(new java.awt.Color(255, 255, 255));
        btJogoPersonalizadoB.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btJogoPersonalizadoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogoPersonalizadoBActionPerformed(evt);
            }
        });
        PainelJogoPersonalizado.add(btJogoPersonalizadoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 215, 100, 30));

        btJogoPersonalizadoC.setBackground(new java.awt.Color(162, 96, 171));
        btJogoPersonalizadoC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btJogoPersonalizadoC.setForeground(new java.awt.Color(255, 255, 255));
        btJogoPersonalizadoC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btJogoPersonalizadoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogoPersonalizadoCActionPerformed(evt);
            }
        });
        PainelJogoPersonalizado.add(btJogoPersonalizadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 294, 100, 30));

        btJogoPersonalizadoD.setBackground(new java.awt.Color(162, 96, 171));
        btJogoPersonalizadoD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btJogoPersonalizadoD.setForeground(new java.awt.Color(255, 255, 255));
        btJogoPersonalizadoD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btJogoPersonalizadoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogoPersonalizadoDActionPerformed(evt);
            }
        });
        PainelJogoPersonalizado.add(btJogoPersonalizadoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 294, 100, 30));

        btJogoPersonalizadoVoltar.setText("voltar");
        btJogoPersonalizadoVoltar.setContentAreaFilled(false);
        btJogoPersonalizadoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogoPersonalizadoVoltarActionPerformed(evt);
            }
        });
        PainelJogoPersonalizado.add(btJogoPersonalizadoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 367, 80, -1));

        btJogoPersonalizadoInformacao.setText("jButton1");
        btJogoPersonalizadoInformacao.setContentAreaFilled(false);
        btJogoPersonalizadoInformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogoPersonalizadoInformacaoActionPerformed(evt);
            }
        });
        PainelJogoPersonalizado.add(btJogoPersonalizadoInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 28, 40, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelJogoPersonalizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelJogoPersonalizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btJogoPersonalizadoBuscarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogoPersonalizadoBuscarJogoActionPerformed
        PessoaBD pessoaBD = new PessoaBD();

        String jogo = pessoaBD.buscarJogo();

        campoBuscaJogo.setText(jogo);        // TODO add your handling code here:
    }//GEN-LAST:event_btJogoPersonalizadoBuscarJogoActionPerformed

    private void btJogoPersonalizadoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogoPersonalizadoJogarActionPerformed

        alterarJogo();
    }//GEN-LAST:event_btJogoPersonalizadoJogarActionPerformed

    private void btJogoPersonalizadoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogoPersonalizadoAActionPerformed
JOptionPane.showMessageDialog(null," CERTA RESPOSTA !! !!!");
       JogoPersonalizadoQuestao.setText("");
			btJogoPersonalizadoA.setText("");
                        btJogoPersonalizadoB.setText("");
                        btJogoPersonalizadoC.setText ("");
                        btJogoPersonalizadoD.setText("");  
                        JogoPersonalizadoConsultarCodigo.setText("");
    }//GEN-LAST:event_btJogoPersonalizadoAActionPerformed

    private void btJogoPersonalizadoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogoPersonalizadoVoltarActionPerformed
        new menuPrincipal().show();
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btJogoPersonalizadoVoltarActionPerformed

    private void btJogoPersonalizadoInformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogoPersonalizadoInformacaoActionPerformed
  JOptionPane.showMessageDialog(null,"Aluno,aqui você joga o Quiz que o seu professor criou. \nInsira o código do Quiz e o jogue!1 Divirta-se.(⁠◠⁠‿⁠◕⁠)");
    }//GEN-LAST:event_btJogoPersonalizadoInformacaoActionPerformed

    private void btJogoPersonalizadoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogoPersonalizadoBActionPerformed
JogoPersonalizadoQuestao.setText("");
			btJogoPersonalizadoA.setText("");
                        btJogoPersonalizadoB.setText("");
                        btJogoPersonalizadoC.setText ("");
                        btJogoPersonalizadoD.setText("");  
                        JogoPersonalizadoConsultarCodigo.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_btJogoPersonalizadoBActionPerformed

    private void btJogoPersonalizadoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogoPersonalizadoCActionPerformed
JogoPersonalizadoQuestao.setText("");
			btJogoPersonalizadoA.setText("");
                        btJogoPersonalizadoB.setText("");
                        btJogoPersonalizadoC.setText ("");
                        btJogoPersonalizadoD.setText("");  
                        JogoPersonalizadoConsultarCodigo.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_btJogoPersonalizadoCActionPerformed

    private void btJogoPersonalizadoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogoPersonalizadoDActionPerformed
JogoPersonalizadoQuestao.setText("");
			btJogoPersonalizadoA.setText("");
                        btJogoPersonalizadoB.setText("");
                        btJogoPersonalizadoC.setText ("");
                        btJogoPersonalizadoD.setText("");  
                        JogoPersonalizadoConsultarCodigo.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_btJogoPersonalizadoDActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JogoPersonalizadoConsultarCodigo;
    private javax.swing.JTextField JogoPersonalizadoQuestao;
    private javax.swing.JPanel PainelJogoPersonalizado;
    private javax.swing.JButton btJogoPersonalizadoA;
    private javax.swing.JButton btJogoPersonalizadoB;
    private javax.swing.JButton btJogoPersonalizadoBuscarJogo;
    private javax.swing.JButton btJogoPersonalizadoC;
    private javax.swing.JButton btJogoPersonalizadoD;
    private javax.swing.JButton btJogoPersonalizadoInformacao;
    private javax.swing.JButton btJogoPersonalizadoJogar;
    private javax.swing.JButton btJogoPersonalizadoVoltar;
    private javax.swing.JTextArea campoBuscaJogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlJogoPersnalizado;
    private javax.swing.JLabel jlJogoPersonalizado;
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
              
                consultaCodigos = JogoPersonalizadoConsultarCodigo.getText();
                
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
			JogoPersonalizadoQuestao.setText (questaoAtual);
			btJogoPersonalizadoA.setText(altA);
                        btJogoPersonalizadoB.setText(altB);
                        btJogoPersonalizadoC.setText (altC);
                        btJogoPersonalizadoD.setText(altD);
		}
		if(status == 0)
		{
			JOptionPane.showMessageDialog(null," "+JogoPersonalizadoConsultarCodigo+" não encontrado!!!","Erro",JOptionPane.ERROR_MESSAGE);
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
