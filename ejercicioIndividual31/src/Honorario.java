public class Honorario extends Trabajador{
    public Honorario(String nombres, String apellidos, String rut, int telefono, int edad) {
        super(nombres, apellidos, rut, telefono, edad);
    }
    private String giro;
    private int anioInicioActividades;

    public Honorario() {
    }

    public Honorario(String nombres, String apellidos, String rut, int telefono, int edad, String giro, int anioInicioActividades) {
        super(nombres, apellidos, rut, telefono, edad);
        this.giro = giro;
        this.anioInicioActividades = anioInicioActividades;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getAnioInicioActividades() {
        return anioInicioActividades;
    }

    public void setAnioInicioActividades(int anioInicioActividades) {
        this.anioInicioActividades = anioInicioActividades;
    }

    @Override
    public String toString() {
        return "Honorario{" +
                "giro='" + giro + '\'' +
                ", anioInicioActividades=" + anioInicioActividades +
                '}';
    }

    public void mostrarDatos(){
        super.mostrarDatos(); //Telefono + edad
        System.out.println("Giro: " + giro);
        System.out.println("Inicio de actividades"+anioInicioActividades+"\n");
    }



}
