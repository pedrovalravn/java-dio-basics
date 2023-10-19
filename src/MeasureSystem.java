public class MeasureSystem {
    public static void main(String[] args) {
        String letter = "M";
/* 
        if(letter == "P")
            System.out.println("Small");
        else if(letter == "M")
            System.out.println("MEDIUM");
        else if(letter == "G")
            System.out.println("BIG");
        else
            System.out.println("Undefined."); */

        switch (letter){
            case "P":{
                System.out.println("Small");
                break;
            }
            case "M":{
                System.out.println("Medium");
                break;
            }
            case "G":{
                System.out.println("Big");
                break;
            }
            default:{
                System.out.println("Undefined.");
            }
        }
    }
}
