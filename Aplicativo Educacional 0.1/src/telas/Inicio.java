
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

        PainelInicio = new javax.swing.JPanel();
        jlInicio = new javax.swing.JLabel();
        btProfessor = new javax.swing.JButton();
        btAluno = new javax.swing.JButton();
        btEncerrarPrograma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inicio.png"))); // NOI18N
        jlInicio.setText("jLabel1");
        PainelInicio.add(jlInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        btProfessor.setText("PROFESSOR");
        btProfessor.setContentAreaFilled(false);
        btProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProfessorActionPerformed(evt);
            }
        });
        PainelInicio.add(btProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 181, 180, 60));

        btAluno.setText("ALUNO");
        btAluno.setContentAreaFilled(false);
        btAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlunoActionPerformed(evt);
            }
        });
        PainelInicio.add(btAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 258, 180, 60));

        btEncerrarPrograma.setText("ENCERRAR SESSÃO");
        btEncerrarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncerrarProgramaActionPerformed(evt);
            }
        });
        PainelInicio.add(btEncerrarPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 333, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PainelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProfessorActionPerformed
      cadLogPr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btProfessorActionPerformed

    private void btAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlunoActionPerformed
        
        cadLogAl.setVisible(true);
        dispose();
    }//GEN-LAST:event_btAlunoActionPerformed

    private void btEncerrarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncerrarProgramaActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btEncerrarProgramaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelInicio;
    private javax.swing.JButton btAluno;
    private javax.swing.JButton btEncerrarPrograma;
    private javax.swing.JButton btProfessor;
    private javax.swing.JLabel jlInicio;
    // End of variables declaration//GEN-END:variables
}
