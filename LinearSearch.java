public class LinearSearch {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,3,7,9,2};
        int key=87;
        int result=linearSearch(arr,key);
        if(result>0){
            System.out.println("found at index "+result);
        }else {
            System.out.println("result not found");
        }
    }
}
