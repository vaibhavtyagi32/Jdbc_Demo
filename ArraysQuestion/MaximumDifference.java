package ArraysQuestion;

public class MaximumDifference {
    public static void main(String[] args) {
        int arr[]={5,6,7,2,90,70};
        int max=arr[0];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("maximum difference is "+(max-min));
    }
}
