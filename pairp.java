import java.util.*;

public class pairp {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Collections.swap(arr,0,2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
