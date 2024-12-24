public class PalindromeString {
    public static boolean isPaindrome(String str){
        int f=0;
        int l=str.length()-1;
        while(f<=l){
            if(str.charAt(f)!=str.charAt(l)){
                return false;
            }
            f++;
            l--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="rar";
        boolean result=isPaindrome(s);
        if(result){
            System.out.println("string is palindrome");
        }else{
            System.out.println("string is not a palindrome");
        }
    }
}
