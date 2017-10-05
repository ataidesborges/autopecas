/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import Model.Funcionário;
import DAO.FuncionarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Larissa
 */
public class FuncionarioView extends javax.swing.JInternalFrame {
    Funcionário funcionario;
    FuncionarioDAO funcionarioDAO;
    List<Funcionário> listaFuncionarios;

    /**
     * Creates new form Funcionário
     */
    public FuncionarioView() {
        funcionarioDAO = new FuncionarioDAO();
        listaFuncionarios = new ArrayList<>();
        initComponents();
        this.setVisible(true);
         AtualizartabelaFuncionario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_funcionario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idfunc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomefunc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cpffunc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        celfunc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailfunc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        loginfunc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        senhafunc = new javax.swing.JPasswordField();
        btn_novofunc = new javax.swing.JButton();
        btn_salvarfunc = new javax.swing.JButton();
        btn_alterarfunc = new javax.swing.JButton();
        btn_excluirfunc = new javax.swing.JButton();
        btn_cancelarfunc = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        datanascfunc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cidadefunc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        estadofunc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        endfunc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        bairrofunc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        numfunc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        complefunc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        telfunc = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_funcionario = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);

        pnl_funcionario.setBackground(new java.awt.Color(204, 204, 204));
        pnl_funcionario.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("DADOS DO FUNCIONÁRIO");
        pnl_funcionario.add(jLabel1);
        jLabel1.setBounds(10, 11, 154, 15);

        jLabel2.setText("ID Funcionário");
        pnl_funcionario.add(jLabel2);
        jLabel2.setBounds(10, 60, 90, 14);

        idfunc.setBackground(new java.awt.Color(204, 204, 204));
        pnl_funcionario.add(idfunc);
        idfunc.setBounds(10, 80, 80, 20);

        jLabel3.setText("Nome");
        pnl_funcionario.add(jLabel3);
        jLabel3.setBounds(100, 60, 40, 14);

        nomefunc.setEnabled(false);
        pnl_funcionario.add(nomefunc);
        nomefunc.setBounds(100, 80, 300, 20);

        jLabel4.setText("CPF");
        pnl_funcionario.add(jLabel4);
        jLabel4.setBounds(10, 110, 50, 14);

        cpffunc.setEnabled(false);
        pnl_funcionario.add(cpffunc);
        cpffunc.setBounds(10, 130, 140, 20);

        jLabel5.setText("Celular");
        pnl_funcionario.add(jLabel5);
        jLabel5.setBounds(130, 210, 50, 14);

        celfunc.setEnabled(false);
        pnl_funcionario.add(celfunc);
        celfunc.setBounds(130, 230, 110, 20);

        jLabel6.setText("Email");
        pnl_funcionario.add(jLabel6);
        jLabel6.setBounds(250, 210, 50, 14);

        emailfunc.setEnabled(false);
        pnl_funcionario.add(emailfunc);
        emailfunc.setBounds(250, 230, 310, 20);

        jLabel7.setText("Login (Nick)");
        pnl_funcionario.add(jLabel7);
        jLabel7.setBounds(10, 320, 80, 14);

        loginfunc.setEnabled(false);
        pnl_funcionario.add(loginfunc);
        loginfunc.setBounds(10, 340, 160, 20);

        jLabel8.setText("Senha");
        pnl_funcionario.add(jLabel8);
        jLabel8.setBounds(180, 320, 60, 14);

        senhafunc.setEnabled(false);
        pnl_funcionario.add(senhafunc);
        senhafunc.setBounds(180, 340, 140, 20);

