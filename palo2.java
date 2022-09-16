import java.util.*;

public class palo2 {
    static int fun(int arr[], int m, int n){
        int darr[] = new int[n+1];
        darr[0] = 0;
        for(int i=1;i<=n;i++){
            darr[i] = Integer.MAX_VALUE;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<m;j++){
                if(arr[j] <= i){
                    int sr = darr[i-arr[j]];
                    if(sr != Integer.MAX_VALUE && sr+1 < darr[i])
                        darr[i] = sr+1;
                }
            }
        }
        if(darr[n] == Integer.MAX_VALUE)
            return -1;

        return darr[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[m];
            for(int i=0;i<m;i++){
                arr[i] = sc.nextInt();
            }
            int x = fun(arr, m, n);
            if(x<0)
                System.out.println("NO");
            else
                System.out.println(x);
            t--;
        }
    }
}