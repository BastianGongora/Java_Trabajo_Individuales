package EjercicioIndividual33;

public class Empleado {
    private String nombre,apellido;
    private int edad, salario;

    // * CONSTRUCTORES


    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int edad, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    // * GETTER AND SETTER


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void calcularBono(){
        if(getEdad()>40){
            this.salario = this.salario+100000;
        }
    }


}
