package CodingClub2023;
public class RemoveVAl {
    static int count=0;
    public static int[] removeVal(int[] a,int val) {
        int[] b = new int[a.length];

        for(int i=0,k=0; i<a.length; i++)
        {
            if(a[i] != val) {
                b[k] = a[i];
                k++;
            }
            else {
                count++;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int a[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        a = removeVal(a, val);
        System.out.println(a.length-count);
        for(int i =0; i<a.length-count; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
