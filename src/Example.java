import collections.ListExample;
import collections.MapExample;
import collections.QueueExample;
import collections.SetExample;

public class Example {
    public static void main(String[] args) {
        ListExample listExample = new ListExample();
        listExample.arrayList();
        listExample.linkedList();
        listExample.stack();
        listExample.vector();

        SetExample setExample = new SetExample();
        setExample.hashSetExample();
        setExample.linkedHashSetExample();
        setExample.treeSetExample();

        QueueExample queueExample = new QueueExample();
        queueExample.priorityQueue();

        MapExample mapExample = new MapExample();
        mapExample.hashMap();
        mapExample.linkedHashMap();
        mapExample.treeMap();


    }
}
