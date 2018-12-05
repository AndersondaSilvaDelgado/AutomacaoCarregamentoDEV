/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author anderson
 */
public class JPanelTecladoNum extends javax.swing.JPanel {

    private TelaPlacaGUI telaPlacaGUI;

    /**
     * Creates new form JPanelTecladoNum
     */
    public JPanelTecladoNum(TelaPlacaGUI telaPlacaGUI) {
        initComponents();
        this.telaPlacaGUI = telaPlacaGUI;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonNum6 = new javax.swing.JButton();
        jButtonNum7 = new javax.swing.JButton();
        jButtonNum8 = new javax.swing.JButton();
        jButtonNum9 = new javax.swing.JButton();
        jButtonNum0 = new javax.swing.JButton();
        jButtonCorrigeNum = new javax.swing.JButton();
        jButtonOKNum = new javax.swing.JButton();
        jButtonNum1 = new javax.swing.JButton();
        jButtonNum2 = new javax.swing.JButton();
        jButtonNum3 = new javax.swing.JButton();
        jButtonNum4 = new javax.swing.JButton();
        jButtonNum5 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(780, 455));

        jButtonNum6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum6.setText("6");
        jButtonNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum6ActionPerformed(evt);
            }
        });

        jButtonNum7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum7.setText("7");
        jButtonNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum7ActionPerformed(evt);
            }
        });

        jButtonNum8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum8.setText("8");
        jButtonNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum8ActionPerformed(evt);
            }
        });

        jButtonNum9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum9.setText("9");
        jButtonNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum9ActionPerformed(evt);
            }
        });

        jButtonNum0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum0.setText("0");
        jButtonNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum0ActionPerformed(evt);
            }
        });

        jButtonCorrigeNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCorrigeNum.setText("CORRIGE");
        jButtonCorrigeNum.setMaximumSize(new java.awt.Dimension(80, 25));
        jButtonCorrigeNum.setMinimumSize(new java.awt.Dimension(80, 25));
        jButtonCorrigeNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorrigeNumActionPerformed(evt);
            }
        });

        jButtonOKNum.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButtonOKNum.setText("OK");
        jButtonOKNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKNumActionPerformed(evt);
            }
        });

        jButtonNum1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum1.setText("1");
        jButtonNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum1ActionPerformed(evt);
            }
        });

        jButtonNum2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum2.setText("2");
        jButtonNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum2ActionPerformed(evt);
            }
        });

        jButtonNum3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum3.setText("3");
        jButtonNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum3ActionPerformed(evt);
            }
        });

        jButtonNum4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum4.setText("4");
        jButtonNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum4ActionPerformed(evt);
            }
        });

        jButtonNum5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum5.setText("5");
        jButtonNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonCorrigeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonOKNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonOKNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCorrigeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOKNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKNumActionPerformed
        // TODO add your handling code here:

        if (telaPlacaGUI.getQtde() == 7) {
            this.telaPlacaGUI.getTelaInicialCPFGUI().getDadosCarregTO().setPlaca1(this.telaPlacaGUI.getTelaInicialCPFGUI().getTelaPlacaGUI().getTextoPlaca());
            this.telaPlacaGUI.getTelaInicialCPFGUI().getDadosCarregTO().setPlaca2("");
            this.telaPlacaGUI.getTelaInicialCPFGUI().getDadosCarregTO().setPlaca3("");
            this.telaPlacaGUI.setVisible(false);
            this.telaPlacaGUI.getTelaInicialCPFGUI().getTelaCameraGUI().setStatusCamera(1);
            this.telaPlacaGUI.getTelaInicialCPFGUI().getTelaCameraGUI().getjButtonCapturarFoto().setEnabled(true);
            this.telaPlacaGUI.getTelaInicialCPFGUI().getTelaCameraGUI().setVisible(true);

        } else {

            this.telaPlacaGUI.getTelaInicialCPFGUI().getjDialogDefault().setTxtMsg("Por Favor, termine de digitar a placa do Veículo.");
            Timer timer = new Timer(4000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    telaPlacaGUI.getTelaInicialCPFGUI().getjDialogDefault().setVisible(false);
                }
            });
            timer.setRepeats(false);
            timer.start();
            this.telaPlacaGUI.getTelaInicialCPFGUI().getjDialogDefault().setVisible(true);

        }

    }//GEN-LAST:event_jButtonOKNumActionPerformed

    private void jButtonNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum1ActionPerformed
        // TODO add your handling code here:

        this.telaPlacaGUI.preencherLabelPlaca("1");

    }//GEN-LAST:event_jButtonNum1ActionPerformed

    private void jButtonNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum2ActionPerformed
        // TODO add your handling code here:

        this.telaPlacaGUI.preencherLabelPlaca("2");

    }//GEN-LAST:event_jButtonNum2ActionPerformed

    private void jButtonNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum3ActionPerformed
        // TODO add your handling code here:

        this.telaPlacaGUI.preencherLabelPlaca("3");

    }//GEN-LAST:event_jButtonNum3ActionPerformed

    private void jButtonNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum4ActionPerformed
        // TODO add your handling code here:

        this.telaPlacaGUI.preencherLabelPlaca("4");

    }//GEN-LAST:event_jButtonNum4ActionPerformed

    private void jButtonNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum5ActionPerformed
        // TODO add your handling code here:

        this.telaPlacaGUI.preencherLabelPlaca("5");

    }//GEN-LAST:event_jButtonNum5ActionPerformed

    private void jButtonNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum6ActionPerformed
        // TODO add your handling code here:

        this.telaPlacaGUI.preencherLabelPlaca("6");

    }//GEN-LAST:event_jButtonNum6ActionPerformed

    private void jButtonNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum7ActionPerformed
        // TODO add your handling code here:

        this.telaPlacaGUI.preencherLabelPlaca("7");

    }//GEN-LAST:event_jButtonNum7ActionPerformed

    private void jButtonNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum8ActionPerformed
        // TODO add your handling code here:

        this.telaPlacaGUI.preencherLabelPlaca("8");

    }//GEN-LAST:event_jButtonNum8ActionPerformed

    private void jButtonNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum9ActionPerformed
        // TODO add your handling code here:

        this.telaPlacaGUI.preencherLabelPlaca("9");

    }//GEN-LAST:event_jButtonNum9ActionPerformed

    private void jButtonNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum0ActionPerformed
        // TODO add your handling code here:

        this.telaPlacaGUI.preencherLabelPlaca("0");

    }//GEN-LAST:event_jButtonNum0ActionPerformed

    private void jButtonCorrigeNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorrigeNumActionPerformed
        // TODO add your handling code here:

        this.telaPlacaGUI.apagarLabelPlaca();

    }//GEN-LAST:event_jButtonCorrigeNumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCorrigeNum;
    private javax.swing.JButton jButtonNum0;
    private javax.swing.JButton jButtonNum1;
    private javax.swing.JButton jButtonNum2;
    private javax.swing.JButton jButtonNum3;
    private javax.swing.JButton jButtonNum4;
    private javax.swing.JButton jButtonNum5;
    private javax.swing.JButton jButtonNum6;
    private javax.swing.JButton jButtonNum7;
    private javax.swing.JButton jButtonNum8;
    private javax.swing.JButton jButtonNum9;
    private javax.swing.JButton jButtonOKNum;
    // End of variables declaration//GEN-END:variables
}