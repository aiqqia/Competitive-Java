import java.util.Scanner;

class Solution{
    public static int printElement(int y,int x){
        int c = y>x?1:y<x?-1:0;
        switch(c){
            case 1: if(y%2 == 0){
                        return (y*y)-(x-1);
                    }
                    else{
                        return ((y-1)*(y-1)) +x;
                    }

            case 0: return (x*x)-(x-1);

            case -1:if(x%2 == 0){
                        return ((x-1)*(x-1)) +y;
                    }
                    else{
                        return (x*x)-(y-1);
                    }

            default: break;
        }
        return -1;
    }
}

public class comp7{
    public static void main(String[] args) {
        int t,y,x;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int i=0;i<t;i++){
            y = sc.nextInt();//rows
            x = sc.nextInt();//columns
            System.out.println(Solution.printElement(y,x));
        }
    }
}
