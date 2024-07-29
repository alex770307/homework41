/**
 * Класс, представляющий видеотрек.
 */
public class Video implements Playable {
    @Override
    public void play() {
        System.out.println("Воспроизведение видео->\n");
    }

    @Override
    public void printInfo() {
        Playable.super.printInfo();
        System.out.println("Это видеотрек.");
    }
}
