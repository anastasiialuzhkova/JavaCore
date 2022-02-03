import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("\nTask 1");
        String[] arr = new String[] {"юзер", "чайник", "ламер", "программер", "копирайт", "геймер", "читер",
            "хакер", "апгрейд", "релиз", "ассемблер", "чайник", "копирайт", "читер", "читер"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String str: arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        System.out.println("Уникальные слова: " + map.keySet());
        System.out.println("Слова и количества: " + map);

        // Task 2
        System.out.println("\nTask 2");
        PhoneBook book = new PhoneBook();
        book.add("Иванов", "12345");
        book.add("Петров", "67890");
        book.add("Иванов", "11001");
        System.out.println(book.get("Иванов"));
        System.out.println(book.get("Петров"));
        System.out.println(book.get("Сидоров"));
    }
}