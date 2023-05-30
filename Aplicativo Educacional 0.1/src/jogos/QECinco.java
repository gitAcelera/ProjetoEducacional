/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogos;

/**
 *
 * @author fellr
 */
public class QECinco extends javax.swing.JFrame {
    private QESeis TelaQESeis;

    /**
     * Creates new form QECinco
     */
    public QECinco() {
        initComponents();
        TelaQESeis = new QESeis();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQECinco = new javax.swing.JPanel();
        jlQECincoA = new javax.swing.JLabel();
        btQECincoA = new javax.swing.JButton();
        btQECincoB = new javax.swing.JButton();
        btQECincoC = new javax.swing.JButton();
        btQECincoD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlQECincoA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQECincoA.setText("Qual é a cor do morango? ");

        btQECincoA.setBackground(new java.awt.Color(255, 51, 51));
        btQECincoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQECincoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQECincoAActionPerformed(evt);
            }
        });

        btQECincoB.setBackground(new java.awt.Color(255, 204, 102));
        btQECincoB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btQECincoC.setBackground(new java.awt.Color(153, 51, 255));
        btQECincoC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btQECincoD.setBackground(new java.awt.Color(255, 0, 153));
        btQECincoD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout PainelQECincoLayout = new javax.swing.GroupLayout(PainelQECinco);
        PainelQECinco.setLayout(PainelQECincoLayout);
        PainelQECincoLayout.setHorizontalGroup(
            PainelQECincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQECincoLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(PainelQECincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlQECincoA)
                    .addGroup(PainelQECincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(PainelQECincoLayout.createSequentialGroup()
                            .addComponent(btQECincoC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btQECincoD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PainelQECincoLayout.createSequentialGroup()
                            .addComponent(btQECincoA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 69, 69)
                            .addComponent(btQECincoB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(134, 134, 134))
        );
        PainelQECincoLayout.setVerticalGroup(
            PainelQECincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQECincoLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jlQECincoA)
                .addGap(42, 42, 42)
                .addGroup(PainelQECincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQECincoA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQECincoB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(PainelQECincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQECincoC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQECincoD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQECinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQECinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQECincoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQECincoAActionPerformed
      TelaQESeis.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQECincoAActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQECinco;
    private javax.swing.JButton btQECincoA;
    private javax.swing.JButton btQECincoB;
    private javax.swing.JButton btQECincoC;
    private javax.swing.JButton btQECincoD;
    private javax.swing.JLabel jlQECincoA;
    // End of variables declaration//GEN-END:variables
}