package CodingClub2023;
public class Power {
    public static double pow(double x, int n) {
        int n1 = Math.abs(n);
        double result = x;
        for(int i = 1 ; i<n1; i++) {
            result = result * x;
        }
        if(n<0) 
            return 1/result;
        
        return result;
    }
    public static void main(String[] args) {
        double result = pow(2.00000, -2);
        System.out.printf("%.5f",result);
    }
}