package design.patterns.structural.adapter.challenge.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String type, String name) {
        if ("mp3".equals(type)) {
            System.out.println("Playing song " + name + " in format: " + type);
        } else {
            System.out.println("Invalid media: " + type + " format not supported");
        }
    }
}