        btn_novofunc.setBackground(new java.awt.Color(153, 153, 153));
        btn_novofunc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_novofunc.setForeground(new java.awt.Color(255, 255, 255));
        btn_novofunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/novo.png"))); // NOI18N
        btn_novofunc.setText("Novo");
        btn_novofunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novofuncActionPerformed(evt);
            }
        });
        pnl_funcionario.add(btn_novofunc);
        btn_novofunc.setBounds(30, 390, 110, 30);

        btn_salvarfunc.setBackground(new java.awt.Color(153, 153, 153));
        btn_salvarfunc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_salvarfunc.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvarfunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        btn_salvarfunc.setText("Salvar");
        btn_salvarfunc.setEnabled(false);
        btn_salvarfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarfuncActionPerformed(evt);
            }
        });
        pnl_funcionario.add(btn_salvarfunc);
        btn_salvarfunc.setBounds(150, 390, 110, 30);

        btn_alterarfunc.setBackground(new java.awt.Color(153, 153, 153));
        btn_alterarfunc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterarfunc.setForeground(new java.awt.Color(255, 255, 255));
        btn_alterarfunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alterar.png"))); // NOI18N
        btn_alterarfunc.setText("Alterar");
        btn_alterarfunc.setEnabled(false);
        btn_alterarfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarfuncActionPerformed(evt);
            }
        });
        pnl_funcionario.add(btn_alterarfunc);
        btn_alterarfunc.setBounds(270, 390, 110, 30);

        btn_excluirfunc.setBackground(new java.awt.Color(153, 153, 153));
        btn_excluirfunc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_excluirfunc.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluirfunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        btn_excluirfunc.setText("Excluir");
        btn_excluirfunc.setEnabled(false);
        btn_excluirfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirfuncActionPerformed(evt);
            }
        });
        pnl_funcionario.add(btn_excluirfunc);
        btn_excluirfunc.setBounds(507, 390, 110, 30);

        btn_cancelarfunc.setBackground(new java.awt.Color(153, 153, 153));
        btn_cancelarfunc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelarfunc.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelarfunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelar.png"))); // NOI18N
        btn_cancelarfunc.setText("Cancelar");
        btn_cancelarfunc.setEnabled(false);
        btn_cancelarfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarfuncActionPerformed(evt);
            }
        });
        pnl_funcionario.add(btn_cancelarfunc);
        btn_cancelarfunc.setBounds(390, 390, 110, 30);

        jLabel9.setText("Data de Nascimento");
        pnl_funcionario.add(jLabel9);
        jLabel9.setBounds(410, 60, 130, 14);

        datanascfunc.setEnabled(false);
        pnl_funcionario.add(datanascfunc);
        datanascfunc.setBounds(410, 80, 140, 20);

        jLabel10.setText("Cidade");
        pnl_funcionario.add(jLabel10);
        jLabel10.setBounds(160, 110, 50, 14);

        cidadefunc.setEnabled(false);
        pnl_funcionario.add(cidadefunc);
        cidadefunc.setBounds(160, 130, 240, 20);

        jLabel11.setText("Estado");
        pnl_funcionario.add(jLabel11);
        jLabel11.setBounds(410, 110, 60, 14);

        estadofunc.setEnabled(false);
        pnl_funcionario.add(estadofunc);
        estadofunc.setBounds(410, 130, 140, 20);

        jLabel12.setText("Endereço");
        pnl_funcionario.add(jLabel12);
        jLabel12.setBounds(10, 160, 60, 14);

        endfunc.setEnabled(false);
        pnl_funcionario.add(endfunc);
        endfunc.setBounds(10, 180, 210, 20);

        jLabel13.setText("Bairro");
        pnl_funcionario.add(jLabel13);
        jLabel13.setBounds(230, 160, 40, 14);

        bairrofunc.setEnabled(false);
        pnl_funcionario.add(bairrofunc);
        bairrofunc.setBounds(230, 180, 170, 20);

        jLabel14.setText("Número");
        pnl_funcionario.add(jLabel14);
        jLabel14.setBounds(410, 160, 60, 14);

        numfunc.setEnabled(false);
        pnl_funcionario.add(numfunc);
        numfunc.setBounds(410, 180, 60, 20);

        jLabel15.setText("Complemento");
        pnl_funcionario.add(jLabel15);
        jLabel15.setBounds(480, 160, 80, 14);

        complefunc.setEnabled(false);
        pnl_funcionario.add(complefunc);
        complefunc.setBounds(480, 180, 80, 20);

        jLabel16.setText("Telefone");
        pnl_funcionario.add(jLabel16);
        jLabel16.setBounds(10, 210, 60, 14);

        telfunc.setEnabled(false);
        pnl_funcionario.add(telfunc);
        telfunc.setBounds(10, 230, 110, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("CADASTRO DO LOGIN");
        pnl_funcionario.add(jLabel17);
        jLabel17.setBounds(10, 280, 150, 15);

        tbl_funcionario.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_funcionario.setSelectionBackground(new java.awt.Color(153, 204, 255));
        tbl_funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_funcionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_funcionario);

        pnl_funcionario.add(jScrollPane1);
        jScrollPane1.setBounds(10, 450, 680, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_excluirfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirfuncActionPerformed
         if (idfunc.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Selecione um funcionário!!");
     }  else {
         funcionario = new Funcionário();
         funcionario.setIdFuncionario(Integer.parseInt(idfunc.getText()));
          int confirma = JOptionPane.showConfirmDialog(null,"Deseja excluir?: " + nomefunc.getText());
          if(confirma == 0){
         try{
               funcionarioDAO.excluir(funcionario);  
            }catch (SQLException ex){
                Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            limpar();
            AtualizartabelaFuncionario();
            excluir();           
     }               
         }   
    }//GEN-LAST:event_btn_excluirfuncActionPerformed

    private void btn_alterarfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarfuncActionPerformed
        Alterar();
        campos_liberados();    
    }//GEN-LAST:event_btn_alterarfuncActionPerformed

    private void btn_salvarfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarfuncActionPerformed
        
        funcionario = new Funcionário();
        if(nomefunc.getText().isEmpty() ||  datanascfunc.getText().isEmpty() || cpffunc.getText().isEmpty() || cidadefunc.getText().isEmpty() ||
                estadofunc.getText().isEmpty() || endfunc.getText().isEmpty() || bairrofunc.getText().isEmpty() || numfunc.getText().isEmpty() ||
                complefunc.getText().isEmpty() || telfunc.getText().isEmpty() ||celfunc.getText().isEmpty() || 
                emailfunc.getText().isEmpty() || loginfunc.getText().isEmpty() ||senhafunc.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!");
            nomefunc.requestFocusInWindow();
        } else if (idfunc.getText().isEmpty())
                {
                    funcionario.setNomeFunc(nomefunc.getText());
                    funcionario.setDatanascimento(datanascfunc.getText());
                    funcionario.setCpf(cpffunc.getText());
                    funcionario.setCidade(cidadefunc.getText());
                    funcionario.setEstado(estadofunc.getText());
                    funcionario.setEndereco(endfunc.getText());
                    funcionario.setBairro(bairrofunc.getText());
                    funcionario.setNumero(Integer.parseInt(numfunc.getText()));
                    funcionario.setComplemento(complefunc.getText());
                    funcionario.setTelefone(Integer.parseInt(telfunc.getText()));
                    funcionario.setCelular(Integer.parseInt(celfunc.getText()));
                    funcionario.setEmail(emailfunc.getText());
                    funcionario.setUsuario(loginfunc.getText());
                    funcionario.setSenha(senhafunc.getText());
            
            try {
                funcionarioDAO.salvar(funcionario);
            } catch (SQLException ex) {
                Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Gravado com Sucesso!!");
             AtualizartabelaFuncionario();
            preparaSalvareCancelar();
            campos_bloqueados();
            limpar();
            
        } 
        
         else{     
            funcionario.setIdFuncionario(Integer.parseInt(idfunc.getText()));
            funcionario.setNomeFunc(nomefunc.getText());
            funcionario.setDatanascimento(datanascfunc.getText());
            funcionario.setCpf(cpffunc.getText());
            funcionario.setCidade(cidadefunc.getText());
            funcionario.setEstado(estadofunc.getText());
            funcionario.setEndereco(endfunc.getText());
            funcionario.setBairro(bairrofunc.getText());
            funcionario.setNumero(Integer.parseInt(numfunc.getText()));
            funcionario.setComplemento(complefunc.getText());
            funcionario.setTelefone(Integer.parseInt(telfunc.getText()));
            funcionario.setCelular(Integer.parseInt(celfunc.getText()));
            funcionario.setEmail(emailfunc.getText());
            funcionario.setUsuario(loginfunc.getText());
            funcionario.setSenha(senhafunc.getText());
            
            try {
                funcionarioDAO.alterar(funcionario);
            } catch (SQLException ex) {
                Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Gravado com Sucesso!!");
            AtualizartabelaFuncionario();
            preparaSalvareCancelar();
            campos_bloqueados();        
        }    
    }//GEN-LAST:event_btn_salvarfuncActionPerformed

    private void btn_novofuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novofuncActionPerformed
       limpar();
       preparanovo();
       campos_liberados();
       
    }//GEN-LAST:event_btn_novofuncActionPerformed

    private void btn_cancelarfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarfuncActionPerformed
         limpar();
         preparaSalvareCancelar();
         campos_bloqueados();
         
    }//GEN-LAST:event_btn_cancelarfuncActionPerformed

    private void tbl_funcionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_funcionarioMouseClicked
        idfunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 0).toString());
        nomefunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 1).toString());
        //datanascfunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 2).toString());
        cpffunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 2).toString());
        telfunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 3).toString());
        /*cidadefunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 4).toString());
        estadofunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 5).toString());
        endfunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 6).toString());
        bairrofunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 7).toString());
        numfunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 8).toString());
        complefunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 9).toString());
        telfunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 10).toString());
        celfunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 11).toString());
        emailfunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 12).toString());
        loginfunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 13).toString());
        senhafunc.setText(tbl_funcionario.getValueAt(tbl_funcionario.getSelectedRow(), 14).toString());*/

        Preparaselecaotabela();
    }//GEN-LAST:event_tbl_funcionarioMouseClicked

    public void preparanovo() {
        btn_novofunc.setEnabled(false);
        btn_salvarfunc.setEnabled(true);
        btn_alterarfunc.setEnabled(false);
        btn_cancelarfunc.setEnabled(true);
        tbl_funcionario.setEnabled(false);
        tbl_funcionario.clearSelection();
    }
          
    public void limpar(){
       nomefunc.setText("");
       datanascfunc.setText("");
       cpffunc.setText("");
       cidadefunc.setText("");
       estadofunc.setText("");
       endfunc.setText("");
       bairrofunc.setText("");
       numfunc.setText("");
       complefunc.setText("");
       telfunc.setText("");
       celfunc.setText("");
       emailfunc.setText("");
       loginfunc.setText("");
       senhafunc.setText("");   
    }
    
    public void excluir(){
       btn_excluirfunc.setEnabled(false);
       btn_alterarfunc.setEnabled(false);  
    }
    
