public class Ejemplo04_03 {
	public static void main(String[] args) {
		// Como el "for each" pero escrito de la forma habitual
		for (int i = 0; i < args.length; i ++) {
			String s = args[i];
			System.out.println(s);
		}
	}
}