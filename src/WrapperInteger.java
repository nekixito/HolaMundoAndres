public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 127;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = 32768;
        System.out.println("intObjeto2 = " + intObjeto2);

        int num = intObjeto;
        int num2 = intObjeto.intValue();
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        String valorTvLcd = "8000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
