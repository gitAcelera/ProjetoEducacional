
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

        PainelrecuperarSenhaProfessor = new javax.swing.JPanel();
        jlrecuperarSenhaProfessor = new javax.swing.JLabel();
        recuperarSenhaProfessorCPF = new javax.swing.JFormattedTextField();
        recuperarSenhaProfessorRecuperarSenha = new javax.swing.JTextField();
        btrecuperarSenhaProfessorVoltar = new javax.swing.JButton();
        btrecuperarSenhaProfessorRecuperar = new javax.swing.JButton();
        btrecuperarSenhaProfessorInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 400));

        PainelrecuperarSenhaProfessor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlrecuperarSenhaProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/recuperarSenhaProfessor.png"))); // NOI18N
        PainelrecuperarSenhaProfessor.add(jlrecuperarSenhaProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        recuperarSenhaProfessorCPF.setBackground(new java.awt.Color(184, 135, 191));
        recuperarSenhaProfessorCPF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        recuperarSenhaProfessorCPF.setForeground(new java.awt.Color(255, 255, 255));
        try {
            recuperarSenhaProfessorCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        recuperarSenhaProfessorCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarSenhaProfessorCPFActionPerformed(evt);
            }
        });
        PainelrecuperarSenhaProfessor.add(recuperarSenhaProfessorCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 141, 290, 20));

        recuperarSenhaProfessorRecuperarSenha.setBackground(new java.awt.Color(184, 135, 191));
        recuperarSenhaProfessorRecuperarSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recuperarSenhaProfessorRecuperarSenha.setForeground(new java.awt.Color(255, 255, 255));
        recuperarSenhaProfessorRecuperarSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        recuperarSenhaProfessorRecuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarSenhaProfessorRecuperarSenhaActionPerformed(evt);
            }
        });
        PainelrecuperarSenhaProfessor.add(recuperarSenhaProfessorRecuperarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 211, 280, 20));

        btrecuperarSenhaProfessorVoltar.setText("VOLTAR");
        btrecuperarSenhaProfessorVoltar.setContentAreaFilled(false);
        btrecuperarSenhaProfessorVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btrecuperarSenhaProfessorVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrecuperarSenhaProfessorVoltarActionPerformed(evt);
            }
        });
        PainelrecuperarSenhaProfessor.add(btrecuperarSenhaProfessorVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 350, 80, 40));

        btrecuperarSenhaProfessorRecuperar.setText("Recuperar");
        btrecuperarSenhaProfessorRecuperar.setContentAreaFilled(false);
        btrecuperarSenhaProfessorRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrecuperarSenhaProfessorRecuperarActionPerformed(evt);
            }
        });
        PainelrecuperarSenhaProfessor.add(btrecuperarSenhaProfessorRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 266, 150, 30));

        btrecuperarSenhaProfessorInformacao.setText("jButton1");
        btrecuperarSenhaProfessorInformacao.setContentAreaFilled(false);
        btrecuperarSenhaProfessorInformacao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btrecuperarSenhaProfessorInformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrecuperarSenhaProfessorInformacaoActionPerformed(evt);
            }
        });
        PainelrecuperarSenhaProfessor.add(btrecuperarSenhaProfessorInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelrecuperarSenhaProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelrecuperarSenhaProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recuperarSenhaProfessorCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarSenhaProfessorCPFActionPerformed

    }//GEN-LAST:event_recuperarSenhaProfessorCPFActionPerformed

    private void btrecuperarSenhaProfessorVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrecuperarSenhaProfessorVoltarActionPerformed
        new loginProfessor().show();
        dispose();
    }//GEN-LAST:event_btrecuperarSenhaProfessorVoltarActionPerformed

    private void recuperarSenhaProfessorRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarSenhaProfessorRecuperarSenhaActionPerformed

    }//GEN-LAST:event_recuperarSenhaProfessorRecuperarSenhaActionPerformed

    private void btrecuperarSenhaProfessorRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrecuperarSenhaProfessorRecuperarActionPerformed
        recuperarProfessor();
    }//GEN-LAST:event_btrecuperarSenhaProfessorRecuperarActionPerformed

    private void btrecuperarSenhaProfessorInformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrecuperarSenhaProfessorInformacaoActionPerformed
        JOptionPane.showMessageDialog(null,"Esqueceu a sua senha? (⁠☉⁠｡⁠☉⁠) \nSem problemas! Digite seu CPF e a sua Palavra de Recuperação. (⁠◠⁠‿⁠◕⁠)"  );
    }//GEN-LAST:event_btrecuperarSenhaProfessorInformacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelrecuperarSenhaProfessor;
    private javax.swing.JButton btrecuperarSenhaProfessorInformacao;
    private javax.swing.JButton btrecuperarSenhaProfessorRecuperar;
    private javax.swing.JButton btrecuperarSenhaProfessorVoltar;
    private javax.swing.JLabel jlrecuperarSenhaProfessor;
    private javax.swing.JFormattedTextField recuperarSenhaProfessorCPF;
    private javax.swing.JTextField recuperarSenhaProfessorRecuperarSenha;
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
            consultaCpf = recuperarSenhaProfessorCPF.getText();
            consultaPergunta = recuperarSenhaProfessorRecuperarSenha.getText();

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
