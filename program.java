package JavaProject;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        int a = 123;
        int b = --a;
        System.out.println(a);
        int c = a--;
        a = --a - a--;
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
    }
    
}