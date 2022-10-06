import java.util.*;

public class arc {
    public static int solve(List<Integer> l){
        int n = l.size();
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i==j){
                    ans += l.get(i)*l.get(i);
                    continue;
                }
                int x = Collections.min(l.subList(i,j));
                int y = l.subList(i,j).stream().mapToInt(Integer::intValue).sum();
                ans += x*y;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(9);
        l.add(4);
        l.add(2);
        l.add(16);
        System.out.println(solve(l));
    }
}
