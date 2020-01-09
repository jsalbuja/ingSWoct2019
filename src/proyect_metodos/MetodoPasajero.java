package proyect_metodos;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import proyect_clases.Pasajero;

public class MetodoPasajero {

    Vector vPrincipal = new Vector();

    //guarda datos en el vector
    public void GuardarPasajero(Pasajero unPasajero) {
        vPrincipal.addElement(unPasajero);
    }

    //guardar archivo txt
    public void GuardarArchivoPasajero(Pasajero pasajero) {
        try {
            try (FileWriter fw = new FileWriter(Entorno.RutaPasajeros, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);) {

                pw.print(pasajero.getId_pasajero());
                pw.print("|" + pasajero.getCedula_pasajero());
                pw.print("|" + pasajero.getNombre_pasajero());
                pw.print("|" + pasajero.getApellido_pasajero());
                pw.print("|" + pasajero.getTipo_pasajero());
                pw.println("|" + pasajero.getEdad_pasajero());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //mostrar los datos en el jtable
    public DefaultTableModel ListaPasajero() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("ID");
        cabeceras.addElement("CEDULA");
        cabeceras.addElement("NOMBRE");
        cabeceras.addElement("APELLIDO");
        cabeceras.addElement("CATEGORIA");
        cabeceras.addElement("EDAD");

        //Crear vector con nombre apellido pasajero cedula edad
        DefaultTableModel mdlTablaP = new DefaultTableModel(cabeceras, 0);

        try {

            try (FileReader fr = new FileReader(Entorno.RutaPasajeros);
                    BufferedReader br = new BufferedReader(fr);) {

                String d;

                while ((d = br.readLine()) != null) {
                    StringTokenizer dato = new StringTokenizer(d, "|");
                    Vector x = new Vector();
                    while (dato.hasMoreTokens()) {
                        x.addElement(dato.nextToken());
                    }
                    mdlTablaP.addRow(x);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTablaP;
    }

    public Vector BuscarPasajeroPorId(String unId) {

        unId = String.valueOf(Integer.parseInt(unId));
        Vector vRes = new Vector();

        try {
            try (FileReader fr = new FileReader(Entorno.RutaPasajeros);
                    BufferedReader br = new BufferedReader(fr)) {
                String d;

                while ((d = br.readLine()) != null) {
                    StringTokenizer dato = new StringTokenizer(d, "|");
                    Vector x = new Vector();

                    while (dato.hasMoreTokens()) {
                        x.addElement(dato.nextToken());
                    }
                    String a = x.elementAt(0).toString();
                    if (a.equals(unId)) {
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

    public Vector BuscarPasajeroPorCedula(String unaCedula) {

        Vector vRes = new Vector();

        try {
            try (FileReader fr = new FileReader(Entorno.RutaPasajeros);
                    BufferedReader br = new BufferedReader(fr)) {
                String d;

                while ((d = br.readLine()) != null) {
                    StringTokenizer dato = new StringTokenizer(d, "|");
                    Vector x = new Vector();

                    while (dato.hasMoreTokens()) {
                        x.addElement(dato.nextToken());
                    }
                    String a = x.elementAt(1).toString();
                    if (a.equals(unaCedula)) {
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

    public void EditarPasajero(Pasajero pasajero) {

        String unIdPasajero = String.valueOf(pasajero.getId_pasajero());

        try {
            FileWriter fw;

            try (FileReader fr = new FileReader(Entorno.RutaPasajeros);
                    BufferedReader br = new BufferedReader(fr)) {

                fw = new FileWriter(new File(Entorno.RutaPasajeros.concat("_tmp")));

                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    String d;

                    while ((d = br.readLine()) != null) {
                        StringTokenizer dato = new StringTokenizer(d, "|");
                        Vector x = new Vector();

                        while (dato.hasMoreTokens()) {
                            x.addElement(dato.nextToken());
                        }

                        String a = x.elementAt(0).toString();
                        if (!a.equals(unIdPasajero)) {
                            bw.write(d.concat(System.lineSeparator()));
                        } else {
                            bw.write(pasajero.getToken());
                        }
                    }
                }
            }
            fw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        new File(Entorno.RutaPasajeros).delete();
        new File(Entorno.RutaPasajeros.concat("_tmp")).renameTo(new File(Entorno.RutaPasajeros));
    }

    public void EliminarPasajeroPorId(String unaRuta) {

        try {
            FileWriter fw;

            try (FileReader fr = new FileReader(Entorno.RutaRutas);
                    BufferedReader br = new BufferedReader(fr)) {

                fw = new FileWriter(new File(Entorno.RutaPasajeros.concat("_tmp")));

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

        new File(Entorno.RutaPasajeros).delete();
        new File(Entorno.RutaPasajeros.concat("_tmp")).renameTo(new File(Entorno.RutaPasajeros));
    }

    public void EliminarPasajeroPorCedula(String unaCedula) {

        try {
            FileWriter fw;

            try (FileReader fr = new FileReader(Entorno.RutaPasajeros);
                    BufferedReader br = new BufferedReader(fr)) {

                fw = new FileWriter(new File(Entorno.RutaPasajeros.concat("_tmp")));

                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    String d;

                    while ((d = br.readLine()) != null) {
                        StringTokenizer dato = new StringTokenizer(d, "|");
                        Vector x = new Vector();

                        while (dato.hasMoreTokens()) {
                            x.addElement(dato.nextToken());
                        }

                        String a = x.elementAt(1).toString();
                        if (!a.equals(unaCedula)) {
                            bw.write(d.concat(System.lineSeparator()));
                        }
                    }
                }
            }
            fw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        new File(Entorno.RutaPasajeros).delete();
        new File(Entorno.RutaPasajeros.concat("_tmp")).renameTo(new File(Entorno.RutaPasajeros));
    }

}
