import java.util.*;

public class palo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int n,x,s=0;
        while(t>0){
            s=0;
            n = sc.nextInt();
            for(int i=0;i<n;i++){
                x = sc.nextInt();
                list1.add(x);
                s+=x;
                list2.add(s);
            }
            
            for(int i=n-1;i>=0;i--){
                int col = 0;
                if(i!=0)
                    col = list2.get(i-1);
                int row = list1.get(i);
                for(int j=0;j<row;j++){
                    for(int k=0;k<col;k++){
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                    if(j==0){
                        x = list1.get(i);
                        while(x>0){
                            System.out.print("* ");
                            x--;
                        }
                    }
                    System.out.println();
                }
            }

            System.out.print("* \n");

            list1.clear();
            list2.clear();
            t--;
        }
    }
}
