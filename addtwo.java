class ListNodes {
     int val;
     ListNodes next;
     ListNodes() {}
     ListNodes(int val) { this.val = val; }
     ListNodes(int val, ListNodes next) { this.val = val; this.next = next; }
 }
public class addtwo {
    public ListNodes addTwoNumbers(ListNodes l1, ListNodes l2) {
        ListNodes sum = new ListNodes();
        ListNodes cur = sum;
        ListNodes newN;
        int c = 0;
        while(l1 != null && l2 != null){
            cur.val = (l1.val + l2.val + c)%10;
            c = (l1.val + l2.val - 10);
            c = (c<0)?0:1;
            newN = new ListNodes();
            cur.next = newN;
            cur = cur.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            cur.val = l1.val;
            cur = cur.next;
            l1 = l1.next;
        }
        while(l2 != null){
            cur.val = l2.val;
            cur = cur.next;
            l2 = l2.next;
        }
        return sum;
    }
}