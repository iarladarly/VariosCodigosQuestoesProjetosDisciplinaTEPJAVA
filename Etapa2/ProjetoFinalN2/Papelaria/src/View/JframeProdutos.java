package View;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import Controller.Controle_Campo;
import Controller.Papelaria_Controle;
import Controller.Controle_Campo.Campo;
import Model.PapelariaModel;



public class JframeProdutos extends javax.swing.JFrame {
    MaskFormatter formatoData;
    MaskFormatter formatoNumero;
    PapelariaModel produtosModel;
    Papelaria_Controle produtosController;
    DefaultTableModel modelo;

    public JframeProdutos() {
        setLocationRelativeTo(this);
        initComponents();
        habilitar(false);
        produtosModel = new PapelariaModel();
        produtosController = new Papelaria_Controle();
        modelo = (DefaultTableModel) tabela.getModel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtquant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtunitario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtValorTot = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLocalizar = new javax.swing.JTextField();
        btn_consulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btn_novo = new javax.swing.JButton();
        btn_salva = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_exclui = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtdescricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtfabricante = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Papelaria");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Código de identificação");

        txtCodigoID.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome do produto:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Quantidade:");

        txtquant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Valor Unitário:");

        txtunitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtunitarioKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Resultado Valor Total");

        txtValorTot.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Localização de produto:");

        txtLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalizarActionPerformed(evt);
            }
        });
        txtLocalizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLocalizarKeyReleased(evt);
            }
        });

        btn_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pesquisar.png"))); // NOI18N
        btn_consulta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descrição", "Fabricante", "Valor Unitário", "Quantidade", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setToolTipText("tabela");
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        btn_novo.setBackground(new java.awt.Color(255, 255, 255));
        btn_novo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(51, 51, 51));
        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/novo.png"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_novo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_novo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salva.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_salva.setForeground(new java.awt.Color(51, 51, 51));
        btn_salva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/salvar.png"))); // NOI18N
        btn_salva.setText("Salvar");
        btn_salva.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_salva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_salva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvaActionPerformed(evt);
            }
        });

        btn_editar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(51, 51, 51));
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/editar.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_exclui.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_exclui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/excluir-.png"))); // NOI18N
        btn_exclui.setText("Excluir");
        btn_exclui.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_exclui.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exclui.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_exclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Descrição: ");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/papelaria.png"))); // NOI18N
        jLabel8.setText("Papelaria");
        jLabel8.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fabricante:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Resultado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLocalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtdescricao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfabricante)
                                    .addComponent(txtnome)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 436, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtunitario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(42, 42, 42)
                                        .addComponent(txtValorTot, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_salva, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exclui, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_exclui)
                            .addComponent(btn_editar)
                            .addComponent(btn_salva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_novo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(31, 31, 31)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtunitario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorTot, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_excluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluiActionPerformed
        // TODO add your handling code here:
        modelo.removeRow(tabela.getSelectedRow());
        produtosController.excluir(produtosModel);
        habilitar(true);
        excluir();
        modelo.setRowCount(0);
    }//GEN-LAST:event_btn_excluiActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        capituraInformacoes();
        produtosController.editar(produtosModel);
        excluir();
        modelo.setRowCount(0);
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_salvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvaActionPerformed
        capituraInformacoes();
        produtosController.cadastrar(produtosModel);
        excluir();
       
    }//GEN-LAST:event_btn_salvaActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        // TODO add your handling code here:
        habilitar(true);
        produtosController.Produtoseguinte();
        txtCodigoID.setText(produtosController.Produtoseguinte());  
    }//GEN-LAST:event_btn_novoActionPerformed

    private void tabelaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMousePressed
        // TODO add your handling code here:
         habilitar(true);
        produtosModel = produtosController.preenche(Integer.parseInt(modelo.getValueAt(tabela.getSelectedRow(), 0).toString()));
        txtCodigoID.setText(produtosModel.getId() + "");
        txtnome.setText(produtosModel.getNome());
        txtdescricao.setText(produtosModel.getDescricao());
        txtfabricante.setText(produtosModel.getFabricante());
        txtquant.setText(produtosModel.getQuant() + "");
        txtunitario.setText(produtosModel.getValorUnitario() + "");
        txtValorTot.setText(produtosModel.getValorTot()+"");
      
    }//GEN-LAST:event_tabelaMousePressed

    private void btn_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaActionPerformed
        // TODO add your handling code here:
        if(txtLocalizar.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Clique no novo e escreva algo para fazer a consulta");
        } else {
           
            modelo.setNumRows(0);
            produtosController.pesquisar(txtLocalizar.getText(), modelo);
        }
    }//GEN-LAST:event_btn_consultaActionPerformed

    private void txtLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalizarActionPerformed

    private void txtunitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtunitarioKeyTyped
        char  c= evt.getKeyChar();
        if(Character.isLetter(c) && evt.isAltDown())
        {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtunitarioKeyTyped

    private void txtquantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantActionPerformed

    private void txtLocalizarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocalizarKeyReleased
        modelo.setNumRows(0);
            produtosController.pesquisar(txtLocalizar.getText(), modelo);
    }//GEN-LAST:event_txtLocalizarKeyReleased

    


  

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JframeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consulta;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_exclui;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigoID;
    private javax.swing.JTextField txtLocalizar;
    private javax.swing.JTextField txtValorTot;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtfabricante;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtquant;
    private javax.swing.JTextField txtunitario;
    // End of variables declaration//GEN-END:variables
    final void habilitar(boolean valor) {
        txtnome.setEnabled(valor);
        txtdescricao.setEnabled(valor);
        txtfabricante.setEnabled(valor);
       
        txtquant.setEnabled(valor);
        txtquant.setEnabled(valor);
        txtunitario.setEnabled(valor);
        txtLocalizar.setEnabled(valor);
    }

    final void capituraInformacoes() {
        int iValue = 0;
        double iValue1 = 0.0;
        produtosModel.setNome(txtnome.getText());
        produtosModel.setDescricao(txtdescricao.getText());
        produtosModel.setFabricante(txtfabricante.getText());
      
        try {
            double value = Double.parseDouble(txtquant.getText().trim().replaceAll(",", "."));
            iValue = (int) value;
            produtosModel.setQuant(iValue);
        } catch (NumberFormatException exception) {
            
            produtosModel.setQuant(0);
           
        }
        try {
            double value1 = Double.parseDouble(txtunitario.getText().trim().replaceAll(",", "."));
            iValue1 = value1;
            produtosModel.setValorUnitario(iValue1);
        } catch (NumberFormatException exception) {        
        }
        double total = iValue1 * iValue;
        String.valueOf(total);
        produtosModel.setValorTot(total);
        txtValorTot.setText(String.format("%.2f", total));

    }
    final void excluir()
    {
        txtCodigoID.setText("");
        txtnome.setText("");
        txtdescricao.setText("");
        txtfabricante.setText(""); 
       
        txtquant.setText("");
        txtunitario.setText("");
        txtValorTot.setText("");
        txtLocalizar.setText("");
    }

   
}
