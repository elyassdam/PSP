package practicaevaluable1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ProcesadorDeInformacion extends Thread {
    public static void main(String[] args) {
        ProcesadorDeInformacion hilo = new ProcesadorDeInformacion();
        hilo.start();
    }

    @Override
    public void run() {
        System.out.println("Abriendo fichero");
        File fich = new File("archivo1000K.csv");
        String[] datosFichero = AbreFichero(fich);
        if (datosFichero != null) {
            System.out.println("Procesando información del fichero ");
            Proceso(datosFichero);
            System.out.println("Guardando fichero");
            Guardar();
        } else {
            System.out.println("Error al abrir el fichero.");
        }
    }

    public static String[] AbreFichero(File fichero) {
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            return br.lines().toArray(String[]::new);
        } catch (FileNotFoundException e) {
            System.out.println("NO se encuentra el fichero");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error E/S");
            e.printStackTrace();
        }
        return null;
    }

    public static Map<String, Integer> Proceso(String[] datosFichero) {
        Map<String, Integer> sumaParcial = new HashMap<>();
        try {
            for (String linea : datosFichero) {
                String id = linea.substring(0, 1); // asumiendo que la letra está al principio
                int numero = Integer.parseInt(linea.substring(1)); // asumiendo que el número sigue a la letra
                sumaParcial.put(id, sumaParcial.getOrDefault(id, 0) + numero);
            }
            System.out.println(sumaParcial.toString());
            System.out.println("Proceso realizado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se ha hecho correctamente ");
        }
        return sumaParcial;
    }

    public static void Guardar() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("resultado.csv"))) {
            Map<String, Integer> mapaGenerado = Proceso(AbreFichero(new File("archivo1000K.csv")));
            for (Map.Entry<String, Integer> entry : mapaGenerado.entrySet()) {
                String key = entry.getKey();
                Integer val = entry.getValue();
                bw.write(key + ":" + val);
                bw.newLine();
            }
            System.out.println("Fichero guardado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar el fichero");
        }
    }
}
