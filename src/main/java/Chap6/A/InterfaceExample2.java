package Chap6.A;

public class InterfaceExample2 {
    public static void main(String[] args) {
        FishingGame play1 = new FishingGame("Nattapong");
        System.out.println("Player : "+play1.getName());
        play1.start();
        play1.stop();
        play1.save();
    }

}
