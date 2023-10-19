public class UserSmartTv {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

            smartTv.decreaseVolume();
            smartTv.decreaseVolume();
            smartTv.decreaseVolume();
            smartTv.increaseVolume();

            smartTv.switchChannel(15);
            System.out.println("Current channel: " + smartTv.channel);
            
            System.out.println("Is the TV on? " + smartTv.on);
            System.out.println("Current sound volume: " + smartTv.soundVolume);

            smartTv.turnOn();
            System.out.println("New Status -> TV On ? " + smartTv.on);

    }
}
