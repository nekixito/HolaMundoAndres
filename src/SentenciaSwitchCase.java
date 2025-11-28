import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        char num = 'a';

        switch(num){
            case '0':
                System.out.println("El numero es cero.");
                break;
            case '1':
                System.out.println("El numero es uno.");
                break;
            case '2':
                System.out.println("El numero es dos.");
                break;
            case '3':
                System.out.println("El numero es tres.");
                break;
            case 'a':
                System.out.println("El caracter es a.");
                break;
            default:
                System.out.println("Numero o caracter desconocido");
        }

        String nombre = "juan";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "miguel":
                System.out.println("Hola miguel.");
                break;
            case "pepe":
                System.out.println("Hola pepe.");
                break;
            default:
                System.out.println("Usuario desconocido");
        }

        System.out.println("Ingrese el numero de mes, entre 1 - 12: ");
        int mes = escaner.nextInt();

        String nombreMes = null;

        switch(mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "No es un numero de mes.";
        }

        System.out.println("El mes es: " + nombreMes);
    }
}
