public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        System.out.println("caracter = " + caracter);
        
        char decimal = 64;
        System.out.println("decimal = " + decimal);

        System.out.println("decimal = caracter: " + (decimal == caracter) );
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        System.out.println("simbolo = caracter: " + (simbolo == caracter) );

        System.out.println();

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("tipo char corresponde en byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("Valor máximo de un char: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un char: " + Character.MIN_VALUE);
    }
}
