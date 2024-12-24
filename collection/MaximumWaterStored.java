package collection;

public class MaximumWaterStored {
    public static  int maxArea(int []height){
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<=r){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            int currArea=h*w;
            if(currArea>max){
                max=currArea;
            }
            if(height[l]<height[r]){
                l++;
            }
            else {
                r--;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int []arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
