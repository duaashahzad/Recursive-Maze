/** PromptForDollar class
 *   Keep prompting user for a word containing $
 *   Anderson, Franceschi
 */

import java.util.Scanner;

public class PromptForDollar
{
    public static final char DOLLAR = '$';

    public static void main( String [] args )
    {

        Scanner scan = new Scanner( System.in );
        System.out.print( "Enter a word containing $ > " );
        String word = scan.next( );

        while( !checkForDollarRecursive( word ) )
        {
            System.out.print( "Enter a word containing $ > " );
            word = scan.next( );
        }

        System.out.println( "The word is " + word );
    }

    public static boolean checkForDollarRecursive( String s )
    {
        if ( s.length( ) == 0 )                           // base case 1
            return false;
        else if ( s.charAt( s.length( ) - 1 ) == DOLLAR ) // base case 2
            return true;
        else                                              // general case
            return checkForDollarRecursive( s.substring( 0, s.length( ) - 1 ) );// begin index, end  index

    }
}