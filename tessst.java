import java.util.*;

public class tessst{
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
            for(int i=list2.size()-1;i>0;i--){
                for(int j=0;j<list2.get(i-1);j++){
                    System.out.print("  ");
                }
                for(int j=0;j<=list1.get(i);j++){
                    System.out.print("* ");
                }
                System.out.println();
                for(int j=0;j<list1.get(i)-1;j++){
                    for(int k=0;k<list2.get(i-1);k++){
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                    System.out.println();
                }
            }

            for(int i=0;i<=list1.get(0);i++){
                System.out.print("* ");
            }
            System.out.println();
            for(int i=0;i<list1.get(0);i++){
                System.out.print("* ");
                System.out.println();
            }
            list1.clear();
            list2.clear();
            t--;
        }
    }
}