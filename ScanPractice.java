import java.util.Scanner;


/**
 * Write a description of class ScanPractice here.
 *
 * @author (Mitchell Duea)
 * @version (1.0)
 */
public class ScanPractice
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of text:");

        String word = scan.next();

        String line = scan.nextLine();

        System.out.println(word);
        System.out.println(line);
        int num = 123;
        double result = num % 100 / 10;
        System.out.println(result);

        // DecimalFormat fmt = new DecimalFormat("0.###");
        // System.out.println("A formatted decimal: " + fmt.format(15.2346672));
        // fmt.applyPattern("0.#");
        // System.out.println("Uses a new format: " + fmt.format(15.2346672));
    }
}
