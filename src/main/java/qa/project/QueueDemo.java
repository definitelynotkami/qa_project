package qa.project;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    private final Queue<String> queueDemo = new LinkedList<>();

    public void addElement(String element) {
        queueDemo.add(element);
    }

    public void removeElement(String element){
        queueDemo.remove(element);
    }

    public boolean searchElement(String element) {
        return queueDemo.contains(element);
    }

    public Queue<String> getQueueDemo() {
        return queueDemo;
    }
}


