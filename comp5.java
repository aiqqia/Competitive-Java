import java.util.Scanner;
import java.util.List;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode r = result;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                ListNode temp = new ListNode(l1.val);
                result.next = temp;
                l1 = l1.next;
                
            } else {
                ListNode temp = new ListNode(l2.val);
                result.next = temp;
                l2 = l2.next;
            }
            result = result.next;
        }
        
        if(l1 != null) {
           result.next = l1; 
        }
        
        if(l2 != null) {
            result.next = l2;
        }
        
        return r.next;
    }
}

public class comp5{
    public static void main(String[] args) {
        // ListNode l1 = new ListNode();
        // ListNode l2 = new ListNode();
        int n1,n2,x;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        x=sc.nextInt();
        ListNode l1 = new ListNode(x);
        ListNode l = l1;
        for(int i=1;i<n1;i++){
            x=sc.nextInt();
            ListNode temp = new ListNode(x,null);
            l1.next=temp;
            l1 = l1.next;
        }
        l1=l;
        n2 = sc.nextInt();
        x=sc.nextInt();
        ListNode l2 = new ListNode(x);
        ListNode m = l2;
        for(int i=1;i<n2;i++){
            x=sc.nextInt();
            ListNode temp = new ListNode(x,null);
            l2.next=temp;
            l2 = l2.next;
        }
        l2=m;
        ListNode res = Solution.mergeTwoLists(l1, l2);
        while(res!=null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}