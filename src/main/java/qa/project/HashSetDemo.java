package qa.project;

import java.util.HashSet;

public class HashSetDemo {

    private HashSet<String> demoHashset = new HashSet<>();

    public void addElement(String element) {
        demoHashset.add(element);
    }

    public void removeElement(String element) {
        demoHashset.remove(element);
    }

    public boolean searchElement(String element) {
        return demoHashset.contains(element);
    }

    public HashSet<String> getDemoHashset() {
        return demoHashset;
    }
}
