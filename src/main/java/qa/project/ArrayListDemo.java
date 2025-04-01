package qa.project;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    private List<String> demoArray = new ArrayList<>();

    public void addElement(String element) {
        demoArray.add(element);
    }

    public void removeElement(String element) {
        demoArray.remove(element);
    }

    public boolean searchElement(String element){
        return demoArray.contains(element);
    }

    public int length() {
        return demoArray.size();
    }

    public List<String> getDemoArray() {
        return demoArray;
    }


}
