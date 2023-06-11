
package telas;
import Banco.PessoaBD;
import Dados.Pessoa;
import javax.swing.JOptionPane;

/**
 * Inicia a classe deletarAluno
 * @author Mateus
 */
public class deletarAluno extends javax.swing.JFrame {

    /**
     * Método construtor da classe  direcaoDelete
     */
    public deletarAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelDeletarAluno = new javax.swing.JPanel();
        jldeletarAluno = new javax.swing.JLabel();
        deletarAlunoDeletar = new javax.swing.JTextField();
        btdeletarAlunoDeletar = new javax.swing.JButton();
        btdeletarAlunoVoltar = new javax.swing.JButton();
        btdeletarAlunoInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelDeletarAluno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jldeletarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/deletarAluno.png"))); // NOI18N
        PainelDeletarAluno.add(jldeletarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        deletarAlunoDeletar.setBackground(new java.awt.Color(184, 135, 191));
        deletarAlunoDeletar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletarAlunoDeletar.setForeground(new java.awt.Color(255, 255, 255));
        deletarAlunoDeletar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deletarAlunoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarAlunoDeletarActionPerformed(evt);
            }
        });
        PainelDeletarAluno.add(deletarAlunoDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 177, 280, 20));

        btdeletarAlunoDeletar.setText("Confirmar");
        btdeletarAlunoDeletar.setContentAreaFilled(false);
        btdeletarAlunoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeletarAlunoDeletarActionPerformed(evt);
            }
        });
        PainelDeletarAluno.add(btdeletarAlunoDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 228, 150, 30));

        btdeletarAlunoVoltar.setText("Voltar");
        btdeletarAlunoVoltar.setContentAreaFilled(false);
        btdeletarAlunoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeletarAlunoVoltarActionPerformed(evt);
            }
        });
        PainelDeletarAluno.add(btdeletarAlunoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 350, 80, 40));

        btdeletarAlunoInformacao.setText("jButton1");
        btdeletarAlunoInformacao.setContentAreaFilled(false);
        btdeletarAlunoInformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeletarAlunoInformacaoActionPerformed(evt);
            }
        });
        PainelDeletarAluno.add(btdeletarAlunoInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelDeletarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelDeletarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btdeletarAlunoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeletarAlunoDeletarActionPerformed
       
        deletarContaAluno();
    }//GEN-LAST:event_btdeletarAlunoDeletarActionPerformed

    private void btdeletarAlunoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeletarAlunoVoltarActionPerformed
       new menuPrincipalDirecao().show();
       dispose();
    }//GEN-LAST:event_btdeletarAlunoVoltarActionPerformed

    private void deletarAlunoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarAlunoDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletarAlunoDeletarActionPerformed

    private void btdeletarAlunoInformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeletarAlunoInformacaoActionPerformed
        JOptionPane.showMessageDialog(null,"É a hora de dizer adeus? ʕ⁠´⁠•⁠ ⁠ᴥ⁠•̥⁠`⁠ʔ\nDigite o R.A do Aluno pra deletar a conta ");
    }//GEN-LAST:event_btdeletarAlunoInformacaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelDeletarAluno;
    private javax.swing.JButton btdeletarAlunoDeletar;
    private javax.swing.JButton btdeletarAlunoInformacao;
    private javax.swing.JButton btdeletarAlunoVoltar;
    private javax.swing.JTextField deletarAlunoDeletar;
    private javax.swing.JLabel jldeletarAluno;
    // End of variables declaration//GEN-END:variables

/**
 * Método que permite a direção deletar a conta de um aluno
 */ 
public void deletarContaAluno()
{
    String raAluno ;
       
       PessoaBD alunoBD = new PessoaBD();
       Pessoa alunoPessoa = new Pessoa();
       
       raAluno = deletarAlunoDeletar.getText();
       alunoPessoa.setRa(raAluno);
       
      
       if (alunoBD.excluirAluno(alunoPessoa)==true)
       {
           JOptionPane.showMessageDialog(null, "Pessoa excluída com sucesso!!!", "Exclusão",JOptionPane.INFORMATION_MESSAGE);
       }
        
        else
	{
		JOptionPane.showMessageDialog(null, "Pessoa não excluída!!!", "Erro",JOptionPane.ERROR_MESSAGE);
	}				
        
    
}

}
