
package telas;
import Banco.PessoaBD;

/**
 * Inicia a classe classiAluno
 * @author Pedro
 */
public class classiAluno extends javax.swing.JFrame {

    /**
     * ´Método construtor da classe classiAluno
     */
    public classiAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelclassiAluno = new javax.swing.JPanel();
        jsclassiAluno = new javax.swing.JScrollPane();
        campoClassificacao = new javax.swing.JTextArea();
        jlclassiAluno = new javax.swing.JLabel();
        btclassiAlunoConsultar = new javax.swing.JButton();
        btclassiLimpar = new javax.swing.JButton();
        btclassiAlunoSair = new javax.swing.JButton();
        btclassiAlunoInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);

        PainelclassiAluno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoClassificacao.setColumns(20);
        campoClassificacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campoClassificacao.setRows(5);
        jsclassiAluno.setViewportView(campoClassificacao);

        PainelclassiAluno.add(jsclassiAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 6, 590, 310));

        jlclassiAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/classiAluno.png"))); // NOI18N
        PainelclassiAluno.add(jlclassiAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btclassiAlunoConsultar.setText("Consultar");
        btclassiAlunoConsultar.setContentAreaFilled(false);
        btclassiAlunoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclassiAlunoConsultarActionPerformed(evt);
            }
        });
        PainelclassiAluno.add(btclassiAlunoConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 342, 120, 40));

        btclassiLimpar.setText("Limpar");
        btclassiLimpar.setContentAreaFilled(false);
        btclassiLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclassiLimparActionPerformed(evt);
            }
        });
        PainelclassiAluno.add(btclassiLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 342, 120, 40));

        btclassiAlunoSair.setText("Sair");
        btclassiAlunoSair.setContentAreaFilled(false);
        btclassiAlunoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclassiAlunoSairActionPerformed(evt);
            }
        });
        PainelclassiAluno.add(btclassiAlunoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 342, 120, 40));

        btclassiAlunoInformacao.setText("jButton1");
        btclassiAlunoInformacao.setContentAreaFilled(false);
        btclassiAlunoInformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclassiAlunoInformacaoActionPerformed(evt);
            }
        });
        PainelclassiAluno.add(btclassiAlunoInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelclassiAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelclassiAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btclassiAlunoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclassiAlunoConsultarActionPerformed
        
        classificaAlu();
    }//GEN-LAST:event_btclassiAlunoConsultarActionPerformed

    private void btclassiAlunoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclassiAlunoSairActionPerformed
      
        new menuPrincipalProfessor().show();
        dispose();
    }//GEN-LAST:event_btclassiAlunoSairActionPerformed

    private void btclassiLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclassiLimparActionPerformed
       campoClassificacao.setText("");
    }//GEN-LAST:event_btclassiLimparActionPerformed

    private void btclassiAlunoInformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclassiAlunoInformacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btclassiAlunoInformacaoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelclassiAluno;
    private javax.swing.JButton btclassiAlunoConsultar;
    private javax.swing.JButton btclassiAlunoInformacao;
    private javax.swing.JButton btclassiAlunoSair;
    private javax.swing.JButton btclassiLimpar;
    private javax.swing.JTextArea campoClassificacao;
    private javax.swing.JLabel jlclassiAluno;
    private javax.swing.JScrollPane jsclassiAluno;
    // End of variables declaration//GEN-END:variables


/**
 * Método responsável para a representar a classificação dos alunos
 */
  public void classificaAlu()
  {
      PessoaBD pessoaBD = new PessoaBD();

        String dados = pessoaBD.relatorioPessoas();

        campoClassificacao.setText(dados);
  }
}
