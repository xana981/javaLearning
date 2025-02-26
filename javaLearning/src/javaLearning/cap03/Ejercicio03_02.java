/* Ejercicio 3.2 - Comprueba el número de argumentos que recibe tu programa. 
 * Si no recibe argumentos, avisa al usuario. Si recibe hasta 4, indícale 
 * cuántos has recibido. Si recibe más, avisa al usuario.
 */

public class Ejercicio03_02 {
	public static void main(String[] args) {
		if (args.length==0)
		{
			System.out.println("No hemos recibido ningún argumento");
		}
		else if(args.length>4)
		{
			System.out.println("Has introducido más de 4 caracteres");
		}
			
		else
		{
			System.out.println("Has introducido "+ args[args.length-1] + " caracteres");			
		}
	}
}