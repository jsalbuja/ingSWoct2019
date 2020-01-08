package proyect_gui;

import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyect_clases.Rutas;
import proyect_metodos.Entorno;
import proyect_metodos.MetodoRutas;
import proyect_metodos.Metodos;

public class GUI_RegistroRutas extends javax.swing.JFrame {

    Rutas ruta = new Rutas();
    MetodoRutas metodos = new MetodoRutas();
    DefaultTableModel mdlTablaR;
    Vector vCabeceras = new Vector();

    public GUI_RegistroRutas() {
        initComponents();
        InicializaEntorno();

        vCabeceras.addElement("ID");
        vCabeceras.addElement("RUTA");
        vCabeceras.addElement("ORIGEN");
        vCabeceras.addElement("DESTINO");
        vCabeceras.addElement("COSTO");
        vCabeceras.addElement("HORA");
        vCabeceras.addElement("FECHA");

        mdlTablaR = new DefaultTableModel(vCabeceras, 0);
        table_rutas.setModel(mdlTablaR);
        table_rutas.setModel(metodos.ListaRutas());

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_rutas = new javax.swing.JTable();
        btn_r_salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_r_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_r_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_r_origen = new javax.swing.JTextField();
        txt_r_destino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_r_fecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_r_hora = new javax.swing.JTextField();
        txt_r_costo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_r_nombre1 = new javax.swing.JTextField();
        txt_r_id1 = new javax.swing.JTextField();
        btn_r_nuevo = new javax.swing.JButton();
        btn_r_guardar = new javax.swing.JButton();
        btn_r_eliminar = new javax.swing.JButton();
        btn_r_actializar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo De Rutas");

        table_rutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "RUTA", "COSTO", "ORIGEN", "DESTINO", "FECHA", "HORA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_rutas);

        btn_r_salir.setText("Salir");
        btn_r_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_salirActionPerformed(evt);
            }
        });

        jLabel9.setText("Hora");

        jLabel1.setText("ID");

        jLabel3.setText("Costo Ruta");

        jLabel4.setText("Ruta");

        jLabel5.setText("Origen");

        jLabel2.setText("Destino");

        jLabel10.setText("Fecha");

        jLabel6.setText("DATOS DE LA RUTA:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_r_hora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_r_origen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_r_id, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txt_r_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(txt_r_destino))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(txt_r_fecha)
                            .addComponent(jLabel3)
                            .addComponent(txt_r_costo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_r_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_r_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_r_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jLabel7.setText("BUSQUEDA DE LA RUTA:");

        jLabel8.setText("ID");

        jLabel11.setText("Ruta");

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
                            .addComponent(jLabel8)
                            .addComponent(txt_r_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txt_r_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_r_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btn_r_nuevo.setText("Nuevo");
        btn_r_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_nuevoActionPerformed(evt);
            }
        });

        btn_r_guardar.setText("Guardar");
        btn_r_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_guardarActionPerformed(evt);
            }
        });

        btn_r_eliminar.setLabel("Eliminar");
        btn_r_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_eliminarActionPerformed(evt);
            }
        });

        btn_r_actializar.setLabel("Editar");
        btn_r_actializar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_actializarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_r_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(btn_r_eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_r_actializar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_r_salir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_r_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btn_r_nuevo)
                        .addGap(35, 35, 35)
                        .addComponent(btn_r_guardar)
                        .addGap(27, 27, 27)
                        .addComponent(btn_r_actializar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_r_eliminar)
                        .addGap(34, 34, 34)
                        .addComponent(btn_r_salir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicializaEntorno() {

        File tmp = new File(Entorno.RutaRutas);

        if (!tmp.exists()) {
            try {
                tmp.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(GUI_RegistroRutas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private boolean ValidarFormulario() {

        if (txt_r_id.isEnabled()) {
            Vector reg = metodos.BuscarRutaPorId(txt_r_id.getText());

            if (reg.size() > 0) {
                JOptionPane.showMessageDialog(null, "Ya existe una ruta con este Id", "Atención", JOptionPane.WARNING_MESSAGE);

                txt_r_id.setText("");
                txt_r_id.setFocusable(true);

                return false;
            }
        }

        if ("".equals(txt_r_nombre.getText()) || "".equals(txt_r_origen.getText()) || "".equals(txt_r_destino.getText())) {
            JOptionPane.showMessageDialog(null, "La información de la ruta está incompleta", "Atención", JOptionPane.WARNING_MESSAGE);
            txt_r_nombre.setFocusable(true);

            return false;
        }

        if ("".equals(txt_r_fecha.getText()) || "".equals(txt_r_hora.getText())) {
            JOptionPane.showMessageDialog(null, "La información de horarios está incompleta", "Atención", JOptionPane.WARNING_MESSAGE);
            txt_r_fecha.setFocusable(true);

            return false;
        }
        
        if (!Metodos.IsNumeric(txt_r_costo.getText())) {
            JOptionPane.showMessageDialog(null, "El costo no es un valor numérico", "Atención", JOptionPane.WARNING_MESSAGE);
            txt_r_costo.setFocusable(true);

            return false;
        }
        
        if (!Metodos.IsDate(txt_r_fecha.getText())) {
            JOptionPane.showMessageDialog(null, "La fecha no tiene un formato válido", "Atención", JOptionPane.WARNING_MESSAGE);
            txt_r_fecha.setFocusable(true);

            return false;
        }
        
        if (!Metodos.IsTime(txt_r_hora.getText())) {
            JOptionPane.showMessageDialog(null, "La hora no tiene un formato válido", "Atención", JOptionPane.WARNING_MESSAGE);
            txt_r_hora.setFocusable(true);

            return false;
        }

        return true;
    }

    private void btn_r_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_guardarActionPerformed
        if (!ValidarFormulario()) {
            return;
        }

        mdlTablaR = new DefaultTableModel();

        int id_r = Integer.parseInt(txt_r_id.getText());
        String nombre_r = txt_r_nombre.getText();
        String origen_r = txt_r_origen.getText();
        String destino_r = txt_r_destino.getText();
        String costo_r = txt_r_costo.getText();
        String hora_r = txt_r_hora.getText();
        String fecha_r = txt_r_fecha.getText();

        ruta.setId_Ruta(id_r);
        ruta.setNombre_Ruta(nombre_r);
        ruta.setOrigen_Ruta(origen_r);
        ruta.setDestino_Ruta(destino_r);
        ruta.setCosto_Ruta(costo_r);
        ruta.setHora_Ruta(hora_r);
        ruta.setFecha_Ruta(fecha_r);

        if (txt_r_id.isEnabled()) {
            metodos.GuardarRutas(ruta);
            metodos.GuardarArchivoRutas(ruta);
        } else {
            metodos.EditarRutas(ruta);
        }

        table_rutas.setModel(metodos.ListaRutas());
    }//GEN-LAST:event_btn_r_guardarActionPerformed

    private void btn_r_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_salirActionPerformed
        // TODO add your handling code here:
        GUI_Principal b = new GUI_Principal();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_r_salirActionPerformed

    private void btn_r_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_nuevoActionPerformed
        // Limpia los Jtext:
        txt_r_id.setText("");
        txt_r_nombre.setText("");
        txt_r_origen.setText("");
        txt_r_destino.setText("");
        txt_r_costo.setText("");
        txt_r_hora.setText("");
        txt_r_fecha.setText("");
        
        txt_r_id.setEnabled(true);
    }//GEN-LAST:event_btn_r_nuevoActionPerformed

    private void btn_r_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_eliminarActionPerformed

        int dialogButton = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este registro?", "Confirmación requerida", JOptionPane.YES_NO_OPTION);

        if (dialogButton == JOptionPane.YES_OPTION) {
            if ("".equals(txt_r_id1.getText()) && "".equals(txt_r_nombre1.getText())) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un ID o un nombre para buscar", "Atención", JOptionPane.WARNING_MESSAGE);
            }
            if (!"".equals(txt_r_id1.getText())) {
                metodos.EliminarRutasPorId(txt_r_id1.getText());
            } else {
                metodos.EliminarRutasPorNombre(txt_r_nombre1.getText());
            }
            table_rutas.setModel(metodos.ListaRutas());
        }
    }//GEN-LAST:event_btn_r_eliminarActionPerformed

    private void btn_r_actializarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_actializarActionPerformed

        if ("".equals(txt_r_id1.getText()) && "".equals(txt_r_nombre1.getText())) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un ID o un nombre para buscar", "Atención", JOptionPane.WARNING_MESSAGE);
        }

        Vector reg;

        if (!"".equals(txt_r_id1.getText())) {
            reg = metodos.BuscarRutaPorId(txt_r_id1.getText());
        } else {
            reg = metodos.BuscarRutaPorNombre(txt_r_nombre1.getText());
        }

        if (reg.size() > 0) {
            txt_r_id.setText(reg.get(0).toString());
            txt_r_nombre.setText(reg.get(1).toString());
            txt_r_origen.setText(reg.get(2).toString());
            txt_r_destino.setText(reg.get(3).toString());
            txt_r_costo.setText(reg.get(4).toString());
            txt_r_fecha.setText(reg.get(5).toString());
            txt_r_hora.setText(reg.get(6).toString());

            txt_r_id.setEnabled(false);
            txt_r_id.setFocusable(true);
        } else {
            JOptionPane.showMessageDialog(null, "No existe un registro con este Id", "Atención", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btn_r_actializarActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroRutas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroRutas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroRutas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroRutas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI_RegistroRutas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_r_actializar;
    private javax.swing.JButton btn_r_eliminar;
    private javax.swing.JButton btn_r_guardar;
    private javax.swing.JButton btn_r_nuevo;
    private javax.swing.JButton btn_r_salir;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_rutas;
    private javax.swing.JTextField txt_r_costo;
    private javax.swing.JTextField txt_r_destino;
    private javax.swing.JTextField txt_r_fecha;
    private javax.swing.JTextField txt_r_hora;
    private javax.swing.JTextField txt_r_id;
    private javax.swing.JTextField txt_r_id1;
    private javax.swing.JTextField txt_r_nombre;
    private javax.swing.JTextField txt_r_nombre1;
    private javax.swing.JTextField txt_r_origen;
    // End of variables declaration//GEN-END:variables
}
