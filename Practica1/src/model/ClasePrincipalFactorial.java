package model;
import java.util.Scanner;

import dto.RecursividadFactorial;

public class ClasePrincipalFactorial {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce el numero para calcular su factorial: ");
		int numero = entrada.nextInt();
		RecursividadFactorial recursividad = new RecursividadFactorial();
		
		int factorial = recursividad.Factorial(numero);
		System.out.println("El factorial de " + numero + " es " + factorial);
		
	}
}