package innocollection;

import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        InnoArrayList<Integer> list = new InnoArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 18; i++) {
            list.add(random.nextInt(100)); // Числа от 0 до 99
        }

        System.out.println("Перед сортировкой:");
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Удаление первого элемента, если список не пуст
        if (!list.isEmpty()) {
            list.remove(0);
        }

        // Сортировка списка с использованием mergeSort
        System.out.println("\nSorting with mergeSort:");
        list.sort(Comparator.naturalOrder());
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Сортировка списка с использованием quickSort
        System.out.println("\nSorting with quickSort:");
        list.sortUsingQuickSort(Comparator.naturalOrder());
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
