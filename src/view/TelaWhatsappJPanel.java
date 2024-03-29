/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import util.Const;

/**
 *
 * @author anderson
 */
public class TelaWhatsappJPanel extends javax.swing.JPanel {

    private final Image image;
    private final BaseJFrame baseJFrame;
    private final DefaultJDialog defaultJDialog;
    
    /**
     * Creates new form TelaWhatsappJPanel
     */
    public TelaWhatsappJPanel(BaseJFrame baseJFrame) {
        this.baseJFrame = baseJFrame;
        initComponents();
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/util/layout_totem.jpg"));
        this.image = imageIcon.getImage();
        defaultJDialog = new DefaultJDialog(new javax.swing.JFrame(), true);
        jLabelCelular.setText("(__) _____-____");
        this.baseJFrame.getAutomacaoCTR().setQtde(0);
        this.baseJFrame.getAutomacaoCTR().setTextoCelular("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButtonCancelar = new javax.swing.JButton();
        jButtonRetornar = new javax.swing.JButton();
        jLabelMsg = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jButtonNum1 = new javax.swing.JButton();
        jButtonNum2 = new javax.swing.JButton();
        jButtonNum3 = new javax.swing.JButton();
        jButtonNum4 = new javax.swing.JButton();
        jButtonNum5 = new javax.swing.JButton();
        jButtonNum6 = new javax.swing.JButton();
        jButtonNum7 = new javax.swing.JButton();
        jButtonNum8 = new javax.swing.JButton();
        jButtonNum9 = new javax.swing.JButton();
        jButtonCorrige = new javax.swing.JButton();
        jButtonNum0 = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        jButtonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(28, 88, 199));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        add(jButtonCancelar, gridBagConstraints);

        jButtonRetornar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRetornar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonRetornar.setForeground(new java.awt.Color(28, 88, 199));
        jButtonRetornar.setText("RETORNAR");
        jButtonRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetornarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        add(jButtonRetornar, gridBagConstraints);

        jLabelMsg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMsg.setText("Informe seu whatsapp por favor.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        add(jLabelMsg, gridBagConstraints);

        jLabelCelular.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabelCelular.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCelular.setText("(__) _____-____");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        add(jLabelCelular, gridBagConstraints);

        jButtonNum1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum1.setForeground(new java.awt.Color(28, 88, 199));
        jButtonNum1.setText("1");
        jButtonNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(10, 80, 5, 0);
        add(jButtonNum1, gridBagConstraints);

        jButtonNum2.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum2.setForeground(new java.awt.Color(28, 88, 199));
        jButtonNum2.setText("2");
        jButtonNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 5, 20);
        add(jButtonNum2, gridBagConstraints);

        jButtonNum3.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum3.setForeground(new java.awt.Color(28, 88, 199));
        jButtonNum3.setText("3");
        jButtonNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 80);
        add(jButtonNum3, gridBagConstraints);

