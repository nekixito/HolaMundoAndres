import javax.lang.model.SourceVersion;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();

        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++) {
            System.out.println(arreglo[i]);
        }

        System.out.println();
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int largo2 = arreglo2.length;

        for (int j = 0; j < largo2; j++) {
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        System.out.println("archivo = " + archivo);
        String[] archivoArr = archivo.split("[.]"); //El punto es un caracter especial, puede usarse como \\.
        //System.out.println(archivoArr[0]);

        int largo3 = archivoArr.length;
        System.out.println("largo3 = " + largo3);
        
        for (int j = 0; j < archivoArr.length; j++) {
            System.out.println(archivoArr[j]);
        }

        System.out.println("extension: " + archivoArr[largo3-1]);

    }
}
