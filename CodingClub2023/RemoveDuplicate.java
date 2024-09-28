package CodingClub2023;
public class RemoveDuplicate {
    static int count=0;
    public static int[] RemoveDuplicateNumber(int[] a) {
        int[] b = new int[a.length];
        b[0] = a[0];
        int n = a[0],k=1;

        for(int i=1; i<a.length; i++)
        {
            if(a[i] != n) {
                b[k] = a[i];
                n = a[i];
                k++;
            }
            else {
                count++;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int a[] = {0,0,1,1,1,2,2,3,3,4};
        a = RemoveDuplicateNumber(a);
        System.out.println(a.length-count);
        for(int i =0; i<a.length-count; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
