
package telas;
import Banco.PessoaBD;
import Dados.Pessoa;
import javax.swing.JOptionPane;
/**
 * Inicia a classe deletarProfessor
 * @author Izabelle
 */
public class deletarProfessor extends javax.swing.JFrame {

    /**
     * Método construtor da classe deletarProfessor
     */
    public deletarProfessor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btConfirmarDelete = new javax.swing.JButton();
        campoCpfProfessorDeletar = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite o CPF Professor ");

        btConfirmarDelete.setText("Confirmar");
        btConfirmarDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarDeleteActionPerformed(evt);
            }
        });

        try {
            campoCpfProfessorDeletar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpfProfessorDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfProfessorDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConfirmarDelete)
                            .addComponent(jLabel1)
                            .addComponent(campoCpfProfessorDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltar)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoCpfProfessorDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(btConfirmarDelete)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new menuPrincipalDirecao().show();
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btConfirmarDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarDeleteActionPerformed

        deletarContaProfessor();
    }//GEN-LAST:event_btConfirmarDeleteActionPerformed

    private void campoCpfProfessorDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfProfessorDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfProfessorDeletarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmarDelete;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFormattedTextField campoCpfProfessorDeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
 
 /**
 * Método qeu permite a direção deletar a conta de um professor
 */
   public void deletarContaProfessor()
   {
       String CpfProfessor;
       
       PessoaBD professorBD = new PessoaBD();
       Pessoa  professorPessoa = new Pessoa();
       
      CpfProfessor = campoCpfProfessorDeletar.getText();
       professorPessoa.setCpf(CpfProfessor);
       
       
      if (professorBD.excluirProfessor(professorPessoa)==true)
       {
           JOptionPane.showMessageDialog(null, "Professor excluído com sucesso!!!", "Exclusão",JOptionPane.INFORMATION_MESSAGE);
       }
        
        else
	{
		JOptionPane.showMessageDialog(null, "Pessoa não excluída!!!", "Erro",JOptionPane.ERROR_MESSAGE);
	}	
       
     
   }
























}
