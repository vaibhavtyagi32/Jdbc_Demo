import java.util.Arrays;

public class MedianOfArray {
    public static double findMedian(int []arr){
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2!=0){
            return arr[n/2];
        }else{
            return (arr[n/2-1]+arr[n/2])/2.0;
        }
    }
    public static void main(String[] args) {
        int []arr1={10,20,30,40,50};
        int []arr2={1,6,5,4,3,2};
        System.out.println(findMedian(arr1));
        System.out.println(findMedian(arr2));
    }
}
