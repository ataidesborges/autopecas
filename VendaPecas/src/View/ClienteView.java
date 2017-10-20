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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;


/**
 *
 * @author Larissa
 */
public class ClienteView extends javax.swing.JInternalFrame {
    Cliente cliente;
    ClienteDAO clienteDAO;
    List<Cliente> listaClientes;
    /**
     * Creates new form Cliente
     */
    public ClienteView() {
        clienteDAO  = new ClienteDAO();
        listaClientes = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        AtualizartabelaCliente();
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
        jLabel5 = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        emailcliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btn_salvarcliente = new javax.swing.JButton();
        btn_alterarcliente = new javax.swing.JButton();
        btn_excluircliente = new javax.swing.JButton();
        btn_novocliente = new javax.swing.JButton();
        estadocliente = new javax.swing.JTextField();
        btn_cancelarcliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cliente = new javax.swing.JTable();
        datacliente = new javax.swing.JFormattedTextField();
        cpfcliente = new javax.swing.JFormattedTextField();
        rgcliente = new javax.swing.JFormattedTextField();
        fixocliente = new javax.swing.JFormattedTextField();
        comercialcliente = new javax.swing.JFormattedTextField();
        celcliente = new javax.swing.JFormattedTextField();

        pnl_cliente.setBackground(new java.awt.Color(204, 204, 204));
        pnl_cliente.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("DADOS DO CLIENTE");
        pnl_cliente.add(jLabel1);
        jLabel1.setBounds(10, 11, 119, 15);

        jLabel2.setText("ID Cliente");
        pnl_cliente.add(jLabel2);
        jLabel2.setBounds(10, 59, 60, 14);

        idcliente.setBackground(new java.awt.Color(204, 204, 204));
        idcliente.setEnabled(false);
        pnl_cliente.add(idcliente);
        idcliente.setBounds(10, 80, 77, 20);

        jLabel3.setText("Nome");
        pnl_cliente.add(jLabel3);
        jLabel3.setBounds(100, 60, 60, 14);

        nomecliente.setEnabled(false);
        pnl_cliente.add(nomecliente);
        nomecliente.setBounds(100, 80, 320, 20);

        jLabel4.setText("CPF");
        pnl_cliente.add(jLabel4);
        jLabel4.setBounds(10, 110, 34, 14);

        jLabel5.setText("RG");
        pnl_cliente.add(jLabel5);
        jLabel5.setBounds(140, 110, 34, 14);

        jLabel6.setText("Endereço");
        pnl_cliente.add(jLabel6);
        jLabel6.setBounds(10, 160, 70, 14);

        endcliente.setEnabled(false);
        pnl_cliente.add(endcliente);
        endcliente.setBounds(10, 180, 250, 20);

        jLabel7.setText("Número");
        pnl_cliente.add(jLabel7);
        jLabel7.setBounds(430, 160, 50, 10);

        numcliente.setEnabled(false);
        pnl_cliente.add(numcliente);
        numcliente.setBounds(430, 180, 60, 20);

        jLabel8.setText("Complemento");
        pnl_cliente.add(jLabel8);
        jLabel8.setBounds(500, 160, 80, 14);

        compcliente.setEnabled(false);
        pnl_cliente.add(compcliente);
        compcliente.setBounds(500, 180, 100, 20);

        jLabel9.setText("Cidade");
        pnl_cliente.add(jLabel9);
        jLabel9.setBounds(270, 110, 50, 14);

        cidadecliente.setEnabled(false);
        pnl_cliente.add(cidadecliente);
        cidadecliente.setBounds(270, 130, 150, 20);

        jLabel10.setText("Bairro");
        pnl_cliente.add(jLabel10);
        jLabel10.setBounds(270, 160, 40, 10);

        bairrocliente.setEnabled(false);
        pnl_cliente.add(bairrocliente);
        bairrocliente.setBounds(270, 180, 150, 20);

        jLabel11.setText("Estado");
        pnl_cliente.add(jLabel11);
        jLabel11.setBounds(430, 110, 40, 10);

        jLabel12.setText("Telefone Fixo");
        pnl_cliente.add(jLabel12);
        jLabel12.setBounds(10, 210, 90, 14);

        jLabel13.setText("Telefone Comercial");
        pnl_cliente.add(jLabel13);
        jLabel13.setBounds(130, 210, 130, 14);

        jLabel14.setText("Celular");
        pnl_cliente.add(jLabel14);
        jLabel14.setBounds(250, 210, 60, 14);

        jLabel15.setText("Email");
        pnl_cliente.add(jLabel15);
        jLabel15.setBounds(370, 210, 50, 14);

        emailcliente.setEnabled(false);
        pnl_cliente.add(emailcliente);
        emailcliente.setBounds(370, 230, 230, 20);

        jLabel16.setText("Data Nascimento");
        pnl_cliente.add(jLabel16);
        jLabel16.setBounds(430, 60, 100, 14);

        btn_salvarcliente.setBackground(new java.awt.Color(153, 153, 153));
        btn_salvarcliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_salvarcliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        btn_salvarcliente.setText("Salvar");
        btn_salvarcliente.setEnabled(false);
        btn_salvarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarclienteActionPerformed(evt);
            }
        });
        pnl_cliente.add(btn_salvarcliente);
        btn_salvarcliente.setBounds(190, 300, 110, 30);

        btn_alterarcliente.setBackground(new java.awt.Color(153, 153, 153));
        btn_alterarcliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterarcliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_alterarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alterar.png"))); // NOI18N
        btn_alterarcliente.setText("Alterar");
        btn_alterarcliente.setEnabled(false);
        btn_alterarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarclienteActionPerformed(evt);
            }
        });
        pnl_cliente.add(btn_alterarcliente);
        btn_alterarcliente.setBounds(320, 300, 110, 30);

        btn_excluircliente.setBackground(new java.awt.Color(153, 153, 153));
        btn_excluircliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_excluircliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluircliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        btn_excluircliente.setText("Excluir");
        btn_excluircliente.setEnabled(false);
        btn_excluircliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirclienteActionPerformed(evt);
            }
        });
        pnl_cliente.add(btn_excluircliente);
        btn_excluircliente.setBounds(570, 300, 110, 30);

        btn_novocliente.setBackground(new java.awt.Color(153, 153, 153));
        btn_novocliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_novocliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_novocliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/novo.png"))); // NOI18N
        btn_novocliente.setText("Novo");
        btn_novocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoclienteActionPerformed(evt);
            }
        });
        pnl_cliente.add(btn_novocliente);
        btn_novocliente.setBounds(60, 300, 110, 30);

        estadocliente.setEnabled(false);
        pnl_cliente.add(estadocliente);
        estadocliente.setBounds(430, 130, 80, 20);

        btn_cancelarcliente.setBackground(new java.awt.Color(153, 153, 153));
        btn_cancelarcliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelarcliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelar.png"))); // NOI18N
        btn_cancelarcliente.setText("Cancelar");
        btn_cancelarcliente.setEnabled(false);
        btn_cancelarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarclienteActionPerformed(evt);
            }
        });
        pnl_cliente.add(btn_cancelarcliente);
        btn_cancelarcliente.setBounds(450, 300, 110, 30);

        tbl_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_cliente);

        pnl_cliente.add(jScrollPane1);
        jScrollPane1.setBounds(10, 380, 700, 130);

        try {

            MaskFormatter mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholderCharacter('_');

            datacliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));

        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        datacliente.setEnabled(false);
        pnl_cliente.add(datacliente);
        datacliente.setBounds(430, 80, 80, 20);

        try {

            MaskFormatter mascara = new MaskFormatter("###.###.###-##");
            mascara.setPlaceholderCharacter('_');

            cpfcliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));

        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfcliente.setEnabled(false);
        pnl_cliente.add(cpfcliente);
        cpfcliente.setBounds(10, 130, 120, 20);

        try {

            MaskFormatter mascara = new MaskFormatter("##.###.###");
            mascara.setPlaceholderCharacter('_');

            rgcliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));

        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rgcliente.setEnabled(false);
        pnl_cliente.add(rgcliente);
        rgcliente.setBounds(140, 130, 120, 20);

        try {

            MaskFormatter mascara = new MaskFormatter("(##) ####-####");
            mascara.setPlaceholderCharacter('_');

            fixocliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));

        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fixocliente.setEnabled(false);
        pnl_cliente.add(fixocliente);
        fixocliente.setBounds(10, 230, 110, 20);

        try {

            MaskFormatter mascara = new MaskFormatter("(##) ####-####");
            mascara.setPlaceholderCharacter('_');

            comercialcliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));

        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        comercialcliente.setEnabled(false);
        pnl_cliente.add(comercialcliente);
        comercialcliente.setBounds(130, 230, 110, 20);

        try {

            MaskFormatter mascara = new MaskFormatter("(##) #####-####");
            mascara.setPlaceholderCharacter('_');

            celcliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));

        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        celcliente.setEnabled(false);
        pnl_cliente.add(celcliente);
        celcliente.setBounds(250, 230, 110, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    
    private void btn_excluirclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirclienteActionPerformed
       if(idcliente.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Selecione um cliente!");
       }else {
           cliente = new Cliente();
           cliente.setIdCliente(Integer.parseInt(idcliente.getText()));
           int confirma = JOptionPane.showConfirmDialog(null,"Deseja excluir?: " + nomecliente.getText());
           if (confirma == 0){
               try {
                   clienteDAO.excluir(cliente);
               } catch (SQLException ex) {
                   Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
               }
               limpar();
               excluir(); 
               AtualizartabelaCliente();
           }
       }
    }//GEN-LAST:event_btn_excluirclienteActionPerformed

    private void btn_salvarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarclienteActionPerformed
        
        cliente = new Cliente();
        
        if(nomecliente.getText().isEmpty() ||  datacliente.getText().isEmpty() || cpfcliente.getText().isEmpty() || rgcliente.getText().isEmpty() || endcliente.getText().isEmpty() || 
           numcliente.getText().isEmpty() || compcliente.getText().isEmpty() || cidadecliente.getText().isEmpty() || bairrocliente.getText().isEmpty() || estadocliente.getText().isEmpty() ||
           fixocliente.getText().isEmpty() || comercialcliente.getText().isEmpty() || celcliente.getText().isEmpty() || emailcliente.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            nomecliente.requestFocusInWindow();
        } else if(idcliente.getText().isEmpty())
                {                   
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
                    cliente.setComplemento(compcliente.getText());
            try{
               clienteDAO.salvar(cliente);     
            }catch (SQLException ex){
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Gravado com Sucesso!!"); 
            AtualizartabelaCliente();
            preparaSalvareCancelar();
            campos_bloqueados();
            limpar();
            
        }
        else{
                    cliente.setIdCliente(Integer.parseInt(idcliente.getText()));
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
                    cliente.setComplemento(compcliente.getText());
                    
            try{
               clienteDAO.alterar(cliente);     
            }catch (SQLException ex){
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Gravado com Sucesso!!"); 
            AtualizartabelaCliente();
            preparaSalvareCancelar();
            campos_bloqueados();
        }
    }//GEN-LAST:event_btn_salvarclienteActionPerformed

    private void btn_novoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoclienteActionPerformed
        limpar();
        preparanovo();
        campos_liberados();
    }//GEN-LAST:event_btn_novoclienteActionPerformed

    private void btn_alterarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarclienteActionPerformed
        Alterar();
        campos_liberados();   
    }//GEN-LAST:event_btn_alterarclienteActionPerformed

    private void tbl_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clienteMouseClicked
        
        
        idcliente.setText(tbl_cliente.getValueAt(tbl_cliente.getSelectedRow(), 0).toString());
        nomecliente.setText(tbl_cliente.getValueAt(tbl_cliente.getSelectedRow(), 1).toString());
        cpfcliente.setText(tbl_cliente.getValueAt(tbl_cliente.getSelectedRow(), 2).toString());
        fixocliente.setText(tbl_cliente.getValueAt(tbl_cliente.getSelectedRow(), 3).toString());
        /*campos_liberados();
        clienteDAO = new ClienteDAO();
        cliente = new Cliente();
        int i = tbl_cliente.getSelectedRow();
        try {
            cliente = clienteDAO.recuperaCliente(Integer.parseInt(tbl_cliente.getValueAt(i, 0).toString()));
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        idcliente.setText((String.valueOf(cliente.getIdCliente())));
        nomecliente.setText(cliente.getNomeCliente());
        //datacliente.setText(cliente.getDataNascimento());
        cpfcliente.setText(cliente.getCpf());
        //rgcliente.setText(cliente.getRg());
        //endcliente.setText(cliente.getEndereco());
        //bairrocliente.setText(cliente.getBairro());
        //numcliente.setText(String.valueOf(cliente.getNumero()));
        //compcliente.setText(cliente.getComplemento());
        fixocliente.setText(String.valueOf(cliente.getTelefone()));
        //comercialcliente.setText(String.valueOf(cliente.getTelefoneComercial()));
        //celcliente.setText(String.valueOf(cliente.getCelular()));
        //emailcliente.setText(cliente.getEmail());*/
        Preparaselecaotabela();
    }//GEN-LAST:event_tbl_clienteMouseClicked

    private void btn_cancelarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarclienteActionPerformed
         limpar();
         preparaSalvareCancelar();
         campos_bloqueados();
    }//GEN-LAST:event_btn_cancelarclienteActionPerformed
        
    public void AtualizartabelaCliente() {
    
     cliente = new Cliente();
        try {
            
            //if(idcliente.getText().isEmpty()){
                listaClientes = clienteDAO.ListaCliente();
           // }
           // else
            //{
                //listaClientes = clienteDAO.ListaCliente(Integer.parseInt(idcliente.getText()));
            //}
        } catch (SQLException ex) {
            Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
 
        String dados [][] = new String[listaClientes.size()] [4];          
        int i = 0;
        for (Cliente cliente : listaClientes) {
        dados[i][0] = String.valueOf(cliente.getIdCliente());
        dados[i][1] = cliente.getNomeCliente();
        //dados[i][2] = cliente.getDataNascimento();
        dados[i][2] = cliente.getCpf();
        dados[i][3] = String.valueOf(cliente.getTelefone());
        /*dados[i][4] = cliente.getRg();
        dados[i][5] = cliente.getCidade();
        dados[i][6] = cliente.getEstado();
        dados[i][7] = cliente.getEndereco();
        dados[i][8] = cliente.getBairro();
        dados[i][9] = String.valueOf(cliente.getNumero());
        dados[i][10] = String.valueOf(cliente.getTelefone());
        dados[i][11] = String.valueOf(cliente.getTelefoneComercial());
        dados[i][12] = String.valueOf(cliente.getCelular());
        dados[i][13] = cliente.getEmail();*/
        i++;
        }
        String tituloColuna[] = {"ID", "Nome", "CPF", "Telefone"};
         DefaultTableModel tabelaCliente = new DefaultTableModel();
        tabelaCliente.setDataVector(dados, tituloColuna);
        tbl_cliente.setModel(new DefaultTableModel(dados, tituloColuna) {
        boolean[] canEdit = new boolean[]{
         false, false, false, false, false
        };
        public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
        }
        });
        tbl_cliente.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_cliente.getColumnModel().getColumn(1).setPreferredWidth(300);
        tbl_cliente.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbl_cliente.getColumnModel().getColumn(3).setPreferredWidth(200); 
        
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbl_cliente.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbl_cliente.setRowHeight(25);
        tbl_cliente.updateUI(); 
    }
 
   public void preparanovo(){
    btn_novocliente.setEnabled(false);
    btn_salvarcliente.setEnabled(true);
    btn_alterarcliente.setEnabled(false);
    btn_excluircliente.setEnabled(false);
    btn_cancelarcliente.setEnabled(true);
    tbl_cliente.setEnabled(false);
    tbl_cliente.clearSelection();
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
    idcliente.setEnabled(false);
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
    btn_salvarcliente.setEnabled(false);
    btn_cancelarcliente.setEnabled(false); 
    tbl_cliente.setEnabled(true);
}

