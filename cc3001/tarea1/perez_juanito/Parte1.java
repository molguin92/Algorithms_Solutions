package cc3001.tarea1.perez_juanito;


/**
 * Cada parte de la tarea, debe ir en una clase aparte, en un archivo aparte.
 * Es decir, Parte1.java implementa la parte 1 de la tarea.
 */
public class Parte1
{


    /**
     * Metodo1: El metodo solicitado en la parte 1 de la tarea.
     * Puede implementarse mediante varios metodos distintos, pero el punto
     * de entrada debe ser el especificado en la tarea.
     *
     * @param input La entrada del metodo.
     * @return la salida del metodo
     */
    public static int metodo1 ( int input ) {

        return input + 1;
    }

    /**
     * main() es requerido para poder correr la clase como un programa por si solo.
     * Cada Parte de la tarea debe poder ejecutarse por si misma.
     *
     * @param args Argumentos pasados a traves de la linea de comandos.
     */
    public static void main ( String[] args )
    {
        System.out.println( metodo1(1) );
    }

}
