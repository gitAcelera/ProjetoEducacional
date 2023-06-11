
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

        PainelalterarSenhaAluno = new javax.swing.JPanel();
        jlalterarSenhaAluno = new javax.swing.JLabel();
        alterarSenhaAlunoRA = new javax.swing.JTextField();
        alterarSenhaAlunoPalavraChave = new javax.swing.JTextField();
        alterarSenhaAlunoNomeNovo = new javax.swing.JTextField();
        alterarSenhaAlunoIdadeNovo = new javax.swing.JTextField();
        alterarSenhaAlunoRANovo = new javax.swing.JTextField();
        alterarSenhaAlunoSenhaNovo = new javax.swing.JTextField();
        alterarSenhaAlunoMenu = new javax.swing.JButton();
        btalterarSenhaAlunoConfirmar = new javax.swing.JButton();
        btalterarSenhaAlunoAlterar = new javax.swing.JButton();
        btalterarSenhaAlunoInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));

        PainelalterarSenhaAluno.setMaximumSize(new java.awt.Dimension(700, 400));
        PainelalterarSenhaAluno.setMinimumSize(new java.awt.Dimension(700, 400));
        PainelalterarSenhaAluno.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelalterarSenhaAluno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlalterarSenhaAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alterarSenhaAluno.png"))); // NOI18N
        PainelalterarSenhaAluno.add(jlalterarSenhaAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        alterarSenhaAlunoRA.setBackground(new java.awt.Color(184, 135, 191));
        alterarSenhaAlunoRA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alterarSenhaAlunoRA.setForeground(new java.awt.Color(255, 255, 255));
        alterarSenhaAlunoRA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        alterarSenhaAlunoRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaAlunoRAActionPerformed(evt);
            }
        });
        PainelalterarSenhaAluno.add(alterarSenhaAlunoRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 162, 140, -1));

        alterarSenhaAlunoPalavraChave.setBackground(new java.awt.Color(184, 135, 191));
        alterarSenhaAlunoPalavraChave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alterarSenhaAlunoPalavraChave.setForeground(new java.awt.Color(255, 255, 255));
        alterarSenhaAlunoPalavraChave.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        alterarSenhaAlunoPalavraChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaAlunoPalavraChaveActionPerformed(evt);
            }
        });
        PainelalterarSenhaAluno.add(alterarSenhaAlunoPalavraChave, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 218, 290, -1));

        alterarSenhaAlunoNomeNovo.setEditable(false);
        alterarSenhaAlunoNomeNovo.setBackground(new java.awt.Color(184, 135, 191));
        alterarSenhaAlunoNomeNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alterarSenhaAlunoNomeNovo.setForeground(new java.awt.Color(255, 255, 255));
        alterarSenhaAlunoNomeNovo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PainelalterarSenhaAluno.add(alterarSenhaAlunoNomeNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 156, 280, 20));

        alterarSenhaAlunoIdadeNovo.setEditable(false);
        alterarSenhaAlunoIdadeNovo.setBackground(new java.awt.Color(184, 135, 191));
        alterarSenhaAlunoIdadeNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alterarSenhaAlunoIdadeNovo.setForeground(new java.awt.Color(255, 255, 255));
        alterarSenhaAlunoIdadeNovo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PainelalterarSenhaAluno.add(alterarSenhaAlunoIdadeNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 218, 120, -1));

        alterarSenhaAlunoRANovo.setEditable(false);
        alterarSenhaAlunoRANovo.setBackground(new java.awt.Color(184, 135, 191));
        alterarSenhaAlunoRANovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alterarSenhaAlunoRANovo.setForeground(new java.awt.Color(255, 255, 255));
        alterarSenhaAlunoRANovo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PainelalterarSenhaAluno.add(alterarSenhaAlunoRANovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 215, 130, 20));

        alterarSenhaAlunoSenhaNovo.setBackground(new java.awt.Color(184, 135, 191));
        alterarSenhaAlunoSenhaNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alterarSenhaAlunoSenhaNovo.setForeground(new java.awt.Color(255, 255, 255));
        alterarSenhaAlunoSenhaNovo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        alterarSenhaAlunoSenhaNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaAlunoSenhaNovoActionPerformed(evt);
            }
        });
        PainelalterarSenhaAluno.add(alterarSenhaAlunoSenhaNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 269, 110, 30));

        alterarSenhaAlunoMenu.setText(" MENU");
        alterarSenhaAlunoMenu.setContentAreaFilled(false);
        alterarSenhaAlunoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaAlunoMenuActionPerformed(evt);
            }
        });
        PainelalterarSenhaAluno.add(alterarSenhaAlunoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 13, 80, 40));

        btalterarSenhaAlunoConfirmar.setText("EDITAR");
        btalterarSenhaAlunoConfirmar.setContentAreaFilled(false);
        btalterarSenhaAlunoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalterarSenhaAlunoConfirmarActionPerformed(evt);
            }
        });
        PainelalterarSenhaAluno.add(btalterarSenhaAlunoConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 300, 140, 30));

        btalterarSenhaAlunoAlterar.setText("CONFIRMAR");
        btalterarSenhaAlunoAlterar.setContentAreaFilled(false);
        btalterarSenhaAlunoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalterarSenhaAlunoAlterarActionPerformed(evt);
            }
        });
        PainelalterarSenhaAluno.add(btalterarSenhaAlunoAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 348, 140, 30));

        btalterarSenhaAlunoInformacao.setText("jButton1");
        btalterarSenhaAlunoInformacao.setContentAreaFilled(false);
        btalterarSenhaAlunoInformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalterarSenhaAlunoInformacaoActionPerformed(evt);
            }
        });
        PainelalterarSenhaAluno.add(btalterarSenhaAlunoInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelalterarSenhaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelalterarSenhaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alterarSenhaAlunoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaAlunoMenuActionPerformed
        new menuPrincipal().show();
        dispose();       
    }//GEN-LAST:event_alterarSenhaAlunoMenuActionPerformed

    private void alterarSenhaAlunoRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaAlunoRAActionPerformed
       
    }//GEN-LAST:event_alterarSenhaAlunoRAActionPerformed

    private void alterarSenhaAlunoPalavraChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaAlunoPalavraChaveActionPerformed

    }//GEN-LAST:event_alterarSenhaAlunoPalavraChaveActionPerformed

    private void btalterarSenhaAlunoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarSenhaAlunoConfirmarActionPerformed
      consultaAlu();
    }//GEN-LAST:event_btalterarSenhaAlunoConfirmarActionPerformed

    private void alterarSenhaAlunoSenhaNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaAlunoSenhaNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alterarSenhaAlunoSenhaNovoActionPerformed

    private void btalterarSenhaAlunoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarSenhaAlunoAlterarActionPerformed
        confirmarAlteracao();
    }//GEN-LAST:event_btalterarSenhaAlunoAlterarActionPerformed

    private void btalterarSenhaAlunoInformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarSenhaAlunoInformacaoActionPerformed
      JOptionPane.showMessageDialog(null,"Nesta sessão é possível alterar sua Senha!!\nMas lembre-se: Com Grandes Poderes, Vem Grandes Responsalidades. (⁠◠⁠‿⁠◕⁠)"  );
    }//GEN-LAST:event_btalterarSenhaAlunoInformacaoActionPerformed

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelalterarSenhaAluno;
    private javax.swing.JTextField alterarSenhaAlunoIdadeNovo;
    private javax.swing.JButton alterarSenhaAlunoMenu;
    private javax.swing.JTextField alterarSenhaAlunoNomeNovo;
    private javax.swing.JTextField alterarSenhaAlunoPalavraChave;
    private javax.swing.JTextField alterarSenhaAlunoRA;
    private javax.swing.JTextField alterarSenhaAlunoRANovo;
    private javax.swing.JTextField alterarSenhaAlunoSenhaNovo;
    private javax.swing.JButton btalterarSenhaAlunoAlterar;
    private javax.swing.JButton btalterarSenhaAlunoConfirmar;
    private javax.swing.JButton btalterarSenhaAlunoInformacao;
    private javax.swing.JLabel jlalterarSenhaAluno;
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
                
            consultaRa = alterarSenhaAlunoRA.getText();
            consultaPalavra = alterarSenhaAlunoPalavraChave.getText();
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
                     
                alterarSenhaAlunoIdadeNovo.setText(idadeAtual);
                alterarSenhaAlunoNomeNovo.setText(nomeAtual);
                alterarSenhaAlunoSenhaNovo.setText(senhaAtual);
                alterarSenhaAlunoRANovo.setText(raAtual);
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

        senhaNovo = alterarSenhaAlunoSenhaNovo.getText();
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
