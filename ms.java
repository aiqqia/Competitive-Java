import java.util.ArrayList;

public class ms{
    public static String soln(ArrayList<Integer> list){
        int x = list.size();
        while(x>2){
            for(int i=0;i<x-1;i++){
                list.set(i, (list.get(i)+list.get(i+1))%10);
            }
            x--;
        }
        return Integer.toString(list.get(0))+Integer.toString(list.get(1));
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.print(soln(list));
    }
}