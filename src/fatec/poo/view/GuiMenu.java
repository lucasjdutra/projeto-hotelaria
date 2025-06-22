package fatec.poo.view;

/**
 *
 * @author Lucas D. e Murilo K.
 */
public class GuiMenu extends javax.swing.JFrame {

    public GuiMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemQuarto = new javax.swing.JMenuItem();
        jMenuItemRecepcionista = new javax.swing.JMenuItem();
        jMenuItemHospede = new javax.swing.JMenuItem();
        jMenuItemServicodeQuarto = new javax.swing.JMenuItem();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuItemReservar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel POO");

        jMenuCadastro.setText("Cadastro");

        jMenuItemQuarto.setText("Quarto");
        jMenuItemQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuartoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemQuarto);

        jMenuItemRecepcionista.setText("Recepcionista");
        jMenuItemRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRecepcionistaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemRecepcionista);

        jMenuItemHospede.setText("Hóspede");
        jMenuItemHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHospedeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemHospede);

        jMenuItemServicodeQuarto.setText("Serviço de Quarto");
        jMenuItemServicodeQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemServicodeQuartoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemServicodeQuarto);

        jMenuBar1.add(jMenuCadastro);

        jMenuRegistro.setText("Registro");

        jMenuItemReservar.setText("Reservar/Liberar");
        jMenuItemReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReservarActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemReservar);

        jMenuBar1.add(jMenuRegistro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuartoActionPerformed
        new GuiQuarto().setVisible(true);
    }//GEN-LAST:event_jMenuItemQuartoActionPerformed

    private void jMenuItemRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRecepcionistaActionPerformed
        new GuiRecepcionista().setVisible(true);
    }//GEN-LAST:event_jMenuItemRecepcionistaActionPerformed

    private void jMenuItemHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHospedeActionPerformed
        new GuiHospede().setVisible(true);
    }//GEN-LAST:event_jMenuItemHospedeActionPerformed

    private void jMenuItemServicodeQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemServicodeQuartoActionPerformed
        new GuiServicoDeQuarto().setVisible(true);
    }//GEN-LAST:event_jMenuItemServicodeQuartoActionPerformed

    private void jMenuItemReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReservarActionPerformed
        new GuiRegistro().setVisible(true);
    }//GEN-LAST:event_jMenuItemReservarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemHospede;
    private javax.swing.JMenuItem jMenuItemQuarto;
    private javax.swing.JMenuItem jMenuItemRecepcionista;
    private javax.swing.JMenuItem jMenuItemReservar;
    private javax.swing.JMenuItem jMenuItemServicodeQuarto;
    private javax.swing.JMenu jMenuRegistro;
    // End of variables declaration//GEN-END:variables
}
