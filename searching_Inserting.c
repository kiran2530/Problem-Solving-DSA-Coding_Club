#include<stdio.h>
/*
int main()
{
	int nums[] = {1,3,5,6};
	int i,index,flag=0,target = 7;
	
	
	for(i=0; i<((sizeof(nums))/4); i++)
	{
		if(target == nums[i])
		{
			printf("%d",i);
			flag=1;
			break;
		}
		else if(target >= nums[i])
		{
			index = i+1;
		}
	}
	
	if(flag==0)
	{
		printf("%d",index);
	}
}
*/
void Search(int a[],int x,int low,int arraylength)
{
	int high = arraylength;
	while(low <= high)
	{
		int mid = low + (high - low)/2;
		if(a[mid]==x)
		{
			printf("%d",mid);
			break;
		}
		if(a[mid]<x)
		{
			low = mid + 1;
			if((high-low) == 0)
			{
				printf("%d",high);
			}
	    }
		else
		{
			high = mid - 1;
			if((high-low) == 0 && arraylength%2==0)
			{
				printf("%d",mid);
			}
			else if((high-low) == 0 && arraylength%2==1)
			{
				printf("%d",mid);
			}
		}
	}
}

int main()
{
	int nums[] = {1,3,5,6,10};
	int target = 12;
	Search(nums,target,0,((sizeof(nums))/(sizeof(nums[0]))));
}


