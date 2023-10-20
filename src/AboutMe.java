import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Type your name: ");
            String name = scanner.next();

            System.out.println("Type your surname: ");
            String surname = scanner.next();

            System.out.println("Type your age: ");
            int age = scanner.nextInt();

            System.out.println("Type your height in ft: ");
            double height = scanner.nextDouble();

            System.out.println("Hello, my name is: " + name.toUpperCase() + " " + surname.toUpperCase());
            System.out.println("I am " + age + " years old.");
            System.out.println("My height is: "+ height + "ft.");
        }
        } catch(InputMismatchException e){
            System.out.println("Fields of age and height must me filled with");
        }
    }
}
