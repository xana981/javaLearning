/*Pintar los numero de 0 a 99 en una matriz de 10 por 10 utilizando bucles for*/
public class Ejercicio04_02 {
	
	public static void main(String[] args) {
		int s=-1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				s = s + 1;
				if (s<10)
				{
					System.out.print("0"+s+" ");
				}
				else
				{
					System.out.print(s+" ");
				}
			}
			System.out.print("\n");
		}
	}
}