/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogos;

/**
 *
 * @author fellr
 */
public class QASete extends javax.swing.JFrame {
    private QAOito TelaQAOito;
    /**
     * Creates new form QASete
     */
    public QASete() {
        initComponents();
        TelaQAOito = new QAOito();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQASete = new javax.swing.JPanel();
        jlQASeteA = new javax.swing.JLabel();
        jlQASeteB = new javax.swing.JLabel();
        btQASeteA = new javax.swing.JButton();
        btQASeteB = new javax.swing.JButton();
        btQASeteC = new javax.swing.JButton();
        btQASeteD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlQASeteA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQASeteA.setText("Qual dos animais a seguir NÃO pode ");

        jlQASeteB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQASeteB.setText("ser um animal de estimação?");

        btQASeteA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQASeteA.setText("GATO");

        btQASeteB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQASeteB.setText("ONÇA");
        btQASeteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQASeteBActionPerformed(evt);
            }
        });

        btQASeteC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQASeteC.setText("CAVALO");
        btQASeteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQASeteCActionPerformed(evt);
            }
        });

        btQASeteD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQASeteD.setText("PATO");

        javax.swing.GroupLayout PainelQASeteLayout = new javax.swing.GroupLayout(PainelQASete);
        PainelQASete.setLayout(PainelQASeteLayout);
        PainelQASeteLayout.setHorizontalGroup(
            PainelQASeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQASeteLayout.createSequentialGroup()
                .addGroup(PainelQASeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelQASeteLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jlQASeteA))
                    .addGroup(PainelQASeteLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(PainelQASeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlQASeteB)
                            .addGroup(PainelQASeteLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(PainelQASeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btQASeteC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btQASeteA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(PainelQASeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btQASeteB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btQASeteD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        PainelQASeteLayout.setVerticalGroup(
            PainelQASeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQASeteLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jlQASeteA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlQASeteB)
                .addGap(36, 36, 36)
                .addGroup(PainelQASeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQASeteA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQASeteB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelQASeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQASeteC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQASeteD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQASete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQASete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQASeteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQASeteCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btQASeteCActionPerformed

    private void btQASeteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQASeteBActionPerformed
     TelaQAOito.setVisible(true);
     dispose();
    }//GEN-LAST:event_btQASeteBActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQASete;
    private javax.swing.JButton btQASeteA;
    private javax.swing.JButton btQASeteB;
    private javax.swing.JButton btQASeteC;
    private javax.swing.JButton btQASeteD;
    private javax.swing.JLabel jlQASeteA;
    private javax.swing.JLabel jlQASeteB;
    // End of variables declaration//GEN-END:variables
}