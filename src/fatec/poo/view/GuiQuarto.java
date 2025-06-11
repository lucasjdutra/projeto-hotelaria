package fatec.poo.view;
import fatec.poo.control.DaoQuarto;
import fatec.poo.control.PreparaConexao;
import fatec.poo.model.Quarto;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas D. e Murilo K.
 */
public class GuiQuarto extends javax.swing.JFrame {

    public GuiQuarto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgrpTipo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNQuarto = new javax.swing.JTextField();
        txtValorDiaria = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rdbSolteiro = new javax.swing.JRadioButton();
        rdbCasal = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Quarto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nº Quarto");
        jLabel1.setName(""); // NOI18N

        jLabel2.setText("Valor Diária");

        txtValorDiaria.setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        btgrpTipo.add(rdbSolteiro);
        rdbSolteiro.setSelected(true);
        rdbSolteiro.setText("Solteiro");
        rdbSolteiro.setEnabled(false);

        btgrpTipo.add(rdbCasal);
        rdbCasal.setText("Casal");
        rdbCasal.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbSolteiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbCasal)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSolteiro)
                    .addComponent(rdbCasal))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txtValorDiaria))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInserir, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos() { //método auxiliar
        txtNQuarto.setText(null);
        txtValorDiaria.setText(null);
        rdbSolteiro.setSelected(true);

        txtNQuarto.setEnabled(true);
        txtValorDiaria.setEnabled(false);
        rdbSolteiro.setEnabled(false);
        rdbCasal.setEnabled(false);

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        txtNQuarto.requestFocus();
    }

    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    String entrada = txtNQuarto.getText().trim();

    if (!entrada.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Número do quarto inválido.\nDigite um valor numérico inteiro.",
                "Mensagem de Aviso", JOptionPane.WARNING_MESSAGE);
        txtNQuarto.requestFocus();
        return;
    }

    int numeroQuarto = Integer.parseInt(entrada);
    quarto = daoQuarto.consultar(numeroQuarto);

    if (quarto != null) {
        txtValorDiaria.setText(String.valueOf(quarto.getValorDiaria()));
        if (quarto.getTipo().equals("S")) {
            rdbSolteiro.setSelected(true);
        } else {
            rdbCasal.setSelected(true);
        }

        txtNQuarto.setEnabled(false);
        txtValorDiaria.setEnabled(true);
        rdbSolteiro.setEnabled(true);
        rdbCasal.setEnabled(true);

        btnConsultar.setEnabled(false);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);

        txtValorDiaria.requestFocus();
    } else {
        txtNQuarto.setEnabled(false);
        txtValorDiaria.setEnabled(true);
        rdbSolteiro.setEnabled(true);
        rdbCasal.setEnabled(true);

        btnConsultar.setEnabled(false);
        btnInserir.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        txtValorDiaria.requestFocus();
        JOptionPane.showMessageDialog(this, "Quarto não encontrado no sistema", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        String tipo = rdbSolteiro.isSelected() ? "S" : "C";

        quarto = new Quarto(
            Integer.parseInt(txtNQuarto.getText()),
            tipo,
            Double.parseDouble(txtValorDiaria.getText())
        );

        daoQuarto.inserir(quarto);

        limparCampos();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            String tipo = rdbSolteiro.isSelected() ? "S" : "C";

            quarto = new Quarto(
                Integer.parseInt(txtNQuarto.getText()),
                tipo,
                Double.parseDouble(txtValorDiaria.getText())
            );

            daoQuarto.alterar(quarto);
        }
        limparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0) {
            daoQuarto.excluir(quarto);
        }
        limparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       prepCon = new PreparaConexao("","");                            
       prepCon.setDriver("net.ucanaccess.jdbc.UcanaccessDriver");
       prepCon.setConnectionString("jdbc:ucanaccess://C:\\Users\\lucas\\OneDrive\\Documentos\\FATEC\\Programação Orientada a Objetos\\prjPOOLucasMurilo\\src\\fatec\\poo\\basededados\\prjPOOBD.accdb" );
       daoQuarto = new DaoQuarto(prepCon.abrirConexao());
       
        if (daoQuarto == null) {
            JOptionPane.showMessageDialog(this, "Falha na Conexão com a Base de Dados", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgrpTipo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbCasal;
    private javax.swing.JRadioButton rdbSolteiro;
    private javax.swing.JTextField txtNQuarto;
    private javax.swing.JTextField txtValorDiaria;
    // End of variables declaration//GEN-END:variables
    private DaoQuarto daoQuarto=null;
    private Quarto quarto=null;
    private PreparaConexao prepCon=null;
}

