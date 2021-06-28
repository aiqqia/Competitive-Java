import java.util.Scanner;

class createArray{
    int size;
    int arr[][];
    createArray(int x){
        this.size = x;
        this.arr = new int[size][size];
    }

    void makeArray(){
        int c=1,x,ch=-1;
        for(int i=0;i<size;i++){
            this.arr[i][i] = c;
            x=1;
            ch*=-1;
            for(int j=0;j<i;j++){
                if(ch==1){
                    this.arr[i-x][i] = c+x;
                    this.arr[i][i-x] = c-x;
                }
                else{
                    this.arr[i-x][i] = c-x;
                    this.arr[i][i-x] = c+x;
                }
                x++;
            }
            c+=(2*(i+1));
        }
    }

}

class Solution {
    public static int printElement(int y,int x) {
        int res;
        int max = y>x? y :x;

        createArray a = new createArray(max);
        a.makeArray();
        res = a.arr[y-1][x-1];

        return res;
    }
}

public class comp6{
    public static void main(String[] args) {
        int t;
        //row y column x
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int xarr[][] = new int[t][2];
        for(int i=0;i<t;i++){
            xarr[i][0] = sc.nextInt();//rows
            xarr[i][1] = sc.nextInt();//columns
        }
        for(int i=0;i<t;i++){
            System.out.println(Solution.printElement(xarr[i][0],xarr[i][1]));
        }
    }
}