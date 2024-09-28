package CodingClub2023;
import java.util.Scanner;
public class scoreOfString{
    public static int scoreString(String str){
        int score=0;
        for(int i=0; i<str.length()-3;i++){
            if(str.charAt(i)==str.charAt(i+3) && str.charAt(i+1)==str.charAt(i+2)){
                score += 5;
            }
            if(i!=str.length()-4 && str.charAt(i)==str.charAt(i+4) && str.charAt(i+1)==str.charAt(i+3)){
                score += 10;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();
        int result = scoreString(str);
        System.out.println(result);
        sc.close();
    }
}