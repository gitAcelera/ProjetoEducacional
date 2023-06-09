
package telas;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Inicia a classe cadastroAluno
 * @author Mateus
 */
public class cadastroAluno extends javax.swing.JFrame {

    private String nome,idade,ra,senha,recuperar;
    
    /**
     * Método construtor da classe cadastroAluno
     */
    public cadastroAluno() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCadastroAluno = new javax.swing.JPanel();
        jlcadastroAluno = new javax.swing.JLabel();
        cadastroAlunoNome = new javax.swing.JTextField();
        cadastroAlunoIdade = new javax.swing.JTextField();
        cadastroAlunoRA = new javax.swing.JTextField();
        cadastroAlunoSenha = new javax.swing.JTextField();
        cadastroAlunoRecuperaSenha = new javax.swing.JTextField();
        cadastroAlunoVoltar = new javax.swing.JButton();
        cadastrarAlunoCadastrar = new javax.swing.JButton();
        cadastrarAlunoInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelCadastroAluno.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelCadastroAluno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlcadastroAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CadastroAluno.png"))); // NOI18N
        jlcadastroAluno.setText("NOME:");
        PainelCadastroAluno.add(jlcadastroAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        cadastroAlunoNome.setBackground(new java.awt.Color(184, 135, 191));
        cadastroAlunoNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cadastroAlunoNome.setForeground(new java.awt.Color(255, 255, 255));
        cadastroAlunoNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cadastroAlunoNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cadastroAlunoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAlunoNomeActionPerformed(evt);
            }
        });
        PainelCadastroAluno.add(cadastroAlunoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 86, 330, 20));

        cadastroAlunoIdade.setBackground(new java.awt.Color(184, 135, 191));
        cadastroAlunoIdade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cadastroAlunoIdade.setForeground(new java.awt.Color(255, 255, 255));
        cadastroAlunoIdade.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cadastroAlunoIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAlunoIdadeActionPerformed(evt);
            }
        });
        PainelCadastroAluno.add(cadastroAlunoIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 145, 140, 20));

        cadastroAlunoRA.setBackground(new java.awt.Color(184, 135, 191));
        cadastroAlunoRA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cadastroAlunoRA.setForeground(new java.awt.Color(255, 255, 255));
        cadastroAlunoRA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cadastroAlunoRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAlunoRAActionPerformed(evt);
            }
        });
        PainelCadastroAluno.add(cadastroAlunoRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 142, 120, 20));

        cadastroAlunoSenha.setBackground(new java.awt.Color(184, 135, 191));
        cadastroAlunoSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cadastroAlunoSenha.setForeground(new java.awt.Color(255, 255, 255));
        cadastroAlunoSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cadastroAlunoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAlunoSenhaActionPerformed(evt);
            }
        });
        PainelCadastroAluno.add(cadastroAlunoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 264, 140, 20));

        cadastroAlunoRecuperaSenha.setBackground(new java.awt.Color(184, 135, 191));
        cadastroAlunoRecuperaSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cadastroAlunoRecuperaSenha.setForeground(new java.awt.Color(255, 255, 255));
        cadastroAlunoRecuperaSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cadastroAlunoRecuperaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAlunoRecuperaSenhaActionPerformed(evt);
            }
        });
        PainelCadastroAluno.add(cadastroAlunoRecuperaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 204, 330, 20));

        cadastroAlunoVoltar.setText("VOLTAR");
        cadastroAlunoVoltar.setContentAreaFilled(false);
        cadastroAlunoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroAlunoVoltarMouseClicked(evt);
            }
        });
        cadastroAlunoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAlunoVoltarActionPerformed(evt);
            }
        });
        PainelCadastroAluno.add(cadastroAlunoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 350, 80, 40));

        cadastrarAlunoCadastrar.setText("CONFIRMAR");
        cadastrarAlunoCadastrar.setContentAreaFilled(false);
        cadastrarAlunoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAlunoCadastrarActionPerformed(evt);
            }
        });
        PainelCadastroAluno.add(cadastrarAlunoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 261, 150, 30));

        cadastrarAlunoInformacao.setText("jButton1");
        cadastrarAlunoInformacao.setContentAreaFilled(false);
        PainelCadastroAluno.add(cadastrarAlunoInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastroAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroAlunoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroAlunoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroAlunoNomeActionPerformed

    private void cadastroAlunoIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroAlunoIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroAlunoIdadeActionPerformed

    private void cadastroAlunoRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroAlunoRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroAlunoRAActionPerformed

    private void cadastroAlunoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroAlunoVoltarActionPerformed
        new telaAluno().show();
        dispose();
    }//GEN-LAST:event_cadastroAlunoVoltarActionPerformed

    private void cadastroAlunoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroAlunoVoltarMouseClicked
        
    }//GEN-LAST:event_cadastroAlunoVoltarMouseClicked

    private void cadastrarAlunoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAlunoCadastrarActionPerformed
      cadastrarAluno();
    }//GEN-LAST:event_cadastrarAlunoCadastrarActionPerformed

    private void cadastroAlunoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroAlunoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroAlunoSenhaActionPerformed

    private void cadastroAlunoRecuperaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroAlunoRecuperaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroAlunoRecuperaSenhaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCadastroAluno;
    private javax.swing.JButton cadastrarAlunoCadastrar;
    private javax.swing.JButton cadastrarAlunoInformacao;
    private javax.swing.JTextField cadastroAlunoIdade;
    private javax.swing.JTextField cadastroAlunoNome;
    private javax.swing.JTextField cadastroAlunoRA;
    private javax.swing.JTextField cadastroAlunoRecuperaSenha;
    private javax.swing.JTextField cadastroAlunoSenha;
    private javax.swing.JButton cadastroAlunoVoltar;
    private javax.swing.JLabel jlcadastroAluno;
    // End of variables declaration//GEN-END:variables

    
    /**
     * Método para o aluno conseguir se cadastrar no banco
     */
   public void cadastrarAluno()
   {
       nome = cadastroAlunoNome.getText();
        idade = cadastroAlunoIdade.getText();
        ra = cadastroAlunoRA.getText();
        senha = cadastroAlunoSenha.getText();
        recuperar = cadastroAlunoRecuperaSenha.getText();
        try {
            /**
             *  //conexão com o banco de dados
             */
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
             /**
             *  //condição para que o aluno possa se cadastrar
             */
             if(stm.executeUpdate("INSERT into aluno values('"+nome+"','"+idade+"','"+ra+"','"+senha+"','"+recuperar+"')")!=0)
            {
                 /**
             *  //cadastro realizado com sucesso e a limpeza dos campos 
             */
                JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!!!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
                cadastroAlunoNome.setText("");
                cadastroAlunoIdade.setText("");
                cadastroAlunoRA.setText("");
                cadastroAlunoSenha.setText("");
                cadastroAlunoRecuperaSenha.setText("");
                new loginAluno (). show();
                dispose();
            } else{
                JOptionPane.showMessageDialog(null,"Erro para realizar o cadastro!!!","Erro",JOptionPane.ERROR_MESSAGE);   
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
