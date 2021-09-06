import java.util.Scanner;

class Solution {
    public static int maxArea(int[] height) {
        int l = height.length;
        int left = 0, right = l-1;
        int maxVol = 0,vol;
        while(right>left){
            vol = Math.min(height[left],height[right])*(right-left);
            if(vol > maxVol) maxVol = vol;
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxVol;
    }
}

public class compRainwater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int nums[] = new int[l];
        for(int i=0;i<l;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Solution.maxArea(nums)); 
    }
}