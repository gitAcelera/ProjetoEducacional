
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

        jPanel1 = new javax.swing.JPanel();
        label_nome_prof = new javax.swing.JLabel();
        nomeProf = new javax.swing.JTextField();
        label_ra_prof = new javax.swing.JLabel();
        raProf = new javax.swing.JTextField();
        label_cpf_prof = new javax.swing.JLabel();
        cpfProf = new javax.swing.JFormattedTextField();
        label_senha_prof = new javax.swing.JLabel();
        senhaProf = new javax.swing.JTextField();
        voltarProf = new javax.swing.JButton();
        cadastrarProf = new javax.swing.JButton();
        recuperaSenhaProfessor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 420));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 420));

        label_nome_prof.setText("NOME:");

        nomeProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeProfActionPerformed(evt);
            }
        });

        label_ra_prof.setText("REGISTRO ACADÊMICO:");

        label_cpf_prof.setText("CPF:");

        try {
            cpfProf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfProfActionPerformed(evt);
            }
        });

        label_senha_prof.setText("CRIAR SENHA:");

        senhaProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaProfActionPerformed(evt);
            }
        });

        voltarProf.setText("VOLTAR");
        voltarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarProfActionPerformed(evt);
            }
        });

        cadastrarProf.setText("CADASTRAR");
        cadastrarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProfActionPerformed(evt);
            }
        });

        recuperaSenhaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperaSenhaProfessorActionPerformed(evt);
            }
        });

        jLabel1.setText("PALAVRA-CHAVE PARA A RECUPERAÇÃO DA SENHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_senha_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_nome_prof)
                                    .addComponent(nomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(raProf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label_ra_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cpfProf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label_cpf_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(recuperaSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(senhaProf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(148, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastrarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_nome_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_cpf_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfProf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_ra_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(raProf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recuperaSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_senha_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaProf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarProfActionPerformed
        new telaProfessor().show();
        dispose();
    }//GEN-LAST:event_voltarProfActionPerformed

    private void cadastrarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProfActionPerformed
        cadastrarProf();
    }//GEN-LAST:event_cadastrarProfActionPerformed

    private void cpfProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfProfActionPerformed

    private void nomeProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeProfActionPerformed

    private void recuperaSenhaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperaSenhaProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recuperaSenhaProfessorActionPerformed

    private void senhaProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaProfActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarProf;
    private javax.swing.JFormattedTextField cpfProf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_cpf_prof;
    private javax.swing.JLabel label_nome_prof;
    private javax.swing.JLabel label_ra_prof;
    private javax.swing.JLabel label_senha_prof;
    private javax.swing.JTextField nomeProf;
    private javax.swing.JTextField raProf;
    private javax.swing.JTextField recuperaSenhaProfessor;
    private javax.swing.JTextField senhaProf;
    private javax.swing.JButton voltarProf;
    // End of variables declaration//GEN-END:variables

 
  
/**
     * Método para o professor conseguir se cadastrar no banco
     */
    public void cadastrarProf()
    {
        nome = nomeProf.getText();
        ra = raProf.getText();
        cpf = cpfProf.getText();
        senha = senhaProf.getText();
        recuperar = recuperaSenhaProfessor.getText();
        
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
                nomeProf.setText("");
                raProf.setText("");
                cpfProf.setText("");
                senhaProf.setText("");
                recuperaSenhaProfessor.setText("");
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
