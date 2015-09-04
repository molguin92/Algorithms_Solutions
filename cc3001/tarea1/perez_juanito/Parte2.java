package cc3001.tarea1.perez_juanito;

public class Parte2
{

    public static boolean metodo2 ( int input )
    {
        if ( 3 > Parte1.metodo1(input) )
            /*
            * Podemos usar los metodos de otras partes de la tarea
            * si estan en el mismo paquete y especificamos el nombre
            * de la clase.
            *
            * Si no esta en el mismo paquete, debemos importarla usando
            *
            * import cc3001.tarea5.perez_juanito.Parte3
            * */
        {
            return true;
        }

        return false;
    }

    public static void main ( String[] args )
    {
        System.out.println( metodo2(4) );
    }

}
