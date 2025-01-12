package innocollection;

/**
 * 10.01.2025
 */

// Коллекция - контейнер для хранения элементов.
public interface InnoCollection {
    /**
     * Добавляет элемент в коллекцию
     * @param element добавляемый элемент
     */
    void add(int element);

    void addAll(int[] elements);

    void clear();

    void isEmpty();


    /**
     * Удаляет элемент из коллекции
     * @param element удаляемый элемент
     */
    void remove(int element);

    void sort();

    /**
     * Проверяет наличие элемента в коллекции
     * @param element проверяемый элемент
     * @return true, если элемент есть в коллекции. false в противном случае
     */
    boolean contains(int element);

    /**
     * Количество элементов в коллекции
     * @return значение, равное количеству элементов
     */
    int size();
}
