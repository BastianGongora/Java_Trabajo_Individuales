/**

 * Trabajo individual 27

 * @author: Bastián Luis Antonio Góngora Barrera

 * @version: 26/06/2023/

 *

 */
public class Main {
    public static void main(String[] args) {
        // Crear objeto Trabajador
        Trabajador trabajador = new Trabajador("Juan", "Pérez", "11.111.111-1", "123456789", 30);

        // Crear objeto Cargafamiliar
        Cargafamiliar cargaFamiliar = new Cargafamiliar(trabajador.getRut(), "Ana", trabajador.getApellidos(), "22.222.222-2", 2, 5);

        // Imprimir información del trabajador
        System.out.println("Trabajador:");
        System.out.println(trabajador.toString());
        System.out.println();
        // Descomponer RUN en Trabajador
        int parteRunTrabajador = trabajador.descomponerRut();
        System.out.println("Parte del RUT del Trabajador descompuesto: " + parteRunTrabajador);
        // Obtener nombre completo en Trabajador
        String nombreCompletoTrabajador = trabajador.nombreCompleto();
        System.out.println("Nombre completo del Trabajador: " + nombreCompletoTrabajador);

        // Imprimir información  carga familiar
        System.out.println("Carga Familiar:");
        System.out.println(cargaFamiliar.toString());



        // Descomponer RUN en CargaFamiliar (heredado de Trabajador)
        int parteRunCargaFamiliar = cargaFamiliar.descomponerRut();
        System.out.println("Parte del RUT de la Carga Familiar descompuesto: " + parteRunCargaFamiliar);


        // Obtener nombre completo en CargaFamiliar (heredado de Trabajador)
        String nombreCompletoCargaFamiliar = cargaFamiliar.nombreCompleto();
        System.out.println("Nombre completo de la Carga Familiar: " + nombreCompletoCargaFamiliar);

    }
}
