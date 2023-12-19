package practicaevaluable1;

public class Bolitas implements Runnable {
String color;
int tamanio;

Bolitas(String color,int tamanio){
	this.color=color;
	this.tamanio=tamanio;
	
}
public void run() {
	System.out.println(toString());
}
@Override
public String toString() {
	return "Bolitas [color=" + color + ", tamanio=" + tamanio + "]";
}


	
	
}
