package design.patterns.structural.adapter.challenge.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

    String filename;

    @Override
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. Name: " + this.filename);
    }
}
