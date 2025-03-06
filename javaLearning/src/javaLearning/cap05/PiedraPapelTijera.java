/* Proyecto – Vamos a jugar a piedra-papel-tijeras contra el ordenador. 
 * Tendrás que explicarle al jugador cómo se juega, pedirle que nos dé su jugada 
 * (Piedra, papeL, Tijeras, Salir), generar una jugada aleatoria para el ordenador 
 * y decidir quien ha ganado. Solo realizaremos una tirada por ejecucion
 */
import java.util.Scanner;
public class PiedraPapelTijera {
	private static final String PIEDRA = "piedra";
	private static final String PAPEL = "papel";
	private static final String TIJERA = "tijera";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("¿Cómo te llamas? ");
		String nombre = scanner.nextLine(); //Preguntamos nombre del jugador
		String Nombre = capitalize(nombre); //Convertimos el nombre con la primera letra en mayúscula
		System.out.println("¡Hola, " + Nombre + "! ¿Preparado para jugar a piedra, papel o tijera? ");//Explicamos normas del juego
		System.out.println("Vamos a explicar las normas del juego:");
		System.out.println(" - La piedra aplasta la tijera. ");
		System.out.println(" - La tijera corta el papel. ");
		System.out.println(" - El papel envuelve la piedra. ");
		System.out.println("   ¡Comencemos!");
	
		boolean valor = false;	
		int tiradaJug1=0;
		int tiradaJug2=0;
		String eleccion =" ";

		do {
			do {
				System.out.print("Escoge entre: ¿Piedra, papel o tijera? ");
				String Eleccion = scanner.nextLine(); //Pedimos la eleccion entre las 3 posibilidades
				eleccion = Eleccion.toLowerCase();  //convertimos todo a minusculas
	
				if (eleccion.equals(PIEDRA))
				{
					tiradaJug1=1;
					valor = true;
				}
				else if (eleccion.equals(PAPEL))
				{
					tiradaJug1=2;
					valor = true;
				}
				else if (eleccion.equals(TIJERA))
				{
					tiradaJug1=3;
					valor = true;
				}
				else
				{
					System.out.println(eleccion + " no es una tirada correcta, intentalo de nuevo.");
					valor = false;
				}
				
			} while (valor == false); //comprobamos que el dato que introducimos sea un dato correcto
			
			System.out.println(" ");
			System.out.println("Has escogido " + eleccion);	//Presentamos por pantalla el valor introducido
		
			//Realizamos tirada de PC (jugador 2) y lo presentamos por pantalla
			tiradaJug2 = (int) (Math.random() * 3) + 1;
			if (tiradaJug2 == 1)
			{
				System.out.println("Mi tirada es piedra");
			}	
			else if (tiradaJug2 == 2)
			{
				System.out.println("Mi tirada es papel");
			}
			else if (tiradaJug2 == 3)
			{
				System.out.println("Mi tirada es tijera");
			}
			else
			{
				System.out.println("Mi tirada es incorrecta...");
			}
		
			
			System.out.println(" ");	
			//Comprobamos quien es el ganador y lo presentamos por pantalla
			if (tiradaJug1 == 1 && tiradaJug2 == 3)
			{
				System.out.println("	"+ Nombre + " has ganado esta partida");
			}
			else if (tiradaJug1 == 1 && tiradaJug2 == 2)
			{
				System.out.println("¡¡¡ He ganado la partida !!!");			
			}
			
			else if (tiradaJug1==2 && tiradaJug2==1)
			{
				System.out.println("	"+ Nombre + " has ganado esta partida");	
			}
			else if (tiradaJug1==2 && tiradaJug2==3)
			{
				System.out.println("	¡¡¡ He ganado la partida !!!");			
			}
			
			else if (tiradaJug1==3 && tiradaJug2==1)
			{
				System.out.println("	" + Nombre + " has ganado esta partida");	
			}
			else if ( tiradaJug1==3 && tiradaJug2==2)
			{
				System.out.println("¡¡¡ He ganado la partida !!!");		
			}
			
			else
			{
				System.out.println("¡Empate! repetimos la jugada, suerte...");
				System.out.println(" ");
			}
		
		} while (tiradaJug1 == tiradaJug2);
	}

	public static String capitalize(String inputString) {
		char letra1 = inputString.charAt(0);
		char letra1May = Character.toUpperCase(letra1);
		return inputString.replace(inputString.charAt(0), letra1May);
	}
	
}	

	
