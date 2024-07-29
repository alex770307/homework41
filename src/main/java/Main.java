/**
 * Главный класс приложения, который служит точкой входа.
 * Здесь создаются экземпляры медиаплеера и различных треков для демонстрации их функциональности.
 */
public class Main {
    public static void main(String[] args) {

        MediaPlayer firstMediaPlayer = new MediaPlayer();
        MediaPlayer secondMediaPlayer = new MediaPlayer();

        AudioTrack track1 = new AudioTrack();
        AudioTrack track2 = new AudioTrack();
        Video video1 = new Video();
        Video video2 = new Video();

        firstMediaPlayer.addTracks(track1, video1);
        firstMediaPlayer.playAll();

        secondMediaPlayer.addTracks(video2, track2);
        secondMediaPlayer.playAll();
    }
}
