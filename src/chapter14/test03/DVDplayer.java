package chapter14.test03;

public class DVDplayer implements ExPlayer {
    @Override
    public void slow() {
        System.out.println("DVD慢放开始！");
    }

    @Override
    public void play() {
        System.out.println("DVD播放开始！");
    }

    @Override
    public void stop() {
        System.out.println("DVD播放结束！");
    }
}
