/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogos;

/**
 *
 * @author fellr
 */
public class QEOito extends javax.swing.JFrame {
    private QENove TelaQENove;

    /**
     * Creates new form QEOito
     */
    public QEOito() {
        initComponents();
        TelaQENove = new QENove();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQEOito = new javax.swing.JPanel();
        jlQEOitoA = new javax.swing.JLabel();
        btQEOitoA = new javax.swing.JButton();
        btQEOitoB = new javax.swing.JButton();
        btQEOitoC = new javax.swing.JButton();
        btQEOitoD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlQEOitoA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQEOitoA.setText("Qual é a cor do céu durante a noite?");

        btQEOitoA.setBackground(new java.awt.Color(204, 204, 255));
        btQEOitoA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btQEOitoB.setBackground(new java.awt.Color(0, 0, 204));
        btQEOitoB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btQEOitoC.setBackground(new java.awt.Color(153, 153, 255));
        btQEOitoC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btQEOitoD.setBackground(new java.awt.Color(0, 0, 51));
        btQEOitoD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQEOitoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQEOitoDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelQEOitoLayout = new javax.swing.GroupLayout(PainelQEOito);
        PainelQEOito.setLayout(PainelQEOitoLayout);
        PainelQEOitoLayout.setHorizontalGroup(
            PainelQEOitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQEOitoLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(PainelQEOitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PainelQEOitoLayout.createSequentialGroup()
                        .addComponent(btQEOitoA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btQEOitoB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelQEOitoLayout.createSequentialGroup()
                        .addComponent(btQEOitoC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btQEOitoD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelQEOitoLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jlQEOitoA)
                .addGap(57, 57, 57))
        );
        PainelQEOitoLayout.setVerticalGroup(
            PainelQEOitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQEOitoLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jlQEOitoA)
                .addGap(45, 45, 45)
                .addGroup(PainelQEOitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQEOitoA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQEOitoB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(PainelQEOitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQEOitoC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQEOitoD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelQEOito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PainelQEOito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQEOitoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQEOitoDActionPerformed
     TelaQENove.setVisible(true);
     dispose();
    }//GEN-LAST:event_btQEOitoDActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQEOito;
    private javax.swing.JButton btQEOitoA;
    private javax.swing.JButton btQEOitoB;
    private javax.swing.JButton btQEOitoC;
    private javax.swing.JButton btQEOitoD;
    private javax.swing.JLabel jlQEOitoA;
    // End of variables declaration//GEN-END:variables
}
