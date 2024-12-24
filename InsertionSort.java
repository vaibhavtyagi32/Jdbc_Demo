public class InsertionSort {
    public static void insertionSort(int arr[]){
        for (int i=1;i<arr.length;i++)
        {
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0 && curr<arr[prev]){
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[]={62,34,76,243,63,87};
        System.out.println("before swapping");
        for(int i:arr){
            System.out.print(i+" ");
        }
        insertionSort(arr);
        System.out.println();
        System.out.println("after swapping");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
