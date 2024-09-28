package CodingClub2023;
public class largest_Sum {
    public static int largestSum(int a[]) {
        int sum = Integer.MIN_VALUE;
        int sum1 = 0;
        for(int i=0; i<a.length; i++) {
            sum1 += a[i];
            if(sum1 > sum) {
                sum = sum1;
            }
            if(sum1 < 0) {
                sum1 = 0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        //int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        int a[] = {};
        int largeSum = largestSum(a);
        System.out.println(largeSum);
    }
}
