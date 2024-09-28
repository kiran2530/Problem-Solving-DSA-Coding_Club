package CodingClub2023;
public class MaxProfit {
    public static int maxProfit(int[] a) {
        int max = 0;
        for(int i=0; i<a.length-1; i++)  {
            for(int j=i+1; j<a.length; j++) {
                if(a[j]-a[i] > max) 
                    max = a[j]-a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
}
