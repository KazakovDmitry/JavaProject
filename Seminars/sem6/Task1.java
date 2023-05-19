//1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24.
//2. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите
// процент уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package JavaProject.Seminars.sem6;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = fillArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(findRatioUnique(arr));
    }

    private static int[] fillArray() {
        int[] array = new int[1000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }
        return array;
    }

    private static float findRatioUnique(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int item : array) {
            set.add(item);
        }
        return set.size() * 100f / array.length;
    }
}
