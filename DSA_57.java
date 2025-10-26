public class DSA_57 {
    public static int TrapWater(int[] heights){
        int left = 0;
        int right = heights.length-1;
        int leftMax = 0;
        int trapped_Water = 0;
        int rightMax = 0;
        while(left < right){
            if(heights[left] < heights[right]){
                if(heights[left] >= leftMax){
                    leftMax = heights[left]; 
                }
                else{
                    trapped_Water += leftMax - heights[left];
                }
                left++;
            }
            else{
                if(heights[right] >= rightMax){
                    rightMax = heights[right];
                }
                else{
                    trapped_Water += rightMax - heights[right];
                }
                right--;
            }
        }
        return trapped_Water;
    }
    public static void main(String args[]){
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TrapWater(heights));
    }
}
