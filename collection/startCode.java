package collection;
import java.util.*;
public class startCode {
    public static void main(String[] args) {
        System.out.println("hello collection");
        /*
            creating collection
            1: type safe = same type of objet(element) are added to collection
            2: un type safe = different type of element can be added to collection
         */

        // type safe collection
        ArrayList<Integer> names=new ArrayList<>();
        names.add(1);
        names.add(2);
        names.add(3);
        names.add(4);
        names.add(1);
        System.out.println(names);
        // get element
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        // remove element
        names.remove(2);
        System.out.println(names);
        // size
        System.out.println("size ="+names.size());
        // check element are present or not
        System.out.println(names.contains(1));
        // check for empty
        System.out.println(names.isEmpty());
        // setting value..
        names.set(1,8);
        System.out.println(names);
        // remove all elements
//        names.clear();
//        System.out.println(names);

        Vector vector=new Vector();
        vector.addAll(names);
        System.out.println("Vector "+vector);



        //un type safe
//        LinkedList ll=new LinkedList();
//        ll.add("vaibhva");
//        ll.add(1);
//        ll.add("tyagi");
//        ll.add(true);
//        System.out.println(ll);

        System.out.println("______________________________________________________");
        HashSet<Double> nms=new HashSet<>();
        nms.add(14.66);
        nms.add(34.86621);
        nms.add(99.646);
        nms.add(14.66);
        System.out.println(nms);

        TreeSet<Double> ts=new TreeSet<>();
        ts.add(23.6622);
        ts.add(132.726);
        ts.add(12.562);
        ts.add(132.726);
        System.out.println(ts);

    }
}
