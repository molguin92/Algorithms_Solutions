package Tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class ROT13
{

    private static String rotate13 ( String input )
    {

        final char[] inputc = input.toCharArray();
        for ( char a: inputc )
        {

            if ( a >= 97 && a <= 122 )
                System.out.println("plas");
            else if ( a >= 65 && a <= 90 )
                System.out.println("plox");


        }

        return "hola";

    }

    public static void main ( String[] args ) throws IOException
    {

        // Pretty standard IO routine
        BufferedReader in = new BufferedReader( new InputStreamReader(
                System.in ) );
        String input;
        String output = "";

        //leemos una linea completa a la vez
        while ( ( input = in.readLine () ) != null )
        {
            //juntamos todo el output en un string
            output += rotate13(input) + "\n";
        }

        //luego lo imprimimos todo de una
        System.out.print ( output );
        System.out.flush ();
        in.close ();

    }

}