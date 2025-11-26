import java.util.Scanner;

public class SistemaTanqueGasolina {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Escribe la medida actual: ");
        double medidaActual = escaner.nextInt();


        if (medidaActual == 70) {
            System.out.println("Estanque lleno");
        }

        if (medidaActual >= 60 && medidaActual < 70) {
            System.out.println("Estanque casi lleno");
        }

        if (medidaActual >= 40 && medidaActual < 60) {
            System.out.println("Estanque 3/4");
        }

        if (medidaActual >= 35 && medidaActual < 40) {
            System.out.println("Medio Estanque");
        }

        if (medidaActual >= 20 && medidaActual < 35) {
            System.out.println("Suficiente");
        }

        if (medidaActual >= 1 && medidaActual < 20) {
            System.out.println("Insuficiente");
        }


    }
}
