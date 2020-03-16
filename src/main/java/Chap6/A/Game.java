package Chap6.A;

public interface Game {

    public static final int level = 3;

    public void start();

    public void pause();

    public void toContinue();

    public void stop();

    public void play();

}

abstract class TicTacTocAbs implements Game {

    @Override
    public void start() {
        System.out.println("TicTacToc : start()");
    }

    @Override
    public void pause() {
        System.out.println("TicTacToc : pause()");

    }

    @Override
    public void play() {
        System.out.println("TicTacToc : play()");

    }

}

class TicTacToe extends TicTacTocAbs {

    @Override
    public void toContinue() {
        System.out.println("TicTacToc : toContinue()");
    }

    @Override
    public void stop() {
        System.out.println("TicTacToc : stop()");
    }

}
