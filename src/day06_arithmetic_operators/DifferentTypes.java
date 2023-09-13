package day06_arithmetic_operators;

public class DifferentTypes {
    public static void main(String[] args) {

        //both of them is int ---> int and int ---> int
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println();

        // one side is double and another side is int --- > double and int --- > double
        System.out.println(10.0 / 5);

        // both side double is double  --- > double and double --- > double
        System.out.println(10.0 / 5.0);
        System.out.println();

        System.out.println( 10.0 / 5);
        System.out.println( (int)10.0 / 5);
        System.out.println( (double)10 / 5);


        byte b1 = 10;
        byte b2 = 20;

        // byte sum =  b1 + b2; // this will not work because thee values get changes to int during the calculation
        int sum = b1 + b2;
        int sumByte = (byte) (b1 + b2);
        System.out.println(sum);
        System.out.println(sumByte);



    }
}
