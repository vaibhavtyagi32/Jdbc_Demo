import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr={2,4,6,8,10};
        int f=0;
        int l=arr.length-1;
        while(f<=l){
            int temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            f++;
            l--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
