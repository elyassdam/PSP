package ejercicio2_7;
	

			// CONTADOR
	
		class HiloA extends Thread {
			private Contador contador;
			public HiloA(String n, Contador c) {
				setName(n);
				contador = c;
			}
			public void  run(){
				synchronized(contador){
				for (int j = 0; j < 5000; j++) {
					contador.incrementa();
					try {
						sleep(1);
					} catch (InterruptedException e) {		}
				}
				System.out.println(getName() + " contador vale " + contador.getValor());
			}
		}
		}
		public class Ejercicio2_7 {
			
			public static void main(String[] args) {
				Contador cont  = new Contador(0);
				HiloA a1 = new HiloA("Hilo1", cont);
				HiloA a2 = new HiloA("Hilo2", cont);
				HiloA a3 = new HiloA("Hilo3", cont);
				HiloA a4= new HiloA("Hilo4", cont);
				HiloA a5 = new HiloA("Hilo5", cont);
				a1.start();       
				a2.start();
				a3.start();       
				a4.start();
				a5.start();       
				
		
			}
		}
	
		// FIN HILOA
	
		
	
	
