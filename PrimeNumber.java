import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean result=isPrime(num);
        if(result){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
    }
}
