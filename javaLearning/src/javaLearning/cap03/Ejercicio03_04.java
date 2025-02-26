/*Ejercicio 3.4 – Escribe un programa que reciba el número de mes y devuelva
el número de días que tiene. Ignora los años bisiestos. 
Sólo debes hacer algo si recibes 1 sólo parámetro.
Enero,febrero,marzo,abril,mayo,junio,julio,agosto,septiembre,octubre,noviembre,diciembre*/

import java.util.Scanner;

public class Ejercicio03_04 {
	public static void main(String[] args)	{
		Scanner lectura = new Scanner (System.in);
		System.out.print("Introduce un número de un mes para saber cuantos días tiene: ");		
		int mesElegido  = lectura.nextInt();

		calculaDias(mesElegido);
		
	} // main

	private static int calculaDias(int mes) {

		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
		{
			System.out.println("El mes "+mes+" tiene 31 días.");
		}
		else if (mes==2)
		{
			System.out.println("Febrero tiene 28 días.");
		}
		else
		{
			System.out.println("El mes "+mes+" tiene 30 días.");		
		}
		return 0;
	} //fin calculaDias
}   // clase