/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogos;

/**
 *
 * @author fellr
 */
public class PtNove extends javax.swing.JFrame {
     private PtDez TelaPtDez;
    /**
     * Creates new form PtNove
     */
    public PtNove() {
        initComponents();
        TelaPtDez = new PtDez();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPtNove = new javax.swing.JPanel();
        jlPtNoveA = new javax.swing.JLabel();
        btPtNoveA = new javax.swing.JButton();
        btPtNoveB = new javax.swing.JButton();
        btPtNoveC = new javax.swing.JButton();
        btPtNoveD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlPtNoveA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtNoveA.setText("Qual o plural da palavra \"CASA\"? ");

        btPtNoveA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtNoveA.setText("CASOS");

        btPtNoveB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtNoveB.setText("CANÇÕES");

        btPtNoveC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtNoveC.setText("CASÕES");

        btPtNoveD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtNoveD.setText("CASAS");
        btPtNoveD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtNoveDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelPtNoveLayout = new javax.swing.GroupLayout(PainelPtNove);
        PainelPtNove.setLayout(PainelPtNoveLayout);
        PainelPtNoveLayout.setHorizontalGroup(
            PainelPtNoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPtNoveLayout.createSequentialGroup()
                .addGroup(PainelPtNoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPtNoveLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jlPtNoveA, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelPtNoveLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(PainelPtNoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btPtNoveC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPtNoveA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(PainelPtNoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btPtNoveB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPtNoveD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        PainelPtNoveLayout.setVerticalGroup(
            PainelPtNoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPtNoveLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jlPtNoveA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(PainelPtNoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPtNoveB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPtNoveA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelPtNoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPtNoveC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPtNoveD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtNove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPtNove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtNoveDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtNoveDActionPerformed
      TelaPtDez.setVisible(true);
      dispose();
    }//GEN-LAST:event_btPtNoveDActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtNove;
    private javax.swing.JButton btPtNoveA;
    private javax.swing.JButton btPtNoveB;
    private javax.swing.JButton btPtNoveC;
    private javax.swing.JButton btPtNoveD;
    private javax.swing.JLabel jlPtNoveA;
    // End of variables declaration//GEN-END:variables
}
