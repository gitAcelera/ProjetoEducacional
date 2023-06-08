
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

        jPanel1 = new javax.swing.JPanel();
        label_nome_aluno = new javax.swing.JLabel();
        nomeAluno = new javax.swing.JTextField();
        label_idade_aluno = new javax.swing.JLabel();
        idadeAluno = new javax.swing.JTextField();
        label_ra_aluno = new javax.swing.JLabel();
        raAluno = new javax.swing.JTextField();
        label_senha_aluno = new javax.swing.JLabel();
        senhaAluno = new javax.swing.JTextField();
        voltarAluno = new javax.swing.JButton();
        cadastrarAluno = new javax.swing.JButton();
        recuperaSenhaAluno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 420));

        label_nome_aluno.setText("NOME:");

        nomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAlunoActionPerformed(evt);
            }
        });

        label_idade_aluno.setText("IDADE:");

        idadeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeAlunoActionPerformed(evt);
            }
        });

        label_ra_aluno.setText("REGISTRO DE MATRICULA (RA):");

        raAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raAlunoActionPerformed(evt);
            }
        });

        label_senha_aluno.setText("CRIAR SENHA:");

        senhaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaAlunoActionPerformed(evt);
            }
        });

        voltarAluno.setText("VOLTAR");
        voltarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarAlunoMouseClicked(evt);
            }
        });
        voltarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarAlunoActionPerformed(evt);
            }
        });

        cadastrarAluno.setText("CONFIRMAR");
        cadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAlunoActionPerformed(evt);
            }
        });

        recuperaSenhaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperaSenhaAlunoActionPerformed(evt);
            }
        });

        jLabel1.setText("PALAVRA-CHAVE PARA A RECUPERAÇÃO DA SENHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(voltarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_senha_aluno)
                            .addComponent(label_nome_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_idade_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_ra_aluno)
                                    .addComponent(raAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)
                            .addComponent(recuperaSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(163, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label_nome_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_ra_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(raAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_idade_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recuperaSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_senha_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAlunoActionPerformed

    private void idadeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeAlunoActionPerformed

    private void raAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raAlunoActionPerformed

    private void voltarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarAlunoActionPerformed
        new telaAluno().show();
        dispose();
    }//GEN-LAST:event_voltarAlunoActionPerformed

    private void voltarAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarAlunoMouseClicked
        
    }//GEN-LAST:event_voltarAlunoMouseClicked

    private void cadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAlunoActionPerformed
      cadastrarAluno();
    }//GEN-LAST:event_cadastrarAlunoActionPerformed

    private void senhaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaAlunoActionPerformed

    private void recuperaSenhaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperaSenhaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recuperaSenhaAlunoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarAluno;
    private javax.swing.JTextField idadeAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_idade_aluno;
    private javax.swing.JLabel label_nome_aluno;
    private javax.swing.JLabel label_ra_aluno;
    private javax.swing.JLabel label_senha_aluno;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JTextField raAluno;
    private javax.swing.JTextField recuperaSenhaAluno;
    private javax.swing.JTextField senhaAluno;
    private javax.swing.JButton voltarAluno;
    // End of variables declaration//GEN-END:variables

    
    /**
     * Método para o aluno conseguir se cadastrar no banco
     */
   public void cadastrarAluno()
   {
       nome = nomeAluno.getText();
        idade = idadeAluno.getText();
        ra = raAluno.getText();
        senha = senhaAluno.getText();
        recuperar = recuperaSenhaAluno.getText();
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
                nomeAluno.setText("");
                idadeAluno.setText("");
                raAluno.setText("");
                senhaAluno.setText("");
                recuperaSenhaAluno.setText("");
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
