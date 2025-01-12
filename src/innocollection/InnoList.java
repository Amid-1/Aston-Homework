package innocollection;

/**
 * 10.01.2025
 */

// Список - это коллекция, которая подразумевает порядок элементов
public interface InnoList extends InnoCollection {

    /**
     * Получение элемента по индексу
     * @param index индекс элемента
     * @return элемент, -1 если вышли за границу
     */
    int get(int index);

    /**
     * Замена элемента в определенном индексе
     * @param index куда хотим вставить элемент
     * @return заменяемый элемент
     */
    void insert (int index, int element);
}



