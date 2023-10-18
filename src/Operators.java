public class Operators {
    public static void main(String[] args) {
/*         String fullName = "LANGUAGE" + " JAVA";

        System.out.println(fullName);

        int number = 5;

        number = - number;
        
        System.out.println(number);

        number = number * -1;

        System.out.println(number);

        boolean variable = true;

        variable = !variable;

        System.out.println(variable); */

 /*        int a, b;

        a = 5;
        b = 6;

        String result = a==b ?"true" : "falso";

        System.out.println(result); */

        boolean condition1 = true;
        boolean condition2 = false;

        if(condition1 && condition2){
            System.out.println("Both conditions are true.");
        }

        if(condition1 || condition2){
            System.out.println("One of both conditions is true.");
        }



        String name1 = "PETER";
        String name2 = new String("PETER");

        System.out.println(name1.equals(name2));


        int number1 = 1;
        int number2 = 2;

        boolean yesNo = number1 == number2;

        if(number1 < number2){
            System.out.println("Our condition is true.");
        }

        System.out.println("Is number one like number two?" + yesNo);

        yesNo = number1 != number2;

        System.out.println("Is number one like number two?" + yesNo);

        yesNo = number1 > number2;

        System.out.println("Is number one like number two?" + yesNo);       
    }
}
