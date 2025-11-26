import java.util.Scanner;

public class DosNumerosOrdenados {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Escribe el primer numero: ");
        int numero1 = escaner.nextInt();

        System.out.println("Escribe el segundo numero: ");
        int numero2 = escaner.nextInt();

        int mayor = (numero1 > numero2) ? numero1 : numero2;
        int menor = (numero1 < numero2) ? numero1: numero2;

       System.out.println(mayor);
       System.out.println(menor);


    }
}
