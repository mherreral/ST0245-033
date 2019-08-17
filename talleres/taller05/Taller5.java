package Recursion;

public class Taller5 {

	public static int[] insertion(int[] array) {
		int indice, valor;
		for (int i = 1; i < array.length; i++) {
			indice = i;
			valor = array[i];
			while (indice > 0 && valor < array[indice - 1]) {
				array[indice] = array[indice - 1];
				indice--;
			}
			array[indice] = valor; //n(c1*n + c2) con notación 0 --> o(c1*n*n + c2*n) por definición
			//o(c1*n*n) por ley de la suma --> o(n*n) por ley del producto
		}

		return array;
	}

	public static int sumatoria(int[] arreglo) {
		int acu = 0; // c1
		for (int i = 1; i < arreglo.length; i++) { // c2 + c3*n
			acu += arreglo[i]; // n
		}
		return acu; // c4
		//Con notación o:
		//o(c3*n + c2)por definición --> o(c3*n) por regla de la suma --> o(n) por regla del producto
	}
}
