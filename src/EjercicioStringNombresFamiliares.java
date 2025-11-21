import java.util.Scanner;

public class EjercicioStringNombresFamiliares {
    public static void main(String[] args) {

        //Entrada
        Scanner escaner = new Scanner(System.in);

        String nombre1 = "";
        String nombre2 = "";
        String nombre3 = "";

        System.out.println("Escribe el primer nombre de tu familiar o amigo");
        nombre1 = escaner.nextLine();

        System.out.println("Escribe el segundo nombre de tu familiar o amigo");
        nombre2 = escaner.nextLine();

        System.out.println("Escribe el tercer nombre de tu familiar o amigo");
        nombre3 = escaner.nextLine();

        //Proceso
        String segundoCaracter = "";
        String ultimosCaracteres = "";

        //nombre 1
        segundoCaracter = nombre1.substring(1,2).toUpperCase();
        ultimosCaracteres = nombre1.substring(nombre1.length()-2);
        System.out.print( segundoCaracter + "." + ultimosCaracteres);
        System.out.print("_");

        //nombre 2
        segundoCaracter = nombre2.substring(1,2).toUpperCase();
        ultimosCaracteres = nombre2.substring(nombre2.length()-2);
        System.out.print( segundoCaracter + "." + ultimosCaracteres);
        System.out.print("_");

        //nombre 3
        segundoCaracter = nombre3.substring(1,2).toUpperCase();
        ultimosCaracteres = nombre3.substring(nombre3.length()-2);
        System.out.println( segundoCaracter + "." + ultimosCaracteres);

    }
}
