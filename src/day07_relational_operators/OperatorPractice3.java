package day07_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {
         int h = 5;
         int p = h;

         h++;
        System.out.println("h: " + h); // h: 6
        System.out.println("p:" + p); // p: 5


        int k = h++;
        System.out.println("h: " + h); // h: 7
        System.out.println("k: " + k); // k: 6

        int g = ++h;
        System.out.println("h: " + h);
        System.out.println("g: " + g);

    }


}
