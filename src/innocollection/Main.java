package innocollection;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        InnoArrayList<Integer> list = new InnoArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 18; i++) {
            list.add(random.nextInt(100));
        }

        if (!list.isEmpty()) {
            list.remove(0);
        }

        for (int number : list) {
            System.out.println(number);
        }
    }
}
