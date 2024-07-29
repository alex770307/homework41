/**
 * Интерфейс для элементов, которые могут воспроизводиться.
 */
public interface Playable {
    /**
     * Запускает воспроизведение элемента.
     */
    void play();

    /**
     * Выводит информацию о элементе, который может быть воспроизведен.
     */
    default void printInfo() {
        System.out.println("Запускаемый файл.");
    }
}
