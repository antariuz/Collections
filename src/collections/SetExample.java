package collections;

import comparator.PersonNameComparator;
import comparator.PersonSurnameComparator;
import model.Person;

import java.util.*;

public class SetExample {

    private static final Person person1 = new Person("Sponge", "Bob", 1);
    private static final Person person2 = new Person("Bob", "Marley", 2);
    private static final Person person3 = new Person("Patrick", "Star", 3);
    private static final Person person4 = new Person("Patrick", "Abba", 4);

    public static void hashSetExample() {
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.print("HashSet: \n" + set + "--->");
        set.add(1);
        System.out.println(set);
        Iterator<Integer> string = set.iterator();
        while (string.hasNext()) {
            System.out.print(string.next() + " ");
        }
    }

    public static void linkedHashSetExample() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set.spliterator());
        System.out.print("LinkedHashSet: ");
        for (Integer treeSet : set) {
            System.out.print(treeSet + " ");
        }
        System.out.println(set.contains(1));
    }

    public static void treeSetExample() {
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.print("TreeSet: ");
        for (Integer treeSet : set) {
            System.out.print(treeSet + " ");
        }
        Comparator<Person> myComparator = new PersonNameComparator().thenComparing(new PersonSurnameComparator());
        TreeSet<Person> personTreeSet = new TreeSet<>(myComparator);
        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3);
        personTreeSet.add(person4);
        System.out.println("\n" + personTreeSet);

    }

}
