/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogos;

/**
 *
 * @author fellr
 */
public class QAQuatro extends javax.swing.JFrame {
    private QACinco TelaQACinco;
    /**
     * Creates new form QAQuatro
     */
    public QAQuatro() {
        initComponents();
        TelaQACinco = new QACinco();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQAQuatro = new javax.swing.JPanel();
        jlQAQuatroA = new javax.swing.JLabel();
        jlQAQuatroB = new javax.swing.JLabel();
        btQAQuatroA = new javax.swing.JButton();
        btQAQuatroB = new javax.swing.JButton();
        btQAQuatroC = new javax.swing.JButton();
        btQAQuatroD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlQAQuatroA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQAQuatroA.setText("Qual animal tem a tromba longa");

        jlQAQuatroB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQAQuatroB.setText("e grande orelhas?");

        btQAQuatroA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAQuatroA.setText("TUCANO");

        btQAQuatroB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAQuatroB.setText("ELEFANTE");
        btQAQuatroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAQuatroBActionPerformed(evt);
            }
        });

        btQAQuatroC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAQuatroC.setText("CROCODILO");

        btQAQuatroD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAQuatroD.setText("GARÇA");

        javax.swing.GroupLayout PainelQAQuatroLayout = new javax.swing.GroupLayout(PainelQAQuatro);
        PainelQAQuatro.setLayout(PainelQAQuatroLayout);
        PainelQAQuatroLayout.setHorizontalGroup(
            PainelQAQuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQAQuatroLayout.createSequentialGroup()
                .addGroup(PainelQAQuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelQAQuatroLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(PainelQAQuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btQAQuatroC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQAQuatroA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(PainelQAQuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btQAQuatroB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQAQuatroD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelQAQuatroLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jlQAQuatroB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQAQuatroLayout.createSequentialGroup()
                .addGap(0, 95, Short.MAX_VALUE)
                .addComponent(jlQAQuatroA)
                .addGap(91, 91, 91))
        );
        PainelQAQuatroLayout.setVerticalGroup(
            PainelQAQuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQAQuatroLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jlQAQuatroA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlQAQuatroB)
                .addGap(31, 31, 31)
                .addGroup(PainelQAQuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQAQuatroA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQAQuatroB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelQAQuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQAQuatroC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQAQuatroD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQAQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQAQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQAQuatroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAQuatroBActionPerformed
      TelaQACinco.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQAQuatroBActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQAQuatro;
    private javax.swing.JButton btQAQuatroA;
    private javax.swing.JButton btQAQuatroB;
    private javax.swing.JButton btQAQuatroC;
    private javax.swing.JButton btQAQuatroD;
    private javax.swing.JLabel jlQAQuatroA;
    private javax.swing.JLabel jlQAQuatroB;
    // End of variables declaration//GEN-END:variables
}