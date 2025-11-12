public class PrimitivosFloat {

    public static void main(String[] args) {
        
        float realFloat = 0.00000000015f;//1.5E-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE);

        System.out.println();

        double realDoble = 3.4028235E39;
        System.out.println("realDoble = " + realDoble);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE);

        System.out.println();

        var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);


    }
}
