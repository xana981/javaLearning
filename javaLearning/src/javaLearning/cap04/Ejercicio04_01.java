/*Construye un programa que liste todos los argumentos recibidos con ciertas reglas:
 1. si la palabra es corta (5 caracteres o menos) se imprime 4 veces en la misma linea
 2. si la palabra es larga, se repite solo dos veces
 3. hacer comprobacion de si ha introducido argumentos */
 
public class Ejercicio04_01 {
	public static void main(String[] args) {
		int x=0;
		int i=0;
		int j=0;
		for (x=0 ; x < args.length;x++)
		{	
			if  (args.length == 0)
			{
				System.err.println("No se han recibido argumentos");
			}
			else if (args[x].length() < 6)
			{	
				for (i=0;i<4;i++)
				{
					System.out.print(args[x]+" ");
				}
				System.err.println(" ");
			}
			else
			{
				for (j=0;j<2;j++)
				{
					System.out.print(args[x]+" ");
				}			
				System.err.println(" ");
			}
		}
		
	}
}