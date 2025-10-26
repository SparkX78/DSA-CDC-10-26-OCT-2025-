public class DSA_55 {
    public static int maxArea1(int[] height) {
        int left = 0; 
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            maxArea = Math.max(maxArea, h*width);

            if(height[left] < height[right]){
                left++;

            }
            else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String args[]){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea1(height));
    }
}
