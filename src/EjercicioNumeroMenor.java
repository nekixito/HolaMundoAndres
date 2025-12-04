import java.util.Scanner;

public class EjercicioNumeroMenor {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Escribe la cantidad de numeros para buscar el menor, debe ser mayor a 10: ");
        int cantidadNumeros = escaner.nextInt();

        if(cantidadNumeros < 10){
            System.out.println("Deben de ser 10 numeros o mas.");
        }else{

            int menor = 0;
            int[] numeros = new int[cantidadNumeros];


            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Escribe el número a comparar: ");
                numeros[i] = escaner.nextInt();

                if(i == 0){
                    menor = numeros[i];
                }else if(numeros[i] < menor){
                    menor = numeros[i];
                }
            }

            System.out.println("El numero menor es: " + menor);

            if(menor < 10){
                System.out.println("El numero menor es menor que 10");
            }else{
                System.out.println("El numero menor es igual o mayor que 10");
            }

        }
    }
}
