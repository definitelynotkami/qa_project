package qa.project;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //ArrayList
        ArrayListDemo demoArray = new ArrayListDemo();

        demoArray.addElement("first");
        demoArray.addElement("second");
        demoArray.addElement("third");

        System.out.println("Поиск " + demoArray.searchElement("second"));

        for (String element: demoArray.getDemoArray()) {
            System.out.println(element);
        }

        //HashMap
        HashMapDemo demoHashMap = new HashMapDemo();

        demoHashMap.addElement(1, "first");
        demoHashMap.addElement(2, "second");
        demoHashMap.addElement(3, "third");

        System.out.println("Поиск " + demoHashMap.searchElement(2));

        for (Map.Entry<Integer, String> entry : demoHashMap.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

        //HashSet
        HashSetDemo set = new HashSetDemo();

        set.addElement("1");
        set.addElement("2");
        set.addElement("3");

        System.out.println("Поиск :" + set.searchElement("2"));

        for (String element: set.getDemoHashset()) {
            System.out.println(element);
        }

        //QueueDemo

        QueueDemo queue = new QueueDemo();

        queue.addElement("Очередь 1");
        queue.addElement("Очередь 2");
        queue.addElement("Очередь 3");

        System.out.println("Поиск :" + queue.searchElement("Очередь"));

        for(String element: queue.getQueueDemo()) {
            System.out.println(element);
        }

    }
}