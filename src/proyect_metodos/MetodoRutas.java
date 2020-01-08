package proyect_metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyect_clases.Rutas;

public class MetodoRutas {

    Vector vPrincipal = new Vector();

    //guarda datos en el vector
    public void GuardarRutas(Rutas unaRuta) {
        vPrincipal.addElement(unaRuta);
    }

    //guardar archivo txt
    public void GuardarArchivoRutas(Rutas rutas) {
        try {
            FileWriter fw = new FileWriter(Entorno.RutaRutas, true);
            BufferedWriter bw = new BufferedWriter(fw);

            try (PrintWriter pw = new PrintWriter(bw)) {
                pw.print(rutas.getId_Ruta());
                pw.print("|" + rutas.getNombre_Ruta());
                pw.print("|" + rutas.getOrigen_Ruta());
                pw.print("|" + rutas.getDestino_Ruta());
                pw.print("|" + rutas.getCosto_Ruta());
                pw.println("|" + rutas.getFecha_Ruta());
                pw.print("|" + rutas.getHora_Ruta());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //mostrar los datos en el jtable
    public DefaultTableModel ListaRutas() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("ID");
        cabeceras.addElement("RUTA");
        cabeceras.addElement("ORIGEN");
        cabeceras.addElement("DESTINO");
        cabeceras.addElement("COSTO");
        cabeceras.addElement("FECHA");
        cabeceras.addElement("HORA");

        DefaultTableModel mdlTablaR = new DefaultTableModel(cabeceras, 0);

        try {
            try (FileReader fr = new FileReader(Entorno.RutaRutas);
                    BufferedReader br = new BufferedReader(fr)) {
                String d;
                while ((d = br.readLine()) != null) {
                    StringTokenizer dato = new StringTokenizer(d, "|");
                    Vector x = new Vector();
                    while (dato.hasMoreTokens()) {
                        x.addElement(dato.nextToken());
                    }
                    mdlTablaR.addRow(x);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTablaR;
    }

    public Vector BuscarRutaPorId(String unaRuta) {

        unaRuta = String.valueOf(Integer.parseInt(unaRuta));
        Vector vRes = new Vector();

        try {
            try (FileReader fr = new FileReader(Entorno.RutaRutas);
                    BufferedReader br = new BufferedReader(fr)) {
                String d;

                while ((d = br.readLine()) != null) {
                    StringTokenizer dato = new StringTokenizer(d, "|");
                    Vector x = new Vector();

                    while (dato.hasMoreTokens()) {
                        x.addElement(dato.nextToken());
                    }
                    String a = x.elementAt(0).toString();
                    if (a.equals(unaRuta)) {
                        vRes = x;
                        System.out.println(vRes);
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return vRes;
    }

    public Vector BuscarRutaPorNombre(String unaRuta) {

        Vector vRes = new Vector();

        try {
            try (FileReader fr = new FileReader(Entorno.RutaRutas);
                    BufferedReader br = new BufferedReader(fr)) {
                String d;

                while ((d = br.readLine()) != null) {
                    StringTokenizer dato = new StringTokenizer(d, "|");
                    Vector x = new Vector();

                    while (dato.hasMoreTokens()) {
                        x.addElement(dato.nextToken());
                    }
                    String a = x.elementAt(1).toString();
                    if (a.equals(unaRuta)) {
                        vRes = x;
                        System.out.println(vRes);
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return vRes;
    }

    public void EditarRutas(Rutas ruta) {
        
        String unIdRuta = String.valueOf(ruta.getId_Ruta());

        try {
            FileWriter fw;

            try (FileReader fr = new FileReader(Entorno.RutaRutas);
                    BufferedReader br = new BufferedReader(fr)) {

                fw = new FileWriter(new File(Entorno.RutaRutas.concat("_tmp")));

                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    String d;

                    while ((d = br.readLine()) != null) {
                        StringTokenizer dato = new StringTokenizer(d, "|");
                        Vector x = new Vector();

                        while (dato.hasMoreTokens()) {
                            x.addElement(dato.nextToken());
                        }

                        String a = x.elementAt(0).toString();
                        if (!a.equals(unIdRuta)) {
                            bw.write(d.concat(System.lineSeparator()));
                        } else {
                            bw.write(ruta.getToken());
                        }
                    }
                }
            }
            fw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        new File(Entorno.RutaRutas).delete();
        new File(Entorno.RutaRutas.concat("_tmp")).renameTo(new File(Entorno.RutaRutas));
    }

    public void EliminarRutasPorId(String unaRuta) {

        try {
            FileWriter fw;

            try (FileReader fr = new FileReader(Entorno.RutaRutas);
                    BufferedReader br = new BufferedReader(fr)) {

                fw = new FileWriter(new File(Entorno.RutaRutas.concat("_tmp")));

                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    String d;

                    while ((d = br.readLine()) != null) {
                        StringTokenizer dato = new StringTokenizer(d, "|");
                        Vector x = new Vector();

                        while (dato.hasMoreTokens()) {
                            x.addElement(dato.nextToken());
                        }

                        String a = x.elementAt(0).toString();
                        if (!a.equals(unaRuta)) {
                            bw.write(d.concat(System.lineSeparator()));
                        }
                    }
                }
            }
            fw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        new File(Entorno.RutaRutas).delete();
        new File(Entorno.RutaRutas.concat("_tmp")).renameTo(new File(Entorno.RutaRutas));
    }

    public void EliminarRutasPorNombre(String unaRuta) {

        try {
            FileWriter fw;

            try (FileReader fr = new FileReader(Entorno.RutaRutas);
                    BufferedReader br = new BufferedReader(fr)) {

                fw = new FileWriter(new File(Entorno.RutaRutas.concat("_tmp")));

                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    String d;

                    while ((d = br.readLine()) != null) {
                        StringTokenizer dato = new StringTokenizer(d, "|");
                        Vector x = new Vector();

                        while (dato.hasMoreTokens()) {
                            x.addElement(dato.nextToken());
                        }

                        String a = x.elementAt(1).toString();
                        if (!a.equals(unaRuta)) {
                            bw.write(d.concat(System.lineSeparator()));
                        }
                    }
                }
            }
            fw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        new File(Entorno.RutaRutas).delete();
        new File(Entorno.RutaRutas.concat("_tmp")).renameTo(new File(Entorno.RutaRutas));
    }
}
