public class Trabajador {
    private String nombres;
    private String apellidos;
    private String rut;
    private String telefono;
    private int edad;
    private String rutFamiliar;
    private String parentesco;
    public Trabajador() {
    }

    public Trabajador(String nombres, String apellidos, String rut, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = rut;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    public int descomponerRut() {
        String runSinGuion = rut.replaceAll("[^0-9]", "");
        String runSinDV = runSinGuion.substring(0, runSinGuion.length() - 1);
        return Integer.parseInt(runSinDV);
    }
    @Override
    public String toString() {
        return "Trabajador{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", rut='" + rut + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }
}