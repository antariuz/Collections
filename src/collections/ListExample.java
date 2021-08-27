package collections;

import comparator.PersonNameComparator;
import model.Person;

import java.util.*;

public class ListExample {

    private static final Person person1 = new Person("Sponge", "Bob", 1);
    private static final Person person2 = new Person("Bob", "Marley", 2);
    private static final Person person3 = new Person("Patrick", "Star", 3);
    private static final Person person4 = new Person("Patrick", "Abba", 4);

    public static void arrayList() {
        List<Person> list = new ArrayList<>(4);
        list.add(person1);
        list.add(person2);
        list.add(person1);
        System.out.println("Is ArrayList empty? - " + list.isEmpty());
        System.out.println("ArrayList size: " + list.size());
        for (Person person : list) {
            System.out.println(person);
        }
        System.out.println(list.get(0).equals(list.get(1)));
        System.out.println(list.get(0).equals(list.get(2)));
        System.out.println(list.get(0).hashCode());
        System.out.println(list.get(1).hashCode());
        System.out.println(list.get(2).hashCode());

        list.remove(person2);
        System.out.println(list.remove(person2));
        for (Person person : list) {
            System.out.println(person);
        }
    }

    public static void linkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.addLast(2);
        linkedList.addFirst(1);
        System.out.println(linkedList);
        System.out.println(linkedList.offer(1));
        System.out.println(linkedList);
        LinkedList<Person> personLinkedList = new LinkedList<>();
        personLinkedList.add(person1);
        personLinkedList.add(person2);
        personLinkedList.add(person3);
        personLinkedList.add(person4);
        System.out.println(personLinkedList);
        personLinkedList.sort(new PersonNameComparator());
        System.out.println(personLinkedList);
    }

    public static void vector() {
        List<Person> vector = new Vector<>();
        vector.add(person1);
        vector.add(person2);
        vector.add(person3);
        vector.add(person4);
        for (Person person : vector) {
            System.out.println(person);
        }
    }

    public static void stack() {
        Stack<Person> stack = new Stack<>();
        stack.push(person1); //add
        stack.push(person2);
        stack.push(person3);
        stack.push(person4);
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.pop()); //take and through
        System.out.println(stack);
        System.out.println(stack.peek()); //show
    }


}
