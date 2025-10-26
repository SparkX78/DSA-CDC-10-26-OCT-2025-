public class DSA_53 {
    public static int SellStock(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int MaxPrice = 0;
        for(int i : prices){
            if(i < minPrice){
                minPrice = i;
            }
            else if(i - minPrice > MaxPrice){
                MaxPrice = i - minPrice;
            }
        }
        return MaxPrice;
    }
    public static void main(String args[]){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(SellStock(prices));
    }
}
