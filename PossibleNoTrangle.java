public class PossibleNoTrangle {
    static int trangleNo = 0;
    public static void findPossibleNoTrangle(int[] a, int n, int[] trangleData, int index,int i) {
        if(n < 3)
            return ;

        if(index == 3) {
            if(trangleData[0] < trangleData[1] + trangleData[2] && trangleData[1] < trangleData[0] + trangleData[2] && trangleData[2] < trangleData[1] + trangleData[0])
                trangleNo++;
            return;
        }

        if(i >= n)
            return;

        trangleData[index] = a[i];
        findPossibleNoTrangle(a, n, trangleData, index+1, i+1);
        findPossibleNoTrangle(a, n, trangleData, index, i+1);
    }
    public static void main(String[] args) {
        // int[] a = {4,6,3,7};
        int[] a = {10,21,22,100,101,200,300};
        int n = a.length;
        int[] trangleData = new int[3];
        findPossibleNoTrangle(a, n, trangleData, 0, 0);

        System.out.println(trangleNo);
    }
}
