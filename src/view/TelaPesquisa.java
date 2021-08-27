/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.Espectador;
import classes.Pesquisa;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class TelaPesquisa extends javax.swing.JDialog {

    private Pesquisa pesquisa;

    public TelaPesquisa(java.awt.Frame parent, boolean modal, Pesquisa pesquisa) {
        super(parent, modal);
        initComponents();
        this.pesquisa = pesquisa;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGOpinioes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLIdade = new javax.swing.JLabel();
        jTFIdade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBOtimo = new javax.swing.JRadioButton();
        jRBBom = new javax.swing.JRadioButton();
        jRBRegular = new javax.swing.JRadioButton();
        jRBRuim = new javax.swing.JRadioButton();
        jRBPessimo = new javax.swing.JRadioButton();
        jBGrava = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do espectador"));

        jLIdade.setText("Idade:");

        jLabel1.setText("Qual a sua opinião sobre o filme?");

        BGOpinioes.add(jBOtimo);
        jBOtimo.setText("Ótimo");
        jBOtimo.setActionCommand("A");

        BGOpinioes.add(jRBBom);
        jRBBom.setText("Bom");
        jRBBom.setActionCommand("B");

        BGOpinioes.add(jRBRegular);
        jRBRegular.setText("Regular");
        jRBRegular.setActionCommand("C");

        BGOpinioes.add(jRBRuim);
        jRBRuim.setText("Ruim");
        jRBRuim.setActionCommand("D");

        BGOpinioes.add(jRBPessimo);
        jRBPessimo.setText("Péssimo");
        jRBPessimo.setActionCommand("E");

        jBGrava.setText("Gravar");
        jBGrava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLIdade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBOtimo)
                        .addGap(18, 18, 18)
                        .addComponent(jRBBom)
                        .addGap(18, 18, 18)
                        .addComponent(jRBRegular)
                        .addGap(18, 18, 18)
                        .addComponent(jRBRuim)
                        .addGap(18, 18, 18)
                        .addComponent(jRBPessimo))
                    .addComponent(jBGrava))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIdade)
                    .addComponent(jTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBOtimo)
                    .addComponent(jRBBom)
                    .addComponent(jRBRegular)
                    .addComponent(jRBRuim)
                    .addComponent(jRBPessimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBGrava)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGravaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravaActionPerformed
        if (jTFIdade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha a idade", "Aviso", 0);
            jTFIdade.requestFocusInWindow();
            return;
        }

        String simNao[] = {
            "Sim",
            "Não"
        };
        if (BGOpinioes.getSelection() != null) {
            int salva = JOptionPane.showOptionDialog(this, "Confirma os dados?", "Gravando...", JOptionPane.YES_NO_OPTION, 3, null, simNao, simNao[0]);
            if (salva == 0) {
                Espectador espectador = montaEspectador();
                pesquisa.adiciona(espectador);
            }
            jTFIdade.setText(null);
            jTFIdade.requestFocusInWindow();
            BGOpinioes.clearSelection();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, dê sua opinião sobre o filme", "Aviso", 0);
        }
    }//GEN-LAST:event_jBGravaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTFIdade.setText(null);
        jTFIdade.requestFocusInWindow();
        BGOpinioes.clearSelection();
    }//GEN-LAST:event_formWindowOpened

    private Espectador montaEspectador() {
        Espectador objEspectador = new Espectador();
        objEspectador.setIdate(Byte.parseByte(jTFIdade.getText()));
        objEspectador.setOpiniao(BGOpinioes.getSelection().getActionCommand().charAt(0));
        return objEspectador;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGOpinioes;
    private javax.swing.JButton jBGrava;
    private javax.swing.JRadioButton jBOtimo;
    private javax.swing.JLabel jLIdade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBBom;
    private javax.swing.JRadioButton jRBPessimo;
    private javax.swing.JRadioButton jRBRegular;
    private javax.swing.JRadioButton jRBRuim;
    private javax.swing.JTextField jTFIdade;
    // End of variables declaration//GEN-END:variables
}
