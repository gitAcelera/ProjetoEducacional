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
public class MtSete extends javax.swing.JFrame {
 
     MtOito TelaMtOito;
    /**
     * Creates new form MtSete
     */
    public MtSete() {

        initComponents();
        TelaMtOito = new MtOito();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlMtSeteA = new javax.swing.JLabel();
        jlMtSeteB = new javax.swing.JLabel();
        btMtSeteA = new javax.swing.JButton();
        btMtSeteB = new javax.swing.JButton();
        btMtSeteD = new javax.swing.JButton();
        btMtSeteC = new javax.swing.JButton();
        btAvancar = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlMtSeteA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtSeteA.setText("Qual o valor da multiplicação");

        jlMtSeteB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtSeteB.setText("\"2 x 3\"");

        btMtSeteA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeteA.setText("5");
        btMtSeteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeteAActionPerformed(evt);
            }
        });

        btMtSeteB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeteB.setText("1");
        btMtSeteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeteBActionPerformed(evt);
            }
        });

        btMtSeteD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeteD.setText("8");
        btMtSeteD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeteDActionPerformed(evt);
            }
        });

        btMtSeteC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtSeteC.setText("6");
        btMtSeteC.setPreferredSize(new java.awt.Dimension(700, 420));
        btMtSeteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtSeteCActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jlMtSeteB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btVoltarMenu)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btMtSeteA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btMtSeteC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btMtSeteD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btMtSeteB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlMtSeteA))))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAvancar)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltarMenu)
                .addGap(11, 11, 11)
                .addComponent(jlMtSeteA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlMtSeteB)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMtSeteA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMtSeteB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMtSeteD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMtSeteC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btAvancar))
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

    private void btMtSeteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeteAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtSeteAActionPerformed

    private void btMtSeteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeteBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtSeteBActionPerformed

    private void btMtSeteDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeteDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtSeteDActionPerformed

    private void btMtSeteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtSeteCActionPerformed
        TelaMtOito.setVisible(true);
        dispose();
    }//GEN-LAST:event_btMtSeteCActionPerformed

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed
        TelaMtOito.setVisible(true);
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
    private javax.swing.JButton btAvancar;
    private javax.swing.JButton btMtSeteA;
    private javax.swing.JButton btMtSeteB;
    private javax.swing.JButton btMtSeteC;
    private javax.swing.JButton btMtSeteD;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlMtSeteA;
    private javax.swing.JLabel jlMtSeteB;
    // End of variables declaration//GEN-END:variables
}
