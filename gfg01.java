import java.util.*;

class mycomparator implements Comparator<meeting>{
    @Override
    public int compare(meeting o1, meeting o2)
    {
        if (o1.end < o2.end)
        {
            return -1;
        }
        else if (o1.end > o2.end)
            return 1;
        return 0;
    }
}

class meeting{
    int start;
    int end;
    int pos;
     
    meeting(int start, int end, int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class Solution {
    public static int maxMeetings(int start[], int end[], int n){
        ArrayList<meeting> meet = new ArrayList<>();
        for(int i = 0; i < n; i++)
             meet.add(new meeting(start[i], end[i], i));
         
        ArrayList<Integer> m = new ArrayList<>();
     
        int time_limit = 0;
        mycomparator mc = new mycomparator();
    
        Collections.sort(meet, mc);
        m.add(meet.get(0).pos);
        time_limit = meet.get(0).end;
    
        for(int i = 1; i < meet.size(); i++){
            if (meet.get(i).start > time_limit){
                m.add(meet.get(i).pos);
                time_limit = meet.get(i).end;
            }
        }
        return m.size();
    }
}

public class gfg01{
    public static void main(String[] args) {
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };
        System.out.println(Solution.maxMeetings(s, f, 6));
    }
}