public class BinarySearch {
    public static int binarySerach(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,8,9};
        int key=76;
        int result=binarySerach(arr,key);
        if(result>0){
            System.out.println("found at index "+result);
        }else {
            System.out.println("result not found");
        }
    }
}
