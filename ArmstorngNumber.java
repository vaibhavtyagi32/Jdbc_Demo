import java.util.Scanner;

public class ArmstorngNumber {
    public static boolean isArmstrong(int n){
        int temp=n;
        int l=0;
        while(temp!=0){
            temp=temp/10;
            l++;
        }
        int arm=0;
        int on=n;
        while(n!=0){
            int ld=n%10;
            arm=arm+(int)Math.pow(ld,l);
            n=n/10;
        }
        return on==arm;
    }
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean result=isArmstrong(num);
        if(result){
            System.out.println(num+" is a armstrong number");
        }else{
            System.out.println(num+" is not a armstrong number");
        }
    }
}
