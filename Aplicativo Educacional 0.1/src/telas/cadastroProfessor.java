
package telas;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 * Inicia a classe cadastroProfessor
 * @author Izabelle
 */


public class cadastroProfessor extends javax.swing.JFrame {

    private String nome,ra,cpf,senha,recuperar;
    /**
     * Método construtor da classe cadastroProfessor
     */
    public cadastroProfessor() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCadastroProfessor = new javax.swing.JPanel();
        jlcadastroProfessor = new javax.swing.JLabel();
        cadastroProfessorNome = new javax.swing.JTextField();
        cadastroProfessorRA = new javax.swing.JTextField();
        cadastroProfessorCPF = new javax.swing.JFormattedTextField();
        cadastroProfessorSenha = new javax.swing.JTextField();
        cadastroProfessorRecuperaSenha = new javax.swing.JTextField();
        cadastroProfessorVoltar = new javax.swing.JButton();
        cadastroProfessorCadastrar = new javax.swing.JButton();
        cadastroProfessorInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelCadastroProfessor.setPreferredSize(new java.awt.Dimension(700, 420));
        PainelCadastroProfessor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlcadastroProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CadastroProfessor.png"))); // NOI18N
        jlcadastroProfessor.setText("NOME:");
        PainelCadastroProfessor.add(jlcadastroProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        cadastroProfessorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProfessorNomeActionPerformed(evt);
            }
        });
        PainelCadastroProfessor.add(cadastroProfessorNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 81, 330, 30));
        PainelCadastroProfessor.add(cadastroProfessorRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 140, 140, 30));

        try {
            cadastroProfessorCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cadastroProfessorCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProfessorCPFActionPerformed(evt);
            }
        });
        PainelCadastroProfessor.add(cadastroProfessorCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 139, 140, 30));

        cadastroProfessorSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProfessorSenhaActionPerformed(evt);
            }
        });
        PainelCadastroProfessor.add(cadastroProfessorSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 260, 140, 30));

        cadastroProfessorRecuperaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProfessorRecuperaSenhaActionPerformed(evt);
            }
        });
        PainelCadastroProfessor.add(cadastroProfessorRecuperaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 200, 330, 30));

        cadastroProfessorVoltar.setText("VOLTAR");
        cadastroProfessorVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProfessorVoltarActionPerformed(evt);
            }
        });
        PainelCadastroProfessor.add(cadastroProfessorVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 350, 90, 40));

        cadastroProfessorCadastrar.setText("CADASTRAR");
        cadastroProfessorCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProfessorCadastrarActionPerformed(evt);
            }
        });
        PainelCadastroProfessor.add(cadastroProfessorCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 260, 150, 30));

        cadastroProfessorInformacao.setText("jButton1");
        PainelCadastroProfessor.add(cadastroProfessorInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelCadastroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastroProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroProfessorVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProfessorVoltarActionPerformed
        new telaProfessor().show();
        dispose();
    }//GEN-LAST:event_cadastroProfessorVoltarActionPerformed

    private void cadastroProfessorCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProfessorCadastrarActionPerformed
        cadastrarProf();
    }//GEN-LAST:event_cadastroProfessorCadastrarActionPerformed

    private void cadastroProfessorCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProfessorCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroProfessorCPFActionPerformed

    private void cadastroProfessorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProfessorNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroProfessorNomeActionPerformed

    private void cadastroProfessorRecuperaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProfessorRecuperaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroProfessorRecuperaSenhaActionPerformed

    private void cadastroProfessorSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProfessorSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroProfessorSenhaActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCadastroProfessor;
    private javax.swing.JFormattedTextField cadastroProfessorCPF;
    private javax.swing.JButton cadastroProfessorCadastrar;
    private javax.swing.JButton cadastroProfessorInformacao;
    private javax.swing.JTextField cadastroProfessorNome;
    private javax.swing.JTextField cadastroProfessorRA;
    private javax.swing.JTextField cadastroProfessorRecuperaSenha;
    private javax.swing.JTextField cadastroProfessorSenha;
    private javax.swing.JButton cadastroProfessorVoltar;
    private javax.swing.JLabel jlcadastroProfessor;
    // End of variables declaration//GEN-END:variables

 
  
/**
     * Método para o professor conseguir se cadastrar no banco
     */
    public void cadastrarProf()
    {
        nome = cadastroProfessorNome.getText();
        ra = cadastroProfessorRA.getText();
        cpf = cadastroProfessorCPF.getText();
        senha = cadastroProfessorSenha.getText();
        recuperar = cadastroProfessorRecuperaSenha.getText();
        
        try {
            /**
             *  //conexão com o banco de dados
             */
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            /**
             *  //condição para que o professor possa se cadastrar
             */
             if(stm.executeUpdate("INSERT into professor values('"+nome+"','"+ra+"','"+cpf+"','"+senha+"','"+recuperar+"')")!=0)
            {
                /**
             *  //cadastro realizado com sucesso e a limpeza dos campos 
             */
                JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!!!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
                cadastroProfessorNome.setText("");
                cadastroProfessorRA.setText("");
                cadastroProfessorCPF.setText("");
                cadastroProfessorSenha.setText("");
                cadastroProfessorRecuperaSenha.setText("");
                new loginProfessor (). show();
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
