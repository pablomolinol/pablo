/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.adoprojeto.view;
/**
 * 
 * @author danilo
 */

import com.mycompany.adoprojeto.dao.informaticaDAO;
import com.mycompany.adoprojeto.model.MaquinaModel;
import javax.swing.JOptionPane;

public class TelaDeCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeCadastro
     */
    public TelaDeCadastro() {
        initComponents();
    }

    MaquinaModel objCadastro;

    public TelaDeCadastro(MaquinaModel obj) {
        initComponents();

        cmbProcessador.setSelectedItem(String.valueOf(obj.getProcessador()));
        cmbHD.setSelectedItem(String.valueOf(obj.getHD()));

        this.objCadastro = obj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbProcessador = new javax.swing.JComboBox<>();
        cmbHD = new javax.swing.JComboBox<>();
        btnCadrastrar = new javax.swing.JButton();
        btnConsultarTelaCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbProcessador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um processador", "I7-10700", "I7-10700F", "Ryzen 7 5700G", "Ryzen 5 5600G", "Ryzen 7 5800X" }));
        cmbProcessador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProcessadorActionPerformed(evt);
            }
        });

        cmbHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um HD", "HD SSD 1TB ", "HD SSD 2TB ", "HD SSD 3TB ", "SSD NVME 1TB", "SSD NVME 500MB" }));

        btnCadrastrar.setText("Salvar");
        btnCadrastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadrastrarActionPerformed(evt);
            }
        });

        btnConsultarTelaCadastrar.setText("Consultar ");
        btnConsultarTelaCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTelaCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadrastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarTelaCadastrar))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadrastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarTelaCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProcessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProcessadorActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProcessadorActionPerformed

    private void btnCadrastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadrastrarActionPerformed

        if (objCadastro == null) {
            if (cmbProcessador.getSelectedIndex() == 0 && cmbHD.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, " Selecione as opçoes de hd e Processador !");
            } else if (cmbProcessador.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, " Selecione um processador !");
            } else if (cmbHD.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, " Selecione um HD !");
            } else {
                String processador = (cmbProcessador.getSelectedItem().toString());
                String hd = (cmbHD.getSelectedItem().toString());

                MaquinaModel objTelaCadastro = new MaquinaModel(hd, processador);

                boolean retorno = informaticaDAO.salvar(objTelaCadastro);

                if (retorno) {
                    JOptionPane.showMessageDialog(rootPane, "sucesso ao cadastrar!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Falha ao cadastrar !!");
                }
            }

        } else if (objCadastro != null && objCadastro.getIdComputador() > 0) {
            if (cmbProcessador.getSelectedIndex() == 0 && cmbHD.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, " Selecione as opçoes de hd e Processador !");
            } else if (cmbProcessador.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, " Selecione um processador !");
            } else if (cmbHD.getSelectedIndex() == 0) {

                JOptionPane.showMessageDialog(rootPane, " Selecione um HD !");
            } else {

                String processador = (cmbProcessador.getSelectedItem().toString());

                String hd = (cmbHD.getSelectedItem().toString());

                objCadastro.setProcessador(processador);
                objCadastro.setHD(hd);

                boolean retorno = informaticaDAO.alterar(objCadastro);
                if (retorno) {
                    JOptionPane.showMessageDialog(rootPane, "Sucesso ao alterar!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Falha ao alterar!");
                }
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadrastrarActionPerformed

    private void btnConsultarTelaCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarTelaCadastrarActionPerformed
        TelaDeConsulta atalhoBTN = new TelaDeConsulta();
        atalhoBTN.setVisible(true);

    }//GEN-LAST:event_btnConsultarTelaCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadrastrar;
    private javax.swing.JButton btnConsultarTelaCadastrar;
    private javax.swing.JComboBox<String> cmbHD;
    private javax.swing.JComboBox<String> cmbProcessador;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
