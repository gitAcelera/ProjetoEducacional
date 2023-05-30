/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogos;

/**
 *
 * @author fellr
 */
public class PtSete extends javax.swing.JFrame {
    private PtOito TelaPtOito;
    /**
     * Creates new form PtSete
     */
    public PtSete() {
        initComponents();
        TelaPtOito = new PtOito();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPtSete = new javax.swing.JPanel();
        jlPtSeteA = new javax.swing.JLabel();
        jlPtSeteB = new javax.swing.JLabel();
        btPtSeteA = new javax.swing.JButton();
        btPtSeteB = new javax.swing.JButton();
        btPtSeteC = new javax.swing.JButton();
        btPtSeteD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);

        jlPtSeteA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtSeteA.setText("Qual das palavras a seguir ");

        jlPtSeteB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtSeteB.setText("NÃO é um pronome:");

        btPtSeteA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtSeteA.setText("EU");
        btPtSeteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtSeteAActionPerformed(evt);
            }
        });

        btPtSeteB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtSeteB.setText("DEU");
        btPtSeteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtSeteBActionPerformed(evt);
            }
        });

        btPtSeteC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtSeteC.setText("NÓS");

        btPtSeteD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtSeteD.setText("TU");

        javax.swing.GroupLayout PainelPtSeteLayout = new javax.swing.GroupLayout(PainelPtSete);
        PainelPtSete.setLayout(PainelPtSeteLayout);
        PainelPtSeteLayout.setHorizontalGroup(
            PainelPtSeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPtSeteLayout.createSequentialGroup()
                .addGroup(PainelPtSeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPtSeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PainelPtSeteLayout.createSequentialGroup()
                            .addGroup(PainelPtSeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btPtSeteA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btPtSeteC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(82, 82, 82)
                            .addGroup(PainelPtSeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btPtSeteD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btPtSeteB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PainelPtSeteLayout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addComponent(jlPtSeteA)))
                    .addGroup(PainelPtSeteLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jlPtSeteB)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        PainelPtSeteLayout.setVerticalGroup(
            PainelPtSeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPtSeteLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlPtSeteA, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPtSeteB, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(PainelPtSeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPtSeteB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPtSeteA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelPtSeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPtSeteC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPtSeteD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelPtSete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtSete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtSeteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtSeteAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPtSeteAActionPerformed

    private void btPtSeteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtSeteBActionPerformed
      TelaPtOito.setVisible(true);
      dispose();
    }//GEN-LAST:event_btPtSeteBActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtSete;
    private javax.swing.JButton btPtSeteA;
    private javax.swing.JButton btPtSeteB;
    private javax.swing.JButton btPtSeteC;
    private javax.swing.JButton btPtSeteD;
    private javax.swing.JLabel jlPtSeteA;
    private javax.swing.JLabel jlPtSeteB;
    // End of variables declaration//GEN-END:variables
}
