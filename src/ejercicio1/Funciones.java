package ejercicio1;
import java.util.Arrays;
import java.util.Scanner;
public class Funciones {
    public static String[] crearMinas(){
        String[] casillas = new String[20];
        int minas = 6;
        int posMina;
        Arrays.fill(casillas, "0");
        while (minas>0){
            posMina = (int) (Math.random()*casillas.length);
            for (int i = 0; i < casillas.length; i++) {
                if (i == posMina){
                    if (!casillas[i].equals("*")){
                        casillas[i] = "*";
                        minas--;
                    }
                }
            }
        }
        for (int i = 0; i < casillas.length; i++) {
            if (casillas[i].equals("*") && (i-1)>=0){
                switch (casillas[i-1]){
                    case "0":
                        casillas[i-1] = "1";
                        break;
                    case "1":
                        casillas[i-1] = "2";
                        break;
                }
            }
            if (casillas[i].equals("*") && (i+1)<casillas.length){
                switch (casillas[i+1]){
                    case "0":
                        casillas[i+1] = "1";
                        break;
                    case "1":
                        casillas[i+1] = "2";
                        break;
                }
            }
        }
        return casillas;
    }
    public static void destapar(String[] casillas){
        int num;
        int cont  = 0;
        String respuesta = "";
        Scanner sc = new Scanner(System.in);
        while (cont!=14){
            System.out.println("Introduzca la casilla que desea destapar");
            num = sc.nextInt();
            respuesta = casillas[num-1];
            System.out.println(respuesta);
            if (respuesta.equals("*")){
                break;
            }else cont++;
        }
        if (cont==14){
            respuesta = "Ha ganado";
        }else respuesta = "Ha perdido";
        System.out.println(respuesta);
    }
}
