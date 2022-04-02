import java.util.Scanner;

public class jam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int maxSize = 1000000;
        size*=3;
        int arr[][] = new int[size][4];
        for(int i=0;i<size;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            arr[i][3] = sc.nextInt();
        }
        int in,sum,extra;
        int min[] = new int[4];
        for(int i=0;i<(size/3);i++){
            in = i*3;
            for(int j=0;j<4;j++){
                min[j] = Math.min(arr[in][j], Math.min(arr[in+1][j], arr[in+2][j]));
            }
            sum = min[0] + min[1] + min[2] + min[3];
            if(sum < maxSize){
                System.out.println("Case #"+(i+1)+": "+"IMPOSSIBLE");
                continue;
            }
            else if(sum > maxSize){
                extra = sum - maxSize;
                for(int j=0;j<4;j++){
                    if(extra <= min[j]){
                        min[j] -= extra;
                        extra = 0;
                    }
                    else if(extra > min[j]){
                        extra -= min[j];
                        min[j] = 0;
                    }
                    if(extra == 0)
                        break;
                }
            }
            System.out.println("Case #"+(i+1)+": "+ min[0] + " " + min[1] + " " + min[2] + " " + min[3]);
        }
        
    }
}
