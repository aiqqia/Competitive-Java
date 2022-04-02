import java.util.Scanner;

public class jam1 {
    static void printPattern(int in, int r, int c){
        //System.out.println(r + " "+ c);
        System.out.print("Case #" + in + ':'+"\n");
        r = 2*r + 1;
        c = 2*c + 1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 && j==0){
                    System.out.print("..");
                    j++;
                    continue;
                }
                if(i==1 && j==0){
                    System.out.print(".");
                    continue;
                }
                if(i%2 == 0){
                    if(j%2 == 0)
                        System.out.print("+");
                    else
                        System.out.print("-");
                }
                else{
                    if(j%2 == 0)
                        System.out.print("|");
                    else
                        System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[][] = new int[size][2];
        for(int i=0;i<size;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            jam1.printPattern(i+1, arr[i][0], arr[i][1]);
        }
    }
}
