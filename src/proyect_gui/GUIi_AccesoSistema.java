package proyect_gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyect_metodos.Entorno;
import proyect_metodos.Metodos;

public class GUIi_AccesoSistema extends javax.swing.JFrame {

    public GUIi_AccesoSistema() {
        initComponents();
        InicializaEntorno();
    }

    private void InicializaEntorno() {

        File tmp = new File(Entorno.RutaAccesos);

        if (!tmp.exists()) {
            try {
                tmp.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(GUI_RegistroRutas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void GuardarAcceso(String _usuario, String _estado) {
        try {
            FileWriter fw = new FileWriter(Entorno.RutaAccesos, true);
            BufferedWriter bw = new BufferedWriter(fw);

            String Hora = java.time.LocalTime.now().toString();

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String Fecha = formatter.format(new java.util.Date());

            try (PrintWriter pw = new PrintWriter(bw)) {
                pw.print(_usuario);
                pw.print("|" + Metodos.GetMachineAddress());
                pw.print("|" + Fecha);
                pw.print("|" + Hora);
                pw.println("|" + _estado);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cj_pass = new javax.swing.JPasswordField();
        cj_usuario = new javax.swing.JTextField();
        btn_entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("INGRESAR");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña:");

        cj_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_passKeyTyped(evt);
            }
        });

        cj_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cj_usuarioActionPerformed(evt);
            }
        });
        cj_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_usuarioKeyTyped(evt);
            }
        });

        btn_entrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_entrar.setText("Entrar");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
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
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_entrar)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cj_pass)
                                .addComponent(cj_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cj_usuario)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cj_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cj_passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_passKeyTyped

        int c = evt.getKeyChar();
        if (c == 10) {
            String usuario = cj_usuario.getText().trim();
            String contraseña = new String(cj_pass.getPassword());

            if (Autenticar(usuario, contraseña)) {
                GuardarAcceso(usuario, "SATISFACTORIO");
                GUI_Principal b = new GUI_Principal();
                b.setVisible(true);
                dispose();
            } else {
                GuardarAcceso(usuario, "FALLIDO");
                JOptionPane.showMessageDialog(null, "Usuario y Contraseña Incorrectos", "Error Al Ingresar", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cj_passKeyTyped

    private boolean Autenticar(String _usuario, String _password) {

        try {
            try (FileReader fr = new FileReader(Entorno.RutaUsuarios);
                    BufferedReader br = new BufferedReader(fr)) {

                String d;

                while ((d = br.readLine()) != null) {
                    StringTokenizer dato = new StringTokenizer(d, "|");

                    Vector x = new Vector();
                    while (dato.hasMoreTokens()) {
                        x.addElement(dato.nextToken());
                    }

                    String usu = x.elementAt(3).toString();
                    String pwd = x.elementAt(4).toString();

                    if (usu.equals(_usuario) && pwd.equals(_password)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return false;
    }


    private void cj_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cj_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cj_usuarioActionPerformed

    private void cj_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_usuarioKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if (c == 10) {
            cj_pass.requestFocus();
        }
    }//GEN-LAST:event_cj_usuarioKeyTyped

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        // TODO add your handling code here:
        String usuario = cj_usuario.getText().trim();
        String contraseña = new String(cj_pass.getPassword());

        if (Autenticar(usuario, contraseña)) {
            GuardarAcceso(usuario,"SATISFACTORIO");
            GUI_Principal b = new GUI_Principal();
            b.setVisible(true);
            dispose();
        } else {
            GuardarAcceso(usuario,"FALLIDO");
            JOptionPane.showMessageDialog(null, "Usuario y Contraseña Incorrectos", "Error Al Ingresar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIi_AccesoSistema.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIi_AccesoSistema.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIi_AccesoSistema.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIi_AccesoSistema.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIi_AccesoSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JPasswordField cj_pass;
    private javax.swing.JTextField cj_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
