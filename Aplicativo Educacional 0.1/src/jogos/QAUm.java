/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogos;

/**
 *
 * @author fellr
 */
public class QAUm extends javax.swing.JFrame {
    private QADois TelaQADois;

    /**
     * Creates new form QAUm
     */
    public QAUm() {
        initComponents();
        TelaQADois = new QADois();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelQAUm = new javax.swing.JPanel();
        jlQAUmA = new javax.swing.JLabel();
        jlQAUmB = new javax.swing.JLabel();
        btQAUmA = new javax.swing.JButton();
        btQAUmB = new javax.swing.JButton();
        btQAUmC = new javax.swing.JButton();
        btQAUmD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlQAUmA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQAUmA.setText("Qual é o animal que voa e");

        jlQAUmB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlQAUmB.setText("produz mel?");

        btQAUmA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAUmA.setText("MOSQUITO");

        btQAUmB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAUmB.setText("BEIJA-FLOR");

        btQAUmC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAUmC.setText("ABELHA");
        btQAUmC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQAUmCActionPerformed(evt);
            }
        });

        btQAUmD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btQAUmD.setText("BESOURO");

        javax.swing.GroupLayout PainelQAUmLayout = new javax.swing.GroupLayout(PainelQAUm);
        PainelQAUm.setLayout(PainelQAUmLayout);
        PainelQAUmLayout.setHorizontalGroup(
            PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQAUmLayout.createSequentialGroup()
                .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelQAUmLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btQAUmC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQAUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btQAUmD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQAUmB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelQAUmLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jlQAUmA))
                    .addGroup(PainelQAUmLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jlQAUmB)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        PainelQAUmLayout.setVerticalGroup(
            PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelQAUmLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jlQAUmA)
                .addGap(18, 18, 18)
                .addComponent(jlQAUmB)
                .addGap(18, 18, 18)
                .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQAUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQAUmD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelQAUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQAUmC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQAUmB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQAUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelQAUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQAUmCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQAUmCActionPerformed
      TelaQADois.setVisible(true);
      dispose();
    }//GEN-LAST:event_btQAUmCActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelQAUm;
    private javax.swing.JButton btQAUmA;
    private javax.swing.JButton btQAUmB;
    private javax.swing.JButton btQAUmC;
    private javax.swing.JButton btQAUmD;
    private javax.swing.JLabel jlQAUmA;
    private javax.swing.JLabel jlQAUmB;
    // End of variables declaration//GEN-END:variables
}
