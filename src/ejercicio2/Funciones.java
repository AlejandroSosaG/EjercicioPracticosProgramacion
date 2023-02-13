package ejercicio2;

import java.util.Scanner;

public class Funciones {
	public static double pedirCarta() {
		double puntos = 0;
		int cartaRandom;
		int paloRandom;
		String respuesta;
		String[] cartas = {"1", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
		String[] palo = {"oros", "copas", "espadas", "bastos"};
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Quiere sacar una carta?");
		do {
			respuesta = sc.next();
			if(respuesta.equals("si")) {
				cartaRandom = (int) (Math.random()*(cartas.length-1));
				paloRandom = (int) (Math.random()*(palo.length-1));
				System.out.println("Tu carta es: " + cartas[cartaRandom] + " de " + palo[paloRandom]);
				switch (cartas[cartaRandom]) {
				case "1": 
					puntos += 1;
					break;
				case "2":
					puntos += 2;
					break;
				case "3":
					puntos += 3;
					break;
				case "4":
					puntos += 4;
					break;
				case "5":
					puntos += 5;
					break;
				case "6":
					puntos += 6;
					break;
				case "7":
					puntos += 7;
					break;
				case "sota", "caballo", "rey":
					puntos += 0.5;
				break;
				}
				System.out.println("Tiene " + puntos + " puntos");
				if(puntos<= 7.5)
				System.out.println("¿Quiere sacar otra carta?");
				else
					System.out.println("Se ha pasado");
			}
		}while(respuesta.equals("si") && puntos<=7.5);
		return puntos;
	}
	public static String compararPuntos(double p1, double p2) {
		double sol = 7.5;
		String ganador = "ambos";
		if(p1 <= sol && p2 <= sol) {
			if((sol-p1) < (sol-p2))
				ganador = "Jugador 1";
			else if((sol-p1) > (sol-p2))
				ganador = "Jugador 2";
		}else {
			if(p1 > sol) {
				if(p2 > sol)
					ganador = "ninguno";
				else
					ganador = "Jugador 2";
			}else {
				if(p2 > sol)
					ganador = "Jugador 1";
			}
		}
		return ganador;
	}
}
