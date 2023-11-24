package practicaevaluable1;
public class Cola {
	
	//variables de clase
	private char []buffer;
	int longitud;
	private int contador=0;
	//Constructor
	
	Cola(int longitud){
		this.buffer=new char[longitud];  
	}
	
//Getters y Setters
	public synchronized char get() {
		while (contador==0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		char valor=buffer[contador-1];//consume el caracter ultimo producido   
  	  System.out.println("Se consume: " + valor);    	  
notifyAll();
  	  return valor; //devuelve el valor consumido
	
	}

	public synchronized void put(char valor) {
		while (contador==buffer.length) {

			try {
				wait();
			} catch (InterruptedException e) {}
		}
		buffer[contador++]=valor;
		contador++;//Inserta en la siguiente posicion
  	  System.out.println("Se produce: " + valor);    	  
  	notifyAll();
		}
}


