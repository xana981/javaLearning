/*Ejercicio03_05 Dadas las siguientes constantes ya definidas en la clase, construye un programa que, en funcion del argumento que reciba realice lo siguiente:
 1. si el argumento es LADRA, devuelve el mensaje "el perro esta ladrando"
 2. si el argumento es CANTA, devuelve el mensaje "la persona esta cantando"
 3. si no hay argumentos, devuelve el mensaje "no tengo argumentos"
 4. si el argumento es diferente a CANTA o LADRA, devuelve el mensaje "argumento no valido"*/

public class Ejercicio03_05 {
	private static final String CANTA = "CANTA";
	private static final String LADRA = "LADRA";
	
	public static void main(String[] args) {

		
		if (args.length == 0)
		{
			System.err.println("No tengo argumentos");
		}
		else if ((args[0].toUpperCase()).equals(LADRA))
		{

			System.out.println("El perro está ladrando");
		}
		else if ((args[0].toUpperCase()).equals(CANTA))
		{

			System.out.println("La persona esta cantando");
		}
		else
		{
			System.out.println("Argumento no válido");
		}
	}
}