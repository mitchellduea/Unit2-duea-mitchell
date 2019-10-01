import java.util.*;


/**
 * Play with Strings
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringMutation
{
    public static void main(String[] args)
    {
        String phrase= new String("Change is inevitable");
        System.out.println(phrase);
        int phraseLength = phrase.Length();
        System.out.println("Lenght of phrase = " + phraseLength);
       String mut1, mut2, mut3, mut4;

      mut1 = phrase + ", except from vending machines.";
      System.out.println(mut1);
      System.out.println("length of mut1 = " + mut1.lenght());

      mut2 = mut1.touppercase();
      System.out.println(mut1);

      System.out.println("length of mut2 = " + mut2.lenght());

      mut3 = mut2.replace('E', 'X');
      System.out.println(mut3);
      System.out.println("Length of mut3 =" + mut3.Length());

      mut4 = mut3.substring(3, 30);
      System.out.println(mut4);
    
    }
}
