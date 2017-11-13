/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasb;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andeson
 */
public class AgendaForm extends javax.swing.JFrame {

    private DefaultListModel modeloLista = new DefaultListModel();
    

    /**
     * Creates new form AgendaForm
     */
    public AgendaForm() {

        initComponents();
        CarregaDados();
        ControleBotoes(false);
              
    }

    /**
     * Método responsável por carregar os dados iniciais da aplicação
     */
    private void CarregaDados() {
        comb_tipo.setModel(new DefaultComboBoxModel(Tipos.values()));
        list_contatos.setModel(modeloLista);
    }

    /**
     * Método para controlar os botões na tela habilita se for == true deve-se:
     * ativar os botões salvar e cancelar se for == false deve-se: desativar os
     * botões salvar e cancelar
     */
    private void ControleBotoes(boolean habilita) {
        btn_salvar.setEnabled(habilita);
        btn_cancelar.setEnabled(habilita);
        //esses abaixo será invertido o valor recebido
        btn_novo.setEnabled(!habilita);
        btn_alterar.setEnabled(!habilita);
        btn_deletar.setEnabled(!habilita);
        btn_finalizar.setEnabled(!habilita);

        //controla se edita ou não os dados
        edit_nome.setEditable(habilita);
        edit_fixo.setEditable(habilita);
        edit_celular.setEditable(habilita);
        edit_email.setEditable(habilita);

        comb_tipo.setEnabled(habilita);
        list_contatos.setEnabled(!habilita);
    }

    /**
     * Vai atualizar os campos do formulário recebendo um contato
     *
     * @param c contato que será mostrado na tela
     */
    private void MostraContato(Contato c) {
        edit_nome.setText(c.getNome());
        edit_celular.setText(c.getCelular());
        edit_fixo.setText(c.getTelefone());
        edit_email.setText(c.getEmail());
        comb_tipo.setSelectedItem((Tipos) c.getTipo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edit_nome = new javax.swing.JTextField();
        edit_fixo = new javax.swing.JTextField();
        edit_celular = new javax.swing.JTextField();
        edit_email = new javax.swing.JTextField();
        comb_tipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_contatos = new javax.swing.JList<>();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_deletar = new javax.swing.JButton();
        btn_finalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contatos");
        setResizable(false);

        jLabel1.setText("Nome do Contato");

        jLabel2.setText("Lista de Contatos");

        jLabel3.setText("Telefone Fixo");

        jLabel4.setText("Telefone Celular");

        jLabel5.setText("E-Mail");

        jLabel6.setText("Tipo de Contato");

        edit_nome.setText("lsdjaklsdjsa");

        edit_fixo.setText("asd");

        edit_celular.setText("asdasd");

        edit_email.setText("asdasdasd");

        comb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        list_contatos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list_contatos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_contatosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list_contatos);

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fasb/imagens/salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fasb/imagens/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fasb/imagens/novo.jpg"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fasb/imagens/editar.png"))); // NOI18N
        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fasb/imagens/excluir.png"))); // NOI18N
        btn_deletar.setText("Deletar");
        btn_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarActionPerformed(evt);
            }
        });

        btn_finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fasb/imagens/Fechar.png"))); // NOI18N
        btn_finalizar.setText("Finalizar");
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_email)
                            .addComponent(edit_nome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(68, 68, 68))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(edit_fixo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(edit_celular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(comb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_novo)
                                            .addComponent(btn_salvar))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_cancelar)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_alterar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_deletar)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_finalizar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edit_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edit_fixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_salvar)
                            .addComponent(btn_cancelar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_finalizar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_novo)
                        .addComponent(btn_alterar)
                        .addComponent(btn_deletar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_finalizarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // cliquei no botão salvar 

        //validação dos campos obrigatórios 
        if (edit_nome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Informe o nome do Contato!");
            edit_nome.requestFocus();
            return;
        }

        if (edit_fixo.getText().trim().isEmpty()
                && edit_celular.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null,
                    "Informe o número do fixo ou do celular!");
            edit_fixo.requestFocus();
            return;
        }

        if (comb_tipo.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Informe o tipo de contato!");
            comb_tipo.requestFocus();
            return;
        }

        //gravar
        Contato novo = new Contato();
        novo.setNome(edit_nome.getText());
        novo.setTelefone(edit_fixo.getText());
        novo.setCelular(edit_celular.getText());
        novo.setEmail(edit_email.getText());
        novo.setTipo((Tipos) comb_tipo.getSelectedItem());

        modeloLista.addElement(novo);

        ControleBotoes(false); //desativar o botão
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // cliquei no botão cancelar
        ControleBotoes(false); //desativar o botão
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        // cliquei no botão Novo 
        ControleBotoes(true); //ativar o botão
        edit_nome.setText("");
        edit_fixo.setText("");
        edit_celular.setText("");
        edit_email.setText("");
        comb_tipo.setSelectedIndex(-1);
        edit_nome.setFocusable(true);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // cliquei no botão Alterar
        ControleBotoes(true); //ativar o botão
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarActionPerformed
        // TODO add your handling code here:

        //verificação se há itens na lista
        if (list_contatos.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Não há contato para apagar"
                    + "\nOu você não selecionou nenhum contato.!");
            return;
        }

        //captura o item que desejamos apagar;
        int index = list_contatos.getSelectedIndex();

        if (JOptionPane.showConfirmDialog(rootPane, 
                "Confirma a exclusão?", 
                "Remover Contato", 
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
            return;
        }
        
        //remove da lista o item que foi selecionado.
        modeloLista.remove(index);

    }//GEN-LAST:event_btn_deletarActionPerformed

    private void list_contatosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_contatosValueChanged
        // TODO add your handling code here:
        int index = list_contatos.getSelectedIndex();

        if (index >= 0) {
            Contato sel = (Contato) modeloLista.get(index);
            MostraContato(sel);
        }

    }//GEN-LAST:event_list_contatosValueChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AgendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_deletar;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> comb_tipo;
    private javax.swing.JTextField edit_celular;
    private javax.swing.JTextField edit_email;
    private javax.swing.JTextField edit_fixo;
    private javax.swing.JTextField edit_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list_contatos;
    // End of variables declaration//GEN-END:variables
}
