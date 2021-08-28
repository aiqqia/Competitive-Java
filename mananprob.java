import java.util.*;

public class mananprob {

    static int getSol(int n, int arr[]){
        int ans = 0;
        Queue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            pq.offer(arr[i]);
            list.add(arr[i]);
        }
        List<Integer> maxList = new ArrayList<>();
        for(int i=0;i<((n+1)/2);i++){
            maxList.add(pq.poll());
        }
        int a,b,ch;
        for(int i=0;i<((n+1)/2);i++){
            if(list.size() == 1){
                ans += list.get(0);
                break;
            }
            if(list.size() == 0) break;
            a = list.get(0);
            b = list.get(1);
            if(maxList.contains(a) || maxList.contains(b)) {
                ch = Math.max(a, b); 
            } else {
                ch = Collections.max(maxList);
            }
            maxList.remove(Integer.valueOf(ch));
            ans+=ch;
            list.remove(Integer.valueOf(ch));
            if(maxList.contains(list.get(0))) maxList.remove(Integer.valueOf(list.get(0)));
            list.remove(0);
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
        System.out.println(getSol(n,arr));
    }
}
