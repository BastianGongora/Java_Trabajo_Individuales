package EjercicioIndividual33;

public class Vendedor extends Empleado{
    private String fechaInicio;
    public Vendedor() {
    }
    public Vendedor(String nombre, String apellido, int edad, int salario, String fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
    }

    // * Getter and Setter


    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    public void calcularBono(){
        super.calcularBono();
        int nuevoSalario = 0;
        nuevoSalario = super.getSalario()+50000;
        super.setSalario(nuevoSalario);
    }

}
