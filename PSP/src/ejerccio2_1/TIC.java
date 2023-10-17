package ejerccio2_1;

import java.util.Iterator;

public class TIC extends Thread {

public void run(){
	while(true) {
		System.out.println("TIC");
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


}