public void Alterar(){
   btn_novocliente.setEnabled(false);
   btn_excluircliente.setEnabled(false);
   btn_alterarcliente.setEnabled(false);
   btn_salvarcliente.setEnabled(true);
   btn_cancelarcliente.setEnabled(true); 
   tbl_cliente.setEnabled(false);
   tbl_cliente.clearSelection();
}

public void Preparaselecaotabela(){
    btn_novocliente.setEnabled(true);
    btn_excluircliente.setEnabled(true);
    btn_alterarcliente.setEnabled(true);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairrocliente;
    private javax.swing.JButton btn_alterarcliente;
    private javax.swing.JButton btn_cancelarcliente;
    private javax.swing.JButton btn_excluircliente;
    private javax.swing.JButton btn_novocliente;
    private javax.swing.JButton btn_salvarcliente;
    private javax.swing.JFormattedTextField celcliente;
    private javax.swing.JTextField cidadecliente;
    private javax.swing.JFormattedTextField comercialcliente;
    private javax.swing.JTextField compcliente;
    private javax.swing.JFormattedTextField cpfcliente;
    private javax.swing.JFormattedTextField datacliente;
    private javax.swing.JTextField emailcliente;
    private javax.swing.JTextField endcliente;
    private javax.swing.JTextField estadocliente;
    private javax.swing.JFormattedTextField fixocliente;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomecliente;
    private javax.swing.JTextField numcliente;
    private javax.swing.JPanel pnl_cliente;
    private javax.swing.JFormattedTextField rgcliente;
    private javax.swing.JTable tbl_cliente;
    // End of variables declaration//GEN-END:variables
}
