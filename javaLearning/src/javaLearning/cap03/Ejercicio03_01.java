/* Ejercicio 3.1 – Comprueba el número de argumentos que recibe tu programa. 
 * Si no recibe argumentos, avisa al usuario. En caso contrario, indícale cuántos 
 * has recibido.
 */

public class Ejercicio03_01 {
	public static void main(String[] args) {
		if (args.length!=0)
		{
			System.out.println("Has introducido "+ args[args.length-1] + " caracteres");
		}
		else 
		{
			System.out.println("No hemos recibido ningún argumento");
		}
	}
}