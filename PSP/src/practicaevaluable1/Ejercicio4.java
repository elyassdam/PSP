package practicaevaluable1;

public class Ejercicio4 {

	public static void main(String[] args) {
		Cola c=new Cola(6);
		Productor p1=new Productor(c,1);
		Consumidor c1=new Consumidor(c,1);
		Consumidor c2=new Consumidor(c,2);

		p1.start();
		c1.start();
	
		
       		
	}
}
