public class Eventual extends Trabajador{

    public Eventual(String nombres, String apellidos, String rut, int telefono, int edad) {
        super(nombres, apellidos, rut, telefono, edad);
    }

    private boolean disponibilidad;
    private String email;

    public Eventual(String nombres, String apellidos, String rut, int telefono, int edad, boolean disponibilidad, String email) {
        super(nombres, apellidos, rut, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.email = email;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Eventual{" +
                "disponibilidad=" + disponibilidad +
                ", email='" + email + '\'' +
                '}';
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        String aux = "";
        if (disponibilidad==true){
            aux="Disponible";
        }else{
            aux ="No Disponible";
        }
        System.out.println("Disponibilidad: "+aux);
        System.out.println("Correo: "+email+"\n");
    }

}
