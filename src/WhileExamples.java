import java.util.concurrent.ThreadLocalRandom;
public class WhileExamples {
    public static void main(String[] args) {
        double allowance = 50.0;

        while(allowance > 0){
            Double bubblegumPrice = randomValue();

            if(bubblegumPrice > allowance)
                bubblegumPrice = allowance;

            System.out.println("Bubblegum price: " + bubblegumPrice + " added to cart");allowance = allowance - bubblegumPrice;
        }
        System.out.println("Current allowance: " + allowance);
        System.out.println("Little John spent all his allowance with sweets.");
    }
    private static double randomValue(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
