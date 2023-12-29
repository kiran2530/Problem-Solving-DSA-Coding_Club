/* Q) Write a program to print all the LEADERS in the array. An element is a leader if it is greater 
      than all to  its right side. And the rightmost element is always a leader. */

public class FindLeaderElements {
    public static void findLeaderElements(int[] a, int n) {
        int leader = a[n-1];                // Create arraylist and store the leader in the 0th position
        System.out.print(leader + " ");
        for(int i=n-1; i>=0; i--) {
            if(a[i] > leader) {
                System.out.print(a[i] + " ");
                leader = a[i];
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {16,17,4,3,5,2};
        findLeaderElements(a, a.length);
    }
}
