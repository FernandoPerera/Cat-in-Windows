import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedimos la ruta del fichero.

        System.out.println("------------------------------------");
        System.out.println("| Introduzca la ruta de un fichero |");
        System.out.println("------------------------------------");
        String path = scanner.nextLine();

        try {

            File archivo = new File(path);

            // Comprobamos si el fichero existe con el método exist()
            // de la clase File.

            if (!archivo.exists()) {
                System.out.println("****************************************");
                System.out.println("ERROR : el fichero introducido no existe");
                System.out.println("****************************************");
            } else {

                // Instanciamos la clase ProcessBuilder y usamos el método command
                // para introducir el comando que queremos realizar.

                ProcessBuilder processBuilder = new ProcessBuilder();
                processBuilder.command("cmd.exe", "/C", "start" , path);

                // Iniciamos el proceso con el método start y creamos un Scanner
                // para su posterior lectura.

                processBuilder.start();

                Scanner fileScanner = new Scanner(archivo);

                System.out.println("\n* Abriendo archivo : " + archivo);
                System.out.println("----------------------------------\n");

                // Vamos leyendo y printeando el contenido del fichero.

                while ( fileScanner.hasNext() ) {
                    System.out.println("-\t" + fileScanner.nextLine());
                }

                // Y mostramos los caracteres totales con un length.

                System.out.println("\n----------------------------------");
                System.out.println("* El archivo contiene " + archivo.length() + " caracteres");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}