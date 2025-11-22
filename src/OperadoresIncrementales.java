public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre incremento
        int i = 1;
        int j = ++i; // j = i + 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post incremento
        i = 2;
        System.out.println("incial de i = " + i);
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();
        //Pre decremento
        i = 3;
        j = --i; // j = i - 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();

        //Post decremento
        i = 4;
        System.out.println("incial de i = " + i);
        j = i--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();
        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
    }
}
