import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ques {
    public static int slices(int A[]){
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<Integer> pq = new PriorityQueue<>();
        int l = A.length;
        for(int i=0;i<l;i++){
            map.put(A[i],i);
            pq.offer(A[i]);
        }
        int k=0;
        int flag = 0;
        while(pq.peek() == A[k++]){
            pq.poll();
            flag++;
        } 
        if(flag != 0) ans++;
        int ind = -1;
        int smallest = pq.poll();
        while(map.get(smallest) > ind){
                ans++;
                for(int i=ind+1;i<=(map.get(smallest));i++){
                    pq.remove(A[i]);
                }
                ind = map.get(smallest);
                if(pq.size() == 0) break;
                smallest = pq.poll();

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Number of slices = "+ slices(arr));
    }
}
