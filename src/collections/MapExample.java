package collections;

import model.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    private static final Person person1 = new Person("Sponge", "Bob", 1);
    private static final Person person2 = new Person("Bob", "Marley", 2);
    private static final Person person3 = new Person("Patrick", "Star", 3);
    private static final Person person4 = new Person("Patrick", "Abba", 4);

    public static void hashMap() {
        Map<Integer, Person> hashmap = new HashMap<>();
        hashmap.put(4, person1);
        hashmap.put(2, person2);
        hashmap.put(3, person3);
        hashmap.put(1, person4);
        System.out.println(hashmap);
        System.out.println(hashmap.get(1));
        hashmap.remove(1);
        System.out.println(hashmap);
        for (Map.Entry<Integer, Person> entry : hashmap.entrySet()){
            System.out.println(entry);
        }
    }

    public static void linkedHashMap(){
        Map<Integer, Person> hashmap = new LinkedHashMap<>();
        hashmap.put(4, person1);
        hashmap.put(2, person2);
        hashmap.put(3, person3);
        hashmap.put(1, person4);
        System.out.println(hashmap);
        System.out.println(hashmap.get(1));
        hashmap.remove(1);
        System.out.println(hashmap);
        for (Map.Entry<Integer, Person> entry : hashmap.entrySet()){
            System.out.println(entry);
        }
    }

    public static void treeMap(){
        TreeMap<Integer, Person> hashmap = new TreeMap<>();
        hashmap.put(4, person1);
        hashmap.put(2, person2);
        hashmap.put(3, person3);
        hashmap.put(1, person4);
        System.out.println(hashmap);
        System.out.println(hashmap.get(1));
        hashmap.remove(1);
        System.out.println(hashmap);
        for (Map.Entry<Integer, Person> entry : hashmap.entrySet()){
            System.out.println(entry);
        }
    }

}
