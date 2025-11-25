import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*
        String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "miguel";
        passwords[0] = "123";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "345";
        */
        String[] usernames = {"miguel", "admin", "pepe"};
        String[] passwords = {"123", "12345", "345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario: ");
        String usuario = scanner.next();

        System.out.println("Ingrese el password: ");
        String contrasenia = scanner.next();

        boolean esAutenticado =  false;

        for (int i = 0; i < usernames.length; i++) {
            if ( (usernames[i].equals(usuario) && passwords[i].equals(contrasenia)) ){
                esAutenticado = true;
                break;
            }
        }


        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        }else{
            System.out.println("Nombre de usuario o contraseña incorrecto!");
            System.out.println("Lo siento, requiere autenticacion");
        }
    }
}
