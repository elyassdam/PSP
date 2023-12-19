
public class Main implements Runnable{
	Avion avion;
	Hangar hangar;
	long timeStamp;
	
	

	public Main(Avion avion, Hangar hangar,long timeStamp) {
		this.avion = avion;
		this.hangar = hangar;
		this.timeStamp=timeStamp;
	}

	public static void main(String[] args) {
		Avion avion1 = new Avion("F-18", new int[] { 3, 1, 2, 4, 1, 1 });
		Avion avion2 = new Avion("F-14", new int[] { 3, 2, 4, 1, 1 });
		
		long initialTime = System.currentTimeMillis();
		Hangar Hangar1 = new Hangar("Hangar 1",avion1,initialTime);
		Hangar Hangar2 = new Hangar("Hangar 2",avion2,initialTime);
	Main m1=new Main(avion1,Hangar1,initialTime);
Thread HiloHangar1=new Thread(m1);
Main m2=new Main(avion2,Hangar2,initialTime);
Thread HiloHangar2=new Thread(m2);
HiloHangar1.start();
HiloHangar2.start();
		// Tiempo de referencia inicial
		

	}

	@Override

		public void run() { synchronized(avion) {

			System.out.println("El Hangar " + this.hangar.getNombre() + 
					" EMPIEZA A CARGAR LAS ARMAS DEL AVION " + avion.getNombre() + 
					" EN EL INSTANTE: " + ((System.currentTimeMillis()/1000) - (timeStamp / 1000))	+
					"seg");

			for (int i = 0; i < avion.getcargaPilon().length; i++) {
				this.esperaTiempo(avion.getcargaPilon()[i]);
				System.out.println("Procesado el pilón " + (i + 1)+hangar.getNombre() + 
						" está tardando en total: " + ((System.currentTimeMillis()/1000) - (timeStamp / 1000)) + 
						" segundos");
			}

			System.out.println("El Hangar " +hangar.getNombre() + " HA TERMINADO DE CARGAR LAS ARMAS DEL " + 
								avion.getNombre() + " EN EL TIEMPO: " + 
								((System.currentTimeMillis()/1000) - (timeStamp / 1000)) + " segundos");

		}
		
	}
	private void esperaTiempo(int segs) {
		try {
			Thread.sleep(segs * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
}
	}

