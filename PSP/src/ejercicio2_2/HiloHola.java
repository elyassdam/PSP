package ejercicio2_2;

public class HiloHola extends Thread {

	public void run() {
		System.out.println("Hola Yassin = "+Thread.currentThread().getId());
	}
}
