package design.patterns.structural.adapter.challenge;

import design.patterns.structural.adapter.challenge.AdvancedMediaPlayer.AdvancedMediaPlayer;
import design.patterns.structural.adapter.challenge.MediaPlayer.MediaPlayer;

class AdvancedMediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String type, String name) {
        advancedMediaPlayer.loadFilename(name);
        advancedMediaPlayer.listen();
    }
}
