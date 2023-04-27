/*
 Пусть дан LinkedList с несколькими элементами.
 Реализуйте метод, который вернет “перевернутый” список
 */

package JavaProject.DZ.DZ4;

import java.util.Arrays;
import java.util.LinkedList;

public class Homework_1 {
    public static void main(String[] args) {

        LinkedList<String> startList = new LinkedList<>(Arrays.asList("1", "2", "3", "a", "b", "c"));

        for (int i = startList.size() - 1; i >= 0; i--) {
            System.out.printf("%s, ", startList.get(i));
        }

    }
}
