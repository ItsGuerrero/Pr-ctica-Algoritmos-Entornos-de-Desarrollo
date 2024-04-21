package util;

public abstract class Algoritmos {
	
	/**
	 * Metodo que calcula el fibonacci de un numero
	 * @param numero -> Es el numero que se va a calcular
	 * @return Fibonacci correspondiente
	 */
	
	public static int fibonacci(int numero) {
		if(numero <= 1) {
			return numero;
		}
		else {
			return fibonacci(numero-1) + fibonacci(numero - 2 );
		}
	}
	
	/**
	 * Metodo que calcula el factorial de un numero
	 * @param numero -> Numero que se va a calcular
	 * @return Resultado del factorial
	 */
	
	public static int factorial(int numero) {
        if (numero < 0)
            System.out.print("Numero negativo");
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero - 1);
    }
	
	/**
	 * Metodo que calcula si un numero es primo
	 * @param numero -> numero que se va a comprobar si es primo
	 * @return true si es primo, false si no es primo
	 */
	
	public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
}
