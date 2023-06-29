package EjercicioIndividual33;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Kevin", "Rojas", 41, 100000);
        empleado.calcularBono();
        System.out.println(empleado.getSalario());

        Vendedor vendedor = new Vendedor("Enrique", "Bahamonde", 62, 100000, "01/01/1993");
        vendedor.calcularBono();
        System.out.println(vendedor.getSalario());

        Repartidor repartidor = new Repartidor("Bastian", "Gongora", 29, 100000, "Lunes");
        repartidor.calcularBono();
        System.out.println(repartidor.getSalario());
    }
}
