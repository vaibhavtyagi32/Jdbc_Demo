package ArraysQuestion;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7};
        int l=arr.length+1;
        int expectedSum=(l*(l+1))/2;
        int actualSum=0;
        for(int i:arr){
            actualSum +=i;
        }
        System.out.println("missing number is "+(expectedSum-actualSum));
    }
}
