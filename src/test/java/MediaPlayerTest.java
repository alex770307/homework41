import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediaPlayerTest {

    @Test
    void addTracks_addInOrder_success() {

        MediaPlayer mediaPlayer = new MediaPlayer();
        AudioTrack audioTrack = new AudioTrack();
        Video video = new Video();

        mediaPlayer.addTracks(audioTrack,video);

        assertEquals(2, mediaPlayer.getPlayList().size());
        assertNotNull(mediaPlayer);

    }

    @Test
    void playAll_playOk_success() {

        MediaPlayer mediaPlayer = new MediaPlayer();
        AudioTrack audioTrack = new AudioTrack();
        Video video = new Video();

        mediaPlayer.addTracks(audioTrack,video);
        mediaPlayer.playAll();
    }
}