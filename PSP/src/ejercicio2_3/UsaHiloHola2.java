package ejercicio2_3;
public class UsaHiloHola2 {
public static void main(String[] args) {
	HiloHola2 h1=new HiloHola2("Hilo1");
	HiloHola2 h2=new HiloHola2("Hilo2");
	HiloHola2 h3=new HiloHola2("Hilo3");
	HiloHola2 h4=new HiloHola2("Hilo4");
	HiloHola2 h5=new HiloHola2("Hilo5");
	new Thread(h1).start();
	new Thread(h2).start();
	new Thread(h3).start();
	new Thread(h4).start();
	new Thread(h5).start();
}
	
}
