import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedimos la ruta del fichero

        System.out.println("------------------------------------");
        System.out.println("| Introduzca la ruta de un fichero |");
        System.out.println("------------------------------------");
        String path = scanner.nextLine();

        File archivo = new File(path);

        // Comprobamos si el fichero existe

        if (!archivo.exists()) {
            System.out.println("****************************************");
            System.out.println("ERROR : el fichero introducido no existe");
            System.out.println("****************************************");
        } else {
            System.out.println("El fichero si existe");
        }

    }
}