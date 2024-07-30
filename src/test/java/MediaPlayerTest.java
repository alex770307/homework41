import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediaPlayerTest {

    @Test
    void addTracks_addInOrder_success() {

        MediaPlayer mediaPlayer = new MediaPlayer();
        AudioTrack audioTrack = new AudioTrack("ABBA");
        Video video = new Video("КВН");

        mediaPlayer.addTracks(audioTrack, video);

        assertTrue(mediaPlayer.getPlayList().contains(audioTrack));
        assertTrue(mediaPlayer.getPlayList().contains(video));
        assertEquals(2, mediaPlayer.getPlayList().size());
        assertEquals("ABBA",audioTrack.getName());
        assertEquals("КВН",video.getName());
        assertNotNull(mediaPlayer);
        assertNotNull(audioTrack);
        assertNotNull(video);
    }

    @Test
    void addTracks_addNullTrack_throwException_success() {

        MediaPlayer mediaPlayer = new MediaPlayer();

        assertThrows(NullPointerException.class, () -> mediaPlayer.addTracks(null));
    }


    @Test
    @Disabled("Этот тест еще не готов")
    void playAll_playOk_success() {

        MediaPlayer mediaPlayer = new MediaPlayer();
        AudioTrack audioTrack = new AudioTrack();
        Video video = new Video();

        mediaPlayer.addTracks(audioTrack,video);
        mediaPlayer.playAll();
    }
}