
package telas;

/**
 * Inicia a classe Inicio
 * @author Izabelle
 */
public class Inicio extends javax.swing.JFrame {
 private telaAluno cadLogAl;
    private telaProfessor cadLogPr;
    
    
    /**
     * Método construtor que instancia as classes
     */
    public Inicio() {
        initComponents();
        cadLogAl = new telaAluno();
        cadLogPr = new telaProfessor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        telaInicioImagem = new javax.swing.JLabel();
        btProf = new javax.swing.JButton();
        btAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telaInicioImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inicio.png"))); // NOI18N
        telaInicioImagem.setText("jLabel1");
        jPanel1.add(telaInicioImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        btProf.setText("PROFESSOR");
        btProf.setContentAreaFilled(false);
        btProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProfActionPerformed(evt);
            }
        });
        jPanel1.add(btProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 170, 49));

        btAluno.setText("ALUNO");
        btAluno.setContentAreaFilled(false);
        btAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlunoActionPerformed(evt);
            }
        });
        jPanel1.add(btAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 170, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProfActionPerformed
      cadLogPr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btProfActionPerformed

    private void btAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlunoActionPerformed
        
        cadLogAl.setVisible(true);
        dispose();
    }//GEN-LAST:event_btAlunoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAluno;
    private javax.swing.JButton btProf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel telaInicioImagem;
    // End of variables declaration//GEN-END:variables
}
