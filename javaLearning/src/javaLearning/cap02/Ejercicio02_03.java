
public class Ejercicio02_03 { //A la hora de ejecutar el programa es necesario meter los 6 valores para que funcione la funcion suma
	
	public static void main(String[] args) {
		int numManzanas = Integer.valueOf(args[0]);
		int numPeras = Integer.valueOf(args[1]);
		int numCucharas = Integer.valueOf(args[2]);
		int numTenedores = Integer.valueOf(args[3]);
		int numNinos = Integer.valueOf(args[4]);
		int numAdultos = Integer.valueOf(args[5]);
		

		//invocamos la funcion llamando a esas 2 variables y las guardamos en variables
		int numFrutas=suma(numManzanas,numPeras);
		int numCubiertos=suma(numCucharas,numTenedores);
		int numPersonas=suma(numNinos,numAdultos);
		
		System.out.println("Tenemos "+numFrutas+ " piezas de fruta, "+
				numCubiertos+" cubiertos y "+
				numPersonas+" personas.") ; 

	}	
	private static int suma(int a, int b) { //nombre del metodo suma, cuando es private solo se puede usar llamado desde la misma clase
		return a+b; //nos devuelve la suma de los 2 valores
	}
}