import java.util.Scanner;
import java.util.Arrays;

public class jam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int maxSize = 1000000;
        int s,x,ans;
        for(int i=0;i<size;i++){
            s = sc.nextInt();
            int arr[] = new int[s];
            for(int j=0;j<s;j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            x=0;
            ans=s;
            for(int j=0;j<s;j++){
                if(arr[j]+x >= j+1)
                    continue;
                else{
                    x++;
                    ans--;
                    continue;
                }
            }
            System.out.println("Case #"+(i+1)+": "+ans);
        }
    }
}
