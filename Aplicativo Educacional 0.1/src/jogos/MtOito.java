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
public class MtOito extends javax.swing.JFrame {
  private MtNove TelaMtNove;
    /**
     * Creates new form MtOito
     */
    public MtOito() {
        initComponents();
        TelaMtNove = new MtNove();
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
        jlMtOitoA = new javax.swing.JLabel();
        jlMtOitoB = new javax.swing.JLabel();
        btMtOitoA = new javax.swing.JButton();
        btMtOitoB = new javax.swing.JButton();
        btMtOitoC = new javax.swing.JButton();
        btMtOitoD = new javax.swing.JButton();
        btAvancar = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlMtOitoA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtOitoA.setText("Qual o valor da multiplicação");

        jlMtOitoB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtOitoB.setText("\"4 x 2\"");

        btMtOitoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtOitoA.setText("8");
        btMtOitoA.setPreferredSize(new java.awt.Dimension(700, 420));
        btMtOitoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtOitoAActionPerformed(evt);
            }
        });

        btMtOitoB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtOitoB.setText("6");
        btMtOitoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtOitoBActionPerformed(evt);
            }
        });

        btMtOitoC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtOitoC.setText("10");
        btMtOitoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtOitoCActionPerformed(evt);
            }
        });

        btMtOitoD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtOitoD.setText("2");
        btMtOitoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtOitoDActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlMtOitoA)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btVoltarMenu)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btMtOitoC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMtOitoA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btMtOitoB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMtOitoD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btAvancar)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlMtOitoB)
                        .addGap(297, 297, 297))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltarMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jlMtOitoA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlMtOitoB)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btMtOitoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMtOitoA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMtOitoC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMtOitoD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btAvancar)
                .addContainerGap())
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

    private void btMtOitoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtOitoAActionPerformed
       TelaMtNove.setVisible(true);
       dispose();
    }//GEN-LAST:event_btMtOitoAActionPerformed

    private void btMtOitoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtOitoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtOitoBActionPerformed

    private void btMtOitoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtOitoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtOitoCActionPerformed

    private void btMtOitoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtOitoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtOitoDActionPerformed

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed
        TelaMtNove.setVisible(true);
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
    private javax.swing.JButton btMtOitoA;
    private javax.swing.JButton btMtOitoB;
    private javax.swing.JButton btMtOitoC;
    private javax.swing.JButton btMtOitoD;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlMtOitoA;
    private javax.swing.JLabel jlMtOitoB;
    // End of variables declaration//GEN-END:variables
}
