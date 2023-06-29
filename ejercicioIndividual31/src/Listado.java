import java.util.ArrayList;
import java.util.List;

public class Listado {
    private List<Trabajador> lista;

    public Listado() {
        this.lista = new ArrayList<Trabajador>();
    }


    // * METODOS

    public void agregarTrabajador(Trabajador trabajador){
        this.lista.add(trabajador);
    }

    public void listarTrabajadores(){
        int contador = 1;
        for (Trabajador trabajador : lista){
            System.out.println("Trabajador N°"+contador);
            trabajador.mostrarDatos();
            contador++;
        }
    }




}
