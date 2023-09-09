package day06_b_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 0;
        System.out.println(x); // 0


        x = x + 1; // take the value of x, which is 0 and add 1 --- > 0 + 1 --- > 1
        System.out.println(x); // 1

        x++;
        System.out.println(x); // 2

        x++;
        System.out.println(x); // 3

        ++x;
        System.out.println(x);


        System.out.println(++x);

        System.out.println(x++);
        System.out.println(x);






    }
}
