/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogos;
import telas.menuPrincipal;
/**
 *
 * @author ADM
 */
public class MtDois extends javax.swing.JFrame {
 private MtTres TelaMtTres;
    /**
     * Creates new form MtDois
     */
    public MtDois() {
        initComponents();
        TelaMtTres = new MtTres();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtDois = new javax.swing.JPanel();
        jlMtDoisA = new javax.swing.JLabel();
        jlMtDoisB = new javax.swing.JLabel();
        btMtDoisA = new javax.swing.JButton();
        btMDoisB = new javax.swing.JButton();
        btMtDoisC = new javax.swing.JButton();
        btMtDoisD = new javax.swing.JButton();
        btAvancar = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelMtDois.setPreferredSize(new java.awt.Dimension(700, 420));

        jlMtDoisA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtDoisA.setText("Qual o valor da operação");

        jlMtDoisB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtDoisB.setText("\" 10 + 6 \"");

        btMtDoisA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtDoisA.setText("4");
        btMtDoisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDoisAActionPerformed(evt);
            }
        });

        btMDoisB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMDoisB.setText("16");
        btMDoisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMDoisBActionPerformed(evt);
            }
        });

        btMtDoisC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtDoisC.setText("7");
        btMtDoisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDoisCActionPerformed(evt);
            }
        });

        btMtDoisD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtDoisD.setText("14");
        btMtDoisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtDoisDActionPerformed(evt);
            }
        });

        btAvancar.setText("Avançar");
        btAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvancarActionPerformed(evt);
            }
        });

        btVoltarMenu.setText("Voltar para o MENU");
        btVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelMtDoisLayout = new javax.swing.GroupLayout(PainelMtDois);
        PainelMtDois.setLayout(PainelMtDoisLayout);
        PainelMtDoisLayout.setHorizontalGroup(
            PainelMtDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMtDoisLayout.createSequentialGroup()
                .addGroup(PainelMtDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelMtDoisLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jlMtDoisB))
                    .addComponent(btVoltarMenu)
                    .addGroup(PainelMtDoisLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(PainelMtDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btMtDoisA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMtDoisC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(PainelMtDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btMDoisB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelMtDoisLayout.createSequentialGroup()
                                .addComponent(btMtDoisD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(btAvancar)))))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMtDoisLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlMtDoisA)
                .addGap(147, 147, 147))
        );
        PainelMtDoisLayout.setVerticalGroup(
            PainelMtDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMtDoisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelMtDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelMtDoisLayout.createSequentialGroup()
                        .addComponent(btVoltarMenu)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMtDoisLayout.createSequentialGroup()
                        .addComponent(jlMtDoisA)
                        .addGap(18, 18, 18)
                        .addComponent(jlMtDoisB)
                        .addGap(28, 28, 28)))
                .addGroup(PainelMtDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMtDoisA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMDoisB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PainelMtDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelMtDoisLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(PainelMtDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btMtDoisC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMtDoisD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMtDoisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAvancar)
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtDois, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtDoisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDoisAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtDoisAActionPerformed

    private void btMDoisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMDoisBActionPerformed
     TelaMtTres.setVisible(true);  
     dispose();
    }//GEN-LAST:event_btMDoisBActionPerformed

    private void btMtDoisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDoisCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtDoisCActionPerformed

    private void btMtDoisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtDoisDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtDoisDActionPerformed

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed
        TelaMtTres.setVisible(true);  
     dispose();
    }//GEN-LAST:event_btAvancarActionPerformed

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed
         new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMtDois;
    private javax.swing.JButton btAvancar;
    private javax.swing.JButton btMDoisB;
    private javax.swing.JButton btMtDoisA;
    private javax.swing.JButton btMtDoisC;
    private javax.swing.JButton btMtDoisD;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JLabel jlMtDoisA;
    private javax.swing.JLabel jlMtDoisB;
    // End of variables declaration//GEN-END:variables
}