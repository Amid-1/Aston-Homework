package innocollection;



public class InnoArrayList implements InnoList {

    // максимальное количество элементов
    private static final int DEFAULT_CAPACITY = 10;

    // массив для хранения элементов
    private int[] elements = new int[DEFAULT_CAPACITY];

    // количество элементов
    private int count;

    // конструктор класса InnoArrayList с заданным количеством элементов
    // по умолчанию DEFAULT_CAPACITY
    public InnoArrayList() {
        this.elements = new int[DEFAULT_CAPACITY];
        this.count = 0;
    }

    @Override
    public void add(int element) {
        // если список переполнен
        if (count == elements.length) {
            resize();
        }
        elements[count++] = element;
    }

    private void resize() {
        // создаем новый массив в полтора раза больше
        int[] newElements = new int[elements.length + elements.length / 2];

        // копируем все элементы из старого массива в новый
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        // устанавливаем ссылку на новый массив в поле elements класса InnoArrayList списка
        // и увеличиваем количество элементов в списке по 1 элементу
        elements = newElements;
    }

    @Override
    public void addAll(int[] elements) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void isEmpty() {

    }

    // TODO: реализовать метод
    @Override
    public void remove(int element) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (elements[i] == element) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                elements[i] = elements[i + 1];
            }
            count--;
        }
    }

    public void sort() {
        if (count > 1) {
            quickSort(elements, 0, count - 1);
        }
        }

    @Override
    public boolean contains(int element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    // Метод быстрой сортировки (quick sort)
    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Определяем индекс опорного элемента
            int pivotIndex = partition(array, low, high);
            // Рекурсивно сортируем левую и правую части
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
    }
    }

    private int partition(int[] array, int low, int high) {
        // Выбираем опорный элемент (pivot) — здесь берём последний элемент
        int pivot = array[high];
        int i = low - 1;
        // Переставляем элементы массива так, чтобы меньшие оказались слева, а большие справа
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        // Перемещаем опорный элемент на его правильное место
        swap(array, i + 1, high);
        return i + 1;  // Возвращаем индекс опорного элемента
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /*
    @Override
    public void sort() {
        if (count > 1) {
            mergSort(elements, 0, count - 1);
        }
    }

    private void mergSort(int[] elements, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2; // середина списка
            mergSort(elements, left, middle); // сортировка левой половины списка
            mergSort(elements, middle + 1, right); // сортировка правой половины списка
            merge(elements, left, middle, right); // слияние сортированных списков в один список
        }
    }

    private void merge(int[] elements, int left, int middle, int right) {
        int leftSize = middle - left + 1; // размер левой половины списка
        int rightSize = right - middle; // размер правой половины списка
        int[] leftArray = new int[leftSize]; // левая половина списка
        int[] rightArray = new int[rightSize]; // правая половина списка
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = elements[left + i]; // заполнение левой половины списка
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = elements[middle + 1 + i]; // заполнение правой половины списка
        }
        int i = 0, j = 0, k = left; // i - индекс левой половины списка, j - индекс правой половины списка и k - индекс слиянного списка
        while (i < leftSize && j < rightSize) { // слияние сортированных списков в один список по возрастанию
            if (leftArray[i] <= rightArray[j]) { // если элемент левой половины списка меньше или равен элементу правой половины списка
                elements[k++] = leftArray[i++]; // добавляем элемент левой половины списка в слиянный список
            } else {
                elements[k++] = rightArray[j++]; // добавляем элемент правой половины списка в слиянный список
            }
        }
        while (i < leftSize) { // добавление оставшихся элементов левой половины списка
            elements[k++] = leftArray[i++]; // добавляем элемент левой половины списка в слиянный список
        }
        while (j < rightSize) { // добавление оставшихся элементов правой половины списка
            elements[k++] = rightArray[j++]; // добавляем элемент правой половины списка в слиянный список
        }
    }

    @Override
    public boolean contains(int element) {
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public int get(int index) {
        if (index >= 0 && index < count) {
            return elements[index];
        } else {
            return -1;
        }

    }

     */

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public void insert(int index, int element) {

    }

}