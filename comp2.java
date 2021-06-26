import java.util.Scanner;

class Solution {
    public static boolean isPalindrome(int x) {
        boolean res = true;

        String num = Integer.toString(x);
        int l = num.length();
        int i,j;
        //System.out.println(l);
        for(i=0,j=l-1; i<j; i++,j--){
            if(num.charAt(i) != num.charAt(j))
                return false;
        }

        return res;
    }

    private static String String(int x) {
        return null;
    }
}

public class comp2{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(Solution.isPalindrome(n));
    }
}