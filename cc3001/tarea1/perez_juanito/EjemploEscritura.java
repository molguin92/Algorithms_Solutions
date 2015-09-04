package cc3001.tarea1.perez_juanito;

/**
 * Created by arachnid92 on 03-09-15.
 */
public class EjemploEscritura
{

    public static void main ( String[] args )
    {

        long init = System.currentTimeMillis();
        for ( int i = 0; i < 1000; i++ )
        {
            System.out.println ( "Probando!" );
        }
        long fin = System.currentTimeMillis();

        long mult_prints = fin - init;

        init = System.currentTimeMillis();
        String output = "";

        for ( int i = 0; i < 1000; i++ )
        {
            output += "Probando!\n";
        }

        System.out.print(output);
        fin = System.currentTimeMillis();

        long one_print = fin - init;

        System.out.println( "1000 lineas, un print cada una: " + mult_prints + "ms\n" );
        System.out.println( "1000 lineas juntas en un string, un print: " + one_print + "ms\n" );

    }

}
