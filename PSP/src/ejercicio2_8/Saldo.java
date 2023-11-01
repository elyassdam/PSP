package ejercicio2_8;

import java.util.Random;

public class Saldo {
Double saldo;
Saldo(Double saldo){
	this.saldo=saldo;
	
}
public Double getSaldo() throws InterruptedException {
	Random random=new Random();
	Thread.sleep(random.nextInt(1000));
	return saldo;
	
}
public void setSaldo(Double saldo) throws InterruptedException {
	Random random=new Random();
	Thread.sleep(random.nextInt(1000));
	this.saldo = saldo;
}
public synchronized void Info(String nombre,Double cantidad) throws InterruptedException {
Double saldoAntes=this.getSaldo();
Double saldoDespues=saldoAntes+cantidad;
this.setSaldo(saldoDespues);
System.out.println(nombre + " añadió " + cantidad + " al saldo.");
System.out.println("Saldo antes de añadir: " + saldoAntes);
System.out.println("Saldo después de añadir: " + saldoDespues);
}

}