public class Trabajador implements Corredora{
    private String nombres;
    private String apellidos;
    private String rut;
    private int telefono;
    private int edad;

    public Trabajador() {
    }

    public Trabajador(String nombres, String apellidos, String rut, int telefono, int edad) {
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", rut='" + rut + '\'' +
                ", telefono=" + telefono +
                ", edad=" + edad +
                '}';
    }

    public void mostrarDatos(){
        System.out.println("Teléfono: "+telefono);
        System.out.println("Edad: "+edad);
    }
}
