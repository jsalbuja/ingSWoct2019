package proyect_metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import proyect_clases.Boleto;
import proyect_clases.Usuario;

public class MetodoBoleto {

    public void crearBoleto(Boleto unBoleto) {

        //FALTA
    }

    public void guardarBoleto(Boleto unBoleto) {
        try {
            try (FileWriter fw = new FileWriter(Entorno.RutaBoletos, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);) {

                pw.print(unBoleto.getToken());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void BuscarBoleto(String numero) {

        try {
            numero = String.valueOf(Integer.parseInt(numero));
            Vector vRes;

            try (FileReader fr = new FileReader(Entorno.RutaBoletos);
                    BufferedReader br = new BufferedReader(fr)) {
                String d;

                while ((d = br.readLine()) != null) {
                    StringTokenizer dato = new StringTokenizer(d, "|");
                    Vector x = new Vector();

                    while (dato.hasMoreTokens()) {
                        x.addElement(dato.nextToken());
                    }
                    String a = x.elementAt(0).toString();
                    if (a.equals(numero)) {
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

    public int ObtenerSecuencia() {

        int secuencia = 0;

        try {
            try (FileReader fr = new FileReader(Entorno.RutaBoletos);
                    BufferedReader br = new BufferedReader(fr)) {
                String d;

                while ((d = br.readLine()) != null) {
                    StringTokenizer dato = new StringTokenizer(d, "|");
                    Vector x = new Vector();

                    while (dato.hasMoreTokens()) {
                        x.addElement(dato.nextToken());
                    }
                    int a = Integer.parseInt(x.elementAt(0).toString());

                    if (a > secuencia) {
                        secuencia = a;
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            secuencia = -1;
        }
        return secuencia + 1;
    }
}
