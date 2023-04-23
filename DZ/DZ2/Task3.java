// Дана строка json:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//  {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//  {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//
// Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package JavaProject.DZ.DZ2;

        import java.io.FileNotFoundException;
        import java.io.FileReader;
        import java.util.Arrays;
        import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) throws FileNotFoundException {

//        String pathProject = System.getProperty("user.dir");
//        System.out.println(pathProject);
//        String pathFile = pathProject.concat("\\students_task3.txt");
//        System.out.println(pathFile);

        FileReader reader = new FileReader("students_task3.txt");
        Scanner scan = new Scanner(reader);
        String input = scan.nextLine();
        scan.close();
        System.out.println(input);

        input = input.substring(1, input.length() - 2);
        input = input.replace(":", ",").replaceAll("[{} \"]", "");
        System.out.println(input);

        String[] arrString = input.split(",");
        System.out.println(Arrays.toString(arrString));

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arrString.length; i += 6) {
            result.append(String.format("\nСтудент %s получил %s по предмету %s.",
                    arrString[i + 1], arrString[i + 3], arrString[i + 5]));
        }

        System.out.println(result);

    }
}
