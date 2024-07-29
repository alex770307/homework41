/**
 * Главный класс приложения, который служит точкой входа.
 * Здесь создаются экземпляры медиаплеера и различных треков для демонстрации их функциональности.
 */
public class Main {
    public static void main(String[] args) {

        MediaPlayer mediaPlayerFirst = new MediaPlayer();
        MediaPlayer mediaPlayerSecond = new MediaPlayer();

        AudioTrack track1 = new AudioTrack();
        AudioTrack track2 = new AudioTrack();
        Video video1 = new Video();
        Video video2 = new Video();

        mediaPlayerFirst.addTracks(track1, video1);
        mediaPlayerFirst.playAll();

        mediaPlayerSecond.addTracks(video2, track2);
        mediaPlayerSecond.playAll();
    }
}
