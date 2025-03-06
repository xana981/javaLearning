/*Construir un programa que visualice por pantalla los parámetros o argumentos de la linea de
ejecución en orden inverso. Nota: debe emplearse un bucle while*/

public class EcoInverso {
	public static void main(String[] args)	{
		int largo = 1;
		int i = args.length;

		do
		{
			largo = args.length;

			if (largo == 0)
			{
				System.out.println("No he recibido ningún valor");
			}
			else
			{
				System.out.print(args[i-1] + " ");
				i--;				
			}
		}while (i != 0);
			
	}
}