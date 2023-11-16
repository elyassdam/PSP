package practicaevaluable1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero = 0;
List<Integer> numeros=new ArrayList();

		while(numero!=-1) {
			System.out.println("Introduce un numero para terminar de introducirlos mete -1");
			numero=sc.nextInt();
			if(numero!=-1) {
			numeros.add(numero);
			}
			}
		System.out.println(numeros.toString());
		Integer[] ordenados;
		ordenados=  numeros.toArray(new Integer[0]);
		Arrays.sort(ordenados);
		System.out.println(Arrays.toString(ordenados));
	}
}
