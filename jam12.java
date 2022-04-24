import java.util.ArrayDeque;
import java.util.Scanner;

public class jam12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        int x,y,c=0,d;
        for(int i=0;i<T;i++){
            x = sc.nextInt();
            c = 0;
            for(int j=0;j<x;j++){
                y = sc.nextInt();
                adq.offer(y);
            }
            d = (adq.peekFirst()<adq.peekLast()) ? adq.peekFirst() : adq.peekLast();
            while(!adq.isEmpty()){
                if(adq.peekFirst() < adq.peekLast()){
                    if(adq.peekFirst() >= d){
                        d = adq.peekFirst();
                        c++;
                    }
                    adq.removeFirst();
                }
                else{
                    if(adq.peekLast() >= d){
                        d = adq.peekLast();
                        c++;
                    }
                    adq.removeLast();
                }
            }
            System.out.println("Case #"+(i+1)+": "+c);
        }

    }
    
}
