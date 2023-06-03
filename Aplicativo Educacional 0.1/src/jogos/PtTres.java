/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogos;
import javax.swing.JOptionPane;
import telas.menuPrincipal;

/**
 *
 * @author aluno
 */
public class PtTres extends javax.swing.JFrame {
private PtQuatro TelaPtQuatro;
    /**
     * Creates new form PtTres
     */
    public PtTres() {
        initComponents();
        TelaPtQuatro = new PtQuatro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPtTres = new javax.swing.JPanel();
        jlPtTresA = new javax.swing.JLabel();
        btPtTresA = new javax.swing.JButton();
        btPtTresB = new javax.swing.JButton();
        btPtTresC = new javax.swing.JButton();
        btPtTresD = new javax.swing.JButton();
        btPtVM = new javax.swing.JButton();
        btPtDica = new javax.swing.JButton();
        btPtAvancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jlPtTresA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlPtTresA.setText("Qual é o contrário da palavra \"ALTO\"?");

        btPtTresA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtTresA.setText("GRANDE");

        btPtTresB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtTresB.setText("FORTE");

        btPtTresC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtTresC.setText("BAIXO");
        btPtTresC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtTresCActionPerformed(evt);
            }
        });

        btPtTresD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btPtTresD.setText("ELEVADO");

        btPtVM.setText("MENU");
        btPtVM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtVMActionPerformed(evt);
            }
        });

        btPtDica.setText("?");
        btPtDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtDicaActionPerformed(evt);
            }
        });

        btPtAvancar.setText("Avançar");
        btPtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPtAvancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelPtTresLayout = new javax.swing.GroupLayout(PainelPtTres);
        PainelPtTres.setLayout(PainelPtTresLayout);
        PainelPtTresLayout.setHorizontalGroup(
            PainelPtTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPtTresLayout.createSequentialGroup()
                .addGroup(PainelPtTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPtTresLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btPtVM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btPtDica))
                    .addGroup(PainelPtTresLayout.createSequentialGroup()
                        .addGroup(PainelPtTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelPtTresLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(PainelPtTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btPtTresA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btPtTresC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(PainelPtTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btPtTresB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PainelPtTresLayout.createSequentialGroup()
                                        .addComponent(btPtTresD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btPtAvancar))))
                            .addGroup(PainelPtTresLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jlPtTresA, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)))
                .addContainerGap())
        );
        PainelPtTresLayout.setVerticalGroup(
            PainelPtTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPtTresLayout.createSequentialGroup()
                .addGroup(PainelPtTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPtTresLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btPtVM))
                    .addGroup(PainelPtTresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btPtDica)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPtTresA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelPtTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPtTresA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPtTresB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PainelPtTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPtTresLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(PainelPtTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btPtTresC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPtTresD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPtTresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPtAvancar)))
                .addGap(30, 30, 30))
        );

        getContentPane().add(PainelPtTres, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPtTresCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtTresCActionPerformed
        TelaPtQuatro.setVisible(true);
      dispose();
    }//GEN-LAST:event_btPtTresCActionPerformed

    private void btPtVMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtVMActionPerformed
        new menuPrincipal().show();
        dispose();
    }//GEN-LAST:event_btPtVMActionPerformed

    private void btPtDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtDicaActionPerformed
        JOptionPane.showMessageDialog(null,"Contrário é aquilo que é oposto, exemplo: o contrario de LEGAL é CHATO");
    }//GEN-LAST:event_btPtDicaActionPerformed

    private void btPtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPtAvancarActionPerformed
        TelaPtQuatro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btPtAvancarActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPtTres;
    private javax.swing.JButton btPtAvancar;
    private javax.swing.JButton btPtDica;
    private javax.swing.JButton btPtTresA;
    private javax.swing.JButton btPtTresB;
    private javax.swing.JButton btPtTresC;
    private javax.swing.JButton btPtTresD;
    private javax.swing.JButton btPtVM;
    private javax.swing.JLabel jlPtTresA;
    // End of variables declaration//GEN-END:variables
}
