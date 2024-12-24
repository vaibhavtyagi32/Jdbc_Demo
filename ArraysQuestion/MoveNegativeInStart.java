package ArraysQuestion;

import java.util.Arrays;

public class MoveNegativeInStart {
    public static void main(String[] args) {
        int arr[]={-10,-20,30,40,50,-8};
        int size=arr.length;
        int temp[]=new int[size];
        int j=0;
        for(int i:arr){
            if(i<0){
                temp[j]=i;
                j++;
            }
        }
        for(int k:arr){
            if(k>0){
                temp[j]=k;
                j++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
