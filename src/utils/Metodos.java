package utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Metodos {

    public void datosFichero(File archivo) {

        try {

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
                processBuilder.command("cmd.exe", "/C", "start" , archivo.getPath());

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
