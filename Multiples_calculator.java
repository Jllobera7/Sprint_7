import java.util.Scanner;

public class MultiplesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean esValido = false;
        int numeroBase = 0;

        // Apartado A: Lectura del número base
        while (!esValido) {
            System.out.print("Introduce un número entero entre 1 y 20: ");
            if (scanner.hasNextInt()) {
                numeroBase = scanner.nextInt();
                if (numeroBase >= 1 && numeroBase <= 20) {
                    esValido = true;
                } else {
                    System.out.println("El número debe estar entre 1 y 20. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Eso no es un número entero. Inténtalo de nuevo.");
                scanner.next(); // Limpiar la entrada incorrecta
            }
        }

        // Apartado B: Generación y muestra de los múltiplos
        System.out.println("Los múltiplos de " + numeroBase + " entre 0 y 100 son:");
        int multiplo = 0;

        while (multiplo <= 100) {
            System.out.println(multiplo);
            multiplo += numeroBase;
        }

        scanner.close();
    }
}
