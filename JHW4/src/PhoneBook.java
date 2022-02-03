import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> map;

    PhoneBook(){
        map = new HashMap<>();
    }

    public void add(String name, String number) {
        map.putIfAbsent(name, new HashSet<>());
        map.get(name).add(number);
    }

    public HashSet<String> get(String name) {
        return map.getOrDefault(name, new HashSet<>());
    }
}
