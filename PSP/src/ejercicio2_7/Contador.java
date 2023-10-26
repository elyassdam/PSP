package ejercicio2_7;

public class Contador {
		private int c = 0;
		public Contador(int c) {
			this.c = c;
		}

		public synchronized void incrementa() {
			c = c + 1;
		}

		public void decrementa() {
			c = c - 1;
		}

		public int getValor() {
			return c;
		}


}
