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
public class MtSeis extends javax.swing.JFrame {
  private MtSete TelaMtSete;
    /**
     * Creates new form MtSeis
     */
    public MtSeis() {
        initComponents();
        TelaMtSete = new MtSete ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtSeis = new javax.swing.JPanel();
        jlMtSeisA = new javax.swing.JLabel();
        jlMtSeisB = new javax.swing.JLabel();
        btMtSeisA = new javax.swing.JButton();
        btMtSeisB = new javax.swing.JButton();
        btMtSeisC = new javax.swing.JButton();
        btMtSeisD = new javax.swing.JButton();
        btAvancar = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelMtSeis.setPreferredSize(new java.awt.Dimension(700, 400));
        PainelMtSeis.setRequestFocusEnabled(false);
        PainelMtSeis.setVerifyInputWhenFocusTarget(false);

        jlMtSeisA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtSeisA.setText("Qual o valor da operação");

        jlMtSeisB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtSeisB.setText("\"12 - 3\"");

        btMtSeisA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeisA.setText("15");
        btMtSeisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeisAActionPerformed(evt);
            }
        });

        btMtSeisB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeisB.setText("5");
        btMtSeisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeisBActionPerformed(evt);
            }
        });

        btMtSeisC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeisC.setText("9");
        btMtSeisC.setPreferredSize(new java.awt.Dimension(700, 420));
        btMtSeisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeisCActionPerformed(evt);
            }
        });

        btMtSeisD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeisD.setText("14");
        btMtSeisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeisDActionPerformed(evt);
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

        javax.swing.GroupLayout PainelMtSeisLayout = new javax.swing.GroupLayout(PainelMtSeis);
        PainelMtSeis.setLayout(PainelMtSeisLayout);
        PainelMtSeisLayout.setHorizontalGroup(
            PainelMtSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMtSeisLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAvancar)
                .addGap(20, 20, 20))
            .addGroup(PainelMtSeisLayout.createSequentialGroup()
                .addGroup(PainelMtSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelMtSeisLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(PainelMtSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PainelMtSeisLayout.createSequentialGroup()
                                .addComponent(btMtSeisC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btMtSeisD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelMtSeisLayout.createSequentialGroup()
                                .addComponent(btMtSeisA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(btMtSeisB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PainelMtSeisLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jlMtSeisB))
                    .addGroup(PainelMtSeisLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jlMtSeisA))
                    .addGroup(PainelMtSeisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btVoltarMenu)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        PainelMtSeisLayout.setVerticalGroup(
            PainelMtSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMtSeisLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btVoltarMenu)
                .addGap(18, 18, 18)
                .addComponent(jlMtSeisA)
                .addGap(18, 18, 18)
                .addComponent(jlMtSeisB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelMtSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMtSeisA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMtSeisB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelMtSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMtSeisC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMtSeisD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(btAvancar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtSeisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeisAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtSeisAActionPerformed

    private void btMtSeisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeisBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtSeisBActionPerformed

    private void btMtSeisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeisCActionPerformed
        TelaMtSete.setVisible(true);
        dispose();
    }//GEN-LAST:event_btMtSeisCActionPerformed

    private void btMtSeisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeisDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtSeisDActionPerformed

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed
         TelaMtSete.setVisible(true);
        dispose();
    }//GEN-LAST:event_btAvancarActionPerformed

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMtSeis;
    private javax.swing.JButton btAvancar;
    private javax.swing.JButton btMtSeisA;
    private javax.swing.JButton btMtSeisB;
    private javax.swing.JButton btMtSeisC;
    private javax.swing.JButton btMtSeisD;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JLabel jlMtSeisA;
    private javax.swing.JLabel jlMtSeisB;
    // End of variables declaration//GEN-END:variables
}