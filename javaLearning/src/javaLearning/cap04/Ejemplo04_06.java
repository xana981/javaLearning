import java.util.Scanner;

public class Ejemplo04_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("¿Cómo te llamas?");
		String nombre = scanner.nextLine();
		String Nombre = capitalize(nombre);
		System.out.println("¡Hola, " + Nombre + "! ¿Qué tal?");
	}
	

	public static String capitalize(String inputString) {
		char letra1 = inputString.charAt(0);
		char letra1May = Character.toUpperCase(letra1);
		return inputString.replace(inputString.charAt(0), letra1May);
	}
}