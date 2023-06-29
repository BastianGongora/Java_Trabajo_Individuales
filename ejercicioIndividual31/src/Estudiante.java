public class Estudiante extends Trabajador{
    public Estudiante(String nombres, String apellidos, String rut, int telefono, int edad){
        super(nombres,apellidos,rut,telefono,edad);
    }
    private int numeroLista;
    private char sexo;

    public Estudiante() {
    }

    public Estudiante(String nombres, String apellidos, String rut, int telefono, int edad, int numeroLista, char sexo) {
        super(nombres, apellidos, rut, telefono, edad);
        this.numeroLista = numeroLista;
        this.sexo = sexo;
    }

    public int getNumeroLista() {
        return numeroLista;
    }

    public void setNumeroLista(int numeroLista) {
        this.numeroLista = numeroLista;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "numeroLista=" + numeroLista +
                ", sexo=" + sexo +
                '}';
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Nombre: "+super.getNombres());
        System.out.println("Apellido: "+super.getApellidos());
        System.out.println("Numero de lista: "+numeroLista);
        System.out.println("Sexo: "+sexo);
    }

}
