import java.util.Scanner;
public class PruebaEjercicio13 {
	public static void main (String[] args) {
		Scanner lectura = new Scanner (System.in);
		System.out.print("Ingrese la medida de un lado del cuadrado: ");
		int lado = lectura.nextInt();
		
		int area = lado * lado;
		System.out.println("El área de un cuadrado con lados de " + lado + " es: " + area);
	}
}