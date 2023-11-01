package ejercicio2_11;



public class Produc_Consum {
  public static void main(String[] args) {  
    Cola cola = new Cola();
	
    Productor p = new Productor(cola, 1);	
	Consumidor c = new Consumidor(cola, 1);
	
    p.start();
	c.start();

	
  }
}
/*
 * 0=>Consumidor: 1, consume: 0
1=>Consumidor: 1, consume: -1
0=>Productor : 1, produce: 0
2=>Consumidor: 1, consume: -1
3=>Consumidor: 1, consume: -1
4=>Consumidor: 1, consume: -1
1=>Productor : 1, produce: 1
2=>Productor : 1, produce: 2
3=>Productor : 1, produce: 3
4=>Productor : 1, produce: 4

 */
