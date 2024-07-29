/**
 * Класс, представляющий аудиотрек.
 */
public class AudioTrack implements Playable {
    @Override
    public void play() {
        System.out.println("Воспроизведение аудиотрека->\n");
    }

    @Override
    public void printInfo() {
        Playable.super.printInfo();
        System.out.println("Это аудиотрек.");
    }
}
