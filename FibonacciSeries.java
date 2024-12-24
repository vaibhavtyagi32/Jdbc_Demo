public class FibonacciSeries {
    public static void fibo(int n){
        int a=-1;
        int b=1;
        for(int i=0;i<n;i++){
            int temp=a+b;
            a=b;
            b=temp;
            System.out.print(temp+" , ");

        }
    }
    public static void main(String[] args) {
        fibo(10);
    }
}
