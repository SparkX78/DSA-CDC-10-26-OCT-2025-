import java.util.*;
public class DSA_54 {
    public static void SortColors(int[] nums){
        boolean swap = false;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            swap = false;
            for(int j = 0; j < n - i - 1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        
    }
    public static void main(String args[]){
        int[] nums = {0,1,2,1,2,1,2,0,0};
        SortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
