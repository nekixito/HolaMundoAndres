public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print("[Prueba salto bucle]");
                System.out.println();
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }

        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Inicio de otro ejemplo");

        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print("[Prueba salto bucle]");
                System.out.println();
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }

        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Inicio de otro ejemplo");

        otrobucle:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            int j = 0;
            while (j < 5) {
                System.out.print("[Prueba salto bucle]");
                System.out.println();
                if (i == 2) {
                    continue otrobucle;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
                j++;
            }
        }

        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Inicio de otro ejemplo");

        otrobuclemas:
        for (int i = 0; i <= 7; i++) {
            int j = 0;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ", descanso de fin de semana!");
                    continue otrobuclemas;
                }
                System.out.println("Dia " + i + " trabajando a las " + j + " hrs.");
                j++;
            }
        }

    }
}
