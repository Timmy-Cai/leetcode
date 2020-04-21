package helloworld;

import java.util.Random;

public class Rand {
    // [1,5]
    public static int rand5() {
        return new Random().nextInt(5) + 1;
    }

    // [1,7]
    public static int rand7() {
        // [0 5 10 15 20] + [1 2 3 4 5]
        // [1,25] -> [1,21] -> [0,6] -> [1,7]
        int rand;
        do {
            rand = (rand5() - 1) * 5 + rand5();
        } while (rand > 21);
        return rand % 7 + 1;
    }

    // [1,10]
    public static int rand10() {
        // [0 7 14 21 28 35 42] + [1 2 3 4 5 6 7]
        // [1,49] -> [1,40] -> [0,9] -> [1,10]
        int rand;
        do {
            rand = (rand7() - 1) * 7 + rand7();
        } while (rand > 40);
        return rand % 10 + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) System.out.println(rand7());
        for (int i = 0; i < 10; i++) System.out.println(rand10());
    }
}
