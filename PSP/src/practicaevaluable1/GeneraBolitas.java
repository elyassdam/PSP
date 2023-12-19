package practicaevaluable1;

import java.util.Iterator;
import java.util.Random;

public class GeneraBolitas {
	public static void main(String[] args) {
Random r=new Random();
int numero=r.nextInt(31)+5;

String color[]= {"rojo","azul","amarillo"};
for (int i = 0; i <numero ; i++) {
	int numero2=r.nextInt(5)+1;
	int numero3=r.nextInt(3);
	Bolitas b = new Bolitas(color[numero3], numero2);
	Thread t =new Thread(b);
	t.start();
}
	}
}
