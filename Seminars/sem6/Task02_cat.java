/*
 * 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
 * а) информационной системой ветеринарной клиники
 * б) архивом выставки котов
 * в) информационной системой Театра кошек Ю. Д. Куклачёва
 * Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
package JavaProject.Seminars.sem6;
public class Task02_cat {
    public static void main(String[] args) {
        VetCat cat = new VetCat("Вася", "Мэй-Кун", null, null, null, null, 'M');

        cat.setName("Барсик");
        System.out.println(cat.getName());
        System.out.println(cat);
    }
}