
import java.io.IOException;

public class LlamadorEjercicio1 {
    public static void main(String[] args) {
        try {
            // Crea un nuevo proceso para ejecutar el programa "EJ1_GeneradorNumeros"
            ProcessBuilder pb = new ProcessBuilder("java", "EJ1_GeneradorNumeros");

            // Establece el directorio de trabajo (asegúrate de ajustar la ruta según tu estructura de directorios)
            pb.directory(new java.io.File(".\\bin"));

            // Inicia el proceso
            Process p = pb.start();

            // Espera a que el proceso termine

            // Imprime un mensaje cuando el proceso ha finalizado
            System.out.println("El proceso ha terminado.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
