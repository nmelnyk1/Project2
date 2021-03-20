package JavaRushGenerics;

import java.util.List;

public class Cat {

    public void voice() {
        System.out.println("Meow meow");
    }
// Upper bound wildcard

    public static void printCatList(List<? extends Cat> list) {
        for (Cat cat : list) {
            System.out.print(cat + " ");
        }
        System.out.println();

    }

    // Lower bound wildcard

    /*public static void printCatList(List<? super Cat> list) {
        for (Cat cat : list) {
            System.out.print(cat + " ");
        }
        System.out.println();

    }*/
}

