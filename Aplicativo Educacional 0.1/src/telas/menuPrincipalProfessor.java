
package telas;

/**
 * Inicia a classe menuPrincipalProfessor
 * @author Izabelle
 */
public class menuPrincipalProfessor extends javax.swing.JFrame {
private personalizarJogo jogoPer;
private classiAluno clasAlu;

    /**
     * Método construtor da classe menuPrincipalProfessor
     */
    public menuPrincipalProfessor() {
        initComponents();
        jogoPer= new personalizarJogo();
        clasAlu = new classiAluno();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelmenuPrincipalProfessor = new javax.swing.JPanel();
        jlmenuPrincipalProfessor = new javax.swing.JLabel();
        btmenuPrincipalProfessorPJ = new javax.swing.JButton();
        btmenuPrincipalProfessorCA = new javax.swing.JButton();
        btmenuPrincipalProfessorSair = new javax.swing.JButton();
        btmenuPrincipalProfessorEncerrar = new javax.swing.JButton();
        btmenuPrincipalProfessorInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelmenuPrincipalProfessor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlmenuPrincipalProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/menuPrincipalProfessor.png"))); // NOI18N
        PainelmenuPrincipalProfessor.add(jlmenuPrincipalProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btmenuPrincipalProfessorPJ.setText("Personalizar Jogos");
        btmenuPrincipalProfessorPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalProfessorPJActionPerformed(evt);
            }
        });
        PainelmenuPrincipalProfessor.add(btmenuPrincipalProfessorPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 147, 300, 40));

        btmenuPrincipalProfessorCA.setText("Classificação dos Alunos");
        btmenuPrincipalProfessorCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalProfessorCAActionPerformed(evt);
            }
        });
        PainelmenuPrincipalProfessor.add(btmenuPrincipalProfessorCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 203, 300, 40));

        btmenuPrincipalProfessorSair.setText("Sair da Conta");
        btmenuPrincipalProfessorSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalProfessorSairActionPerformed(evt);
            }
        });
        PainelmenuPrincipalProfessor.add(btmenuPrincipalProfessorSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 269, 140, 40));

        btmenuPrincipalProfessorEncerrar.setText("Encerrar");
        btmenuPrincipalProfessorEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalProfessorEncerrarActionPerformed(evt);
            }
        });
        PainelmenuPrincipalProfessor.add(btmenuPrincipalProfessorEncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 269, 150, 40));

        btmenuPrincipalProfessorInformacao.setText("jButton4");
        PainelmenuPrincipalProfessor.add(btmenuPrincipalProfessorInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelmenuPrincipalProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelmenuPrincipalProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmenuPrincipalProfessorPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalProfessorPJActionPerformed
 jogoPer.setVisible(true);       
    }//GEN-LAST:event_btmenuPrincipalProfessorPJActionPerformed

    private void btmenuPrincipalProfessorSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalProfessorSairActionPerformed
        new loginProfessor().show();
        dispose();
    }//GEN-LAST:event_btmenuPrincipalProfessorSairActionPerformed

    private void btmenuPrincipalProfessorEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalProfessorEncerrarActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btmenuPrincipalProfessorEncerrarActionPerformed

    private void btmenuPrincipalProfessorCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalProfessorCAActionPerformed
  clasAlu.setVisible(true);      
    }//GEN-LAST:event_btmenuPrincipalProfessorCAActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelmenuPrincipalProfessor;
    private javax.swing.JButton btmenuPrincipalProfessorCA;
    private javax.swing.JButton btmenuPrincipalProfessorEncerrar;
    private javax.swing.JButton btmenuPrincipalProfessorInformacao;
    private javax.swing.JButton btmenuPrincipalProfessorPJ;
    private javax.swing.JButton btmenuPrincipalProfessorSair;
    private javax.swing.JLabel jlmenuPrincipalProfessor;
    // End of variables declaration//GEN-END:variables
}
