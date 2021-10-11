package mediaChallenge_3;

// aim: MediaPlayer should be able to play other formats in addition to AudioPlayer
// therefore, needs an Adaptor that adapts an AdvMediaPlayer to a MediaPlayer, thus AdvMediaPlayerAdapter

public interface IMediaPlayer {
    public void play(String audioType, String filename);
}

class AudioPlayer implements IMediaPlayer {

    @Override
    public void play(String audioType, String filename) {
        // can play mp3 format by default
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + filename + ".mp3");
        }
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
