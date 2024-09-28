package CodingClub2023;
public class TargetInMatrix {
    public static boolean findTarget(int[][] a, int target,int row,int col) {
        if(target > a[row-1][col-1]){
            return false;
        }
        int i=0,j=col-1;
        while(i<row && j >=0) {
            if(target == a[i][j]) {
                return true;
            }
            if(target > a[i][col-1]){
                i++;
            }
            else if(target < a[i][j]) {
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int r =3 , c = 4;
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 21;
        System.out.println(findTarget(a, target, r, c));
    }
}
