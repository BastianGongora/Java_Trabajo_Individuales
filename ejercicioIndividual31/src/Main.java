public class Main {
    public static void main(String[] args) {
        //System.out.println("Creando Trabajador (Clase Padre)");
        Trabajador trabajador = new Trabajador("Kevin Alexander","Rojas Palma","18202088-5",966362686,30);
        //System.out.println("Creando Honorario");
        Honorario honorario1 = new Honorario("Enrique1","Bahamonde","11111111-1",999999999,62,"Industrial",2023);
        Honorario honorario2 = new Honorario("Enrique2","Bahamonde","11111111-1",999999999,62,"Industrial",2023);
        Honorario honorario3 = new Honorario("Enrique3","Bahamonde","11111111-1",999999999,62,"Industrial",2023);
        Honorario honorario4 = new Honorario("Enrique4","Bahamonde","11111111-1",999999999,62,"Industrial",2023);
        Honorario honorario5 = new Honorario("Enrique5","Bahamonde","11111111-1",999999999,62,"Industrial",2023);
        //System.out.println("Creando Contratado");
        Contratado contratado1 = new Contratado("Mauro1","Boccardo","22222222-2",988888888,31,"20-06-2020",700000);
        Contratado contratado2 = new Contratado("Mauro2","Boccardo","22222222-2",988888888,31,"20-06-2020",700000);
        Contratado contratado3 = new Contratado("Mauro3","Boccardo","22222222-2",988888888,31,"20-06-2020",700000);
        Contratado contratado4 = new Contratado("Mauro4","Boccardo","22222222-2",988888888,31,"20-06-2020",700000);
        Contratado contratado5 = new Contratado("Mauro5","Boccardo","22222222-2",988888888,31,"20-06-2020",700000);
        //System.out.println("Creando Eventual");
        Eventual eventual1 = new Eventual("Bastian1","Gongora","33333333-3",977777777,26,true,"bastiangongora@gmail.com");
        Eventual eventual2 = new Eventual("Bastian2","Gongora","33333333-3",977777777,26,true,"bastiangongora@gmail.com");
        Eventual eventual3 = new Eventual("Bastian3","Gongora","33333333-3",977777777,26,true,"bastiangongora@gmail.com");
        Eventual eventual4 = new Eventual("Bastian4","Gongora","33333333-3",977777777,26,true,"bastiangongora@gmail.com");
        Eventual eventual5 = new Eventual("Bastian5","Gongora","33333333-3",977777777,26,true,"bastiangongora@gmail.com");
        Estudiante estudiante = new Estudiante("Juanito","Perez","44444444-4",966666666,16,38,'M');


        /*
        System.out.println("\nMostrando Objetos\n");
        System.out.println(trabajador.toString());
        System.out.println(honorario.toString());
        System.out.println(contratado.toString());
        System.out.println(eventual.toString());
        System.out.println(estudiante.toString());
        System.out.println("\nMostrando Métodos");
        System.out.println("\nMostrar datos clase Padre\n");
        trabajador.mostrarDatos();
        System.out.println("\nMostrar datos clase Honorario\n");
        honorario.mostrarDatos();
        System.out.println("\nMostrar datos clase Contratado\n");
        contratado.mostrarDatos();
        System.out.println("\nMostrar datos clase Eventual\n");
        eventual.mostrarDatos();
        System.out.println("\nMostrar datos clase Estudiante\n");
        estudiante.mostrarDatos();

        System.out.println("\nEditando estudiante\n");
        estudiante.setNombres("Don Ramon");
        estudiante.mostrarDatos();
        */

        Listado lista = new Listado();
        lista.agregarTrabajador(honorario1);
        lista.agregarTrabajador(honorario2);
        lista.agregarTrabajador(honorario3);
        lista.agregarTrabajador(honorario4);
        lista.agregarTrabajador(honorario5);
        lista.agregarTrabajador(contratado1);
        lista.agregarTrabajador(contratado2);
        lista.agregarTrabajador(contratado3);
        lista.agregarTrabajador(contratado4);
        lista.agregarTrabajador(contratado5);
        lista.agregarTrabajador(eventual1);
        lista.agregarTrabajador(eventual2);
        lista.agregarTrabajador(eventual3);
        lista.agregarTrabajador(eventual4);
        lista.agregarTrabajador(eventual5);
        lista.listarTrabajadores();


    }
}
