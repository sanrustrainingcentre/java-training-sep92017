/**
 *
 */
public class SwitchDemo {

    public static void main(String[] args) {

        int result = 0;

        if(result == 0)
        {
            System.out.println("execution for result = 0");
            System.out.println("execution for result = 1");
        } else if (result == 1)
        {
            System.out.println("execution for result = 1");
        }

        switch (result)
        {

            case 0:
                System.out.println("execution for result = 0");

            case 1:
                System.out.println("execution for result = 1");
                break;

            case 2:
                System.out.println("execution for result = 2");
                break;

            case 5:
                System.out.println("execution for result = 5");
                break;

            default:
                System.out.println("No cases executed for the result = " + result);
                break;


        }

        System.out.println("After switch");


        char ch = 'A';

        switch (ch)
        {
            case 'A':
                break;
            case 'B':
                break;
            case '&':
                break;
            case '0':
                break;
            default:
                System.out.println("No characters matched");
        }

        if(ch == 'A')
        {

        }
        else if (ch == 'B')
        {

        }
        else if (ch == 'C')
        {

        }
        else
        {

        }

    }
}
