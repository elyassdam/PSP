package ejercicio2_3;

public class HiloHola2  implements Runnable{
String nombre;
	@Override
	public void run() {
System.out.println("Hola desde el hilo "+Thread.currentThread().getId());		
	
	}
	HiloHola2(String nombre){
		this.nombre=nombre;
		
	}
	

}
