import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "miguel";
        String password = "12345";

        String username2 = "admin";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario: ");
        String usuario = scanner.next();

        System.out.println("Ingrese el password: ");
        String contrasenia = scanner.next();

        boolean esAutenticado =  false;

        if ( (username.equals(usuario) && password.equals(contrasenia))  ||
                (username2.equals(usuario) && password2.equals(contrasenia))){
            esAutenticado = true;
        }else {
            System.out.println("Nombre de usuario o contraseña incorrecto!");
        }

        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        }else{
            System.out.println("Lo siento, requiere autenticacion");
        }
    }
}
