package practicaevaluable1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Aleatorios {
	
public static void main(String[] args) {
	int aleatorio;
	List<Integer> aleatorios=new ArrayList();
	
	Random r=new Random();
	for (int i = 0; i < 50; i++) {
		aleatorio=r.nextInt(101);
		aleatorios.add(aleatorio);
	}
	System.out.println(aleatorios.toString());
	
	
	
	
}
}
