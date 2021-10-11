package mediaChallenge_3;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        System.out.println("****** Adopter Patter Demo ******");

        IAdvancedMediaPlayer mp4Player = new Mp4Player();
        IAdvancedMediaPlayer vlcPlayer = new VlcPlayer();
        IMediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Focus");

        AdvancedMediaPlayerAdapter ampa = new AdvancedMediaPlayerAdapter(mp4Player);
        ampa.play("mp4", "Squid Game");

        ampa = new AdvancedMediaPlayerAdapter(vlcPlayer);
        ampa.play("vlc", "The Walking Dead");

        audioPlayer.play("mp4", "Godly");

    }
}
