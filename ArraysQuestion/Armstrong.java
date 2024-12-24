package ArraysQuestion;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int temp=n;
        int digit=0;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        int sum=0;
        int num=n;
        while(n>0){
            int t=n%10;
            sum=sum+(int)(Math.pow(t,digit));
            n=n/10;
        }
        if(num==sum){
            System.out.println("armstrong "+sum);
        }
        else{
            System.out.println("not armstrng "+sum);
        }
    }
}
