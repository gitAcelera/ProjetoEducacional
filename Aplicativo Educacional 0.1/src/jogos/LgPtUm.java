/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogos;

/**
 *
 * @author fellr
 */
public class LgPtUm extends javax.swing.JFrame {
    private LgPtDois TelaLgPtDois;

    /**
     * Creates new form LgPtUm
     */
    public LgPtUm() {
        initComponents();
        TelaLgPtDois = new LgPtDois();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelLgPtUm = new javax.swing.JPanel();
        jlLgPtUmA = new javax.swing.JLabel();
        btLgPtUmA = new javax.swing.JButton();
        btLgPtUmB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlLgPtUmA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlLgPtUmA.setText("Qual é o maior? Escolha um objeto: ");

        btLgPtUmA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btLgPtUmB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btLgPtUmB.setText("Aqui");
        btLgPtUmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLgPtUmBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLgPtUmLayout = new javax.swing.GroupLayout(PainelLgPtUm);
        PainelLgPtUm.setLayout(PainelLgPtUmLayout);
        PainelLgPtUmLayout.setHorizontalGroup(
            PainelLgPtUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLgPtUmLayout.createSequentialGroup()
                .addGroup(PainelLgPtUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLgPtUmLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jlLgPtUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelLgPtUmLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btLgPtUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btLgPtUmB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        PainelLgPtUmLayout.setVerticalGroup(
            PainelLgPtUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLgPtUmLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jlLgPtUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addGroup(PainelLgPtUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLgPtUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLgPtUmB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelLgPtUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelLgPtUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLgPtUmBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLgPtUmBActionPerformed
        TelaLgPtDois.setVisible(true);
        dispose();
    }//GEN-LAST:event_btLgPtUmBActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelLgPtUm;
    private javax.swing.JButton btLgPtUmA;
    private javax.swing.JButton btLgPtUmB;
    private javax.swing.JLabel jlLgPtUmA;
    // End of variables declaration//GEN-END:variables
}
