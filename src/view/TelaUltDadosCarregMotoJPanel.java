/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import util.Const;

/**
 *
 * @author anderson
 */
public class TelaUltDadosCarregMotoJPanel extends javax.swing.JPanel {

    private final Image image;
    private final BaseJFrame baseJFrame;

    /**
     * Creates new form TelaDadosUltCarregJPanel
     */
    public TelaUltDadosCarregMotoJPanel(BaseJFrame baseJFrame) {
        this.baseJFrame = baseJFrame;
        initComponents();
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/util/layout_totem.jpg"));
        this.image = imageIcon.getImage();
        carreg();
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
        jLabelPerg = new javax.swing.JLabel();
        jLabelNomeMotorista = new javax.swing.JLabel();
        jLabelCPFMotorista = new javax.swing.JLabel();
        jLabelRGMotorista = new javax.swing.JLabel();
        jLabelCNHMotorista = new javax.swing.JLabel();
        jButtonNao = new javax.swing.JButton();
        jButtonSim = new javax.swing.JButton();

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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        add(jButtonRetornar, gridBagConstraints);

        jLabelPerg.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelPerg.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPerg.setText("Confirma dados do ultimo carregamento?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 30, 0);
        add(jLabelPerg, gridBagConstraints);

        jLabelNomeMotorista.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelNomeMotorista.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeMotorista.setText("José da Silva");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        add(jLabelNomeMotorista, gridBagConstraints);

        jLabelCPFMotorista.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelCPFMotorista.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPFMotorista.setText("CPF: 000.000.000-00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        add(jLabelCPFMotorista, gridBagConstraints);

        jLabelRGMotorista.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelRGMotorista.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRGMotorista.setText("RG: 00.000.000-0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        add(jLabelRGMotorista, gridBagConstraints);

        jLabelCNHMotorista.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelCNHMotorista.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCNHMotorista.setText("CNH: 00000000000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 40, 0);
        add(jLabelCNHMotorista, gridBagConstraints);

        jButtonNao.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonNao.setForeground(new java.awt.Color(28, 88, 199));
        jButtonNao.setText("NÃO");
        jButtonNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 60;
        gridBagConstraints.insets = new java.awt.Insets(0, 130, 0, 10);
        add(jButtonNao, gridBagConstraints);

        jButtonSim.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSim.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonSim.setForeground(new java.awt.Color(28, 88, 199));
        jButtonSim.setText("SIM");
        jButtonSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 60;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 130);
        add(jButtonSim, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        this.baseJFrame.mudarTela(Const.TELA_CPF);

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNaoActionPerformed

        this.baseJFrame.getAutomacaoCTR().setConfirmarMotorista(false);
        this.baseJFrame.mudarTela(Const.TELA_WHATSAPP);

    }//GEN-LAST:event_jButtonNaoActionPerformed

    private void jButtonSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimActionPerformed

        this.baseJFrame.getAutomacaoCTR().setConfirmarMotorista(true);
        this.baseJFrame.mudarTela(Const.TELA_WHATSAPP);

    }//GEN-LAST:event_jButtonSimActionPerformed

    private void jButtonRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetornarActionPerformed

        this.baseJFrame.retornarTela();

    }//GEN-LAST:event_jButtonRetornarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonNao;
    private javax.swing.JButton jButtonRetornar;
    private javax.swing.JButton jButtonSim;
    private javax.swing.JLabel jLabelCNHMotorista;
    private javax.swing.JLabel jLabelCPFMotorista;
    private javax.swing.JLabel jLabelNomeMotorista;
    private javax.swing.JLabel jLabelPerg;
    private javax.swing.JLabel jLabelRGMotorista;
    // End of variables declaration//GEN-END:variables

    private void carreg() {
        jLabelNomeMotorista.setText("" + this.baseJFrame.getAutomacaoCTR().getUltViagemBean().getNomeMotorista());
        jLabelCPFMotorista.setText("CPF: " + this.baseJFrame.getAutomacaoCTR().getTextoCPF());
        jLabelRGMotorista.setText("RG: " + this.baseJFrame.getAutomacaoCTR().getUltViagemBean().getRgMotorista());
        jLabelCNHMotorista.setText("CNH: " + this.baseJFrame.getAutomacaoCTR().getUltViagemBean().getCnhMotorista());
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