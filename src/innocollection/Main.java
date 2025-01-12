package innocollection;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        InnoList list = new InnoArrayList();
        Random random = new Random();
        for (int i = 0; i < 18; i++) {
            list.add(random.nextInt(100));
        }
        list.remove(0);
    }
}
