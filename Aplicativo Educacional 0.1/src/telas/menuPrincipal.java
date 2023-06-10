
package telas;
   import jogos.PtUm;
   import jogos.QAUm;
   import jogos.QEUm;
   import jogos.MtUm;
/**
 * Inicia a classe menuPrincipal
 * @author Felipe
 */
public class menuPrincipal extends javax.swing.JFrame
{
    private PtUm TelaPtUm;
    private QAUm TelaQAUm;
    private QEUm TelaQEUm;
    private MtUm TelaMtUm;
     private JogoPersonalizado TelaJpUm;
     private alterarSenhaAluno altSen;
      /**
     * Método construtor que instancia a classe menuPrincipal
     */
    public menuPrincipal()
    {
        initComponents();
        TelaPtUm = new PtUm();
        TelaQAUm = new QAUm();
        TelaQEUm = new QEUm();
        TelaMtUm = new MtUm();
          TelaJpUm = new JogoPersonalizado();
          altSen = new alterarSenhaAluno();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        PainelmenuPrincipal = new javax.swing.JPanel();
        jlmenuPrincipal = new javax.swing.JLabel();
        btmenuPrincipalPt = new javax.swing.JButton();
        btmenuPrincipalMt = new javax.swing.JButton();
        btmenuPrincipalQC = new javax.swing.JButton();
        btmenuPrincipalQA = new javax.swing.JButton();
        btmenuPrincipalQP = new javax.swing.JButton();
        btmenuPrincipalSair = new javax.swing.JButton();
        btmenuPrincipalAlterarDados = new javax.swing.JButton();

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("Edit");
        jMenuBar1.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 420));

        PainelmenuPrincipal.setPreferredSize(new java.awt.Dimension(700, 420));
        PainelmenuPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlmenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/menuPrincipal.png"))); // NOI18N
        PainelmenuPrincipal.add(jlmenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btmenuPrincipalPt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btmenuPrincipalPt.setText("Português");
        btmenuPrincipalPt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalPtActionPerformed(evt);
            }
        });
        PainelmenuPrincipal.add(btmenuPrincipalPt, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 105, 350, 47));

        btmenuPrincipalMt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btmenuPrincipalMt.setText("Matemática");
        btmenuPrincipalMt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalMtActionPerformed(evt);
            }
        });
        PainelmenuPrincipal.add(btmenuPrincipalMt, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 162, 350, 47));

        btmenuPrincipalQC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btmenuPrincipalQC.setText("Qual é a cor?");
        btmenuPrincipalQC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalQCActionPerformed(evt);
            }
        });
        PainelmenuPrincipal.add(btmenuPrincipalQC, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 219, 350, 47));

        btmenuPrincipalQA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btmenuPrincipalQA.setText("Qual é o animal?");
        btmenuPrincipalQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalQAActionPerformed(evt);
            }
        });
        PainelmenuPrincipal.add(btmenuPrincipalQA, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 278, 350, 46));

        btmenuPrincipalQP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btmenuPrincipalQP.setText("Jogo Personalizado");
        btmenuPrincipalQP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalQPActionPerformed(evt);
            }
        });
        PainelmenuPrincipal.add(btmenuPrincipalQP, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 337, 350, 47));

        btmenuPrincipalSair.setText("Sair da Conta");
        btmenuPrincipalSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalSairActionPerformed(evt);
            }
        });
        PainelmenuPrincipal.add(btmenuPrincipalSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 11, 80, 40));

        btmenuPrincipalAlterarDados.setText("Alterar Dados");
        btmenuPrincipalAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalAlterarDadosActionPerformed(evt);
            }
        });
        PainelmenuPrincipal.add(btmenuPrincipalAlterarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 8, 80, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelmenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelmenuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmenuPrincipalPtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalPtActionPerformed
      TelaPtUm.setVisible(true);
      dispose();
        
    }//GEN-LAST:event_btmenuPrincipalPtActionPerformed

    private void btmenuPrincipalQCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalQCActionPerformed
     TelaQEUm.setVisible(true);
     dispose();
    }//GEN-LAST:event_btmenuPrincipalQCActionPerformed

    private void btmenuPrincipalQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalQAActionPerformed
      TelaQAUm.setVisible(true);
      dispose();
    }//GEN-LAST:event_btmenuPrincipalQAActionPerformed

    private void btmenuPrincipalMtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalMtActionPerformed
      TelaMtUm.setVisible(true);
      dispose();
    }//GEN-LAST:event_btmenuPrincipalMtActionPerformed

    private void btmenuPrincipalQPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalQPActionPerformed
        TelaJpUm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btmenuPrincipalQPActionPerformed

    private void btmenuPrincipalSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalSairActionPerformed
        new loginAluno().show();
        dispose();
    }//GEN-LAST:event_btmenuPrincipalSairActionPerformed

    private void btmenuPrincipalAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalAlterarDadosActionPerformed
      altSen.setVisible(true);
      dispose();
    }//GEN-LAST:event_btmenuPrincipalAlterarDadosActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelmenuPrincipal;
    private javax.swing.JButton btmenuPrincipalAlterarDados;
    private javax.swing.JButton btmenuPrincipalMt;
    private javax.swing.JButton btmenuPrincipalPt;
    private javax.swing.JButton btmenuPrincipalQA;
    private javax.swing.JButton btmenuPrincipalQC;
    private javax.swing.JButton btmenuPrincipalQP;
    private javax.swing.JButton btmenuPrincipalSair;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jlmenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
