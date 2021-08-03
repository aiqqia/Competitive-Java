import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ques2 {
    public static boolean solution(int[] A , int[] P , int B , int E){
        List<int[]> totalRange = new ArrayList<>();
        
        for(int i = 0 ; i < A.length ; i++){
            totalRange.add(new int[]{
                 P[i] - A[i] , A[i] + P[i]
                });
        }
        
        Collections.sort(totalRange , (a , b) -> a[1] - b[1]);
        
        List<int[]> disjoint = new ArrayList<>();
        
        for(int i = 0 ; i < totalRange.size() ; i++){
            
            int start  = totalRange.get(i)[0];
            int end = totalRange.get(i)[1];
            while( i < totalRange.size() -1 && end >= totalRange.get(i+1)[0]){
                start = Math.min(start , totalRange.get(i+1)[0]);
                end = totalRange.get(i+1)[1];
                i++;
            }
            
            disjoint.add(new int[]{start , end});
        }
        
        int low = 0 , high = disjoint.size() -1;
        
        while(low <= high){
            int mid = (low + high + 1)/2;
            int[] temp = disjoint.get(mid);
            if(B >= temp[0] && B <= temp[1]){
                if(E >= temp[0] && E <= temp[1]){
                    return true;
                }else{
                    return false;
                }
                
            }else if(B >= temp[0]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
        return false;
    }
}
