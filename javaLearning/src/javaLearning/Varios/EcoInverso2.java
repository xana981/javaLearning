/*
 * Ejemplo de sentencia while
 * Visualiza los argumentos de la linea de comandos en orden inverso
 * Los caracteres tambien los visualiza en orden inverso
*/

public class EcoInverso2 {
	public static void main(String[] args)	{
		int largo = 1;
		int i = args.length;
		int j = args[i-1].length();		
		do
		{
			largo = args.length;
	
			if (largo == 0)
			{
				System.out.println("No he recibido ningún valor");
			}
			else
			{
				do
				{					
					System.out.print(args[i-1].charAt(j-1));
					i--;				
					j--;
				} while (j!=0);	
			}	
		}while (i != 0);
			
	}
}