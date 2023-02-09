package ejercicio1;

import java.util.Arrays;

public class Buscaminas {
    public static void main(String[] args) {
        String[] casillas = Funciones.crearMinas();
        System.out.println(Arrays.toString(casillas));
        Funciones.destapar(casillas);
    }
}
