public class DataTypesDemo {

    public static void main(String[] args) {

        //Whole Number data types
        byte b;//declaration
        b = 127;//initialization

        short s = -32768;
        int i = -2147483648;
        long l = 89769782641248711L;

        float f = 0.008909798775F;
        double d = 5.6757657875675675875875875;

        boolean result = true;

        char ch = 'A';

        String str = "Java course " + "10.asdfasdfas";
        String str1 = "Java \\\" Course";

        System.out.println("byte b => " + b);
        System.out.println("short s => " + s);
        System.out.println("int i => " + i);
        System.out.println("long l => " + l);
        System.out.println("float f => " + f);
        System.out.println("double d => " + d);
        System.out.println("boolean result => " + result);
        System.out.println("char ch => " + ch);
        System.out.println("String str => " + str);
        System.out.println("String str1 => " + str1);
    }
}
