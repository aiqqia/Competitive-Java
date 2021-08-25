import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class parentnode {

    static void getParents(int n, int arr[][]){
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> listTemp = new ArrayList<>();
        for(int i=0;i<(n-1);i++){
            ArrayList<Integer> list = new ArrayList<>();
            if(map.containsKey(arr[i][0])){
                listTemp = map.get(arr[i][0]);
                listTemp.add(arr[i][1]);
                map.put(arr[i][0], listTemp);
            } else if(map.containsKey(arr[i][1])){
                listTemp = map.get(arr[i][1]);
                listTemp.add(arr[i][0]);
                map.put(arr[i][1], listTemp);
            } else{
                list.add(arr[i][1]);
                map.put(arr[i][0], list);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n-1][2];
        for(int i=0;i<n-1;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        getParents(n,arr);
    }
}
