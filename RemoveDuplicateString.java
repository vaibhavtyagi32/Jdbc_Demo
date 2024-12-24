import java.util.Set;
import java.util.HashSet;
public class RemoveDuplicateString {
    public static String removeduplicate(String str){
        Set<Character> set=new HashSet<>();
        StringBuffer sf=new StringBuffer();
        for(int i=0;i<str.length();i++){
            Character c=str.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                sf.append(c);
            }

        }
        return sf.toString();
    }
    public static void main(String[] args) {
        String str="java";
        System.out.println(removeduplicate(str));
    }
}
