package ArraysQuestion;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateInArray {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        boolean p=true;
        Set<Integer> duplicates=new HashSet<>();
        for(int ob:arr){
            if(!duplicates.contains(ob)){
                duplicates.add(ob);
            }
            else{
                p=false;
                break;
            }
        }
        if(p){
            System.out.println("array doesnt contain duplicate item");
        }else{
            System.out.println("array contain duplicate item");
        }
    }
}
