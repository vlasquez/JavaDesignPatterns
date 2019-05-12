package design.patterns.structural.adapter.challenge;

import design.patterns.structural.adapter.challenge.AdvancedMediaPlayer.AdvancedMediaPlayer;
import design.patterns.structural.adapter.challenge.MediaPlayer.MediaPlayer;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String type, String name) {
        advancedMediaPlayer.loadFilename(name);
        advancedMediaPlayer.listen();
    }
}
