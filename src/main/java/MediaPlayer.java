import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Класс медиаплеера для управления воспроизведением аудио и видео треков.
 */
public class MediaPlayer {
     private List<Playable> playList;

    public MediaPlayer() {
        playList = new ArrayList<>();
    }

    /**
     * Метод для добавления одного или нескольких треков в плейлист.
     *
     * @param tracks треки для добавления
     */
    public void addTracks(Playable... tracks) {
        for (Playable track : tracks) {
            playList.add(track);

        }
    }

    /**
     * Метод для запуска "очереди треков"
     * Запускает воспроизведение всех треков в плейлисте, выводя информацию о каждом треке.
     */
    public void playAll() {
        for (Playable track : playList) {
            track.printInfo();
            track.play();
        }
    }

    @Override
    public String toString() {
        return "MediaPlayer{" +
                "playList=" + playList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediaPlayer that = (MediaPlayer) o;
        return Objects.equals(playList, that.playList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(playList);
    }

    public List<Playable> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Playable> playList) {
        this.playList = playList;
    }
}
