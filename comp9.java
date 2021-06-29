import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
    
        //using map
        
        int[] result = new int[2];
        Map<Integer,Integer> point = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(point.containsKey(target-nums[i])){
                result[0] = point.get(target-nums[i]);
                result[1] = i;
                break;
            }
            point.put(nums[i],i);
        }
        return result;
    }
}

public class comp9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int nums[] = new int[l];
        for(int i=0;i<l;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans[] = new int[2];
        ans = Solution.twoSum(nums,target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
