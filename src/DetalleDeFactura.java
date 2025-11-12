import java.util.Scanner;

class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre para la factura:");
        String descripcionFactura = scanner.nextLine();


        System.out.println("Ingrese un precio de producto:");
        double precioProducto1 = scanner.nextDouble();
        System.out.println("Ingrese un precio de producto:");
        double precioProducto2 = scanner.nextDouble();

        double totalBrutoProductos =  precioProducto1 + precioProducto2;
        double impuesto = totalBrutoProductos * 0.19;
        double montoTotal = impuesto + totalBrutoProductos;

        System.out.println("La factura " + descripcionFactura + " tiene un total bruto de "
                + totalBrutoProductos + ", con un impuesto de " + impuesto
                + " y el monto despues de impuesto es de " + montoTotal);

    }
}