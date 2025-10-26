import java.util.*;
public class DSA_56 {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i --];
            }
            else{
                nums1[k--] = nums2[j --];
            }
        }
    }
    public static void main(String args[]){
        int[] nums1 = {3,5,7,9,0,0,0};
        int[] nums2 = {2,6,10};
        merge(nums1, 4, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }
}

