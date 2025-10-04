/*
 * Descripción: Más y diferentes usos de la variable 'Math'
 * Autor: Raúl Beltrán
 * Fecha: 01/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame el valor de 2 números:" + "\nPrimero: ");
		double num1 = teclado.nextDouble();
		
		System.out.print("Segundo: ");
		double num2 = teclado.nextDouble();
		
		double condicion1 = Math.min(num1, num2);					// ESTA FUNCION SIRVE PARA DAR EL VALOR MINIMO DE UN NÚMERO. PARA EL VALOR MÁXIMO SERÍA MATH.MAX
		double num1Elevadonum2 = Math.pow(num1, num2);				// EL MATH.POW SE USA PARA ELEVAR A CUALQUIER POTENCIA.
		double raiznum1 = Math.sqrt(num1);							// ESTA FUNCIÓN SIRVE PARA HACER RAÍZ CUADRADA
		
		System.out.println("El numero menor es: " + condicion1 + 
				"\nEl valor de " + num1 +  " elevado a " + num2 + " es: " + num1Elevadonum2 +
				"\nLa raíz cuadrada de " + num1 + " es: " + raiznum1); 
		
		
		
		num2 = Math.random();										// ESTA FUNCIÓN SIRVE PARA DAR UN VALOR RAMDOM ENTRE EL 0 Y EL 1
		
		System.out.println("Número ramdom : " + num2);
	}

}
