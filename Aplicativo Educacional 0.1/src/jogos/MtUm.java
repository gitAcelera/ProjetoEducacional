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
public class MtUm extends javax.swing.JFrame {
  private MtDois TelaMtDois;
    /**
     * Creates new form MtUm
     */
    public MtUm() {
        initComponents();
        TelaMtDois = new MtDois();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMtUm = new javax.swing.JPanel();
        jlMtUmA = new javax.swing.JLabel();
        jlMtUmB = new javax.swing.JLabel();
        btMtUmA = new javax.swing.JButton();
        btMtUmB = new javax.swing.JButton();
        btMtUmC = new javax.swing.JButton();
        btMtUmD = new javax.swing.JButton();
        btAvancar = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 420));

        PainelMtUm.setPreferredSize(new java.awt.Dimension(700, 400));

        jlMtUmA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtUmA.setText("Qual o valor da operação");

        jlMtUmB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlMtUmB.setText("\" 7 + 5 \"");

        btMtUmA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtUmA.setText("10");

        btMtUmB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtUmB.setText("8");
        btMtUmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtUmBActionPerformed(evt);
            }
        });

        btMtUmC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtUmC.setText("2");

        btMtUmD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btMtUmD.setText("12");
        btMtUmD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMtUmDActionPerformed(evt);
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

        javax.swing.GroupLayout PainelMtUmLayout = new javax.swing.GroupLayout(PainelMtUm);
        PainelMtUm.setLayout(PainelMtUmLayout);
        PainelMtUmLayout.setHorizontalGroup(
            PainelMtUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMtUmLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(PainelMtUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btMtUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMtUmC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(PainelMtUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btMtUmD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMtUmB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btAvancar)
                .addGap(23, 23, 23))
            .addGroup(PainelMtUmLayout.createSequentialGroup()
                .addGroup(PainelMtUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelMtUmLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jlMtUmB))
                    .addGroup(PainelMtUmLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jlMtUmA))
                    .addGroup(PainelMtUmLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btVoltarMenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelMtUmLayout.setVerticalGroup(
            PainelMtUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMtUmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltarMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(PainelMtUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAvancar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMtUmLayout.createSequentialGroup()
                        .addComponent(jlMtUmA)
                        .addGap(18, 18, 18)
                        .addComponent(jlMtUmB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelMtUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btMtUmA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMtUmB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(PainelMtUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btMtUmC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMtUmD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMtUm, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMtUmBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtUmBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMtUmBActionPerformed

    private void btMtUmDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMtUmDActionPerformed
        TelaMtDois.setVisible(true);
        dispose();
    }//GEN-LAST:event_btMtUmDActionPerformed

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed
        TelaMtDois.setVisible(true);
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
    private javax.swing.JPanel PainelMtUm;
    private javax.swing.JButton btAvancar;
    private javax.swing.JButton btMtUmA;
    private javax.swing.JButton btMtUmB;
    private javax.swing.JButton btMtUmC;
    private javax.swing.JButton btMtUmD;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jlMtUmA;
    private javax.swing.JLabel jlMtUmB;
    // End of variables declaration//GEN-END:variables
}