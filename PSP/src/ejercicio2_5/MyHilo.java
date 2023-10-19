package ejercicio2_5;

public class MyHilo extends Thread{
		private SolicitaSuspender suspender = new SolicitaSuspender();
		private int contador=0;
		private boolean stopHilo=false;
		public void pararHilo() {
			stopHilo=true;
		}
		//Metodo que suspende el hilo
		public void suspende(){suspender.set(true);}
		//Metodo que reanuda el hilo
		public void reanuda(){suspender.set(false);}
		
		public void run(){
			try{
				while(stopHilo==false) {
					contador++;
					System.out.println("contador:"+contador);
					Thread.sleep(1000);
suspender.esperandoParaReanudar(); //ComprobaciÃ³n
				
				}//while
			
			}catch (InterruptedException exception){}
			System.out.println("Contador final"+contador);
			}
		//run
		public int valorContador () {
			return  contador;
		}
	}//MyHilo

