package JavaProject;

import java.util.Scanner;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        boolean flag = false;
        // while (flag == false) {
            System.out.printf("Введите число: ");
            flag = iScanner.hasNextInt();
            System.out.println(flag);
        // }
        int a = iScanner.nextInt();
        int b = --a;
        System.out.println(a);
        int c = a--;
        a = --a - a--;
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        iScanner.close();
    }
    
}