
package telas;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * Inicia a classe loginProfessor
 * @author Izabelle
 */
public class loginProfessor extends javax.swing.JFrame {
    private  menuPrincipalProfessor mpp;
    private recuperaSenhaProfessor rsp;
     private loginDirecao lD;
    
    String cpfAtual,senhaAtual,cpfBanco,senhaBanco;
    /**
     * Método construtor que instancia as classes
     */
    public loginProfessor() {
        initComponents();
        mpp = new menuPrincipalProfessor();
        rsp = new recuperaSenhaProfessor();
        lD= new loginDirecao();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelloginProfessor = new javax.swing.JPanel();
        jlloginProfessor = new javax.swing.JLabel();
        loginProfessorSenha = new javax.swing.JPasswordField();
        loginProfessorCPF = new javax.swing.JFormattedTextField();
        loginProfessorMostrarSenha = new javax.swing.JCheckBox();
        btloginProfessorEntrar = new javax.swing.JButton();
        btloginProfessorVoltar = new javax.swing.JButton();
        btloginProfessorRecuperarSenha = new javax.swing.JButton();
        btloginProfessorDirecao = new javax.swing.JButton();
        btloginProfessorInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 420));

        PainelloginProfessor.setPreferredSize(new java.awt.Dimension(700, 420));
        PainelloginProfessor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlloginProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/loginProfessor.png"))); // NOI18N
        jlloginProfessor.setText("CPF");
        PainelloginProfessor.add(jlloginProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        loginProfessorSenha.setBackground(new java.awt.Color(184, 135, 191));
        loginProfessorSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginProfessorSenha.setForeground(new java.awt.Color(255, 255, 255));
        loginProfessorSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginProfessorSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginProfessorSenhaActionPerformed(evt);
            }
        });
        PainelloginProfessor.add(loginProfessorSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 213, 280, 20));

        loginProfessorCPF.setBackground(new java.awt.Color(184, 135, 191));
        loginProfessorCPF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginProfessorCPF.setForeground(new java.awt.Color(255, 255, 255));
        try {
            loginProfessorCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        loginProfessorCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginProfessorCPFActionPerformed(evt);
            }
        });
        PainelloginProfessor.add(loginProfessorCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 142, 270, 20));

        loginProfessorMostrarSenha.setText("Mostrar senha");
        loginProfessorMostrarSenha.setContentAreaFilled(false);
        loginProfessorMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginProfessorMostrarSenhaActionPerformed(evt);
            }
        });
        PainelloginProfessor.add(loginProfessorMostrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 260, 140, 27));

        btloginProfessorEntrar.setText("ENTRAR");
        btloginProfessorEntrar.setContentAreaFilled(false);
        btloginProfessorEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginProfessorEntrarActionPerformed(evt);
            }
        });
        PainelloginProfessor.add(btloginProfessorEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 350, 80, 40));

        btloginProfessorVoltar.setText("VOLTAR");
        btloginProfessorVoltar.setContentAreaFilled(false);
        btloginProfessorVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginProfessorVoltarActionPerformed(evt);
            }
        });
        PainelloginProfessor.add(btloginProfessorVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 350, 80, 40));

        btloginProfessorRecuperarSenha.setText("Esqueci a Senha");
        btloginProfessorRecuperarSenha.setContentAreaFilled(false);
        btloginProfessorRecuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginProfessorRecuperarSenhaActionPerformed(evt);
            }
        });
        PainelloginProfessor.add(btloginProfessorRecuperarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 260, 153, 30));

        btloginProfessorDirecao.setText("DIREÇÃO");
        btloginProfessorDirecao.setContentAreaFilled(false);
        btloginProfessorDirecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginProfessorDirecaoActionPerformed(evt);
            }
        });
        PainelloginProfessor.add(btloginProfessorDirecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 80, 40));

        btloginProfessorInformacao.setText("jButton1");
        btloginProfessorInformacao.setContentAreaFilled(false);
        PainelloginProfessor.add(btloginProfessorInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelloginProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelloginProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btloginProfessorVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginProfessorVoltarActionPerformed
        new telaProfessor().show();
        dispose();
    }//GEN-LAST:event_btloginProfessorVoltarActionPerformed

    private void btloginProfessorEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginProfessorEntrarActionPerformed
       verificaLoginProfessor();
    }//GEN-LAST:event_btloginProfessorEntrarActionPerformed

    private void loginProfessorSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginProfessorSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginProfessorSenhaActionPerformed

    private void loginProfessorMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginProfessorMostrarSenhaActionPerformed
       if(loginProfessorMostrarSenha.isSelected()) 
{
    loginProfessorSenha.setEchoChar((char)0);
}
else 
{
 loginProfessorSenha.setEchoChar('*');   
}
    }//GEN-LAST:event_loginProfessorMostrarSenhaActionPerformed

    private void loginProfessorCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginProfessorCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginProfessorCPFActionPerformed

    private void btloginProfessorRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginProfessorRecuperarSenhaActionPerformed

       rsp.setVisible(true);
       dispose();
    }//GEN-LAST:event_btloginProfessorRecuperarSenhaActionPerformed

    private void btloginProfessorDirecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginProfessorDirecaoActionPerformed
 lD.setVisible(true); 
 dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btloginProfessorDirecaoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelloginProfessor;
    private javax.swing.JButton btloginProfessorDirecao;
    private javax.swing.JButton btloginProfessorEntrar;
    private javax.swing.JButton btloginProfessorInformacao;
    private javax.swing.JButton btloginProfessorRecuperarSenha;
    private javax.swing.JButton btloginProfessorVoltar;
    private javax.swing.JLabel jlloginProfessor;
    private javax.swing.JFormattedTextField loginProfessorCPF;
    private javax.swing.JCheckBox loginProfessorMostrarSenha;
    private javax.swing.JPasswordField loginProfessorSenha;
    // End of variables declaration//GEN-END:variables

    
    /**
     * Método responsável pela validação do login do professor
     */
   public void verificaLoginProfessor()
   {
       int status;
        try
        {
                // conexão com o banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional","root","");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * from professor");
  
            // pega os valores do cpf e senha digitadas pelo professor
            cpfAtual = loginProfessorCPF.getText();
            senhaAtual = loginProfessorSenha.getText();

            status =0;
            while(res.next())

            {
           // pega os valores do cpf e senha do banco
                cpfBanco = res.getString("cpf");
                senhaBanco = res.getString("senha");
                
 // faz a comparação dos valores digitados pelo professor com as armazenadas no banco de dados
                if(cpfBanco.compareTo(cpfAtual)==0 && senhaBanco.compareTo(senhaAtual)==0 )
                

                {
                    status=1;
                }

            }

            if(status == 1)
            {
// se os dados estão de acordo, =o aluno vai para o menu principal do Professor
               mpp.setVisible(true);
            dispose();

            }
            if(status == 0)
            {
                JOptionPane.showMessageDialog(null,"Erro nos dados informados!!!","Erro",JOptionPane.ERROR_MESSAGE);
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
