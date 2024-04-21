package app;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		//Array con numeros del uno al 10
		
				int [] numeros = new int [5];
				
				for (int i = 0; i < numeros.length; i++) {
					numeros[i] = (int) (Math.random()*10) + 1;
				}
				
				//2 Calcular Fibonacci de los números
		        int[] resultadoFibonacci = new int[numeros.length];
		        
		        for (int i = 0; i < numeros.length; i++) {
		            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
		        }
		        
		      //3 Calcular factorial de los números
		        int[] resultadoFactorial = new int[numeros.length];
		        
		        for (int i = 0; i < numeros.length; i++) {
		            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
		        }
		        
		      //4 Verificar si los números son primos
		        boolean[] resultadoPrimos = new boolean[numeros.length];
		        
		        for (int i = 0; i < numeros.length; i++) {
		            resultadoPrimos[i] = Algoritmos.esPrimo(numeros[i]);
		        }

	}

}
