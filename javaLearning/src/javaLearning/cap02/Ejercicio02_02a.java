public class Ejercicio02_02a {
	private static int sumaFrutas(int a, int b) { //nombre del metodo sumafrutas, cuando es private solo se puede usar llamado desde la misma clase
		return a+b; //nos devuelve la suma
	}
	public static void main(String[] args) {
		int numManzanas = 5;
		int numPeras = 4;
		
		System.out.println("el frutero tiene "+ sumaFrutas(numManzanas, numPeras)+ " frutas") ; //invoco la funciona llamando a esas 2 variables
		
		float numeroPi = 3.14f; //define el valor como float
		
		String saluda = "hola a todos"; //el tipo String no es un tipo de datos simple, es una clase con sus metodos.
		System.out.println ("el  numero pi es "+ numeroPi);
		
		System.out.println ("saludandote "+ saluda);
	}
}