public void campos_bloqueados(){
    nomefunc.setEnabled(false);
    datanascfunc.setEnabled(false);
    cpffunc.setEnabled(false);
    cidadefunc.setEnabled(false);
    estadofunc.setEnabled(false);
    endfunc.setEnabled(false);
    bairrofunc.setEnabled(false);
    numfunc.setEnabled(false);
    complefunc.setEnabled(false);
    telfunc.setEnabled(false);
    celfunc .setEnabled(false);
    emailfunc.setEnabled(false);
    loginfunc.setEnabled(false);
    senhafunc.setEnabled(false);
    
}
public void campos_liberados(){
    nomefunc.setEnabled(true);
    datanascfunc.setEnabled(true);
    cpffunc.setEnabled(true);
    cidadefunc.setEnabled(true);
    estadofunc.setEnabled(true);
    endfunc.setEnabled(true);
    bairrofunc.setEnabled(true);
    numfunc.setEnabled(true);
    complefunc.setEnabled(true);
    telfunc.setEnabled(true);
    celfunc .setEnabled(true);
    emailfunc.setEnabled(true);
    loginfunc.setEnabled(true);
    senhafunc.setEnabled(true);
    
}

public void preparaSalvareCancelar(){
    btn_novofunc.setEnabled(true);
    btn_salvarfunc.setEnabled(true);
    btn_cancelarfunc.setEnabled(false); 
    tbl_funcionario.setEnabled(true);
}

