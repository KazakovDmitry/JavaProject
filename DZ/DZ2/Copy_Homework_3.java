/*
3. Реализовать простой калькулятор
*/

package JavaProject.DZ.DZ2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Copy_Homework_3 {
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
        int res = 0;


        switch (operator) {
            case "+":
                res = a+b;
                break;

            case "-":
                res = a-b;
                break;

            case "*":
                res = a*b;
                break;

            case "/":
                if (b == 0) {
                    System.out.println("На ноль делить нельзя!");
                    logger.info("Выполнено с ошибкой");
                }
                else {
                    res = a/b;
                }
                break;

       }

       System.out.printf("%d %s %d = %d\n", a, operator, b, res);
       logger.info(String.format("%d %s %d = %d\n", a, operator, b, res));
    }
}
