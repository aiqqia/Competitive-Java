import java.util.Scanner;

class Solution {
    public static int removeDuplicates(int[] nums) {
        int l = nums.length;
        if(l==0) return 0;
        if(l==1) return 1;
        int i,x;
        int c=0;
        for(i=0;i<l-1;i++){
            x = nums[i];
            if(x == nums[i+1]){
                continue;
            }
            else{
                nums[c++]=nums[i];
            }
        }
        if(nums[i]!=nums[c-1]){
            nums[c++] = nums[i];
        }
        if(c==0){
            c++;
        }

        for(i=0;i<l;i++){
            System.out.print(nums[i]+" ");
        }
        return c;
    }
}

// public int removeDuplicates(int[] nums) {

//     int index=1;
    
//     for(int i=0;i<nums.length-1;i++){
        
//         if(nums[i]!=nums[i+1]){
            
//             nums[index++]=nums[i+1];
            
//         }
//     }
//     return index;
    
// }

public class comp10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int nums[] = new int[l];
        for(int i=0;i<l;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Solution.removeDuplicates(nums));
    }
}
