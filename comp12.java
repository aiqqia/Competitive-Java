import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static int[] plusOne(int[] digits) {
        int l = digits.length;
        if(l==1 && digits[l-1]==9){
            int newDigits[] = new int[l+1];
            newDigits[0] = 1;
            newDigits[1] = 0;
            return newDigits;
        }
        int m=l-1;
        digits[m] = (digits[m] + 1)%10;
        while(digits[m] == 0){
            digits[m-1] = (digits[m-1]+1)%10;
            m--;
        }
        return digits;
    }
}

public class comp12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int nums[] = new int[l];
        for(int i=0;i<l;i++){
            nums[i] = sc.nextInt();
        }
        nums = Solution.plusOne(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
