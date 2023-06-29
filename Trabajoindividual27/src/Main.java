/**

 * Trabajo individual 27

 * @author: Bastián Luis Antonio Góngora Barrera

 * @version: 26/06/2023/

 *

 */
public class Main {
    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador("Kevin", "Rojas", "18202088-5", 966366856, 30);
        Cargafamiliar carga = new Cargafamiliar("111111111-1", "Sofia Dominique", "Rojas Miranda", trabajador1, 2, 12);

        System.out.println(carga.toString());

    }
}
