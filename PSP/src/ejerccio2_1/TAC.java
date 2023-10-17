package ejerccio2_1;

public class TAC extends Thread {

	

	public void run(){
		while(true) {
			System.out.println("TAC");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}


	}


