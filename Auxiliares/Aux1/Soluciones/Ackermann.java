package Auxiliares.Aux1.Soluciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by arachnid92 on 09-09-15.
 */
public class Ackermann {

    public static int ackermann ( int m, int n )
    {

        if ( m < 0 || n < 0 )
            return 0;

        if ( m == 0 )
            return n + 1;

        if ( n == 0 )
            return ackermann( m - 1, 1 );

        return ackermann( m - 1, ackermann( m, n - 1 ) );

    }

    public static void main ( String[] args ) throws IOException {

        BufferedReader in = new BufferedReader ( new InputStreamReader( System.in ) );
        String input;
        String output = "";
        String[] mn = new String[2]; //Entrada separada

        while ( ( input = in.readLine () ) != null )
        //leemos linea por linea
        {
            mn = input.split(" ");
            int M = Integer.parseInt(mn[0]);
            int N = Integer.parseInt(mn[1]);
            output += ackermann(M, N) + "\n";
        }

        System.out.print ( output );
        //luego, lo imprimimos de una
        System.out.flush ();
        in.close ();

    }

}
