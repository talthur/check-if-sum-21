package exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

	public static void main(String[] args) {

		calculation(6);

	}

	public static List<Integer> calculation(int maxDigit) {
		
		if (maxDigit <= 4) {
			System.out.println("Deu ruim");
			return null;
			
		}
		
		List<Integer> listaDeNumerosSomados21 = new ArrayList<Integer>();
		for (int i = 5555; i <= 9999; i++) {
			
			int verificadorDeMaxDigit = 0;
			int[] numeroEmArray = integerToArray(i);
			int somaDoNumeroDoArray = somaArray(numeroEmArray);
			if (somaDoNumeroDoArray == 21) {
				for (int numero:numeroEmArray) {
					if (numero <= maxDigit) {
						verificadorDeMaxDigit += 1;
					}
				}
				if (verificadorDeMaxDigit == Integer.toString(i).length()) {
					listaDeNumerosSomados21.add(i);
				}
				verificadorDeMaxDigit = 0;
			}
			
		}
		
		for (int numero : listaDeNumerosSomados21) {
			System.out.println(numero);
		}
		return listaDeNumerosSomados21;
	}
	
	public static int[] integerToArray(int numero) {
		
		int tamanhoArray = Integer.toString(numero).length();
		int[]array = new int[tamanhoArray];
		int j = 0;
		
		while (numero != 0) {
			array[tamanhoArray - j - 1] = numero % 10;
			numero = numero/10;
			j++;
		}
		return array;
	}

	public static Integer somaArray(int[] array) {
		int total = 0;
		for (int number : array) {
			total += number;
		}
		return total;
	}

}
