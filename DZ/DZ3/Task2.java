// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package DZ.DZ3;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}
