package Chap6.A;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }
    

    public String getName() {
        return name;
    }

}

class FishingGame extends Player implements Game, Score {

    public FishingGame(String name) {
        super(name);
    }
    

    @Override
    public void start() {
        System.out.println("FishingGame : start()");
    }

    @Override
    public void pause() {
        System.out.println("FishingGame : pause()");
    }

    @Override
    public void toContinue() {
        System.out.println("FishingGame : toContinue()");
    }

    @Override
    public void stop() {
        System.out.println("FishingGame : stop()");
    }

    @Override
    public void play() {
        System.out.println("FishingGame : play()");
    }

    @Override
    public void computer() {
        System.out.println("FishingGame : computer()");
    }

    @Override
    public void save() {
        System.out.println("FishingGame : save()");
    }

}
