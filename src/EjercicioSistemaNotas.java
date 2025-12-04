import java.util.Scanner;

public class EjercicioSistemaNotas {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        double[] notas = new double[20];

        double sumaNotasReprobadas = 0;
        double sumaNotasAprobadas = 0;
        int contadorNotasReprobadas = 0;
        int contadorNotasAprobadas = 0;
        double sumaTotal = 0;

        boolean salidaNormal = true;



        for (int i = 0; i < notas.length; i++){

            System.out.println("Escriba la nota: mayor a 0 y menor o igual a 7");
            notas[i] = escaner.nextDouble();

            if(notas[i] > 0 && notas[i] < 5){
                sumaNotasReprobadas += notas[i];
                contadorNotasReprobadas++;
            }else if(notas[i] >= 5 && notas[i] <= 7){
                sumaNotasAprobadas += notas[i];
                contadorNotasAprobadas++;
            }else{
                System.out.println("No es un número válido.");
                salidaNormal = false;
                break;
            }

            sumaTotal += notas[i];
        }

        if (salidaNormal){
            System.out.println("Promedio de notas mayores a 5: " + (sumaNotasAprobadas/contadorNotasAprobadas));
            System.out.println("Promedio de notas mayores a 5: " + (sumaNotasReprobadas/contadorNotasReprobadas));
            System.out.println("Promediio total: " + (sumaTotal / notas.length));
        }else{
            System.out.println("Saliendo del programa... ");
        }

    }
}
