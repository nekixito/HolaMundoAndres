import javax.swing.*;

public class NombreMasLargoTresPersonas {
    public static void main(String[] args) {
        String nombre1 = "Alberto Rodriguez";//JOptionPane.showInputDialog("Escribe el nombre completo de la primera persona: ");
        String nombre2 = "Humberto Velez";//JOptionPane.showInputDialog("Escribe el nombre completo de la segunda persona: ");
        String nombre3 = "Estela Gomez";//JOptionPane.showInputDialog("Escribe el nombre completo de la tercera persona: ");

        String[] nombreArreglo1 = nombre1.split(" ");
        String[] nombreArreglo2 = nombre2.split(" ");
        String[] nombreArreglo3 = nombre3.split(" ");

        //System.out.println("nombre1 = " + nombreArreglo1[0]);
        //System.out.println("nombre2 = " + nombreArreglo2[0]);
        //System.out.println("nombre3 = " + nombreArreglo3[0]);

        //System.out.println("nombre1 = " + nombreArreglo1[0].length());
        //System.out.println("nombre2 = " + nombreArreglo2[0].length());
        //System.out.println("nombre3 = " + nombreArreglo3[0].length());

        String nombreMasLargo = (nombreArreglo1[0].length() > nombreArreglo2[0].length()) ? nombre1 : nombre2;
        nombreMasLargo = (nombreArreglo3[0].length() > nombreMasLargo.length()) ? nombre3 : nombreMasLargo;

        System.out.println(nombreMasLargo + " tiene el nombre más largo.");


        
    }
}
