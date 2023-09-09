package day05_variables;

public class CharExample {
    public static void main(String[] args) {

        // assign characters to the char data type

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';

        // sout
        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo); // 97 + 90 --- > 187



        char letterThree = 65;
        System.out.println(letterThree);

        // char letterFour = '65'; // this is invalid because there are two characters

        System.out.println(letterOne + letterTwo + numberOne + specialOne); //97 + 98 + 65 + 57 + 36

        //Concatenation
        System.out.println(letterOne + " " + letterTwo + " " +  numberOne + " " + specialOne);

        //Concatenation
        System.out.println("chars: " + letterOne + letterTwo + numberOne + specialOne);

        //RULE: Concatenation stars from FIRST String. Anything after FIRST String is concatenated
        System.out.println(letterOne + letterTwo + " chars: " +  numberOne + specialOne);

        //Concatenation
        System.out.println(letterOne + " chars: " + letterTwo + numberOne + specialOne);







    }
}
