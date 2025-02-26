/* Ejercicio 3.3 – Realiza el mismo ejercicio que en el punto anterior, 
 * pero pon el número máximo de argumentos aceptables en una constante.
 */

public class Ejercicio03_03 {
	// Número máximo de argumentos.
	// Es una constante, el nombre debe decirnos qué significa, no que valor tiene
	// y debemos escribirlo en MAYÚSCULAS
	public static void main(String[] args) 
	{
		int valorMax=10;
		if (args.length>=valorMax)
		{
			System.out.println("HEMOS SUPERADO EL NIVEL MÁXIMO DE ARGUMENTOS");
		}
		else if (args.length==0)
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