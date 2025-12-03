import java.util.Scanner;

public class EjercicioMultiplicarDosNumeros {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Escribe el primer numero: ");
        int numero1 = escaner.nextInt();
        //int numero1 = -7;

        System.out.println("Escribe el segundo numero: ");
        int numero2 = escaner.nextInt();
        //int numero2 = -8;

        int multiplicacion = 0;

        if((numero1 > 0 && numero2 > 0) || (numero1 < 0 && numero2 > 0)){
            for (int i = 1; i <= numero2; i++) {
                multiplicacion += numero1;
            }
        }

        if((numero1 < 0 && numero2 < 0)){

            String numero1PositivoCadena = Integer.toString(numero1).substring(1);
            int numero1Positivo = Integer.parseInt(numero1PositivoCadena);

            String numero2PositivoCadena = Integer.toString(numero2).substring(1);
            int numero2Positivo = Integer.parseInt(numero2PositivoCadena);

            for (int i = 1; i <= numero2Positivo; i++) {
                multiplicacion += numero1Positivo;
            }
        }

        if((numero1 > 0 && numero2 < 0)){

            String numero2PositivoCadena = Integer.toString(numero2).substring(1);
            int numero2Positivo = Integer.parseInt(numero2PositivoCadena);

            for (int i = 1; i <= numero2Positivo; i++) {
                multiplicacion += numero1;
            }


            multiplicacion = Integer.parseInt("-" + multiplicacion);
        }



        System.out.println("multiplicacion = " + multiplicacion);

    }
}
