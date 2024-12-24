public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,21,45,6,7};
        System.out.println("before swapping");
        for(int i:arr){
            System.out.print(i+" ");
        }
        bubbleSort(arr);
        System.out.println();
        System.out.println("after swapping");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
