public class SchoolGrades {
    public static void main(String[] args) {
        int grade = 6;

        if(grade >= 7)
            System.out.println("Approved.");

            else if(grade >= 5 && grade < 7)
               System.out.println("Remedial Class");

            else
                System.out.println("Retained.");


 /*        int grade = 7; 

        String result = grade >= 7 ? "Approved" : "Retained";

        System.out.println(result); */

/*         int grade = 6;
        String result = grade >= 7 ? "Approved" : grade >= 5 && grade < 7 ? "Remedial Class" : "Retained";

        System.out.println(result); */
    }
}
