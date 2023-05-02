//Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

package JavaProject.DZ.DZ5;

import java.util.*;


public class Task1 {
    public static void main(String[] args) {
        Map<String, List<Integer>> phonebook = new HashMap<>();

        phonebook.put("Иванов", Arrays.asList(123, 89871234));
        phonebook.put("Петров", Arrays.asList(456));
        phonebook.put("Сидоров", Arrays.asList(789, 8917789));
        phonebook.putIfAbsent("Котятина", Arrays.asList(456));
        phonebook.putIfAbsent("Сидоров", Arrays.asList(369, 8917369));
//        phonebook.put("Иванов", phonebook.get("Иванов").add(Arrays.asList(258)));
        List<Integer> test = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> pair : phonebook.entrySet()) {
            if(pair.getKey().equals("Иванов")) pair.getValue().add(258);

        }
//        test.add(phonebook.get("Иванов"));
        test.add(258);
        System.out.println(test);
        System.out.println(test.getClass());

        System.out.println(phonebook);
    }
}
