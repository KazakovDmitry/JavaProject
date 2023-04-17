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
        int a = 1;
        int b = 63;
        int c = 63;
        int d = 5;
        int e = 6;
        int f = 9;
        int res = 0;

        
        for (int i = 0; i < 10; i++) {
            if (a == 63) a = i;
            
            for (int j = 0; j < 10; j++) {
                if (b == 63) b = j;
                    
                for (int l = 0; l < 10; l++) {
                    if (c == 63) c = l;
                            
                    for (int k = 0; k < 10; k++) {
                        if (d == 63) d = k;
                                    
                        // for (int n = 0; n < 10; n++) {
                        //     if (e == 63) e = n;
                                            
                        //     for (int m = 0; m < 10; m++) {
                        //         if (f == 63) f = m;
                                res = a * 10 + b + c * 10 + d;
                                
                                if (a * 10 + b + c * 10 + d == e * 10 + f) {
                                    System.out.printf("%d%d + %d%d = %d%d", a, b, c, d, e, f);
                            //     }

                            // }
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }
}