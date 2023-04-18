/*
3. Реализовать простой калькулятор
*/

package JavaProject.DZ.DZ1;
import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
		System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите оператор (+, -, *, /): ");
        String operator = iScanner.next();
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        iScanner.close();

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
                }
                else {
                    System.out.printf("%d / %d = %d\n", a, b, a/b);
                }
                break;
        
       } 
    }
}
