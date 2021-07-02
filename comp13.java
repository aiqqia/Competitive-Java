import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double med = 0.0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] merge = new int[l1+l2];
        int i=0,j=0,k=0;
        while(i!=l1 && j!=l2){
            if(nums1[i] < nums2[j]){
                merge[k++] = nums1[i++];
            }
            else{
                merge[k++] = nums2[j++];
            }
        }
        while(i<l1){
            merge[k++] = nums1[i++];
        }
        while(j<l2){
            merge[k++] = nums2[j++];
        }
        if((l1+l2)%2 != 0){
            med = merge[(l1+l2+1)/2 - 1]/1.0;
        }
        else{
            med = (merge[(l1+l2)/2 - 1] + merge[(l1+l2+2)/2 - 1]) / 2.0;
        }
        return med;
    }
}

public class comp13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int nums1[] = new int[l1];
        for(int i=0;i<l1;i++){
            nums1[i] = sc.nextInt();
        }
        int l2 = sc.nextInt();
        int nums2[] = new int[l2];
        for(int i=0;i<l2;i++){
            nums2[i] = sc.nextInt();
        }
        System.out.println(Solution.findMedianSortedArrays(nums1, nums2)); 
    }
}