        jButtonNum4.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum4.setForeground(new java.awt.Color(28, 88, 199));
        jButtonNum4.setText("4");
        jButtonNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 80, 5, 0);
        add(jButtonNum4, gridBagConstraints);

        jButtonNum5.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum5.setForeground(new java.awt.Color(28, 88, 199));
        jButtonNum5.setText("5");
        jButtonNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 20);
        add(jButtonNum5, gridBagConstraints);

        jButtonNum6.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum6.setForeground(new java.awt.Color(28, 88, 199));
        jButtonNum6.setText("6");
        jButtonNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 80);
        add(jButtonNum6, gridBagConstraints);

        jButtonNum7.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum7.setForeground(new java.awt.Color(28, 88, 199));
        jButtonNum7.setText("7");
        jButtonNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 80, 5, 0);
        add(jButtonNum7, gridBagConstraints);

        jButtonNum8.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum8.setForeground(new java.awt.Color(28, 88, 199));
        jButtonNum8.setText("8");
        jButtonNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 20);
        add(jButtonNum8, gridBagConstraints);

        jButtonNum9.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum9.setForeground(new java.awt.Color(28, 88, 199));
        jButtonNum9.setText("9");
        jButtonNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 80);
        add(jButtonNum9, gridBagConstraints);

        jButtonCorrige.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCorrige.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCorrige.setForeground(new java.awt.Color(28, 88, 199));
        jButtonCorrige.setText("CORRIGE");
        jButtonCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorrigeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.insets = new java.awt.Insets(5, 80, 10, 0);
        add(jButtonCorrige, gridBagConstraints);

        jButtonNum0.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNum0.setForeground(new java.awt.Color(28, 88, 199));
        jButtonNum0.setText("0");
        jButtonNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 10, 20);
        add(jButtonNum0, gridBagConstraints);

        jButtonOK.setBackground(new java.awt.Color(255, 255, 255));
        jButtonOK.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButtonOK.setForeground(new java.awt.Color(28, 88, 199));
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 80);
        add(jButtonOK, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum1ActionPerformed
        
        jLabelCelular.setText(this.baseJFrame.getAutomacaoCTR().preencherCelular("1"));
        
    }//GEN-LAST:event_jButtonNum1ActionPerformed

    private void jButtonNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum2ActionPerformed
        
        jLabelCelular.setText(this.baseJFrame.getAutomacaoCTR().preencherCelular("2"));
        
    }//GEN-LAST:event_jButtonNum2ActionPerformed

    private void jButtonNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum3ActionPerformed
        
        jLabelCelular.setText(this.baseJFrame.getAutomacaoCTR().preencherCelular("3"));
        
    }//GEN-LAST:event_jButtonNum3ActionPerformed

    private void jButtonNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum4ActionPerformed
        
        jLabelCelular.setText(this.baseJFrame.getAutomacaoCTR().preencherCelular("4"));
        
    }//GEN-LAST:event_jButtonNum4ActionPerformed

    private void jButtonNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum5ActionPerformed
        
        jLabelCelular.setText(this.baseJFrame.getAutomacaoCTR().preencherCelular("5"));
        
    }//GEN-LAST:event_jButtonNum5ActionPerformed

    private void jButtonNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum6ActionPerformed
        
        jLabelCelular.setText(this.baseJFrame.getAutomacaoCTR().preencherCelular("6"));
        
    }//GEN-LAST:event_jButtonNum6ActionPerformed

    private void jButtonNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum7ActionPerformed
        
        jLabelCelular.setText(this.baseJFrame.getAutomacaoCTR().preencherCelular("7"));
        
    }//GEN-LAST:event_jButtonNum7ActionPerformed

    private void jButtonNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum8ActionPerformed
        
        jLabelCelular.setText(this.baseJFrame.getAutomacaoCTR().preencherCelular("8"));
        
    }//GEN-LAST:event_jButtonNum8ActionPerformed

    private void jButtonNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum9ActionPerformed
        
        jLabelCelular.setText(this.baseJFrame.getAutomacaoCTR().preencherCelular("9"));
        
    }//GEN-LAST:event_jButtonNum9ActionPerformed

    private void jButtonCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorrigeActionPerformed
        
        jLabelCelular.setText(this.baseJFrame.getAutomacaoCTR().apagarCelular());
        
    }//GEN-LAST:event_jButtonCorrigeActionPerformed

    private void jButtonNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum0ActionPerformed
        
        jLabelCelular.setText(this.baseJFrame.getAutomacaoCTR().preencherCelular("0"));
        
    }//GEN-LAST:event_jButtonNum0ActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        
        ok();
        
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        this.baseJFrame.mudarTela(Const.TELA_CPF);
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetornarActionPerformed

        this.baseJFrame.retornarTela();
                
    }//GEN-LAST:event_jButtonRetornarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCorrige;
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
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonRetornar;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelMsg;
    // End of variables declaration//GEN-END:variables
    
    public void ok() {
        if (this.baseJFrame.getAutomacaoCTR().getQtde() == 11) {
            if (this.baseJFrame.getAutomacaoCTR().isMotoristaExistente()) {
                this.baseJFrame.mudarTela(Const.TELA_ULT_PRODUTO_CARREG);
            } else {
                this.baseJFrame.mudarTela(Const.TELA_PRODUTO_CARREG);
            }
            this.setVisible(false);
        } else {
            terminarNumero();
        }
    }
    
    private void terminarNumero() {
        defaultJDialog.setTxtMsg("Por Favor, termine de digitar o Whatsapp.");
        Timer timer = new Timer(4000, (ActionEvent e) -> {
            defaultJDialog.setVisible(false);
        });
        timer.setRepeats(false);
        timer.start();
        defaultJDialog.setVisible(true);
    }
    
    @Override
    public Dimension getPreferredSize() {
        Dimension superSize = super.getPreferredSize();
        if (isPreferredSizeSet() || image == null) {
            return superSize;
        }
        int prefW = Math.max(image.getWidth(null), superSize.width);
        int prefH = Math.max(image.getHeight(null), superSize.height);
        return new Dimension(prefW, prefH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, null);
        }
    }

}
