package design.patterns.structural.adapter.challenge;

import design.patterns.structural.adapter.challenge.AdvancedMediaPlayer.AdvancedMediaPlayer;
import design.patterns.structural.adapter.challenge.AdvancedMediaPlayer.Mp4Player;
import design.patterns.structural.adapter.challenge.AdvancedMediaPlayer.VlcPlayer;
import design.patterns.structural.adapter.challenge.MediaPlayer.AudioPlayer;
import design.patterns.structural.adapter.challenge.MediaPlayer.MediaPlayer;

public class Client {

    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "123.mp3");

        AdvancedMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer advanceMediaPlayerAdapter = new AdvancedMediaPlayerAdapter(mp4Player);
        advanceMediaPlayerAdapter.play("mp4", "video.mp4");

        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
        MediaPlayer advanceMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advanceMediaPlayerAdapter1.play("vlc", "vlc_video.vlc");

        audioPlayer.play("wmv", "wmv.wmv");
    }
}
