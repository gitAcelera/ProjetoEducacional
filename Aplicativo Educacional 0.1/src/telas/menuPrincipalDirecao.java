/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;


/**
 * Inicia a classe menuPrincipalDirecao
 * @author Izabelle
 */
public class menuPrincipalDirecao extends javax.swing.JFrame {
      private deletarAluno deleteAluno;
      private deletarProfessor deleteProf;
    /**
     * Método construtor da classe menuPrincipalProfessor
     */
    public menuPrincipalDirecao() {
        initComponents();
        deleteAluno= new deletarAluno ();
        deleteProf= new deletarProfessor();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelmenuPrincipalDirecao = new javax.swing.JPanel();
        jlmenuPrincipalDirecao = new javax.swing.JLabel();
        btmenuPrincipalDirecaoDeletarProfessor = new javax.swing.JButton();
        btmenuPrincipalDirecaoDeletarAluno = new javax.swing.JButton();
        btmenuPrincipalDirecaoEncerrarSessao = new javax.swing.JButton();
        btmenuPrincipalDirecaoSairDaConta = new javax.swing.JButton();
        btmenuPrincipalDirecaoInformacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelmenuPrincipalDirecao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlmenuPrincipalDirecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/menuPrincipalDirecao.png"))); // NOI18N
        PainelmenuPrincipalDirecao.add(jlmenuPrincipalDirecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btmenuPrincipalDirecaoDeletarProfessor.setText("Deletar Professor");
        btmenuPrincipalDirecaoDeletarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalDirecaoDeletarProfessorActionPerformed(evt);
            }
        });
        PainelmenuPrincipalDirecao.add(btmenuPrincipalDirecaoDeletarProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 145, 300, 50));

        btmenuPrincipalDirecaoDeletarAluno.setText("Deletar Aluno");
        btmenuPrincipalDirecaoDeletarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalDirecaoDeletarAlunoActionPerformed(evt);
            }
        });
        PainelmenuPrincipalDirecao.add(btmenuPrincipalDirecaoDeletarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 202, 300, 50));

        btmenuPrincipalDirecaoEncerrarSessao.setText("Encerrar");
        btmenuPrincipalDirecaoEncerrarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalDirecaoEncerrarSessaoActionPerformed(evt);
            }
        });
        PainelmenuPrincipalDirecao.add(btmenuPrincipalDirecaoEncerrarSessao, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 270, 150, 40));

        btmenuPrincipalDirecaoSairDaConta.setText("Sair da Conta");
        btmenuPrincipalDirecaoSairDaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuPrincipalDirecaoSairDaContaActionPerformed(evt);
            }
        });
        PainelmenuPrincipalDirecao.add(btmenuPrincipalDirecaoSairDaConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 140, 40));

        btmenuPrincipalDirecaoInformacao.setText("jButton1");
        PainelmenuPrincipalDirecao.add(btmenuPrincipalDirecaoInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelmenuPrincipalDirecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelmenuPrincipalDirecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmenuPrincipalDirecaoDeletarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalDirecaoDeletarAlunoActionPerformed
       deleteAluno.setVisible(true);
       dispose();
    }//GEN-LAST:event_btmenuPrincipalDirecaoDeletarAlunoActionPerformed

    private void btmenuPrincipalDirecaoEncerrarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalDirecaoEncerrarSessaoActionPerformed
        
      
        System.exit(0);
    }//GEN-LAST:event_btmenuPrincipalDirecaoEncerrarSessaoActionPerformed

    private void btmenuPrincipalDirecaoDeletarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalDirecaoDeletarProfessorActionPerformed
       deleteProf.setVisible(true);
       dispose();
    }//GEN-LAST:event_btmenuPrincipalDirecaoDeletarProfessorActionPerformed

    private void btmenuPrincipalDirecaoSairDaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuPrincipalDirecaoSairDaContaActionPerformed
        new loginProfessor().show();
        dispose();
    }//GEN-LAST:event_btmenuPrincipalDirecaoSairDaContaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelmenuPrincipalDirecao;
    private javax.swing.JButton btmenuPrincipalDirecaoDeletarAluno;
    private javax.swing.JButton btmenuPrincipalDirecaoDeletarProfessor;
    private javax.swing.JButton btmenuPrincipalDirecaoEncerrarSessao;
    private javax.swing.JButton btmenuPrincipalDirecaoInformacao;
    private javax.swing.JButton btmenuPrincipalDirecaoSairDaConta;
    private javax.swing.JLabel jlmenuPrincipalDirecao;
    // End of variables declaration//GEN-END:variables
}
