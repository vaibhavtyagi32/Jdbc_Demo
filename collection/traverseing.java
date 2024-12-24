package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class traverseing {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("vaibhav");
        names.add("anshu");
        names.add("karan");
        names.add("aman");
        names.add("durgesh");

        // for each loop
        for(String str:names){
            System.out.print(str+"\t"+str.length()+"\t");
            StringBuffer sb=new StringBuffer(str);
            System.out.println(sb.reverse());
        }
        System.out.println("_________________________________________________");

        // traversing through iterator : forward traversing
        Iterator itr= names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("_________________________________________________");
        // traversing through listiterator : backward traversing
        ListIterator<String> litr = names.listIterator(names.size());
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        System.out.println("_________________________________________________");
        // forEach method
        names.forEach(e->{
            System.out.println(e);
        });
    }
}
