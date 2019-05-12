package design.patterns.structural.adapter.challenge.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

    String filename;

    @Override
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: " + this.filename);
    }
}
