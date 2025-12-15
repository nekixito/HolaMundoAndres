import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjercicioCalcularEdad {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Date fechaActual = new Date();
        System.out.println("fechaActual = " + sdf.format(fechaActual));
        long fechaActualMilisegundos = fechaActual.getTime();

        Calendar fechaCalendario = Calendar.getInstance();
        fechaCalendario.set(Calendar.YEAR,1980);
        fechaCalendario.set(Calendar.MONTH,Calendar.JULY);
        fechaCalendario.set(Calendar.DATE,6);
        //System.out.println("fechaCalendario = " + fechaCalendario);

        Date fechaNacimiento = fechaCalendario.getTime();
        System.out.println("fechaNacimiento = " + sdf.format(fechaNacimiento));
        long fechaNacimientoMilisegundos = fechaNacimiento.getTime();
        //System.out.println("fechaNacimientoMilisegundos = " + fechaNacimientoMilisegundos);

        long edadMilisegundos = fechaActualMilisegundos - fechaNacimientoMilisegundos;
        //System.out.println("edadMilisegundos = " + edadMilisegundos);

        long milisegundosEnUnAnio = 365L * 24 * 60 * 60 * 1000;
        //System.out.println("milisegundosEnUnAnio = " + milisegundosEnUnAnio);

        long edad = (long)edadMilisegundos / milisegundosEnUnAnio;
        System.out.println("edad = " + edad);

    }
}
