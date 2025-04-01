package qa.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    private final HashMap<Integer, String> hashMapDemo = new HashMap<>();

    public void addElement(int key, String value) {
        hashMapDemo.put(key, value);
    }

    public void removeElement(int key, String value) {
        hashMapDemo.remove(key, value);
    }

    public boolean searchElement(int key) {
        return hashMapDemo.containsKey(key);
    }

    public Set<Map.Entry<Integer, String>> entrySet() {
        return hashMapDemo.entrySet();
    }
}
