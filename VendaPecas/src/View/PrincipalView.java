/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author User
 */
public class PrincipalView extends javax.swing.JFrame {
    


    /**
     * Creates new form NovoJFrame
     */
    public PrincipalView() {
        initComponents();
        this.setVisible(true);
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
        setLocationRelativeTo( null );
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon("src/Imagens/auto3.png");
        icon.setImage(icon.getImage().getScaledInstance(img.getWidth(), img.getHeight(), 1));
        img.setIcon(icon);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        pnl_principal = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        menucadastrofunc = new javax.swing.JButton();
        menucadastrocliente = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        menucadastrarprod = new javax.swing.JButton();

        jMenuItem6.setText("jMenuItem6");

        jMenu4.setText("jMenu4");

        jMenu8.setText("jMenu8");

        jMenu9.setText("jMenu9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        pnl_principal.setBackground(new java.awt.Color(255, 255, 255));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/auto.png"))); // NOI18N
        img.setToolTipText("");
        img.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        img.setDoubleBuffered(true);

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 754, Short.MAX_VALUE)
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pnl2.setBackground(new java.awt.Color(255, 255, 255));
        pnl2.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        menucadastrofunc.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        menucadastrofunc.setForeground(new java.awt.Color(255, 255, 255));
        menucadastrofunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão.png"))); // NOI18N
        menucadastrofunc.setText("Funcionário");
        menucadastrofunc.setToolTipText("");
        menucadastrofunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menucadastrofunc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menucadastrofunc.setIconTextGap(0);
        menucadastrofunc.setName(""); // NOI18N
        menucadastrofunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucadastrofuncActionPerformed(evt);
            }
        });

        menucadastrocliente.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        menucadastrocliente.setForeground(new java.awt.Color(255, 255, 255));
        menucadastrocliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão.png"))); // NOI18N
        menucadastrocliente.setText("Cliente");
        menucadastrocliente.setToolTipText("");
        menucadastrocliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menucadastrocliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menucadastrocliente.setIconTextGap(0);
        menucadastrocliente.setName(""); // NOI18N
        menucadastrocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucadastroclienteActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 255, 255));
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão.png"))); // NOI18N
        sair.setText("Sair");
        sair.setToolTipText("");
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sair.setIconTextGap(0);
        sair.setName(""); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        menucadastrarprod.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        menucadastrarprod.setForeground(new java.awt.Color(255, 255, 255));
        menucadastrarprod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão.png"))); // NOI18N
        menucadastrarprod.setText("Produtos");
        menucadastrarprod.setToolTipText("");
        menucadastrarprod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menucadastrarprod.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menucadastrarprod.setIconTextGap(0);
        menucadastrarprod.setName(""); // NOI18N
        menucadastrarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucadastrarprodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menucadastrarprod, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menucadastrofunc, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl2Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl2Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(menucadastrocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(menucadastrocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(menucadastrofunc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(menucadastrarprod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        int resultado = JOptionPane.showConfirmDialog(null, "Sair do programa?");

        if(resultado == JOptionPane.YES_OPTION){

            this.dispose();

        }
        
    }//GEN-LAST:event_sairActionPerformed

    private void menucadastroclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucadastroclienteActionPerformed
        
        ClienteView cli = new ClienteView();
        pnl_principal.removeAll();
        pnl_principal.add(cli);
        pnl_principal.updateUI();               
      
      
      
    }//GEN-LAST:event_menucadastroclienteActionPerformed

    private void menucadastrofuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucadastrofuncActionPerformed
        FuncionarioView func = new FuncionarioView();
        pnl_principal.removeAll();
        pnl_principal.add(func);
        pnl_principal.updateUI();
    }//GEN-LAST:event_menucadastrofuncActionPerformed

    private void menucadastrarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucadastrarprodActionPerformed
        ProdutoView pro = new ProdutoView();
        pnl_principal.removeAll();
        pnl_principal.add(pro);
        pnl_principal.updateUI();// TODO add your handling code here:
    }//GEN-LAST:event_menucadastrarprodActionPerformed
    
    
    
    /**
     * 
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JButton menucadastrarprod;
    private javax.swing.JButton menucadastrocliente;
    private javax.swing.JButton menucadastrofunc;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
