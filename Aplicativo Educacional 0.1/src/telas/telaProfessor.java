
package telas;

/**
 * Inicia a classe telaProfessor
 * @author Izabelle
 */
public class telaProfessor extends javax.swing.JFrame {

    private cadastroProfessor cadProf;
    private loginProfessor logProf;
    
    /**
     * Método construtor que instancia a classe telaProfessor
     */
    public telaProfessor() {
        initComponents();
        cadProf = new cadastroProfessor();
        logProf = new loginProfessor();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaineltelaProfessor = new javax.swing.JPanel();
        jltelaProfessor = new javax.swing.JLabel();
        bttelaProfessorCadastrar = new javax.swing.JButton();
        bttelaProfessorEntrar = new javax.swing.JButton();
        bttelaProfessorVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PaineltelaProfessor.setPreferredSize(new java.awt.Dimension(700, 420));
        PaineltelaProfessor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jltelaProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaProfessor.png"))); // NOI18N
        PaineltelaProfessor.add(jltelaProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        bttelaProfessorCadastrar.setText("CADASTRAR-SE");
        bttelaProfessorCadastrar.setContentAreaFilled(false);
        bttelaProfessorCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttelaProfessorCadastrarActionPerformed(evt);
            }
        });
        PaineltelaProfessor.add(bttelaProfessorCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 138, 180, 60));

        bttelaProfessorEntrar.setText("ENTRAR");
        bttelaProfessorEntrar.setContentAreaFilled(false);
        bttelaProfessorEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttelaProfessorEntrarActionPerformed(evt);
            }
        });
        PaineltelaProfessor.add(bttelaProfessorEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 218, 180, 60));

        bttelaProfessorVoltar.setText("VOLTAR");
        bttelaProfessorVoltar.setContentAreaFilled(false);
        bttelaProfessorVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttelaProfessorVoltarActionPerformed(evt);
            }
        });
        PaineltelaProfessor.add(bttelaProfessorVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 352, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaineltelaProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaineltelaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttelaProfessorCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttelaProfessorCadastrarActionPerformed
        cadProf.setVisible(true);
        dispose();
    }//GEN-LAST:event_bttelaProfessorCadastrarActionPerformed

    private void bttelaProfessorEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttelaProfessorEntrarActionPerformed
        logProf.setVisible(true);
        dispose();
    }//GEN-LAST:event_bttelaProfessorEntrarActionPerformed

    private void bttelaProfessorVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttelaProfessorVoltarActionPerformed
        new Inicio().show();
        dispose();
    }//GEN-LAST:event_bttelaProfessorVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaineltelaProfessor;
    private javax.swing.JButton bttelaProfessorCadastrar;
    private javax.swing.JButton bttelaProfessorEntrar;
    private javax.swing.JButton bttelaProfessorVoltar;
    private javax.swing.JLabel jltelaProfessor;
    // End of variables declaration//GEN-END:variables
}
