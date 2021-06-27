import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
    public static int distinctCount(int a[]) {
        Set<Integer> s = new HashSet<>();
        for(int ele : a){
            s.add(ele);
        }
        return s.size();
    }

    private static String String(int x) {
        return null;
    }
}

public class comp3{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Solution.distinctCount(a));
    }
}