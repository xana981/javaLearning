package javaLearning.cap02;

public class Ejercicio02_02 {
	private static int sumaFrutas(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int numManzanas = 5;
		int numPeras = 4;
		
		System.out.println("el frutero tiene "+ sumaFrutas(numManzanas, numPeras)+ " frutas") ;
		float numeroPi = 3.14f;
		String saluda = "hola a todos"; //el tipo String no es un tipo de datos simple, es una clase con sus metodos.
		System.out.println ("el  numero pi es "+ numeroPi);
		System.out.println ("saludandote "+ saluda);
	}

}
