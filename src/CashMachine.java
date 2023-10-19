public class CashMachine {

    public static void main (String[] args){

        double currentBalance = 2.0;
        double valueRequested = 17.0;

            if(valueRequested < currentBalance){
                currentBalance = currentBalance - valueRequested;
                
                System.out.println("New balance: " + currentBalance);

            } else 

                System.out.println("Insuficient balance.");
     }      
}
