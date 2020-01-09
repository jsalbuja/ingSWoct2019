package proyect_gui;

import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyect_metodos.MetodoPasajero;
import proyect_clases.Pasajero;
import proyect_metodos.Entorno;

public class GUI_RegistroPasajeros extends javax.swing.JFrame {

    Pasajero pasajero = new Pasajero();
    MetodoPasajero metodos = new MetodoPasajero();
    DefaultTableModel mdlTablaP;
    Vector vCabeceras = new Vector();

    public GUI_RegistroPasajeros() {
        initComponents();
        InicializaEntorno();

        vCabeceras.addElement("ID");
        vCabeceras.addElement("CEDULA");
        vCabeceras.addElement("NOMBRE");
        vCabeceras.addElement("APELLIDO");
        vCabeceras.addElement("CATEGORIA");
        vCabeceras.addElement("EDAD");

        mdlTablaP = new DefaultTableModel(vCabeceras, 0);
        table_pasajero.setModel(metodos.ListaPasajero());

        this.setLocationRelativeTo(null);
    }

    private void InicializaEntorno() {

        File tmp = new File(Entorno.RutaPasajeros);

        if (!tmp.exists()) {
            try {
                tmp.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(GUI_RegistroPasajeros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_p_id1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_p_cedula1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_p_nuevo = new javax.swing.JButton();
        btn_p_guardar = new javax.swing.JButton();
        btn_p_actializar = new javax.swing.JButton();
        btn_p_salir = new javax.swing.JButton();
        btn_p_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_p_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_p_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_p_cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_p_edad = new javax.swing.JTextField();
        txt_p_pasajero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_p_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pasajero = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("DATOS DEL PASAJERO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("BUSQUEDA DEL PASAJERO");

        jLabel8.setText("ID");

        jLabel11.setText("Cédula");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_p_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txt_p_cedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_p_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_p_cedula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 410, 90));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_p_nuevo.setText("Nuevo");
        btn_p_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_nuevoActionPerformed(evt);
            }
        });

