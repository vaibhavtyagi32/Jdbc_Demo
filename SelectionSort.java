public class SelectionSort {
    public static  void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={62,34,76,243,63,87};
        System.out.println("before swapping");
        for(int i:arr){
            System.out.print(i+" ");
        }
        selectionSort(arr);
        System.out.println();
        System.out.println("after swapping");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
