/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.ClienteDAO;
import Model.Cliente;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Larissa
 */
public class ClienteView extends javax.swing.JInternalFrame {
    Cliente cliente;
    ClienteDAO clienteDAO;
    /**
     * Creates new form Cliente
     */
    public ClienteView() {
        clienteDAO  = new ClienteDAO();
        initComponents();
        this.setVisible(true);
        btn_salvarcliente.setEnabled(false);
        btn_alterarcliente.setEnabled(false);
        btn_excluircliente.setEnabled(false);
        idcliente.setEnabled(false);
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

        pnl_cliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idcliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomecliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cpfcliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rgcliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        endcliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        numcliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        compcliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cidadecliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bairrocliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fixocliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        comercialcliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        celcliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        emailcliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        datacliente = new javax.swing.JFormattedTextField();
        btn_salvarcliente = new javax.swing.JButton();
        btn_alterarcliente = new javax.swing.JButton();
        btn_excluircliente = new javax.swing.JButton();
        btn_novocliente = new javax.swing.JButton();
        estadocliente = new javax.swing.JTextField();
        btn_cancelarcliente = new javax.swing.JButton();

        setClosable(true);

        pnl_cliente.setBackground(new java.awt.Color(204, 204, 204));
        pnl_cliente.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("DADOS DO CLIENTE");
        pnl_cliente.add(jLabel1);
        jLabel1.setBounds(10, 11, 119, 15);

        jLabel2.setText("ID Cliente");
        pnl_cliente.add(jLabel2);
        jLabel2.setBounds(10, 59, 60, 14);
        pnl_cliente.add(idcliente);
        idcliente.setBounds(10, 80, 77, 20);

        jLabel3.setText("Nome");
        pnl_cliente.add(jLabel3);
        jLabel3.setBounds(100, 60, 60, 14);
        pnl_cliente.add(nomecliente);
        nomecliente.setBounds(100, 80, 350, 20);

        jLabel4.setText("CPF");
        pnl_cliente.add(jLabel4);
        jLabel4.setBounds(10, 110, 34, 14);
        pnl_cliente.add(cpfcliente);
        cpfcliente.setBounds(10, 130, 130, 20);

        jLabel5.setText("RG");
        pnl_cliente.add(jLabel5);
        jLabel5.setBounds(150, 110, 34, 14);
        pnl_cliente.add(rgcliente);
        rgcliente.setBounds(150, 130, 140, 20);

        jLabel6.setText("Endereço");
        pnl_cliente.add(jLabel6);
        jLabel6.setBounds(10, 160, 70, 14);
        pnl_cliente.add(endcliente);
        endcliente.setBounds(10, 180, 250, 20);

        jLabel7.setText("Número");
        pnl_cliente.add(jLabel7);
        jLabel7.setBounds(430, 160, 50, 10);
        pnl_cliente.add(numcliente);
        numcliente.setBounds(430, 180, 70, 20);

        jLabel8.setText("Complemento");
        pnl_cliente.add(jLabel8);
        jLabel8.setBounds(510, 160, 80, 14);
        pnl_cliente.add(compcliente);
        compcliente.setBounds(510, 180, 90, 20);

        jLabel9.setText("Cidade");
        pnl_cliente.add(jLabel9);
        jLabel9.setBounds(300, 110, 50, 14);
        pnl_cliente.add(cidadecliente);
        cidadecliente.setBounds(300, 130, 160, 20);

        jLabel10.setText("Bairro");
        pnl_cliente.add(jLabel10);
        jLabel10.setBounds(270, 160, 40, 10);
        pnl_cliente.add(bairrocliente);
        bairrocliente.setBounds(270, 180, 150, 20);

        jLabel11.setText("Estado");
        pnl_cliente.add(jLabel11);
        jLabel11.setBounds(470, 110, 40, 10);

        jLabel12.setText("Telefone Fixo");
        pnl_cliente.add(jLabel12);
        jLabel12.setBounds(10, 210, 90, 14);
        pnl_cliente.add(fixocliente);
        fixocliente.setBounds(10, 230, 140, 20);

        jLabel13.setText("Telefone Comercial");
        pnl_cliente.add(jLabel13);
        jLabel13.setBounds(160, 210, 130, 14);
        pnl_cliente.add(comercialcliente);
        comercialcliente.setBounds(160, 230, 140, 20);

        jLabel14.setText("Celular");
        pnl_cliente.add(jLabel14);
        jLabel14.setBounds(310, 210, 60, 14);
        pnl_cliente.add(celcliente);
        celcliente.setBounds(310, 230, 140, 20);

        jLabel15.setText("Email");
        pnl_cliente.add(jLabel15);
        jLabel15.setBounds(10, 260, 50, 14);
        pnl_cliente.add(emailcliente);
        emailcliente.setBounds(10, 280, 310, 20);

        jLabel16.setText("Data de Nascimento");
        pnl_cliente.add(jLabel16);
        jLabel16.setBounds(460, 60, 130, 14);
        pnl_cliente.add(datacliente);
        datacliente.setBounds(460, 80, 120, 20);

        btn_salvarcliente.setBackground(new java.awt.Color(102, 102, 102));
        btn_salvarcliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_salvarcliente.setText("Salvar");
        btn_salvarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarclienteActionPerformed(evt);
            }
        });
        pnl_cliente.add(btn_salvarcliente);
        btn_salvarcliente.setBounds(200, 340, 100, 30);

        btn_alterarcliente.setBackground(new java.awt.Color(102, 102, 102));
        btn_alterarcliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterarcliente.setText("Alterar");
        btn_alterarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarclienteActionPerformed(evt);
            }
        });
        pnl_cliente.add(btn_alterarcliente);
        btn_alterarcliente.setBounds(320, 340, 100, 30);

        btn_excluircliente.setBackground(new java.awt.Color(102, 102, 102));
        btn_excluircliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_excluircliente.setText("Excluir");
        btn_excluircliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirclienteActionPerformed(evt);
            }
        });
        pnl_cliente.add(btn_excluircliente);
        btn_excluircliente.setBounds(560, 340, 100, 30);

        btn_novocliente.setBackground(new java.awt.Color(102, 102, 102));
        btn_novocliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_novocliente.setText("Novo");
        btn_novocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoclienteActionPerformed(evt);
            }
        });
        pnl_cliente.add(btn_novocliente);
        btn_novocliente.setBounds(80, 340, 100, 30);
        pnl_cliente.add(estadocliente);
        estadocliente.setBounds(470, 130, 60, 20);

        btn_cancelarcliente.setBackground(new java.awt.Color(102, 102, 102));
        btn_cancelarcliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelarcliente.setText("Cancelar");
        pnl_cliente.add(btn_cancelarcliente);
        btn_cancelarcliente.setBounds(440, 340, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_excluirclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirclienteActionPerformed
       if(idcliente.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Selecione um Cliente");
       }else {
           cliente = new Cliente();
           cliente.setIdCliente(Integer.parseInt(idcliente.getText()));
           int confirma = JOptionPane.showConfirmDialog(null,"Deseja Excluir : " + nomecliente.getText());
           if (confirma == 0){
               try {
                   clienteDAO.excluir(cliente);
               } catch (SQLException ex) {
                   Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
               }
               limpar();
            excluir(); 
               
           }
       }
    }//GEN-LAST:event_btn_excluirclienteActionPerformed

    private void btn_salvarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarclienteActionPerformed
        if(nomecliente.getText().isEmpty() ||  datacliente.getText().isEmpty() || cpfcliente.getText().isEmpty() || rgcliente.getText().isEmpty() || endcliente.getText().isEmpty() || 
                 numcliente.getText().isEmpty() || compcliente.getText().isEmpty() || cidadecliente.getText().isEmpty() || bairrocliente.getText().isEmpty() || estadocliente.getText().isEmpty() ||
                 fixocliente.getText().isEmpty() || comercialcliente.getText().isEmpty() || celcliente.getText().isEmpty() || emailcliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!");
            nomecliente.requestFocusInWindow();
        } else{
            cliente = new Cliente();
           // cliente.setIdCliente(Integer.parseInt(idcliente.getText()));
            cliente.setNomeCliente(nomecliente.getText());
            cliente.setDataNascimento(datacliente.getText());
            cliente.setEndereco(endcliente.getText());
            cliente.setNumero(Integer.parseInt(numcliente.getText()));
            cliente.setBairro(bairrocliente.getText());
            cliente.setCidade(cidadecliente.getText());
            cliente.setEstado(estadocliente.getText());
            cliente.setEmail(emailcliente.getText());
            cliente.setCpf(cpfcliente.getText());
            cliente.setRg(rgcliente.getText());
            cliente.setTelefone(Integer.parseInt(fixocliente.getText()));
            cliente.setTelefoneComercial(Integer.parseInt(comercialcliente.getText()));
            cliente.setCelular(Integer.parseInt(celcliente.getText()));
            
            try{
               clienteDAO.salvar(cliente);
               
            }catch (SQLException ex){
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Gravado com Sucesso!!"); 
            limpar();
            campos_bloqueados();
            btn_salvarcliente.setEnabled(false);        //terminarei depois
            btn_novocliente.setEnabled(true);
            
        }
    }//GEN-LAST:event_btn_salvarclienteActionPerformed

    private void btn_novoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoclienteActionPerformed
        btn_salvarcliente.setEnabled(true);        //terminarei depois
        btn_novocliente.setEnabled(false);
        campos_liberados();
    }//GEN-LAST:event_btn_novoclienteActionPerformed

    private void btn_alterarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_alterarclienteActionPerformed
        
      public void preparanovo(){
          btn_novocliente.setEnabled(false);
          btn_salvarcliente.setEnabled(true);
          btn_alterarcliente.setEnabled(false);
          btn_excluircliente.setEnabled(false);
          
      }
      
      public void limpar(){
    celcliente.setText("");
    cidadecliente.setText("");
    comercialcliente.setText("");
    compcliente.setText("");
    cpfcliente.setText("");
    datacliente.setText("");
    emailcliente.setText("");
    endcliente.setText("");
    estadocliente.setText("");
    fixocliente.setText("");
    rgcliente.setText("");
    nomecliente.setText("");
    numcliente.setText("");
    bairrocliente.setText("");
}
public void campos_bloqueados(){
    celcliente.setEnabled(false);
    cidadecliente.setEnabled(false);
    comercialcliente.setEnabled(false);
    compcliente.setEnabled(false);
    cpfcliente.setEnabled(false);
    datacliente.setEnabled(false);
    emailcliente.setEnabled(false);
    endcliente.setEnabled(false);
    estadocliente.setEnabled(false);
    fixocliente.setEnabled(false);
    rgcliente.setEnabled(false);
    nomecliente.setEnabled(false);
    numcliente.setEnabled(false);
    bairrocliente.setEnabled(false);
}
public void campos_liberados(){
    celcliente.setEnabled(true);
    cidadecliente.setEnabled(true);
    comercialcliente.setEnabled(true);
    compcliente.setEnabled(true);
    cpfcliente.setEnabled(true);
    datacliente.setEnabled(true);
    emailcliente.setEnabled(true);
    endcliente.setEnabled(true);
    estadocliente.setEnabled(true);
    fixocliente.setEnabled(true);
    rgcliente.setEnabled(true);
    nomecliente.setEnabled(true);
    numcliente.setEnabled(true);
    bairrocliente.setEnabled(true);
}

