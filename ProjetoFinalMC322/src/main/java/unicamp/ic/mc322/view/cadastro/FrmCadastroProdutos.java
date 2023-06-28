/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicamp.ic.mc322.view.cadastro;

import java.awt.Color;
import java.lang.reflect.Array;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import unicamp.ic.mc322.model.ClientePF;
import unicamp.ic.mc322.model.Fornecedor;
import unicamp.ic.mc322.model.Funcionario;
import unicamp.ic.mc322.model.Gerente;
import unicamp.ic.mc322.model.Produto;
import unicamp.ic.mc322.util.JMenuFrame;
import unicamp.ic.mc322.util.Util;

public class FrmCadastroProdutos extends javax.swing.JFrame {

        public Funcionario funcionarioLogado;

        public Produto objProduto;

        public FrmCadastroProdutos(Funcionario funcionarioLogado) {
                initComponents();
                this.getContentPane().setBackground(Color.WHITE);
                this.funcionarioLogado = funcionarioLogado;
        }

        public JMenuItem MenuItem() {
                return JMenuFrame.CreateMenuItem("Cadastrar Produtos", this);
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                painel_dados = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                txtcodigo = new javax.swing.JTextField();
                txtNome = new javax.swing.JTextField();
                txtpreco = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                cbfornecedor = new javax.swing.JComboBox<>();
                txtqtdestoque = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                txtpreco1 = new javax.swing.JTextField();
                btnSalvar = new javax.swing.JButton();
                btnExcluir = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Cadastro de Produtos");
                addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowActivated(java.awt.event.WindowEvent evt) {
                                formWindowActivated(evt);
                        }
                });

                jPanel1.setBackground(new java.awt.Color(217, 217, 217));

                jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Cadastro de Produtos");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(23, 23, 23)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(1047, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(20, Short.MAX_VALUE)));

                painel_dados.setBackground(new java.awt.Color(255, 255, 255));
                painel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar"));

                jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel3.setText("Nome");

                jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel4.setText("Preço:");

                jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel8.setText("Qtd. Estoque:");

                txtcodigo.setEditable(false);
                txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                txtpreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel2.setText("Código:");

                jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel14.setText("Fornecedor:");

                cbfornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                txtqtdestoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel5.setText("Preço de compra");

                txtpreco1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
                painel_dados.setLayout(painel_dadosLayout);
                painel_dadosLayout.setHorizontalGroup(
                                painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(painel_dadosLayout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(20, 20, 20)
                                                                                                .addComponent(jLabel5)
                                                                                                .addGap(9, 9, 9)
                                                                                                .addComponent(txtpreco1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                110,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addComponent(jLabel2))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(txtcodigo,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                67,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txtpreco,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txtNome,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                283,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                                .addGroup(painel_dadosLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel14)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(cbfornecedor,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                214,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel8)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(txtqtdestoque,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                164,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(979, Short.MAX_VALUE)));
                painel_dadosLayout.setVerticalGroup(
                                painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(painel_dadosLayout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(txtcodigo,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(12, 12, 12)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(txtNome,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(txtpreco,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel4))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(txtpreco1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel5))
                                                                .addGap(17, 17, 17)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(txtqtdestoque,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(cbfornecedor,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel14))
                                                                .addContainerGap(135, Short.MAX_VALUE)));

                painel_dadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL,
                                new java.awt.Component[] { txtNome, txtpreco });

                btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btnSalvar.setText("Salvar");
                btnSalvar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSalvarActionPerformed(evt);
                        }
                });

                btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btnExcluir.setText("Excluir");
                btnExcluir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnExcluirActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(384, 384, 384)
                                                                .addComponent(btnSalvar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                108,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(66, 66, 66)
                                                                .addComponent(btnExcluir,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                108,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(painel_dados,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                449,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btnExcluir,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                42,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnSalvar,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                42,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(30, 30, 30))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                layout.createSequentialGroup()
                                                                                                .addContainerGap(116,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(painel_dados,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(100,
                                                                                                                Short.MAX_VALUE))));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void formWindowActivated(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowActivated
                cbfornecedor.removeAllItems();
                for (Fornecedor fornecedor : funcionarioLogado.getFilial().listarFornecedores())
                        cbfornecedor.addItem(fornecedor.getNome());
                txtcodigo.setText(String.valueOf(Util.criarId()));
        }// GEN-LAST:event_formWindowActivated

        private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluirActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_btnExcluirActionPerformed

        private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarActionPerformed
                objProduto = new Produto(Integer.parseInt(txtcodigo.getText()), txtNome.getText(),
                                Integer.parseInt(txtqtdestoque.getText()),
                                Double.parseDouble(txtpreco.getText()),
                                Double.parseDouble(txtpreco1.getText()),
                                funcionarioLogado.getFilial()
                                                .selecionarFornecedor(cbfornecedor.getSelectedItem().toString()));

                if (funcionarioLogado.getFilial().addProduto(objProduto)) {
                        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                } else {
                        JOptionPane.showMessageDialog(null, "Produto já cadastrado!");
                }

                txtNome.setText("");
                txtcodigo.setText(String.valueOf(Util.criarId()));
                txtpreco.setText("");
                txtpreco1.setText("");
                txtqtdestoque.setText("");
        }// GEN-LAST:event_btnSalvarActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Windows".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(FrmCadastroProdutos.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(FrmCadastroProdutos.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(FrmCadastroProdutos.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(FrmCadastroProdutos.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new FrmCadastroProdutos(new Gerente(null, null, null, null, null, null, null))
                                                .setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnExcluir;
        private javax.swing.JButton btnSalvar;
        private javax.swing.JComboBox<String> cbfornecedor;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel painel_dados;
        private javax.swing.JTextField txtNome;
        private javax.swing.JTextField txtcodigo;
        private javax.swing.JTextField txtpreco;
        private javax.swing.JTextField txtpreco1;
        private javax.swing.JTextField txtqtdestoque;
        // End of variables declaration//GEN-END:variables
}
