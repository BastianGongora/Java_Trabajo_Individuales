public class Cargafamiliar  {
    private String rut,nombres,apellidos;
    private Trabajador trabajador;
    private int parentesco,edad;

    public Cargafamiliar() {
    }

    public Cargafamiliar(String rut, String nombres, String apellidos, Trabajador trabajador, int parentesco, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.trabajador = trabajador;
        this.parentesco = parentesco;
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public int getParentesco() {
        return parentesco;
    }

    public void setParentesco(int parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Carga{" +
                "rut='" + rut + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", trabajador=" + trabajador +
                ", parentesco=" + parentesco +
                ", edad=" + edad +
                '}';
    }
}
