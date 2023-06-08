
package telas;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Inicia a classe personalizarJogo
 * @author Pedro
 */
public class personalizarJogo extends javax.swing.JFrame {
    private String novoCodigo, novaQuestao,novaDisciplina, novoAltA,novoAltB,novoAltC,novoAltD;
 private String consultaCodigos= " ";
 private String consultaDisciplina = " ";

    /**
     * Método construtor da classe personalizarJogo
     */
    public personalizarJogo() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        consultaDis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoQuestao = new javax.swing.JTextField();
        campoNovoCodigo = new javax.swing.JTextField();
        campoAltA = new javax.swing.JTextField();
        campoAltB = new javax.swing.JTextField();
        campoAltC = new javax.swing.JTextField();
        campoAltD = new javax.swing.JTextField();
        btConfirmarAlteracaoAluno = new javax.swing.JButton();
        Questão = new javax.swing.JLabel();
        campoAlternativaA = new javax.swing.JLabel();
        campoAlternativaB = new javax.swing.JLabel();
        campoAlternativaC = new javax.swing.JLabel();
        campoAlternativaD = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código do Jogo");

        jLabel5.setText("Disciplina");

        campoAltC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAltCActionPerformed(evt);
            }
        });

        btConfirmarAlteracaoAluno.setText("confirmar");
        btConfirmarAlteracaoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarAlteracaoAlunoActionPerformed(evt);
            }
        });

        Questão.setText("Questão");

        campoAlternativaA.setText("alternativa A");

        campoAlternativaB.setText("alternativa B");

        campoAlternativaC.setText("alternativa C");

        campoAlternativaD.setText("alternativa D");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btConfirmarAlteracaoAluno)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consultaDis, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNovoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoAlternativaA, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoAltA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(campoAltB, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoAltC, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoAlternativaC))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoAlternativaD)
                                    .addComponent(campoAltD, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(Questão))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(campoAlternativaB)))
                .addGap(169, 177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNovoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultaDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Questão)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAlternativaA)
                    .addComponent(campoAlternativaB)
                    .addComponent(campoAlternativaC)
                    .addComponent(campoAlternativaD))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAltA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAltB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAltC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAltD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmarAlteracaoAluno)
                    .addComponent(btVoltar))
                .addGap(18, 18, 18))
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

    private void campoAltCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAltCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAltCActionPerformed

    private void btConfirmarAlteracaoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarAlteracaoAlunoActionPerformed

        criarJogo();
    }//GEN-LAST:event_btConfirmarAlteracaoAlunoActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new menuPrincipalProfessor().show();
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Questão;
    private javax.swing.JButton btConfirmarAlteracaoAluno;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField campoAltA;
    private javax.swing.JTextField campoAltB;
    private javax.swing.JTextField campoAltC;
    private javax.swing.JTextField campoAltD;
    private javax.swing.JLabel campoAlternativaA;
    private javax.swing.JLabel campoAlternativaB;
    private javax.swing.JLabel campoAlternativaC;
    private javax.swing.JLabel campoAlternativaD;
    private javax.swing.JTextField campoNovoCodigo;
    private javax.swing.JTextField campoQuestao;
    private javax.swing.JTextField consultaDis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
    /**
     * Método que permite o professor criar um jogo personalizado
     */
    public void criarJogo()
    {
        novoCodigo=campoNovoCodigo.getText();
        novaQuestao = campoQuestao.getText();  
        novaDisciplina = consultaDis.getText();
        novoAltA=campoAltA.getText();
        novoAltB=campoAltB.getText();
        novoAltC=campoAltC.getText();
        novoAltD=campoAltD.getText();
        
        try {
            // conexão com o banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            
            // Condição para a criação do jogo e inserção do jogo no banco de dados
     if(stm.executeUpdate("INSERT into questoes values('"+novoCodigo+"','"+novaDisciplina+"','"+novaQuestao+"','"+novoAltA+"','"+novoAltB+"','"+novoAltC+"','"+novoAltD+"')")!=0)
            {
                // se o jogo foi criado, limpeza dos campos e mensagem de retorno.
                JOptionPane.showMessageDialog(null,"Jogo Criado com sucesso!!!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
                campoNovoCodigo.setText("");
                consultaDis.setText("");
                campoQuestao.setText("");
                campoAltA.setText("");
                campoAltB.setText("");
                campoAltD.setText("");
            } else{
                JOptionPane.showMessageDialog(null,"Erro para realizar a alteração!!!","Erro",JOptionPane.ERROR_MESSAGE);   
            }
            
        }
                catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }

}
