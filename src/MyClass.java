public class MyClass {
        public static void main (String [] args){
            String firstName = "Pedro";
            String surName = "Valravn";

            String fullName = fullName (firstName, surName);

            System.out.println(fullName);
    }

        public static String fullName (String firstName, String surName){
                return firstName.concat(" ").concat(surName);
        }
}
