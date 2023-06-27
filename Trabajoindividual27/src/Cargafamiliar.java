public class Cargafamiliar extends Trabajador {
    private String rut;
    private String nombres;
    private String apellidos;
    private String rutFamiliar;
    private int parentesco;
    private int edad;

    public Cargafamiliar(String rut, String nombres, String apellidos, String rutFamiliar, int parentesco, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rutFamiliar = rutFamiliar;
        this.parentesco = parentesco;
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getRutFamiliar() {
        return rutFamiliar;
    }

    public int getParentesco() {
        return parentesco;
    }

    public int getEdad() {
        return edad;
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
        return "RUT: " + rut +
                "\nNombres: " + nombres +
                "\nApellidos: " + apellidos +
                "\nRUT Familiar: " + rutFamiliar +
                "\nParentesco: " + parentesco +
                "\nEdad: " + edad;
    }
}
