
public class Ejercicio02_02 {
	public static void main(String[] args) {
		int numManzanas = Integer.valueOf(args[0]); //Convertir a entero lo que hay en la primera posicion del argumento
		int numPeras = Integer.valueOf(args[1]);
		
		int numFrutas=numManzanas+numPeras;
		
		System.out.println("El frutero tiene "+ numFrutas + " piezas de fruta.");
	}
}
