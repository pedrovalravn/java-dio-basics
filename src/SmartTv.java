public class SmartTv {
    boolean on= false;
    int channel = 1;
    int soundVolume = 25;

    public void switchChannel(int newChannel){
        channel = newChannel;
    }

    public void increaseChannel(){
        channel++;
    }

    public void decreaseChannel(){
        channel--;
    }


    public void increaseVolume(){
        System.out.println("Increasing volume to: " + soundVolume);
/*         soundVolume = soundVolume + 1; */
        soundVolume++;
    }

    public void decreaseVolume(){
        System.out.println("Decreasing volume to: " + soundVolume);
/*         soundVolume = soundVolume + 1; */
        soundVolume--;
    }

    public void turnOn(){
        on= true;
    }

    public void turnOff(){
        on= false;
    }
}
