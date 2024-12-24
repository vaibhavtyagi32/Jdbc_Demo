import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int []arr={1,5,3,2,4};
        int key=5;
        Arrays.sort(arr);
        int f=0;
        int l=arr.length-1;
        boolean c=false;
        while(f<=l){
            if(arr[f]+arr[l]==key){
                System.out.println("( "+arr[f]+" , "+arr[l]+" )");
                break;
            }else if(arr[f]+arr[l]>key){
                l--;
            }else{
                f++;
            }
        }
        if(c==false){
            System.out.println("key not found ");
        }

    }
}
