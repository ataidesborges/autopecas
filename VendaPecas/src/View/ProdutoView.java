/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.ProdutoDAO;
import Model.Produto;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Larissa
 */
public class ProdutoView extends javax.swing.JInternalFrame {
    Produto produto;
    ProdutoDAO produtoDAO;
     List<Produto> listaProdutos;
    

    /**
     * Creates new form Produto
     */
    public ProdutoView() {
        produtoDAO  = new ProdutoDAO();
        initComponents();
        this.setVisible(true);
         btn_salvarprod.setEnabled(false);
        btn_alterarprod.setEnabled(false);
        btn_excluirprod.setEnabled(false);
        idprod.setEnabled(false);
        campos_bloqueados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnl_produto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idprod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomeprod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantprod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        codprod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        unidadeprod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        valorcustoprod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        valorvendaprod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dataprod = new javax.swing.JFormattedTextField();
        btn_salvarprod = new javax.swing.JButton();
        btn_alterarprod = new javax.swing.JButton();
        btn_excluirprod = new javax.swing.JButton();
        btn_novoprod = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        marcaprod = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        forneprod = new javax.swing.JTextField();
        btn_cancelarprod = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBorder(null);
        setClosable(true);
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

        idprod.setBackground(new java.awt.Color(204, 204, 204));
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
        pnl_produto.add(quantprod);
        quantprod.setBounds(350, 70, 70, 20);

        jLabel5.setText("Código de Barras");
        pnl_produto.add(jLabel5);
        jLabel5.setBounds(10, 100, 130, 14);
        pnl_produto.add(codprod);
        codprod.setBounds(10, 120, 180, 20);

        jLabel6.setText("Unidade");
        pnl_produto.add(jLabel6);
        jLabel6.setBounds(200, 100, 60, 14);
        pnl_produto.add(unidadeprod);
        unidadeprod.setBounds(200, 120, 70, 20);

        jLabel7.setText("Valor Custo");
        pnl_produto.add(jLabel7);
        jLabel7.setBounds(10, 150, 70, 14);
        pnl_produto.add(valorcustoprod);
        valorcustoprod.setBounds(10, 170, 100, 20);

        jLabel8.setText("Valor Venda");
        pnl_produto.add(jLabel8);
        jLabel8.setBounds(120, 150, 70, 14);
        pnl_produto.add(valorvendaprod);
        valorvendaprod.setBounds(120, 170, 100, 20);

        jLabel9.setText("Data de Cadastro");
        pnl_produto.add(jLabel9);
        jLabel9.setBounds(430, 50, 100, 14);
        pnl_produto.add(dataprod);
        dataprod.setBounds(430, 70, 100, 20);

        btn_salvarprod.setBackground(new java.awt.Color(102, 102, 102));
        btn_salvarprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_salvarprod.setText("Salvar");
        btn_salvarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarprodActionPerformed(evt);
            }
        });
        pnl_produto.add(btn_salvarprod);
        btn_salvarprod.setBounds(160, 230, 90, 30);

        btn_alterarprod.setBackground(new java.awt.Color(102, 102, 102));
        btn_alterarprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterarprod.setText("Alterar");
        btn_alterarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarprodActionPerformed(evt);
            }
        });
        pnl_produto.add(btn_alterarprod);
        btn_alterarprod.setBounds(270, 230, 90, 30);

        btn_excluirprod.setBackground(new java.awt.Color(102, 102, 102));
        btn_excluirprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_excluirprod.setText("Excluir");
        btn_excluirprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirprodActionPerformed(evt);
            }
        });
        pnl_produto.add(btn_excluirprod);
        btn_excluirprod.setBounds(490, 230, 90, 30);

        btn_novoprod.setBackground(new java.awt.Color(102, 102, 102));
        btn_novoprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_novoprod.setText("Novo");
        btn_novoprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoprodActionPerformed(evt);
            }
        });
        pnl_produto.add(btn_novoprod);
        btn_novoprod.setBounds(50, 230, 90, 30);

        jLabel10.setText("Fornecedor");
        pnl_produto.add(jLabel10);
        jLabel10.setBounds(280, 100, 70, 14);
        pnl_produto.add(marcaprod);
        marcaprod.setBounds(410, 120, 120, 20);

        jLabel11.setText("Marca");
        pnl_produto.add(jLabel11);
        jLabel11.setBounds(410, 100, 29, 14);
        pnl_produto.add(forneprod);
        forneprod.setBounds(280, 120, 120, 20);

        btn_cancelarprod.setBackground(new java.awt.Color(102, 102, 102));
        btn_cancelarprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelarprod.setText("Cancelar");
        btn_cancelarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarprodActionPerformed(evt);
            }
        });
        pnl_produto.add(btn_cancelarprod);
        btn_cancelarprod.setBounds(380, 230, 90, 30);

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblProduto);

        pnl_produto.add(jScrollPane2);
        jScrollPane2.setBounds(20, 310, 620, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarprodActionPerformed
        if(nomeprod.getText().isEmpty() ||  quantprod.getText().isEmpty() || marcaprod.getText().isEmpty() || codprod.getText().isEmpty() || 
                unidadeprod.getText().isEmpty() || valorcustoprod.getText().isEmpty() || valorvendaprod.getText().isEmpty() || 
                 dataprod.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!");
            nomeprod.requestFocusInWindow();
        } else{
            produto = new Produto();
            produto.setNomeproduto(nomeprod.getText());
            produto.setQuantidade(Integer.parseInt(quantprod.getText()));
            produto.setNomeproduto(dataprod.getText());
            produto.setCodigobarras(codprod.getText());
            produto.setUnidade(unidadeprod.getText());
            produto.setNomeproduto(forneprod.getText());
            produto.setMarca(marcaprod.getText());
            produto.setValorcusto(Double.parseDouble(valorcustoprod.getText()));
            produto.setValorvenda(Double.parseDouble(valorvendaprod.getText()));
            
            try{
               produtoDAO.salvar(produto);  
            }catch (SQLException ex){
                Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Gravado com Sucesso!!"); 
            preparaSalvareCancelar();
            campos_bloqueados();
            limpar();
        }        
    }//GEN-LAST:event_btn_salvarprodActionPerformed

    private void btn_alterarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarprodActionPerformed
        Alterar();
        campos_liberados();  
    }//GEN-LAST:event_btn_alterarprodActionPerformed

    private void btn_excluirprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirprodActionPerformed
         if (idprod.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Selecione um Funcionário!!");
     }  else {
        produto = new Produto();
        produto.setIdProduto(Integer.parseInt(idprod.getText()));
        int confirma = JOptionPane.showConfirmDialog(null,"Deseja excluir :" + nomeprod.getText());
            if(confirma == 0){
        try{
            produtoDAO.excluir(produto);  
            }catch (SQLException ex){
            Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            limpar();
            excluir();
            
     }       
         
         }   
    }//GEN-LAST:event_btn_excluirprodActionPerformed

    private void btn_novoprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoprodActionPerformed
        limpar();
        preparanovo();
        campos_liberados();
    }//GEN-LAST:event_btn_novoprodActionPerformed

    private void btn_cancelarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarprodActionPerformed
        limpar();
        preparaSalvareCancelar();
        campos_bloqueados();
    }//GEN-LAST:event_btn_cancelarprodActionPerformed


    public void preparanovo(){
        btn_novoprod.setEnabled(false);
        btn_salvarprod.setEnabled(true);
        btn_alterarprod.setEnabled(false);
        btn_excluirprod.setEnabled(false);
          
    }
      
    public void limpar(){
       nomeprod.setText("");
       quantprod.setText("");
       dataprod.setText("");
       codprod.setText("");
       unidadeprod.setText("");
       forneprod.setText("");
       marcaprod.setText("");
       valorcustoprod.setText("");
       valorvendaprod.setText("");
  }
    public void campos_bloqueados(){
       nomeprod.setEnabled(false);
       quantprod.setEnabled(false);
       dataprod.setEnabled(false);
       codprod.setEnabled(false);
       unidadeprod.setEnabled(false);
       forneprod.setEnabled(false);
       marcaprod.setEnabled(false);
       valorcustoprod.setEnabled(false);
       valorvendaprod .setEnabled(false);
    
}
    public void campos_liberados(){
    nomeprod.setEnabled(true);
       quantprod.setEnabled(true);
       dataprod.setEnabled(true);
       codprod.setEnabled(true);
       unidadeprod.setEnabled(true);
       forneprod.setEnabled(true);
       marcaprod.setEnabled(true);
       valorcustoprod.setEnabled(true);
       valorvendaprod .setEnabled(true);
}

