package CodingClub2023;
public class largeInt
{
    public static void main(String[] args) 
    {
        int digits[] = {9,9,9,9};
        int len = digits.length;
        int digits1[] = new int[len+1];
        int a = len-1;
        for(int i=0; i<len; i++)
        {
            digits1[i] = digits[a];
            a--;
        }
        digits1[len] = 0;

        int result[] = new int[len+1];
        int carry = 0 ,i;

        for(i=0; i<digits1.length; i++)
        {
            if(i==0)
            {
                result[i] = digits1[i]+1 ;
                carry = result[i]/10 ;
                result[i] = result[i]%10;
            }
            else if(i==len)
            {
                result[i] = carry ;
            }
            else
            {
                result[i] = digits1[i] + carry;
                carry = result[i]/10 ;
                result[i] = result[i]%10;
            }
        }

        a=len;
        for(i=0; i<=len; i++)
        {
            digits1[i] = result[a];
            a--;
        }

        if(digits1[0]==0)
        {
            for(i=1; i<=len; i++)
            {
                System.out.print(digits1[i] + " ");
            }
        }
        else
        {
            for(i=0; i<=len; i++)
            {
                System.out.print(digits1[i] + " ");
            }
        }
        
    }
}
