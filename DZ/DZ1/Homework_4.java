package JavaProject.DZ.DZ1;
/*
 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. 
 Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69. 
 Требуется восстановить выражение до верного равенства. 
 Предложить хотя бы одно решение или сообщить, что его нет.
*/

import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        char a = 1;
        char b = 63;
        char c = 63;
        char d = 5;
        char e = 6;
        char f = 9;

        if (a == 63) {
            for (int i = 0; i < 10; i++) {
                a = (char) i;
                if (b == 63) {
                    for (int j = 0; j < 10; j++) {
                        b = (char) j;
                        if (c == 63) {
                            for (int l = 0; l < 10; l++) {
                                c = (char) l;
                                if (d == 63) {
                                    for (int k = 0; k < 10; k++) {
                                        d = (char) k;
                                        if (e == 63) {
                                            for (int n = 0; n < 10; n++) {
                                                e = (char) n;
                                                if (f == 63) {
                                                    for (int m = 0; m < 10; m++) {
                                                        f = (char) m;
                                                        if (a * 10 + b + c * 10 + d == e * 10 + f) {
                                                            System.out.printf("%d%d + %d%d = %d%d", a, b, c, d, e, f);
                                                            
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}