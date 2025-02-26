public class PruebaEjercicio15 {
	public static void main (String[] args) {
		//Gomez Garcia Maria Lucas Pedro Juan "Maria Luisa"
		String primerApellido = args[0];
		String segundoApellido = args[1];
		String nombre1Hijo = args[2];
		String nombre2Hijo = args[3];
		String nombre3Hijo = args[4];
		String nombrePadre = args[5];
		String nombreMadre = args[6];
		System.out.print("Padre: ");
		pintarPersona(nombrePadre,primerApellido," ");
		System.out.print("Madre: ");
		pintarPersona(nombreMadre,segundoApellido," ");
		System.out.println("Hijos: ");
		pintarPersona(nombre1Hijo,primerApellido,segundoApellido);		
		pintarPersona(nombre2Hijo,primerApellido,segundoApellido);
		pintarPersona(nombre3Hijo,primerApellido,segundoApellido);
		
		System.out.println(" ");		
		System.out.println("NOMBRES COMPLETOS");
		pintarNombreCompleto(nombrePadre,primerApellido," ");
		pintarNombreCompleto(nombreMadre,segundoApellido," ");
		pintarNombreCompleto(nombre1Hijo,primerApellido,segundoApellido);	
		pintarNombreCompleto(nombre2Hijo,primerApellido,segundoApellido);	
		pintarNombreCompleto(nombre3Hijo,primerApellido,segundoApellido);	
		
	}	

	private static void pintarPersona(String nombre,String apellido1,String apellido2) {
		String Apellidos = apellido1 + " " + apellido2;
		
		System.out.println("Nombre: " + nombre + " / Apellidos: " + Apellidos);
	}
	
	private static void pintarNombreCompleto(String nombre,String apellido1,String apellido2) {
		String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;
		
		System.out.println(nombreCompleto);
	}
	
}