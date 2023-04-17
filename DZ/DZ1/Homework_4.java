package JavaProject.DZ.DZ1;
/*
 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. 
 Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69. 
 Требуется восстановить выражение до верного равенства. 
 Предложить хотя бы одно решение или сообщить, что его нет.
*/


public class Homework_4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 63;
        int c = 63;
        int d = 5;
        int e = 6;
        int f = 9;
        
        int at;
        int bt;
        int ct;
        int dt;
        int et;
        int ft;
        boolean flag = false;

        
        for (int i = 0; i < 10; i++) {
            if (a == 63) at = i;
            else at = a;
            
            for (int j = 0; j < 10; j++) {
                if (b == 63) bt = j;
                else bt = b;
                for (int l = 0; l < 10; l++) {
                    if (c == 63) ct = l;
                    else ct = c;
                    for (int k = 0; k < 10; k++) {
                        if (d == 63) dt = k;
                        else dt = d;    
                        for (int n = 0; n < 10; n++) {
                            if (e == 63) et = n;
                            else et = e;                
                            for (int m = 0; m < 10; m++) {
                                if (f == 63) ft = m;
                                else ft = f;
                                
                                if (at * 10 + bt + ct * 10 + dt == et * 10 + ft) {
                                    while(!flag){
                                        System.out.printf("%d%d + %d%d = %d%d", at, bt, ct, dt, et, ft);
                                        flag = true;
                                    }
                                }

                            }
                        }
                    }
                }
            }
            if(!flag) {
                System.out.println("Решения нет");
            }
        }
    }
}