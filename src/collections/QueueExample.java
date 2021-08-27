package collections;

import model.Person;

import java.util.PriorityQueue;

public class QueueExample {

    private static final Person person1 = new Person("Sponge", "Bob", 1);
    private static final Person person2 = new Person("Bob", "Marley", 2);
    private static final Person person3 = new Person("Patrick", "Star", 3);
    private static final Person person4 = new Person("Patrick", "Abba", 4);

    public static void priorityQueue() {
        java.util.Queue<Person> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(person1);
        System.out.println(priorityQueue);
    }

}
