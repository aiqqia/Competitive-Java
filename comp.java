import java.util.Scanner;

class Solution {
    public static int reverse(int x) {
        
        if(x==0) return 0;
		
		long  number = 0;
		int n;
        boolean isNegative = x < 0;
        if(isNegative) x = -1*x;
        while(x>0) {
            n = x%10;
            number = number*10 + n;
            if (number >= Integer.MAX_VALUE)  return 0;
            x = x/10;
        }
        
        return isNegative ? -1*(int)number : (int)number;
    }
}

public class comp{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(Solution.reverse(n));
    }
}