package ejercicio2;

public class SieteYMedia {

	public static void main(String[] args) {
		double p1;
		double p2;
		System.out.println("Bienvenido al juego de las Siete y Media");
		System.out.println("Es el turno del Jugador 1");
		p1 = Funciones.pedirCarta();
		System.out.println("Turno del Jugador 2");
		p2 = Funciones.pedirCarta();
		System.out.println("El ganador es " + Funciones.compararPuntos(p1, p2));
	}
}
