package day16_loops;

public class Replace {
    public static void main(String[] args) {
        String str = "java is a language";


        String first = str.substring(0, str.indexOf(" ")); //java
        String second = str.substring(str.indexOf(" ") + 1);
        // String second = str.substring(first.length() + 1); // -- another way to do

        System.out.println(first);
        System.out.println(second);

        System.out.println((second + " " + first));
        String result = second + " " + first;
        System.out.println(result);

    }
}
