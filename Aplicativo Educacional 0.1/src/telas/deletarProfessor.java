
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

        PaineldeletarProfessor = new javax.swing.JPanel();
        jldeletarProfessor = new javax.swing.JLabel();
        deletarProfessorDeletar = new javax.swing.JFormattedTextField();
        btdeletarProfessorVoltar = new javax.swing.JButton();
        btdeletarProfessorDeletar = new javax.swing.JButton();
        btdeletarProfessorInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PaineldeletarProfessor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jldeletarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/deletarProfessor.png"))); // NOI18N
        PaineldeletarProfessor.add(jldeletarProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        deletarProfessorDeletar.setBackground(new java.awt.Color(184, 135, 191));
        deletarProfessorDeletar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deletarProfessorDeletar.setForeground(new java.awt.Color(255, 255, 255));
        try {
            deletarProfessorDeletar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        deletarProfessorDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarProfessorDeletarActionPerformed(evt);
            }
        });
        PaineldeletarProfessor.add(deletarProfessorDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 176, 280, 20));

        btdeletarProfessorVoltar.setText("Voltar");
        btdeletarProfessorVoltar.setContentAreaFilled(false);
        btdeletarProfessorVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeletarProfessorVoltarActionPerformed(evt);
            }
        });
        PaineldeletarProfessor.add(btdeletarProfessorVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 350, 80, 40));

        btdeletarProfessorDeletar.setText("Confirmar");
        btdeletarProfessorDeletar.setContentAreaFilled(false);
        btdeletarProfessorDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeletarProfessorDeletarActionPerformed(evt);
            }
        });
        PaineldeletarProfessor.add(btdeletarProfessorDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 228, 152, 30));

        btdeletarProfessorInformacao.setText("jButton1");
        btdeletarProfessorInformacao.setContentAreaFilled(false);
        btdeletarProfessorInformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeletarProfessorInformacaoActionPerformed(evt);
            }
        });
        PaineldeletarProfessor.add(btdeletarProfessorInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaineldeletarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaineldeletarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btdeletarProfessorVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeletarProfessorVoltarActionPerformed
        new menuPrincipalDirecao().show();
        dispose();
    }//GEN-LAST:event_btdeletarProfessorVoltarActionPerformed

    private void btdeletarProfessorDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeletarProfessorDeletarActionPerformed

        deletarContaProfessor();
    }//GEN-LAST:event_btdeletarProfessorDeletarActionPerformed

    private void deletarProfessorDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarProfessorDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletarProfessorDeletarActionPerformed

    private void btdeletarProfessorInformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeletarProfessorInformacaoActionPerformed
         JOptionPane.showMessageDialog(null,"É a hora de dizer adeus? ʕ⁠´⁠•⁠ ⁠ᴥ⁠•̥⁠`⁠ʔ\nDigite o CPF do Professor pra deletar a conta ");
    }//GEN-LAST:event_btdeletarProfessorInformacaoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaineldeletarProfessor;
    private javax.swing.JButton btdeletarProfessorDeletar;
    private javax.swing.JButton btdeletarProfessorInformacao;
    private javax.swing.JButton btdeletarProfessorVoltar;
    private javax.swing.JFormattedTextField deletarProfessorDeletar;
    private javax.swing.JLabel jldeletarProfessor;
    // End of variables declaration//GEN-END:variables
 
 /**
 * Método qeu permite a direção deletar a conta de um professor
 */
   public void deletarContaProfessor()
   {
       String CpfProfessor;
       
       PessoaBD professorBD = new PessoaBD();
       Pessoa  professorPessoa = new Pessoa();
       
      CpfProfessor = deletarProfessorDeletar.getText();
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
