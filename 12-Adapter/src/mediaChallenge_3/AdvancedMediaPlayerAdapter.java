package mediaChallenge_3;

public class AdvancedMediaPlayerAdapter implements IMediaPlayer {
    // from the name of the class, AdvMediaPlayer will be adapted to the default MediaAdaptor

    IAdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(IAdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        advancedMediaPlayer.loadFilename(filename);
        advancedMediaPlayer.listen();
    }
}
