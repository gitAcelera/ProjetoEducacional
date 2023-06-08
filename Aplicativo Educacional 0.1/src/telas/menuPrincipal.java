
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
        jPanel2 = new javax.swing.JPanel();
        btPt = new javax.swing.JButton();
        btMt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btQA = new javax.swing.JButton();
        btQC = new javax.swing.JButton();
        btJp = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btLogoff = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("Edit");
        jMenuBar1.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 420));

        jPanel2.setPreferredSize(new java.awt.Dimension(700, 420));

        btPt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPt.setText("Português");
        btPt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtActionPerformed(evt);
            }
        });

        btMt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMt.setText("Matemática");
        btMt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtActionPerformed(evt);
            }
        });

        jButton1.setText("imagem");

        btQA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQA.setText("Qual é o animal?");
        btQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAActionPerformed(evt);
            }
        });

        btQC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQC.setText("Qual é a cor?");
        btQC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQCActionPerformed(evt);
            }
        });

        btJp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btJp.setText("Jogo Personalizado");
        btJp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJpActionPerformed(evt);
            }
        });

        jButton2.setText("Sair da Conta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btLogoff.setText("Encerrar");

        jButton3.setText("Alterar Dados");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btJp, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQA, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQC, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(151, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btLogoff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addGap(41, 41, 41))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(btLogoff))
                        .addGap(22, 22, 22)
                        .addComponent(jButton3)
                        .addGap(44, 44, 44)
                        .addComponent(btPt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btMt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btQA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btQC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btJp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtActionPerformed
      TelaPtUm.setVisible(true);
      dispose();
        
    }//GEN-LAST:event_btPtActionPerformed

    private void btQCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQCActionPerformed
     TelaQEUm.setVisible(true);
     dispose();
    }//GEN-LAST:event_btQCActionPerformed

    private void btQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAActionPerformed
      TelaQAUm.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQAActionPerformed

    private void btMtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtActionPerformed
      TelaMtUm.setVisible(true);
      dispose();
    }//GEN-LAST:event_btMtActionPerformed

    private void btJpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJpActionPerformed
        TelaJpUm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btJpActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new loginAluno().show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      altSen.setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btJp;
    private javax.swing.JButton btLogoff;
    private javax.swing.JButton btMt;
    private javax.swing.JButton btPt;
    private javax.swing.JButton btQA;
    private javax.swing.JButton btQC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
