package CodingClub2023;
public class MaxProfitOfShareTrader {
    public static int findMaxProfit(int[] prize, int n) {
        int[] profit = new int[3];
        int[] profitPreviousDiff = new int[3];
        for(int i=0; i<3; i++)
            profitPreviousDiff[i] = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=1; j<=2; j++) {
                profitPreviousDiff[j] = Math.max(profitPreviousDiff[j], profit[j-1]-prize[i]);
                profit[j] = Math.max(profit[j], prize[i] + profitPreviousDiff[j]);
            }
        }
        return profit[2];
    }
    public static void main(String[] args) {
        int[] prize = {10,22,5,75,65,80};
        System.out.println(findMaxProfit(prize, prize.length));
    }
}
