
package telas;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Inicia a classe alterarSenhaAluno
 * @author Felipe
 */
public class alterarSenhaAluno extends javax.swing.JFrame {
    private String nomeAtual,raAtual,senhaAtual,idadeAtual,recuperaAtual;
 private String nomeBanco,raBanco,senhaNovo;
 private String consultaRa= " ";
 private String consultaPalavra = " ";

    /**
     * Método construtor da classe alterarSenhaAluno
     */
    public alterarSenhaAluno() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btVoltarMenu = new javax.swing.JButton();
        RaConsulta = new javax.swing.JLabel();
        consultaCampo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoPalavraChave = new javax.swing.JTextField();
        btConsult = new javax.swing.JButton();
        nomeConsulta = new javax.swing.JLabel();
        campoNomeBanco = new javax.swing.JTextField();
        idadeConsulta = new javax.swing.JLabel();
        campoIdadeBanco = new javax.swing.JTextField();
        raConsulta = new javax.swing.JLabel();
        campoRaBanco = new javax.swing.JTextField();
        novaSenha = new javax.swing.JLabel();
        campoSenhaNovo = new javax.swing.JTextField();
        btConfirmarAlteracaoAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btVoltarMenu.setText(" MENU");
        btVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarMenuActionPerformed(evt);
            }
        });

        RaConsulta.setText("Digite seu R.A");

        consultaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaCampoActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite sua Palavra-Chave");

        campoPalavraChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPalavraChaveActionPerformed(evt);
            }
        });

        btConsult.setText("EDITAR");
        btConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultActionPerformed(evt);
            }
        });

        nomeConsulta.setText("Nome");

        campoNomeBanco.setEditable(false);

        idadeConsulta.setText("Idade");

        campoIdadeBanco.setEditable(false);

        raConsulta.setText(" R.A");

        campoRaBanco.setEditable(false);

        novaSenha.setText("Nova Senha");

        campoSenhaNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaNovoActionPerformed(evt);
            }
        });

        btConfirmarAlteracaoAluno.setText("CONFIRMAR");
        btConfirmarAlteracaoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarAlteracaoAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltarMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(campoSenhaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConsult)
                            .addComponent(btConfirmarAlteracaoAluno)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RaConsulta)
                            .addComponent(consultaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeConsulta))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPalavraChave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(campoNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idadeConsulta)
                    .addComponent(campoIdadeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raConsulta)
                    .addComponent(campoRaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novaSenha))
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltarMenu)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RaConsulta)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPalavraChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btConsult)
                .addGap(18, 18, 18)
                .addComponent(nomeConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idadeConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdadeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(raConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoRaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(novaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSenhaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConfirmarAlteracaoAluno))
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed
        new menuPrincipal().show();
        dispose();       
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    private void consultaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaCampoActionPerformed
       
    }//GEN-LAST:event_consultaCampoActionPerformed

    private void campoPalavraChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPalavraChaveActionPerformed

    }//GEN-LAST:event_campoPalavraChaveActionPerformed

    private void btConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultActionPerformed
      consultaAlu();
    }//GEN-LAST:event_btConsultActionPerformed

    private void campoSenhaNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaNovoActionPerformed

    private void btConfirmarAlteracaoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarAlteracaoAlunoActionPerformed
        confirmarAlteracao();
    }//GEN-LAST:event_btConfirmarAlteracaoAlunoActionPerformed

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RaConsulta;
    private javax.swing.JButton btConfirmarAlteracaoAluno;
    private javax.swing.JButton btConsult;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JTextField campoIdadeBanco;
    private javax.swing.JTextField campoNomeBanco;
    private javax.swing.JTextField campoPalavraChave;
    private javax.swing.JTextField campoRaBanco;
    private javax.swing.JTextField campoSenhaNovo;
    private javax.swing.JTextField consultaCampo;
    private javax.swing.JLabel idadeConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeConsulta;
    private javax.swing.JLabel novaSenha;
    private javax.swing.JLabel raConsulta;
    // End of variables declaration//GEN-END:variables
   
    /**
     * Método para habilitar a edição da senha
     */
    public void consultaAlu()
   {
        int status;

        try
        {
             
               //conexão com o banco de dados
             
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * from aluno");

           
            // pega os valores do ra e palavra de recuperação digitadas pelo aluno
                
            consultaRa = consultaCampo.getText();
            consultaPalavra = campoPalavraChave.getText();
            status = 0;
            while(res.next())
            {
                
                   // pega os valores do ra  e palavra de recuperação do banco
                   
                raAtual = res.getString("ra");
                recuperaAtual = res.getString("recuperar");
                
                 
                     // faz a comparação dos valores digitados pelo aluno com as armazenadas no banco de dados
                   
                if(recuperaAtual.compareTo(consultaPalavra)==0 && raAtual.compareTo(consultaRa)==0)
                {
                     
                   // se os dados estão de acordo, é puxado os dados de cadastro do aluno
                   
                    nomeAtual=res.getString("nome");
                    idadeAtual=res.getString("idade");
                    raAtual = res.getString("ra");
                    senhaAtual = res.getString("senha");

                    status = 1;
                }
            }
            if(status == 1)
            {
                 
                      // envia os valores puxados e envia aos respectivos campos
                     
                campoIdadeBanco.setText(idadeAtual);
                campoNomeBanco.setText(nomeAtual);
                campoSenhaNovo.setText(senhaAtual);
                campoRaBanco.setText(raAtual);
            }
            if(status == 0)
            {
                JOptionPane.showMessageDialog(null,"R.A: "+consultaRa+" n�o encontrado!!!","Erro",JOptionPane.ERROR_MESSAGE);
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

/**
     * Método para confirmar a edição da senha
     */
      public void confirmarAlteracao()
      {
           String classeDriver = "com.mysql.cj.jdbc.Driver";
        String stringConexao = "jdbc:mysql://localhost/aplicativo_educacional";
        String login = "root";
        String senha = "";
        Connection con;
        String sql;

        senhaNovo = campoSenhaNovo.getText();
        con = null;

        sql = "SELECT *From aluno";
        try
        {
       
             //conexão com o banco de dados
             
            Class.forName(classeDriver);
            con = DriverManager.getConnection(stringConexao, login, senha);
            PreparedStatement stmt = con.prepareStatement(sql);
    
     //realização do update para a alteração da senha
     
            int x=stmt.executeUpdate("UPDATE aluno SET senha='"+senhaNovo+"' WHERE nome='"+nomeAtual+"'");
            if (x == 1 )
            JOptionPane.showMessageDialog(null,"Senha atualizada com sucesso!","",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.INFORMATION_MESSAGE);
        }
      }
}
