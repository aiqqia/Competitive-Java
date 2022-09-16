import java.util.Arrays;
import java.util.Scanner;

public class sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean arr[] = new Boolean[n+1];
        Arrays.fill(arr, Boolean.TRUE);
        arr[0] = Boolean.FALSE;
        arr[1] = Boolean.FALSE;
        for(int i=2;i*i<=n;i++){
            if(arr[i] == Boolean.TRUE){
                for(int j=i*i;j<=n;j+=i){
                    arr[j] = Boolean.FALSE;
                }
            }
        }
        for(int i=0;i<n+1;i++){
            if(arr[i] == Boolean.TRUE)
                System.out.print(i+" ");
        }
    }
}