public void Alterar(){
   btn_novofunc.setEnabled(false);
   btn_excluirfunc.setEnabled(false);
   btn_alterarfunc.setEnabled(false);
   btn_salvarfunc.setEnabled(true);
   btn_cancelarfunc.setEnabled(true); 
   tbl_funcionario.setEnabled(false);
   tbl_funcionario.clearSelection();
}

public void AtualizartabelaFuncionario()  {
   funcionario = new Funcionário();  
 
        
       try {
           //if(idfunc.getText().isEmpty()){
           listaFuncionarios = funcionarioDAO.ListaFuncionario();
       
           //else
            //{
      
              // listaFuncionarios = funcionarioDAO.ListaFuncionario(Integer.parseInt(idfunc.getText()));
            //}
       }   catch (SQLException ex) {
           Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
        String dados [][] = new String[listaFuncionarios.size()] [4];          
        int i = 0;
        for (Funcionário funcionario : listaFuncionarios) {
        dados[i][0] = String.valueOf(funcionario.getIdFuncionario());
        dados[i][1] = funcionario.getNomeFunc();
        //dados[i][2] = funcionario.getEmail();
        dados[i][2] = funcionario.getCpf();
       // dados[i][4] = String.valueOf(funcionario.getCelular());
        //dados[i][5] = funcionario.getUsuario();
        //dados[i][6] = funcionario.getSenha();
        //dados[i][7] = funcionario.getCidade();
        //dados[i][8] = funcionario.getEstado();
        dados[i][3] = String.valueOf(funcionario.getTelefone());
        //dados[i][10] = funcionario.getDatanascimento(); 
        //dados[i][11] = funcionario.getEndereco();
        //dados[i][12] = funcionario.getBairro();
        //dados[i][13] = funcionario.getComplemento();
        //dados[i][14] = String.valueOf(funcionario.getNumero());
        i++;
        }
        
        String tituloColuna[] = {"ID", "Nome", "CPF", "Telefone"};
         DefaultTableModel tabelaFuncionario = new DefaultTableModel();
        tabelaFuncionario.setDataVector(dados, tituloColuna);
        tbl_funcionario.setModel(new DefaultTableModel(dados, tituloColuna) {
        boolean[] canEdit = new boolean[]{
         false, false, false, false
        };
        public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
        }
        });
        tbl_funcionario.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_funcionario.getColumnModel().getColumn(1).setPreferredWidth(300);
        tbl_funcionario.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbl_funcionario.getColumnModel().getColumn(3).setPreferredWidth(200);
        
        
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbl_funcionario.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbl_funcionario.setRowHeight(25);
        tbl_funcionario.updateUI(); 
}

public void Preparaselecaotabela(){
    btn_novofunc.setEnabled(true);
    btn_excluirfunc.setEnabled(true);
    btn_alterarfunc.setEnabled(true);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairrofunc;
    private javax.swing.JButton btn_alterarfunc;
    private javax.swing.JButton btn_cancelarfunc;
    private javax.swing.JButton btn_excluirfunc;
    private javax.swing.JButton btn_novofunc;
    private javax.swing.JButton btn_salvarfunc;
    private javax.swing.JTextField celfunc;
    private javax.swing.JTextField cidadefunc;
    private javax.swing.JTextField complefunc;
    private javax.swing.JTextField cpffunc;
    private javax.swing.JTextField datanascfunc;
    private javax.swing.JTextField emailfunc;
    private javax.swing.JTextField endfunc;
    private javax.swing.JTextField estadofunc;
    private javax.swing.JTextField idfunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loginfunc;
    private javax.swing.JTextField nomefunc;
    private javax.swing.JTextField numfunc;
    private javax.swing.JPanel pnl_funcionario;
    private javax.swing.JPasswordField senhafunc;
    private javax.swing.JTable tbl_funcionario;
    private javax.swing.JTextField telfunc;
    // End of variables declaration//GEN-END:variables
}
