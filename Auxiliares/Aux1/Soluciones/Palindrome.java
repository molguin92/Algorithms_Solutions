package Auxiliares.Aux1.Soluciones;

public class Palindrome {

    public static boolean palindrome ( String S )
    {

        int i = 0;
        int k = S.length() - 1;

        for ( i = 0; i < k - i; i++ )
        {

            if ( S.charAt(i) != S.charAt(k - i) )
                return false;

        }

        return true;
    }

    public static void main ( String[] args )
    {

        String test_p = "sometemos";
        String test_n = "no palindromo";

        System.out.println(palindrome(test_p));
        System.out.println(palindrome(test_n));

    }

}
