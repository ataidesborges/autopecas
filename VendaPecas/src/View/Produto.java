/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Larissa
 */
public class Produto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Produto
     */
    public Produto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_produto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idprod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomeprod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantiprod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        codbarrasprod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        uniprod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        custoprod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        vendaprod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dataprod = new javax.swing.JFormattedTextField();
        btn_salvarprod = new javax.swing.JButton();
        btn_alterarprod = new javax.swing.JButton();
        btn_excluirprod = new javax.swing.JButton();
        btn_novoprod = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        forneprod = new java.awt.Choice();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), null));
        setPreferredSize(new java.awt.Dimension(658, 422));

        pnl_produto.setBackground(new java.awt.Color(204, 204, 204));
        pnl_produto.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("CADASTRO DE PRODUTOS");
        pnl_produto.add(jLabel1);
        jLabel1.setBounds(10, 11, 159, 15);

        jLabel2.setText("ID Produto");
        pnl_produto.add(jLabel2);
        jLabel2.setBounds(10, 50, 70, 14);
        pnl_produto.add(idprod);
        idprod.setBounds(10, 70, 80, 20);

        jLabel3.setText("Produto");
        pnl_produto.add(jLabel3);
        jLabel3.setBounds(100, 50, 50, 14);
        pnl_produto.add(nomeprod);
        nomeprod.setBounds(100, 70, 240, 20);

        jLabel4.setText("Quantidade");
        pnl_produto.add(jLabel4);
        jLabel4.setBounds(350, 50, 70, 14);
        pnl_produto.add(quantiprod);
        quantiprod.setBounds(350, 70, 90, 20);

        jLabel5.setText("Código de Barras");
        pnl_produto.add(jLabel5);
        jLabel5.setBounds(10, 100, 130, 14);
        pnl_produto.add(codbarrasprod);
        codbarrasprod.setBounds(10, 120, 210, 20);

        jLabel6.setText("Unidade");
        pnl_produto.add(jLabel6);
        jLabel6.setBounds(230, 100, 60, 14);
        pnl_produto.add(uniprod);
        uniprod.setBounds(230, 120, 70, 20);

        jLabel7.setText("Valor Custo");
        pnl_produto.add(jLabel7);
        jLabel7.setBounds(10, 150, 70, 14);
        pnl_produto.add(custoprod);
        custoprod.setBounds(10, 170, 100, 20);

        jLabel8.setText("Valor Venda");
        pnl_produto.add(jLabel8);
        jLabel8.setBounds(120, 150, 70, 14);
        pnl_produto.add(vendaprod);
        vendaprod.setBounds(120, 170, 100, 20);

        jLabel9.setText("Data de Cadastro");
        pnl_produto.add(jLabel9);
        jLabel9.setBounds(230, 150, 100, 14);
        pnl_produto.add(dataprod);
        dataprod.setBounds(230, 170, 110, 20);

        btn_salvarprod.setBackground(new java.awt.Color(102, 102, 102));
        btn_salvarprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_salvarprod.setText("Salvar");
        pnl_produto.add(btn_salvarprod);
        btn_salvarprod.setBounds(160, 250, 90, 30);

        btn_alterarprod.setBackground(new java.awt.Color(102, 102, 102));
        btn_alterarprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterarprod.setText("Alterar");
        pnl_produto.add(btn_alterarprod);
        btn_alterarprod.setBounds(280, 250, 90, 30);

        btn_excluirprod.setBackground(new java.awt.Color(102, 102, 102));
        btn_excluirprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_excluirprod.setText("Excluir");
        pnl_produto.add(btn_excluirprod);
        btn_excluirprod.setBounds(400, 250, 90, 30);

        btn_novoprod.setBackground(new java.awt.Color(102, 102, 102));
        btn_novoprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_novoprod.setText("Novo");
        pnl_produto.add(btn_novoprod);
        btn_novoprod.setBounds(40, 250, 90, 30);

        jLabel10.setText("Fornecedor");
        pnl_produto.add(jLabel10);
        jLabel10.setBounds(310, 100, 70, 14);
        pnl_produto.add(forneprod);
        forneprod.setBounds(310, 120, 140, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterarprod;
    private javax.swing.JButton btn_excluirprod;
    private javax.swing.JButton btn_novoprod;
    private javax.swing.JButton btn_salvarprod;
    private javax.swing.JTextField codbarrasprod;
    private javax.swing.JTextField custoprod;
    private javax.swing.JFormattedTextField dataprod;
    private java.awt.Choice forneprod;
    private javax.swing.JTextField idprod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomeprod;
    private javax.swing.JPanel pnl_produto;
    private javax.swing.JTextField quantiprod;
    private javax.swing.JTextField uniprod;
    private javax.swing.JTextField vendaprod;
    // End of variables declaration//GEN-END:variables
}
