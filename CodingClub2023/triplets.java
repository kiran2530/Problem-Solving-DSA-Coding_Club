import java.util.Arrays;

public class triplets 
{   
    public static void main(String args[])
    {
        int nums[]={-1,0,1,2,-1,-4,};
        int count=0,flag=0;
        Arrays.sort(nums);
        String[] trio = {"-1","-1","-1","-1","-1","-1","-1","-1","-1","-1"};
        for(int i=0; i<nums.length-2; i++)
        {
            for(int j=i+1; j<nums.length-1; j++)
            {
                for(int k=j+1; k<nums.length; k++)
                {
                    if((nums[i]+nums[j]+nums[k])==0)
                    {
                        int[] result = new int[3];
                        result[0]=nums[i];
                        result[1]=nums[j];
                        result[2]=nums[k];

                        Arrays.sort(result);
                        String trio1 = Integer.toString(result[0])+","+Integer.toString(result[1])+","+Integer.toString(result[2]);
                        int a=count;
                        for(int m=0; m<=a; m++)
                        {
                            String trio2 = trio[m];
                            if(trio1.compareTo(trio2)==0)
                            {
                                flag=1;
                                break;
                            }
                            else
                            {
                                flag=0;
                            }
                        }

                        if(flag==0)
                        {
                            trio[count]=trio1;
                            count++;
                        }
                    }
                }
            }
        }

        System.out.print("[");
        for(int i=0; i<count; i++)
        {
            System.out.print(" [" + trio[i] + "] ");
        }
        System.out.print("]");
    }
}