public void excluir(){
       btn_excluircliente.setEnabled(false);
       btn_alterarcliente.setEnabled(false);  
    }

public void preparaSalvareCancelar(){
    btn_novocliente.setEnabled(true);
    btn_salvarcliente.setEnabled(true);
    btn_cancelarcliente.setEnabled(false); 
}

public void Alterar(){
   btn_novocliente.setEnabled(false);
   btn_excluircliente.setEnabled(false);
   btn_alterarcliente.setEnabled(false);
   btn_salvarcliente.setEnabled(true);
   btn_cancelarcliente.setEnabled(true);   
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairrocliente;
    private javax.swing.JButton btn_alterarcliente;
    private javax.swing.JButton btn_cancelarcliente;
    private javax.swing.JButton btn_excluircliente;
    private javax.swing.JButton btn_novocliente;
    private javax.swing.JButton btn_salvarcliente;
    private javax.swing.JTextField celcliente;
    private javax.swing.JTextField cidadecliente;
    private javax.swing.JTextField comercialcliente;
    private javax.swing.JTextField compcliente;
    private javax.swing.JTextField cpfcliente;
    private javax.swing.JFormattedTextField datacliente;
    private javax.swing.JTextField emailcliente;
    private javax.swing.JTextField endcliente;
    private javax.swing.JTextField estadocliente;
    private javax.swing.JTextField fixocliente;
    private javax.swing.JTextField idcliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomecliente;
    private javax.swing.JTextField numcliente;
    private javax.swing.JPanel pnl_cliente;
    private javax.swing.JTextField rgcliente;
    // End of variables declaration//GEN-END:variables
}
