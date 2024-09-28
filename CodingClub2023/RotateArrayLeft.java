package CodingClub2023;
public class RotateArrayLeft {
    public static int[] rotateArrayLeft(int[] arr, int n, int d) {
        if(d % arr.length == 0)
            return arr;
        else
            d = (d % arr.length);

        int[] rotateArr = new int[n];
        int last = n-d, positions = d, k = 0;

        for(int i=0; i<Math.max(n-d, d); i++) {
            if(i < n-d)
                rotateArr[i] = arr[i+d];
            if(positions > 0) {
                rotateArr[last++] = arr[k++];
                positions--;
            }
        }
        return rotateArr;
    }
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5,6,7};
        int[] arr = {1,6,7,8};
        int d = 1;

        int[] rotateArr = rotateArrayLeft(arr, arr.length, d);
        for(int i=0; i<rotateArr.length; i++) {
            System.out.print(rotateArr[i] + " ");
        }
    }
}
