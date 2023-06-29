package EjercicioIndividual33;

public class Repartidor extends Empleado{
    private String disponibilidadHoraria;

    public Repartidor() {
    }

    public Repartidor(String nombre, String apellido, int edad, int salario, String disponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    // * Getter and setter


    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    public void setDisponibilidadHoraria(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public void calcularBono(){
        super.calcularBono();
        if(super.getEdad()<30){
            int nuevoSalario = super.getSalario()+15000;
            super.setSalario(nuevoSalario);
        }
    }

}
