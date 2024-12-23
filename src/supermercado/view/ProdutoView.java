package supermercado.view;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import supermercado.ProdutoController;
import supermercado.ProdutoEntity;
import supermercado.ProdutoDAO;

public class ProdutoView extends javax.swing.JFrame {

    public ProdutoView() {
        initComponents();
        
        // Atualiza a tabela ao clicar nela
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() 
        {
           @Override
           public void mouseClicked(java.awt.event.MouseEvent evt) 
           {
               if (evt.getClickCount() == 1) 
               { // Clique simples
                   atualizarTabela();
               }
           }
       });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textPreco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        btnFiltro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Preço:");

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        textPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        jLabel3.setText("Cadastrar Produto");

        btnExcluir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnAtualizar.setText("Editar");
        btnAtualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnFiltro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnFiltro.setText("Pesquisar");
        btnFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("Lista de Produtos");

        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(187, 187, 187))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar))
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFiltro)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void textPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvarProduto();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirProduto();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        editarProduto();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed
        String filtro = txtFiltro.getText().trim(); // Obtém o texto do campo de pesquisa
        ProdutoController controller = new ProdutoController();

        // Obtem o modelo da tabela filtrado
        DefaultTableModel modelo = controller.buscarProdutos(filtro);

        if (modelo.getRowCount() > 0) 
        {
            jTable1.setModel(modelo); // Atualiza o modelo na tabela
        } 
        
        else 
        {
            JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com o filtro: " + filtro);
        }
    }//GEN-LAST:event_btnFiltroActionPerformed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1FocusGained

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFiltro;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textPreco;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void salvarProduto() 
    {
        try
        {
            String nome = textNome.getText();
            Double preco = Double.valueOf(textPreco.getText());
            
            ProdutoEntity produto = new ProdutoEntity(0, nome, preco);
            ProdutoController controller = new ProdutoController();
            ProdutoDAO produtoDAO = new ProdutoDAO();
            
            if (produto.getNome() == null || produto.getNome().isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "O nome do produto não pode ser vazio.");
            }

            if (produto.getPreco() <= 0) 
            {
                JOptionPane.showMessageDialog(this, "O preço deve ser maior que zero.");
            }

            if (produtoDAO.produtoExiste(produto.getNome())) 
            {
                JOptionPane.showMessageDialog(this, "Produto já existe no banco de dados.");
            }
            
            if(controller.salvarProduto(produto))
            {
                JOptionPane.showMessageDialog(this, "Produto salvo com sucesso!");
                limpar();
            }
            
            else
            {
                JOptionPane.showMessageDialog(this, "Erro ao salvar o produto.");
            }
        }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Preço inválido!");
            }
    }

    private void limpar() 
    {
        textNome.setText("");
        textPreco.setText("");
    }

    private void excluirProduto() 
    {
        try
        {
            int id = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID do produto para excluir: "));
            
            ProdutoDAO dao = new ProdutoDAO();
            
            int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o produto?",
                                                                  "Confirmação ", JOptionPane.YES_NO_OPTION);
            
            if(confirmacao == JOptionPane.YES_OPTION)
            {
                if(dao.excluirProduto(id))
                {
                    JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");
                }
                
                else
                {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir produto!");
                }
            }
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }

    private void editarProduto() 
    {
        try
        {
            int id= Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID do produto para atualizar: "));
            String novoNome = JOptionPane.showInputDialog(this, "Novo nome do produto: ");
            double novoPreco = Double.parseDouble(JOptionPane.showInputDialog(this, "Novo preço do produto: "));
            
            ProdutoEntity produto = new ProdutoEntity(id, novoNome, novoPreco);
            ProdutoDAO dao = new ProdutoDAO();
            
            if(dao.atualizarProduto(produto))
            {
                JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!");
            }
            
            else
            {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar produto!");
            }
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }

    private void atualizarTabela() 
    {
       DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
       modelo.setRowCount(0); // Limpa os dados da tabela
       ProdutoDAO produtoDAO = new ProdutoDAO();

       List<ProdutoEntity> produtos = produtoDAO.buscarProdutos(""); // Busca atualizada do banco

       for (ProdutoEntity produto : produtos) 
       {
           modelo.addRow(new Object[]{produto.getId(), produto.getNome(), produto.getPreco()});
       }
    }
    
}
