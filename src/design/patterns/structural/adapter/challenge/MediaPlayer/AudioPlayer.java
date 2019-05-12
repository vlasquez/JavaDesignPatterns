package design.patterns.structural.adapter.challenge.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String type, String name) {

        switch (type) {
            case "mp3":
                System.out.println("Playing song " + name + " in format: " + type);
                break;
            default:
                System.out.println("Invalid media: " + type + " format not supported");
        }
    }
}
