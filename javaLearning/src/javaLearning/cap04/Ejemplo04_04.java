
public class Ejemplo04_04 {
	// Acuérdate de usar constantes
	private static final String FIN = "fin";

	public static void main(String[] args) {
		System.out.println("Se han recibido " + args.length + " argumentos:");	

		// El bucle while itera hasta que se cumple la condición
		// No podemos olvidar controlar la posición

		int i = 0; // Punto de inicio
		//int j = 0;
		int hayFin = 1;
		// CUIDADO!!! No podemos comparar strings con ==
		

		while (i < args.length && !args[i].equals(FIN)) { // condición de terminación
			System.out.println(i + ")" + args[i]);
			i++; // actualización
		}
		
		for (int j=0;j<args.length;j++)	{	
			if (args[j].equals(FIN))
			{
				hayFin = 1;
				break;
			}
			else
			{
				hayFin = 0;
			}
		}
		if (hayFin==0)
		{
			System.out.println("La palabra fin no está en la lista de los argumentos");
		}
		else
		{
			System.out.println("\"fin\" estaba en la posición nº " + i);// Como la i fue declarada fuera del bucle, aquí aún podemos usarla.
		}
		

	}
}