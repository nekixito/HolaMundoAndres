public class ArgumentosLineaComandosCalculadora {
    public static void main(String[] args) {
        if (args.length != 3){
            System.err.println("Por favor ingresa una operación (suma, resta, multiplicacion, division y dos enteros)");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.0;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Cuidado, a y b deben ser enteros, vuelva a intentar");
            System.exit(-1);
        }



        switch (operacion){
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "division":
                if (b==0){
                    System.exit(-1);
                }
                resultado = (double)a / b;
                break;
            default:
                System.err.println("No es una operación válida");
                System.exit(-1);
                break;
        }

        System.out.println("Resultado de la operación '" + operacion + "' es: " + resultado);

    }
}
