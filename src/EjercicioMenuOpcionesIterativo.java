import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class EjercicioMenuOpcionesIterativo {
    public static void main(String[] args) {
        int opcionIndice = 0;

        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar",1);
        opciones.put("Eliminar",2);
        opciones.put("Agregar",3);
        opciones.put("Listar",4);
        opciones.put("Salir",5);

        Object[] opArreglo = opciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione una opción",
                "Mantenedor de productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);


        if( opcion == null ){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion");
        }else{


            //opcionIndice = 1;

            boolean estaActivo = true;
            do {
                opcionIndice = opciones.get(opcion.toString());


                switch (opcionIndice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Usuario actualizado corretamente");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Usuario eliminado corretamente");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Usuario agregado corretamente");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Usuario listado corretamente");
                        break;
                    case 5:
                        estaActivo = false;
                        break;
                }

                if (opcionIndice == 5){
                    JOptionPane.showMessageDialog(null, "Has salido con exito");
                }else{
                    opcion = JOptionPane.showInputDialog(null,
                            "Seleccione una opción",
                            "Mantenedor de productos",
                            JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);
                }

            }while(estaActivo);
        }

    }
}
