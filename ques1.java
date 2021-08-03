// you can also use imports, for example:
import java.util.*;
import java.util.Stack;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class ques1 {
    public int solution(int[] A) {
        int slices = slicing(A);
        return slices;/*an alternate solution would be using Maps and Priority Queues
         and getting minimum of the remaining array and comparing to the map 
         consisting of array values and its indices.*/
    }
    static int slicing(int arr[]){
        int num,smallest;
        int l = arr.length;
        if(l <= 1) return l;
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<l;i++){
            num = arr[i];
            if(num>=st.peek()) st.push(num);
            else {
                smallest = st.pop();
                while(st.size()>0 && num<st.peek()){
                    st.pop();
                }
                st.push(smallest);
            }
        }
        return st.size();
    }
}