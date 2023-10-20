public class ForExamplesArray {
    public static void main(String[] args) {
        String students [] = {"JOHN", "LOUIS", "AMANDA", "EKATERINA"};
            
/*             for (int x= 0; x < students.length; x++){
                System.out.println("The student on index x= " + x + " is " + students[x]);
            } */

            for(String student : students){
                System.out.println("The student's name is: " + student);
            }
    }
}
