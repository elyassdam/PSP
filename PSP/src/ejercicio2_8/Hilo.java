package ejercicio2_8;

public class Hilo extends Thread {
Saldo saldo;
private Double  cantidad;
private String nombre;
Hilo(Saldo saldo,String nombre,Double cantidad){
this.saldo=saldo;
	this.cantidad=cantidad;
	this.nombre=nombre;
}
	@Override
	public void run() {
		try {
			saldo.Info(nombre, cantidad);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public static void main(String[] args) throws InterruptedException {
		Saldo cuenta=new Saldo(00.00);
		Hilo h1=new Hilo(cuenta,"h1",30.00);
		Hilo h2=new Hilo(cuenta,"h2",50.00);
		h1.start();
		h2.start();
		h1.join();
		h2.join();
		System.out.println("saldo final es :"+cuenta.getSaldo());
		
	}
	}

