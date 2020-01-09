package proyect_clases;

public class Boleto {

    private int secuencia_boleto;
    private int numero_boleto;
    private String fecha_boleto;
    private String hora_boleto;
    private double descuento_boleto;
    private double costo_boleto;

    private String cedula;
    private String nombre;
    private String apellido;
    private String tipo;
    private int edad;

    private String nombre_Ruta;
    private String origen_Ruta;
    private String destino_Ruta;
    private String fecha_Ruta;
    private String hora_Ruta;
    private String costo_Ruta;

    public Boleto() {

    }

    public Boleto(int numero_boleto, String fecha_boleto, String hora_boleto, int costo_boleto) {
        this.numero_boleto = numero_boleto;
        this.fecha_boleto = fecha_boleto;
        this.hora_boleto = hora_boleto;
        this.costo_boleto = costo_boleto;
    }

    public int getSecuencia_boleto() {
        return secuencia_boleto;
    }

    public void setSecuencia_boleto(int secuencia_boleto) {
        this.secuencia_boleto = secuencia_boleto;
    }

    public int getNumero_boleto() {
        return numero_boleto;
    }

    public void setNumero_boleto(int numero_boleto) {
        this.numero_boleto = numero_boleto;
    }

    public String getFecha_boleto() {
        return fecha_boleto;
    }

    public void setFecha_boleto(String fecha_boleto) {
        this.fecha_boleto = fecha_boleto;
    }

    public String getHora_boleto() {
        return hora_boleto;
    }

    public void setHora_boleto(String hora_boleto) {
        this.hora_boleto = hora_boleto;
    }

    public double getCosto_boleto() {
        return costo_boleto;
    }

    public void setCosto_boleto(double costo_boleto) {
        this.costo_boleto = costo_boleto;
    }

    public double getDescuento_boleto() {
        return costo_boleto;
    }

    public void setDescuento_boleto(double descuento_boleto) {
        this.descuento_boleto = descuento_boleto;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombreRuta(String nombre_Ruta) {
        this.nombre_Ruta = nombre_Ruta;
    }

    public String getNombreRuta() {
        return this.nombre_Ruta;
    }

    public void setOrigenRuta(String origen_Ruta) {
        this.origen_Ruta = origen_Ruta;
    }

    public String getOrigenRuta() {
        return this.origen_Ruta;
    }

    public void setDestinoRuta(String destino_Ruta) {
        this.destino_Ruta = destino_Ruta;
    }

    public String getDestinoRuta() {
        return this.destino_Ruta;
    }

    public void setFechaRuta(String fecha_Ruta) {
        this.fecha_Ruta = fecha_Ruta;
    }

    public String getFechaRuta() {
        return this.fecha_Ruta;
    }

    public void setHoraRuta(String hora_Ruta) {
        this.hora_Ruta = hora_Ruta;
    }

    public String getHoraRuta() {
        return this.hora_Ruta;
    }

    public void setCostoRuta(String costo_Ruta) {
        this.costo_Ruta = costo_Ruta;
    }

    public String getCostoRuta() {
        return this.costo_Ruta;
    }

    public String getToken() {
        return String.valueOf(secuencia_boleto).concat("|")
                .concat(String.valueOf(numero_boleto)).concat("|")
                .concat(fecha_boleto).concat("|")
                .concat(hora_boleto).concat("|")
                .concat(String.valueOf(descuento_boleto)).concat("|")
                .concat(String.valueOf(costo_boleto)).concat("|")
                .concat(cedula).concat("|")
                .concat(nombre).concat("|")
                .concat(apellido).concat("|")
                .concat(tipo).concat("|")
                .concat(String.valueOf(edad)).concat("|")
                .concat(nombre_Ruta).concat("|")
                .concat(origen_Ruta).concat("|")
                .concat(destino_Ruta).concat("|")
                .concat(fecha_Ruta).concat("|")
                .concat(hora_Ruta).concat("|")
                .concat(costo_Ruta).concat("|")
                .concat(System.lineSeparator());
    }
}
