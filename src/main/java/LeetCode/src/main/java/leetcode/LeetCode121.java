package LeetCode.src.main.java.leetcode;

public class LeetCode121 {
    public int maxProfit1(int[] prices) {
        int maxprofit = 0;
        int cost = Integer.MAX_VALUE;
        // [ 7 , 1 , 5 , 6 , 4  ]
        for (int price : prices) {
            cost = Math.min(cost,price);
            maxprofit = Math.max(maxprofit,price - cost);
        }
        return maxprofit;
    }
}
