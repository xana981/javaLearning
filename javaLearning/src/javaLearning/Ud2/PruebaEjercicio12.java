public class PruebaEjercicio12 {
	public static void main (String[] args) {
		//Gomez Garcia Maria Lucas Pedro Juan "Maria Luisa"
		String primerApellido = args[0];
		String segundoApellido = args[1];
		String nombre1Hijo = args[2];
		String nombre2Hijo = args[3];
		String nombre3Hijo = args[4];
		String nombrePadre = args[5];
		String nombreMadre = args[6];
		System.out.println("Padre: " + nombrePadre + " " + primerApellido +
		"\nMadre: " + nombreMadre + " " + segundoApellido +
		"\nHijos:" +
		"\n" + nombre1Hijo + " " + primerApellido + " " + segundoApellido +
		"\n" + nombre2Hijo + " " + primerApellido + " " + segundoApellido +
		"\n" + nombre3Hijo + " " + primerApellido + " " + segundoApellido);
	}
}