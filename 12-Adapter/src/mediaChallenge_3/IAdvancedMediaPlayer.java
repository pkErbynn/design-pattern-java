package mediaChallenge_3;

public interface IAdvancedMediaPlayer {
    public void loadFilename(String filename);
    public void listen();
}

class VlcPlayer implements IAdvancedMediaPlayer {
    public String filename;

    @Override
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: " + this.filename);
    }
}

class Mp4Player implements IAdvancedMediaPlayer {

    public String filename;

    @Override
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. Name: " + this.filename);
    }
}
