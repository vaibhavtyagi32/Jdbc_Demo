public class SecondHighestElement {
    public static int secondHighest(int []arr){
        int lar=arr[0];
        int slar=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>lar){
                slar=lar;
                lar=arr[i];
            }
            if(arr[i]<lar && arr[i]>slar){
                slar=arr[i];
            }
        }
        return slar;
    }
    public static void main(String[] args) {
        int []num={1,1,1,1,1};
        int result=secondHighest(num);
        System.out.println("second highest number is "+result);
    }
}
