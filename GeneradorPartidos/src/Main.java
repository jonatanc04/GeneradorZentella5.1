import javax.swing.*;

public class Main {

    /**
     * Aplicación creada por Sirinazurey de forma EXCLUSIVA para la Liga Zentella
     * Su utilización fuera de esta es ILEGAL, ¡no se la pases a nadie!
     *
     * 1.0 Programa Base.
     *      1.1 Arreglo de errores en la generación de goles y nerfeo a las tarjetas.
     *          1.1.2 Nerfeo a las tarjetas.
     *
     * 2.0 Se ha optimizado el programa y se ha mejorado la generación de partidos.
     *      2.1 Se ha mejorado considerablemente la generación de partidos.
     *
     * 3.0 Ahora la aplicación es descargable en .jar para que la puedan utilizar los usuarios.
     *                          (Crédito del .exe a gonrured)
     *      3.1 Se ha implementado la disminución de media si un equipo recibe una roja directa y
     *      se ha simplificado el sistema del buff de local.
     *          3.1.1 Se ha mejorado el sistema de asignación de tarjetas amarillas.
     *
     * 4.0 Se ha implementado la generación de números aleatorios entre el 1 y un máximo y se ha
     * implementado la ruleta de jugadores.
     *          (4.0.1) Se ha mejorado el sistema de la ruleta de jugadores.
     *      4.1 Se ha mejorado considerablemente el sistema de ruleta de jugadores, se ha
     *      implementado la ruleta de asistencias, se ha optimizado el código y se ha añadido
     *      un pequeño porcentaje de Roja Directa para los dos equipos.
     *          4.1.1 Se ha añadido un selector de máximos en el número aleatorio, se ha nerfeado
     *          ligeramente la probabilidad de córner, se ha optimizado la asignación de asistencias
     *          y se ha implementado el buff dinámico del local.
     *          4.1.2 Se ha eliminado una pequeña parte del buff dinámico y se ha corregido un error
     *          en la asignación de asistencias.
     *
     * 5.0 Se ha implementado la ruleta de lesiones y se ha cambiado ligeramente la probabilidad de gol para
     * delanteros y se ha aumentado ligeramente la probabilidad de gol de defensa en los corner.
     *          5.0.1 Se ha implementado un botón de limpieza para dejar el resultado de un partido a 0 y
     *          un indicador de partido generado para evitar confusiones
     *      5.1 Se ha implementado un balance de asignación de tarjetas, para que haya una ligera probabilidad
     *      de que la amarilla caiga en posiciones defensivas
     *
     * (Las versiones entre paréntesis no han sido lanzadas como aplicación, se ha esperado a una actualización
     * mayor o conjunto de actualizaciones más pequeñas para ser lanzadas.)
     *
     * @param args Pues lo que necesite esta mierda para funcionar, friki
     */

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new GeneradorZentella();
                frame.setSize(500, 500);
                frame.setVisible(true);
            }
        });

    }

}