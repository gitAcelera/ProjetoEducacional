
package telas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * Inicia a classe recuperaSenhaProfessor
 * @author Pedro
 */
public class recuperaSenhaProfessor extends javax.swing.JFrame {
private String consultaCpf = " ";
private String consultaPergunta = " ";
private String cpfAtual,senhaAtual,recuperaProfAtual;
    /**
     * Método construtor da classe  recuperaSenhaProfessor
     */
    public recuperaSenhaProfessor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoCPFSenha = new javax.swing.JFormattedTextField();
        btVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoRecuperaSenhaProfessor = new javax.swing.JTextField();
        btRecuperar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 400));

        jLabel1.setText("DIGITE SEU CPF");

        try {
            campoCPFSenha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCPFSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFSenhaActionPerformed(evt);
            }
        });

        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jLabel2.setText("DIGITE A PALAVRA-CHAVE DE RECUPERAÇÃO DA SENHA");

        campoRecuperaSenhaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRecuperaSenhaProfessorActionPerformed(evt);
            }
        });

        btRecuperar.setText("Recuperar");
        btRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecuperarActionPerformed(evt);
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
                        .addComponent(btVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoRecuperaSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(campoCPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(51, 51, 51)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btRecuperar)))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btVoltar)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoRecuperaSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btRecuperar)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCPFSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFSenhaActionPerformed

    }//GEN-LAST:event_campoCPFSenhaActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new loginProfessor().show();
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void campoRecuperaSenhaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRecuperaSenhaProfessorActionPerformed

    }//GEN-LAST:event_campoRecuperaSenhaProfessorActionPerformed

    private void btRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecuperarActionPerformed
        recuperarProfessor();
    }//GEN-LAST:event_btRecuperarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRecuperar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFormattedTextField campoCPFSenha;
    private javax.swing.JTextField campoRecuperaSenhaProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


       /**
      * Método responsável pela recuperação de senha do professor
      */
     public void recuperarProfessor() 
     {
         int status;
        try
        {
            //conexão com o banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * from professor");
                  
            // pega os valores do cpf e recuperação digitados pelo professor
            consultaCpf = campoCPFSenha.getText();
            consultaPergunta = campoRecuperaSenhaProfessor.getText();

            status =0;
            while(res.next())

            {
                    // pega os valores do cpf e de recuperação do banco
                cpfAtual = res.getString("cpf");
                recuperaProfAtual = res.getString("recuperarProf");
                 
                 // faz a comparação dos valores digitados pelo professor com as armazenadas no banco de dados
                if(recuperaProfAtual.compareTo(consultaPergunta)==0 && cpfAtual.compareTo(consultaCpf)==0)
                
                     
                {
                    // se os dados estão de acordo, é puxado a senha do aluno
                    cpfAtual = res.getString("cpf");
                    senhaAtual = res.getString("senha");
                    status=1;
                    
                }

            }

            if(status == 1)
            {
               // mostra a senha do professor
                JOptionPane.showMessageDialog(null,"Sua senha é: "+senhaAtual);
                new loginProfessor ().show();
                dispose();
            }
            if(status == 0)
            {
                JOptionPane.showMessageDialog(null,"CPF: "+consultaCpf+" não encontrado!!!","Erro",JOptionPane.ERROR_MESSAGE);
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
