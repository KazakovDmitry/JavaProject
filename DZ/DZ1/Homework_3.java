/*
3. Реализовать простой калькулятор
*/

package JavaProject.DZ.DZ1;
import JavaProject.DZ.DZ2.Task2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Homework_3 {
    public static void main(String[] args) throws IOException {
        Scanner iScanner = new Scanner(System.in);
		System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите оператор (+, -, *, /): ");
        String operator = iScanner.next();
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        iScanner.close();

        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler info = new FileHandler("log.txt");
        logger.addHandler(info);


        switch (operator) {
            case "+":
                System.out.printf("%d + %d = %d\n", a, b, a+b);
                break;

            case "-":
                System.out.printf("%d - %d = %d\n", a, b, a-b);
                break;

            case "*":
                System.out.printf("%d * %d = %d\n", a, b, a*b);
                break;

            case "/":
                if (b == 0) {
                    System.out.println("На ноль делить нельзя!");
                    logger.info("Выполнено с ошибкой");
                }
                else {
                    System.out.printf("%d / %d = %d\n", a, b, a/b);
                }
                break;

       }
       logger.info("Задание выполнено");
    }
}
