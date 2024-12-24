import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char []c1= s1.toCharArray();
        char []c2= s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st string ");
        String s1=sc.next();
        System.out.println("enter 2nd string ");
        String s2=sc.next();
        boolean result=isAnagram(s1,s2);
        if(result){
            System.out.println(s1+" and "+s2+" are anagarm string");
        }else{
            System.out.println(s1+" and "+s2+" are not a anagarm string");
        }
    }
}
