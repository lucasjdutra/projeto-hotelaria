package fatec.poo.view;
import fatec.poo.control.*;
import fatec.poo.model.*;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas D. e Murilo K.
 */
public class GuiRegistro extends javax.swing.JFrame {

    public GuiRegistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLiberar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtRegistroFuncional = new javax.swing.JTextField();
        txtQuarto = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtDataSaida = new javax.swing.JTextField();
        txtDataEntrada = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnRegistroFuncional = new javax.swing.JButton();
        btnCPF = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnSituacao = new javax.swing.JButton();
        lblValorHospedagem = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        lblRegistroFuncional = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Hospedagem");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 294, 107, -1));

        jLabel1.setText("Código");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, -1));

        jLabel2.setText("Registro Funcional");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, -1, -1));

        jLabel3.setText("CPF Hóspede");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 99, -1, -1));

        jLabel4.setText("N°. Quarto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, -1, -1));

        jLabel5.setText("Data entrada");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, -1, -1));

        jLabel6.setText("Data saída");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, -1, -1));

        jLabel7.setText("Valor Hospedagem");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 248, -1, -1));

        btnLiberar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnLiberar.setText("Liberar");
        btnLiberar.setEnabled(false);
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLiberar, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 294, 107, -1));

        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.setEnabled(false);
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 294, 120, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 115, -1));

        txtRegistroFuncional.setEnabled(false);
        getContentPane().add(txtRegistroFuncional, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 115, -1));

        txtQuarto.setEnabled(false);
        getContentPane().add(txtQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, -1));

        txtCPF.setEnabled(false);
        getContentPane().add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 125, -1));

        txtDataSaida.setEnabled(false);
        getContentPane().add(txtDataSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 125, -1));

        txtDataEntrada.setEnabled(false);
        getContentPane().add(txtDataEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 125, -1));

        lblCPF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblCPF.setPreferredSize(new java.awt.Dimension(6, 20));
        getContentPane().add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 338, -1));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 130, -1));

        btnRegistroFuncional.setText("...");
        btnRegistroFuncional.setEnabled(false);
        btnRegistroFuncional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroFuncionalActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroFuncional, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 50, -1));

        btnCPF.setText("...");
        btnCPF.setEnabled(false);
        btnCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPFActionPerformed(evt);
            }
        });
        getContentPane().add(btnCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 50, -1));

        jLabel9.setText("Situação");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        btnSituacao.setText("...");
        btnSituacao.setEnabled(false);
        btnSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSituacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 50, -1));

        lblValorHospedagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblValorHospedagem.setPreferredSize(new java.awt.Dimension(6, 20));
        getContentPane().add(lblValorHospedagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 90, -1));

        lblSituacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSituacao.setPreferredSize(new java.awt.Dimension(6, 20));
        getContentPane().add(lblSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 280, -1));

        lblRegistroFuncional.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblRegistroFuncional.setPreferredSize(new java.awt.Dimension(6, 20));
        getContentPane().add(lblRegistroFuncional, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 338, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed
        try {
            Date saida = Date.valueOf(txtDataSaida.getText().trim());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Data de saída inválida. Use o formato AAAA-MM-DD.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
            txtDataSaida.requestFocus();
            return;
        }
            LocalDate dataSaida = LocalDate.parse(txtDataSaida.getText().trim());
            registro.setDataSaida(dataSaida);

            double valor = registro.liberarQuarto();
            daoRegistro.liberar(registro);
            DaoQuarto daoQuarto = new DaoQuarto(prepCon.abrirConexao());
            daoQuarto.alterar(registro.getQuarto());

            lblValorHospedagem.setText(String.format("%.2f", valor));
            txtDataSaida.setEnabled(false);
            btnLiberar.setEnabled(false);
            lblSituacao.setText("Disponível");
    }//GEN-LAST:event_btnLiberarActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        try {
            Date entrada = Date.valueOf(txtDataEntrada.getText().trim());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Data de entrada inválida.\nUse o formato: AAAA-MM-DD", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
            txtDataEntrada.requestFocus();
            return;
        }
        
        int codigo = Integer.parseInt(txtCodigo.getText());
        LocalDate dataEntrada = LocalDate.parse(txtDataEntrada.getText().trim());
        
        registro = new Registro(codigo, dataEntrada, recep);
        registro.setHospede(hospede);
        registro.setQuarto(quarto);
        
        //muda o estado do quarto para ocupado
        quarto.reservar();
        
        //atualiza o estado do quarto no BD
        DaoQuarto daoQuarto = new DaoQuarto(prepCon.abrirConexao());
        daoQuarto.alterar(quarto);
        
        daoRegistro.reservar(registro);
        
        JOptionPane.showMessageDialog(this, "Reserva efetuada com sucesso!");
        
        txtCodigo.setText("");
        txtRegistroFuncional.setText("");
        txtCPF.setText("");
        txtQuarto.setText("");
        txtDataEntrada.setText("");
        txtDataSaida.setText("");
        lblRegistroFuncional.setText("");
        lblCPF.setText("");
        lblSituacao.setText("");
        lblValorHospedagem.setText("");

        txtRegistroFuncional.setEnabled(false);
        txtCPF.setEnabled(false);
        txtQuarto.setEnabled(false);
        txtDataEntrada.setEnabled(false);
        txtDataSaida.setEnabled(false);
        btnRegistroFuncional.setEnabled(false);
        btnCPF.setEnabled(false);
        btnSituacao.setEnabled(false);
        btnReservar.setEnabled(false);
        btnLiberar.setEnabled(false);
        btnConsultar.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String entrada = txtCodigo.getText().trim();
        if (!entrada.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Código de Registro inválido.\nDigite um valor numérico inteiro.", "Aviso", JOptionPane.WARNING_MESSAGE);
            txtRegistroFuncional.requestFocus();
            return;
        }
        
        int codigo = Integer.parseInt(entrada);
        registro = daoRegistro.consultar(codigo);

        if (registro != null) {
            txtDataEntrada.setText(registro.getEntrada().toString());
            txtCPF.setText(registro.getHospede().getCpf());
            lblCPF.setText(registro.getHospede().getNome());
            txtQuarto.setText(Integer.toString(registro.getQuarto().getNumero()));
            lblSituacao.setText(registro.getQuarto().isSituacao() ? "Ocupado" : "Disponível");
            txtRegistroFuncional.setText(Integer.toString(registro.getRecepcionista().getRegFunc()));
            lblRegistroFuncional.setText(registro.getRecepcionista().getNome());
            lblValorHospedagem.setText(String.format("%.2f", registro.getValorHospedagem()));

            if (registro.getDataSaida() == null) {
                txtDataSaida.setEnabled(true);
                btnLiberar.setEnabled(true);
                txtDataSaida.requestFocus();
            } else {
                txtDataSaida.setText(registro.getDataSaida().toString());
            }
            
            txtCodigo.setEnabled(false);
            btnConsultar.setEnabled(false);
            btnReservar.setEnabled(false);
        } else {
            btnConsultar.setEnabled(false);
            txtCodigo.setEnabled(false);
            txtRegistroFuncional.setEnabled(true);
            btnRegistroFuncional.setEnabled(true);
            txtRegistroFuncional.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRegistroFuncionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroFuncionalActionPerformed
        try {
            int regFunc = Integer.parseInt(txtRegistroFuncional.getText().trim());
            DaoRecepcionista daoRecep = new DaoRecepcionista(prepCon.abrirConexao());
            recep = daoRecep.consultar(regFunc);

            if (recep != null) {
                lblRegistroFuncional.setText(recep.getNome());
                txtRegistroFuncional.setEnabled(false);
                btnRegistroFuncional.setEnabled(false);
                txtCPF.setEnabled(true);
                btnCPF.setEnabled(true);
                txtCPF.requestFocus();
                
            } else {
                JOptionPane.showMessageDialog(this, "Recepcionista não cadastrado.");
                lblRegistroFuncional.setText("");
                txtRegistroFuncional.requestFocus();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Código inválido.");
            lblRegistroFuncional.setText("");
            txtRegistroFuncional.requestFocus();
        }
    }//GEN-LAST:event_btnRegistroFuncionalActionPerformed

    private void btnCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPFActionPerformed
        String cpf = txtCPF.getText().replaceAll("[^\\d]", "");

        if (!Hospede.validarCPF(cpf)) {
            JOptionPane.showMessageDialog(this, "CPF inválido.");
            lblCPF.setText("");
            txtCPF.requestFocus();
            return;
        }

        DaoHospede daoHosp = new DaoHospede(prepCon.abrirConexao());
        hospede = daoHosp.consultar(cpf);

        if (hospede != null) {
            lblCPF.setText(hospede.getNome());
            txtCPF.setEnabled(false);
            btnCPF.setEnabled(false);
            txtQuarto.setEnabled(true);
            btnSituacao.setEnabled(true);
            txtQuarto.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Hóspede não cadastrado.");
            lblCPF.setText("");
        }
    }//GEN-LAST:event_btnCPFActionPerformed

    private void btnSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSituacaoActionPerformed
        try {
            int numero = Integer.parseInt(txtQuarto.getText().trim());
            DaoQuarto daoQuarto = new DaoQuarto(prepCon.abrirConexao());
            quarto = daoQuarto.consultar(numero);

            if (quarto != null) { //checa se o quarto está cadastrado
                if (quarto.isSituacao()) { //checa se o quarto está livre
                    JOptionPane.showMessageDialog(this, "Quarto Ocupado.");
                    lblSituacao.setText("Ocupado");
                    txtQuarto.requestFocus();
                } else {
                    lblSituacao.setText("Disponível");
                    txtQuarto.setEnabled(false);
                    btnSituacao.setEnabled(false);
                    txtDataEntrada.setEnabled(true);
                    txtDataEntrada.requestFocus();
                    btnReservar.setEnabled(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Quarto não cadastrado.");
                lblSituacao.setText("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Número de quarto inválido.");
            lblSituacao.setText("");
        }
    }//GEN-LAST:event_btnSituacaoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       prepCon = new PreparaConexao("","");                       
       prepCon.setDriver("net.ucanaccess.jdbc.UcanaccessDriver");
       prepCon.setConnectionString("jdbc:ucanaccess://C:\\Users\\lucas\\OneDrive\\Documentos\\FATEC\\Programação Orientada a Objetos\\prjPOOLucasMurilo\\src\\fatec\\poo\\basededados\\prjPOOBD.accdb" );
       daoRegistro = new DaoRegistro (prepCon.abrirConexao());
       
        if (daoRegistro == null) {
            JOptionPane.showMessageDialog(this, "Falha na Conexão com a Base de Dados", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_formWindowOpened




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCPF;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnRegistroFuncional;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblRegistroFuncional;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblValorHospedagem;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDataEntrada;
    private javax.swing.JTextField txtDataSaida;
    private javax.swing.JTextField txtQuarto;
    private javax.swing.JTextField txtRegistroFuncional;
    // End of variables declaration//GEN-END:variables
    private PreparaConexao prepCon = null;
    private Registro registro = null;
    private DaoRegistro daoRegistro = null;
    private Recepcionista recep = null;
    private Hospede hospede = null;
    private Quarto quarto = null;
}
