public class Contratado extends Trabajador{
    public Contratado(String nombres, String apellidos, String rut, int telefono, int edad) {
        super(nombres, apellidos, rut, telefono, edad);
    }
    private String fechaIngreso;
    private int salarioMensual;

    public Contratado(String nombres, String apellidos, String rut, int telefono, int edad, String fechaIngreso, int salarioMensual) {
        super(nombres, apellidos, rut, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "Contratado{" +
                "fechaIngreso='" + fechaIngreso + '\'' +
                ", salarioMensual=" + salarioMensual +
                '}';
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("Salario mensual: " + salarioMensual+"\n");
    }

}
