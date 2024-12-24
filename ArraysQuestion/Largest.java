package ArraysQuestion;

public class Largest {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,90,67,54,32,90};
        int l=arr[0];
        int sl=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            } else if(arr[i]<l && arr[i]>sl) {
                sl=arr[i];
            }
        }
        System.out.println("largest is "+l);
        System.out.println("second largest is "+sl);
    }
}
