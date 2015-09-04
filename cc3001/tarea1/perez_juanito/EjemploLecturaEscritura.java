package cc3001.tarea1.perez_juanito;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploLecturaEscritura
{

    public static void main ( String[] args ) throws IOException {

        BufferedReader in = new BufferedReader ( new InputStreamReader(
                System.in ) );
        String input;
        String output = "";

        while ( ( input = in.readLine () ) != null )
            //leemos linea por linea
        {
            output += input + "\n";
            //juntamos toda la salida en un string

            //.split(" ")
            //Integer.parseInt()
        }

        System.out.print ( output );
        //luego, lo imprimimos de una
        System.out.flush ();
        in.close ();

    }

}
