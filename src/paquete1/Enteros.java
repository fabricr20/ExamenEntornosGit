package paquete1;

/**
 * Esta clase contiene metodos de operaciones con entereos.
 * @author Fabricio Israel Conde Rojas
 * @version 1.0
 */

public class Enteros {
	
	/**
	 * M�todo que calcula el factorial de un n�mero recursivamente.
	 * @param n N�mero para calcular su factorial.
	 * @return Devuleve el factorial de un n�mero. 
	 */
	public static int r_factorial(int n) {
		int resultado;

		if (n == 0) {
			resultado = 1;
		} else {
			resultado = n * r_factorial(n - 1);
		}
		return resultado;
	}
	
	/**
	 * M�todo que calcula el factorial de numero con un bucle (for).
	 * @param n N�mero para calcular su factorial.
	 * @return Devuleve el factorial de un n�mero. 
	 */
	public static int factorial(int n) {
		int resultado;

		resultado = 1;
		for (int i = 2; i <= n; i++) {
			resultado = resultado * i;
		}
		return resultado;
	}
	
	/**
	 *  M�todo que escribe una cadena del rev�s.
	 * @param cadena Cadena de caracteres.
	 * @return Devuleve una cadena del rev�s.
	 */
	public static String alreves(String cadena) {
		String resultado = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado = resultado + cadena.charAt(i);
		}
		return resultado;
	}
	
	/**
	 * M�todo que comprueba si un n�mero es capicua.
	 * @param n N�mero a comprobar.
	 * @return Devuelve true si es capicua y false si no lo es.
	 */
	public static boolean capicua(int n) {
		boolean resultado;
		String cadena;

		cadena = Integer.toString(n);
		if (cadena.equals(alreves(cadena))) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}
	/**
	 * M�todo que calcula si un n�mero es divisible por otro.
	 * @param multiplo N�mero que queremos comprobar si es divisible.
	 * @param divisor N�mero que comprueba si el numero anterior es divisible.
	 * @return Devuelve true si es divisible y false si no lo es.
	 */
	public static boolean divisible(int multiplo, int divisor) {
		boolean resultado;

		if (multiplo % divisor == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}
	
	/**
	 * M�todo que calcula si un n�mero es multiplo por otro.
	 * @param mult N�mero que queremos comprobar si es multiplo.
	 * @param divisor N�mero que comprueba si el numero anterior es multiplo.
	 * @return Devuelve true si es multiplo y false si no lo es.
	 */
	public static boolean multiplo(int mult, int divisor) {
		boolean resultado;

		try {
			if (mult % divisor == 0) {
				resultado = true;
			} else {
				resultado = false;
			}
		} catch (ArithmeticException e) {
			resultado = false;
		}
		return resultado;
	}
	
	/**
	 * M�todo que comprueba si un n�mero es primo.
	 * @param n N�mero que queremos conocer si es primo. 
	 * @return Devuelve true si es primo y false si no lo es.
	 */
	public static boolean esPrimo(int n) {
		boolean primo;

		if (n <= 1) {
			primo = false;
		} else {
			primo = true;
			int i = 2;
			while (primo && i <= n / 2) {
				if (divisible(n, i)) {
					primo = false;
				} else {
					i++;
				}
			}
		}
		return primo;
	} 
	
	/**
	 * M�todo que calcula la cantidad de primos que hay hasta un n�mero.
	 * @param n El n�mero limite hasta donde se calcula la cantidad de primos.
	 * @return Devuelve la cantidad de primos hasta un n�mero.
	 */
	public static int n_primos(int n) {
		int resultado = 0;

		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado++;
			}
		}
		return resultado;
	}
	
	/**
	 * M�todo que calculo los primos hasta un numero y los guarda en un vector.
	 * @param n El n�mero limite hasta donde se calcula la cantidad de primos.
	 * @return Devuelve un vector con todos los primos que hay hasta un numero.
	 */
	public static int[] primosHasta(int n) {
		int[] resultado;

		resultado = new int[n_primos(n)];
		int cont = 0;
		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
		}

		return resultado;
	}
	
	/**
	 * M�todo que recibe un n�mero y devuelve los primeros primos.
	 * @param n El n�mero limite hasta donde se calcula la cantidad de primos.
	 * @return Devuelve los primeros primos hasta un n�mero.
	 */
	public static int[] primerosPrimos(int n) {
		int[] resultado = new int[(n < 0) ? 0 : n];

		int cont = 0;
		int i = 2;
		while (cont < n) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
			i++;
		}

		return resultado;
	}
}

