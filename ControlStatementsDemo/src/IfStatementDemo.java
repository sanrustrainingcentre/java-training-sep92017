/**
 * JavaDoc Commenting
 *
 * <brief explanation of this class is documented in here>
 *
 * -100 <= x < 10 => Print Value is Tiny
 * 10 <= x < 100 => Print Value is Small
 * 100 <= x < 1000 => Print Value is Medium
 * 1000 <= x < 100000 => Print value is Large
 * x >= 100000 => Print value is infinite
 */
public class IfStatementDemo {

    public static void main(String[] args) {
        int x = 500;


        if (x >= -100 && x < 10)
        {
            System.out.println("Tiny");
        }
        else if (x >= 10 && x < 100)
        {
            System.out.println("Small");
        }
        else if (x >= 100 && x < 1000)
        {
            System.out.println("Medium");
        }
        else if (x >= 1000 && x < 100000)
        {
            System.out.println("Large");
        }
        else if (x >= 100000)
        {
            System.out.println("Infinite");
        }
        else
        {
            System.out.println("Range not matched");
        }

    }

}
