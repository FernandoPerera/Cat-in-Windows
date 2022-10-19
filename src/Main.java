import utils.Metodos;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instancio la clase Scanner y Metodos para poder usarlas

        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();

        // Pedimos la ruta del fichero.

        System.out.println("------------------------------------");
        System.out.println("| Introduzca la ruta de un fichero |");
        System.out.println("------------------------------------");
        String path = scanner.nextLine();

        // Creo un objeto tipo File llamado archivo y lo introduzco
        // como parámetro en la función datosFichero de la clase Metodos .

        File archivo = new File(path);

        metodos.datosFichero(archivo);
    }
}