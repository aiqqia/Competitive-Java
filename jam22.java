import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class jam22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long c,p,count=0,x,last;
        List<Long> list = new ArrayList<Long>();
        for(int i=0;i<T;i++){
            c = sc.nextInt();
            p = sc.nextInt();
            count = 0;
            last = 0;
            for(int j=0;j<c;j++){
                list = new ArrayList<Long>();
                for(int k=0;k<p;k++){
                    x = sc.nextInt();
                    list.add(x);
                }
                Collections.sort(list);
                if(Math.abs(last-list.get(0)) <= Math.abs(last-list.get(list.size() - 1))){
                    for(int l = 0; l<list.size();l++){
                        if(l == 0){
                            count += Math.abs(list.get(l)-last);
                        }
                        else{
                            count += Math.abs(list.get(l)-list.get(l-1));
                        }
                    }
                    last = list.get(list.size()-1);
                }
                else{
                    for(int l = list.size()-1; l>=0;l--){
                        if(l == list.size()-1){
                            count += Math.abs(list.get(l) - last);
                        }
                        else{
                            count += Math.abs(list.get(l)-list.get(l+1));
                        }
                    }
                    last = list.get(0);
                }
            }
            System.out.println("Case #"+(i+1)+": "+count);
        }

    }
    
}
