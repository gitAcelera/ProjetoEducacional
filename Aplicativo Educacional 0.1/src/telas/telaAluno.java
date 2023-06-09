
package telas;

/**
 * Inicia a classe telaAluno
 * @author Mateus
 */
public class telaAluno extends javax.swing.JFrame {

    private cadastroAluno cadAl;
    private loginAluno logAl;
     
    /**
     * Método construtor que instancia a classe telaAluno
     */
    public telaAluno() {
        initComponents();
        cadAl = new cadastroAluno();
        logAl = new loginAluno();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaineltelaAluno = new javax.swing.JPanel();
        jltelaAluno = new javax.swing.JLabel();
        bttelaAlunoCadastrar = new javax.swing.JButton();
        bttelaAlunoEntrar = new javax.swing.JButton();
        bttelaAlunoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PaineltelaAluno.setPreferredSize(new java.awt.Dimension(700, 420));
        PaineltelaAluno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jltelaAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaAluno.png"))); // NOI18N
        jltelaAluno.setText("Voce deseja: ");
        PaineltelaAluno.add(jltelaAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        bttelaAlunoCadastrar.setText("CADASTRAR");
        bttelaAlunoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttelaAlunoCadastrarActionPerformed(evt);
            }
        });
        PaineltelaAluno.add(bttelaAlunoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 140, 180, 60));

        bttelaAlunoEntrar.setText("ENTRAR");
        bttelaAlunoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttelaAlunoEntrarActionPerformed(evt);
            }
        });
        PaineltelaAluno.add(bttelaAlunoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 217, 180, 60));

        bttelaAlunoVoltar.setText("VOLTAR");
        bttelaAlunoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttelaAlunoVoltarActionPerformed(evt);
            }
        });
        PaineltelaAluno.add(bttelaAlunoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 353, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaineltelaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaineltelaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttelaAlunoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttelaAlunoCadastrarActionPerformed
        cadAl.setVisible(true);
        dispose();
    }//GEN-LAST:event_bttelaAlunoCadastrarActionPerformed

    private void bttelaAlunoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttelaAlunoEntrarActionPerformed
        logAl.setVisible(true);
        dispose();
    }//GEN-LAST:event_bttelaAlunoEntrarActionPerformed

    private void bttelaAlunoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttelaAlunoVoltarActionPerformed
        new Inicio().show();
        dispose();
    }//GEN-LAST:event_bttelaAlunoVoltarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaineltelaAluno;
    private javax.swing.JButton bttelaAlunoCadastrar;
    private javax.swing.JButton bttelaAlunoEntrar;
    private javax.swing.JButton bttelaAlunoVoltar;
    private javax.swing.JLabel jltelaAluno;
    // End of variables declaration//GEN-END:variables
}
