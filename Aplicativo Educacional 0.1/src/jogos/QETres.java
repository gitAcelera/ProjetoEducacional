/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogos;

/**
 *
 * @author fellr
 */
public class QETres extends javax.swing.JFrame {
    private QEQuatro TelaQEQuatro;

    /**
     * Creates new form QETres
     */
    public QETres() {
        initComponents();
        TelaQEQuatro = new QEQuatro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQETres = new javax.swing.JPanel();
        jlQETresA = new javax.swing.JLabel();
        btQETresA = new javax.swing.JButton();
        btQETresB = new javax.swing.JButton();
        btQETresC = new javax.swing.JButton();
        btQETresD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlQETresA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQETresA.setText("Qual é a cor da grama?");

        btQETresA.setBackground(new java.awt.Color(102, 51, 255));
        btQETresA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btQETresB.setBackground(new java.awt.Color(153, 0, 153));
        btQETresB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btQETresC.setBackground(new java.awt.Color(0, 204, 0));
        btQETresC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQETresC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQETresCActionPerformed(evt);
            }
        });

        btQETresD.setBackground(new java.awt.Color(255, 102, 102));
        btQETresD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout PainelQETresLayout = new javax.swing.GroupLayout(PainelQETres);
        PainelQETres.setLayout(PainelQETresLayout);
        PainelQETresLayout.setHorizontalGroup(
            PainelQETresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQETresLayout.createSequentialGroup()
                .addGroup(PainelQETresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelQETresLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(PainelQETresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PainelQETresLayout.createSequentialGroup()
                                .addComponent(btQETresC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btQETresD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelQETresLayout.createSequentialGroup()
                                .addComponent(btQETresA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btQETresB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PainelQETresLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jlQETresA)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        PainelQETresLayout.setVerticalGroup(
            PainelQETresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQETresLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jlQETresA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(PainelQETresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQETresA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQETresB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(PainelQETresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQETresC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQETresD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQETres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQETres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQETresCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQETresCActionPerformed
      TelaQEQuatro.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQETresCActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQETres;
    private javax.swing.JButton btQETresA;
    private javax.swing.JButton btQETresB;
    private javax.swing.JButton btQETresC;
    private javax.swing.JButton btQETresD;
    private javax.swing.JLabel jlQETresA;
    // End of variables declaration//GEN-END:variables
}