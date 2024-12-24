package ArraysQuestion;


import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,2,1,3};
        Set<Integer> nonDuplicates=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();
        for(int ob:arr){
            if(!nonDuplicates.contains(ob)){
                nonDuplicates.add(ob);
            }else{
                duplicates.add(ob);
            }
        }
        System.out.println("duplicates elements are "+duplicates);
    }
}
