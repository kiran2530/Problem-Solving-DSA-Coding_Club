#include<stdio.h>
#include<math.h>
#include<string.h>

int Substring(char str1[],char str2[])
{
	int i,j,c=0,strl=0;
	
	for(i=0; i<strlen(str1); i++)
	{
		if(str1[i] == str2[c])
		{
			int k=i;
			for(j=i; j<(k+strlen(str2)); j++)
			{
				if(str1[j] == str2[c])
				{
					c++;
					strl++;
				}
				else
				{
					c=0;
					strl=0;
					break;
				}
				
				if(strl==strlen(str2))
				{
					return i;
				}
					
			}
		}
	}
	
	return -1;
}

int main()
{
//	char haystack[]={"sadbutsad"};
//	char needle[]={"sad"};
	
//	char haystack[]={"leetcode"};
//	char needle[]={"leeto"};

	char haystack[]={"mr_mhell"};
	char needle[]={"hell"};
	
	int index = Substring(haystack,needle);
	printf("%d",index);
}
