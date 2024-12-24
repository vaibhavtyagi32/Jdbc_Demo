import java.util.Arrays;

public class MoveNegativeInStart {
    public static void move(int []arr){
        int []newArr=new int[arr.length];
        int k=0;
        for(int i:arr){
            if(i<0){
                newArr[k]=i;
                k++;
            }
        }
        for(int n:arr){
            if(n>0){
                newArr[k]=n;
                k++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
    public static void main(String[] args) {
        int []arr={2,-10,5,-29,65,83,-30};
        System.out.println(Arrays.toString(arr));
        move(arr);


    }
}