        btn_p_guardar.setText("Guardar");
        btn_p_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_guardarActionPerformed(evt);
            }
        });

        btn_p_actializar.setText("Editar");
        btn_p_actializar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_actializarActionPerformed(evt);
            }
        });

        btn_p_salir.setText("Salir");
        btn_p_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_salirActionPerformed(evt);
            }
        });

        btn_p_eliminar.setText("Eliminar");
        btn_p_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_p_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_p_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_p_actializar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_p_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_p_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_p_nuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_p_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_p_actializar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_p_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_p_salir)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, 200));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido");

        jLabel3.setText("Cedula");

        jLabel4.setText("Edad:");

        jLabel5.setText("Tipo Pasajero");

        jLabel9.setText("ID:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_p_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_p_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_p_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_p_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_p_id, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_p_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt_p_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_p_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_p_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_p_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_p_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_p_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 410, 100));

        table_pasajero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CEDULA", "NOMBRE", "APELLIDO", "TIPO", "EDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_pasajero);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 530, 201));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new GUI_RegistroPasajeros().setVisible(true);
        });
    }

    private boolean ValidarFormulario() {

        if (txt_p_id.isEnabled()) {
            Vector reg = metodos.BuscarPasajeroPorId(txt_p_id.getText());

            if (reg.size() > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe un pasajero con este Id", "Atención", JOptionPane.WARNING_MESSAGE);

                txt_p_id.setText("");
                txt_p_id.setFocusable(true);

                return false;
            }

            reg = metodos.BuscarPasajeroPorCedula(txt_p_cedula.getText());

            if (reg.size() > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe un pasajero con este número de cédula", "Atención", JOptionPane.WARNING_MESSAGE);

                txt_p_cedula.setText("");
                txt_p_cedula.setFocusable(true);

                return false;
            }
        }

        if ("".equals(txt_p_nombre.getText()) || "".equals(txt_p_apellido.getText())) {
            JOptionPane.showMessageDialog(null, "La información del nombre del pasajero está incompleta", "Atención", JOptionPane.WARNING_MESSAGE);
            txt_p_nombre.setFocusable(true);

            return false;
        }

        if ("".equals(txt_p_pasajero.getText()) || "".equals(txt_p_edad.getText())) {
            JOptionPane.showMessageDialog(null, "La información complementaria del pasajero está incompleta", "Atención", JOptionPane.WARNING_MESSAGE);
            txt_p_pasajero.setFocusable(true);

            return false;
        }

        return true;
    }

    private void btn_p_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_guardarActionPerformed

        if (!ValidarFormulario()) {
            return;
        }

        mdlTablaP = new DefaultTableModel();

        int id_p = Integer.parseInt(txt_p_id.getText());
        String nombre_p = txt_p_nombre.getText();
        String apellido_p = txt_p_apellido.getText();
        String pasajero_p = txt_p_pasajero.getText();
        String cedula_p = txt_p_cedula.getText();
        int edad_p = Integer.parseInt(txt_p_edad.getText());

        pasajero.setId_pasajero(id_p);
        pasajero.setNombre_pasajero(nombre_p);
        pasajero.setApellido_pasajero(apellido_p);
        pasajero.setTipo_pasajero(pasajero_p);
        pasajero.setCedula_pasajero(cedula_p);
        pasajero.setEdad_pasajero(edad_p);

        if (txt_p_id.isEnabled()) {
            metodos.GuardarPasajero(pasajero);
            metodos.GuardarArchivoPasajero(pasajero);
        } else {
            metodos.EditarPasajero(pasajero);
        }

        table_pasajero.setModel(metodos.ListaPasajero());
    }//GEN-LAST:event_btn_p_guardarActionPerformed

    private void btn_p_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_salirActionPerformed
        // TODO add your handling code here:
        GUI_Principal b = new GUI_Principal();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_p_salirActionPerformed

    private void btn_p_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_eliminarActionPerformed

        int dialogButton = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este registro?", "Confirmación requerida", JOptionPane.YES_NO_OPTION);

        if (dialogButton == JOptionPane.YES_OPTION) {
            if ("".equals(txt_p_id1.getText()) && "".equals(txt_p_cedula1.getText())) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un ID o un número de cédula para buscar", "Atención", JOptionPane.WARNING_MESSAGE);
            }
            if (!"".equals(txt_p_id1.getText())) {
                metodos.EliminarPasajeroPorId(txt_p_id1.getText());
            } else {
                metodos.EliminarPasajeroPorCedula(txt_p_cedula1.getText());
            }
            table_pasajero.setModel(metodos.ListaPasajero());
        }
    }//GEN-LAST:event_btn_p_eliminarActionPerformed

    private void btn_p_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_nuevoActionPerformed
        // Limpia los Jtext:
        txt_p_id.setText("");
        txt_p_nombre.setText("");
        txt_p_apellido.setText("");
        txt_p_pasajero.setText("");
        txt_p_cedula.setText("");
        txt_p_edad.setText("");
    }//GEN-LAST:event_btn_p_nuevoActionPerformed

    private void btn_p_actializarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_actializarActionPerformed
        
        if ("".equals(txt_p_id1.getText()) && "".equals(txt_p_cedula1.getText())) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un ID o un número de cédula para buscar", "Atención", JOptionPane.WARNING_MESSAGE);
        }

        Vector reg;

        if (!"".equals(txt_p_id1.getText())) {
            reg = metodos.BuscarPasajeroPorId(txt_p_id1.getText());
        } else {
            reg = metodos.BuscarPasajeroPorCedula(txt_p_cedula1.getText());
        }

        if (reg.size() > 0) {
            txt_p_id.setText(reg.get(0).toString());
            txt_p_cedula.setText(reg.get(1).toString());
            txt_p_nombre.setText(reg.get(2).toString());
            txt_p_apellido.setText(reg.get(3).toString());
            txt_p_pasajero.setText(reg.get(4).toString());
            txt_p_edad.setText(reg.get(5).toString());

            txt_p_id.setEnabled(false);
            txt_p_id.setFocusable(true);
        } else {
            JOptionPane.showMessageDialog(null, "No existe un registro con este Id", "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_p_actializarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_p_actializar;
    private javax.swing.JButton btn_p_eliminar;
    private javax.swing.JButton btn_p_guardar;
    private javax.swing.JButton btn_p_nuevo;
    private javax.swing.JButton btn_p_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_pasajero;
    private javax.swing.JTextField txt_p_apellido;
    private javax.swing.JTextField txt_p_cedula;
    private javax.swing.JTextField txt_p_cedula1;
    private javax.swing.JTextField txt_p_edad;
    private javax.swing.JTextField txt_p_id;
    private javax.swing.JTextField txt_p_id1;
    private javax.swing.JTextField txt_p_nombre;
    private javax.swing.JTextField txt_p_pasajero;
    // End of variables declaration//GEN-END:variables

}
