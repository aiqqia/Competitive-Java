import java.util.Scanner;

class Solution {
    public static String addBinary(String a, String b) {
        long x1=0,x2=0;
        long l1 = a.length();
        long l2 = b.length();
        int c=0;
        for(long i=l1-1;i>=0;i--){
            x1 += (Math.pow(2, c++)) * (long)(a.charAt(i));
        }
        c=0;
        for(long i=l2-1;i>=0;i--){
            x2 += (Math.pow(2, c++)) * (long)(b.charAt(i));
        }
        return Long.toBinaryString(x1+x2);
    }
}

public class comp8{
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println(Solution.addBinary(s1,s2));
    }
}


// public static String addBinary(String a, String b)
// {
//     String result = "";
//     int sum = 0;
//     int i = a.length() - 1;
//     int j = b.length() - 1;
//     while (i >= 0 || j >= 0 || sum == 1)
//     {
//         sum += (i >= 0) ? a.charAt(i--) - 48 : 0;
//         sum += (j >= 0) ? b.charAt(j--) - 48 : 0;
//         result = (char)(sum % 2 + 48) + result;
//         sum /= 2;
        
//     }
    
//     return result;
// }