public void excluir(){
       btn_excluirprod.setEnabled(false);
       btn_alterarprod.setEnabled(false);  
    }

public void preparaSalvareCancelar(){
    btn_novoprod.setEnabled(true);
    btn_salvarprod.setEnabled(true);
    btn_cancelarprod.setEnabled(false); 
}

public void Alterar(){
   btn_novoprod.setEnabled(false);
   btn_excluirprod.setEnabled(false);
   btn_alterarprod.setEnabled(false);
   btn_salvarprod.setEnabled(true);
   btn_cancelarprod.setEnabled(true);   
}


public void AtualizartabelaProduto() {
    
   
     
        
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterarprod;
    private javax.swing.JButton btn_cancelarprod;
    private javax.swing.JButton btn_excluirprod;
    private javax.swing.JButton btn_novoprod;
    private javax.swing.JButton btn_salvarprod;
    private javax.swing.JTextField codprod;
    private javax.swing.JFormattedTextField dataprod;
    private javax.swing.JTextField forneprod;
    private javax.swing.JTextField idprod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField marcaprod;
    private javax.swing.JTextField nomeprod;
    private javax.swing.JPanel pnl_produto;
    private javax.swing.JTextField quantprod;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField unidadeprod;
    private javax.swing.JTextField valorcustoprod;
    private javax.swing.JTextField valorvendaprod;
    // End of variables declaration//GEN-END:variables
}
