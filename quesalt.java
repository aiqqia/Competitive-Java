import java.util.Scanner;
import java.util.Stack;

public class quesalt {
    public static int slices(int A[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(A[0]);
        for(int i=1;i<A.length;i++){
            if(A[i] >= stack.peek()){
                stack.push(A[i]);
            }
            else{
                System.out.println(stack.peek());
                int x = stack.pop();
                while(stack.size()>0 && A[i] < stack.peek()){
                    stack.pop();
                }
                stack.push(x);
            }
        }
        return stack.size();
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
