import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static int singleNumber(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<l-1;){
            if(i==(l-1)){
                return nums[i];
            }
            if(nums[i] == nums[i+1])
                i+=2;
            else
                return nums[i];
        }
        
        return nums[l-1];
    }
}

public class comp11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int nums[] = new int[l];
        for(int i=0;i<l;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Solution.singleNumber(nums));
    }
}
