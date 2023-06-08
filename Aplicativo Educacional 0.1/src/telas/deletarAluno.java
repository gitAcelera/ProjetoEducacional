
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

        jPanel1 = new javax.swing.JPanel();
        nomeAlunoDeletar = new javax.swing.JLabel();
        campoNomeRaDeletar = new javax.swing.JTextField();
        btConfirmarDelete = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeAlunoDeletar.setText("Digite o RA do Aluno ");

        campoNomeRaDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeRaDeletarActionPerformed(evt);
            }
        });

        btConfirmarDelete.setText("Confirmar");
        btConfirmarDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarDeleteActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeAlunoDeletar)
                            .addComponent(campoNomeRaDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConfirmarDelete)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btVoltar)))
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btVoltar)
                .addGap(63, 63, 63)
                .addComponent(nomeAlunoDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNomeRaDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(btConfirmarDelete)
                .addGap(73, 73, 73))
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

    private void btConfirmarDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarDeleteActionPerformed
       
        deletarContaAluno();
    }//GEN-LAST:event_btConfirmarDeleteActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
       new menuPrincipalDirecao().show();
       dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void campoNomeRaDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeRaDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeRaDeletarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmarDelete;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField campoNomeRaDeletar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeAlunoDeletar;
    // End of variables declaration//GEN-END:variables

/**
 * Método que permite a direção deletar a conta de um aluno
 */ 
public void deletarContaAluno()
{
    String raAluno ;
       
       PessoaBD alunoBD = new PessoaBD();
       Pessoa alunoPessoa = new Pessoa();
       
       raAluno = campoNomeRaDeletar.getText();
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
