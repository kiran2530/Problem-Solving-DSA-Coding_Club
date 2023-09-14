#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *next;
};

struct node *head = NULL,*tell = NULL;

void insert_list(int item)
{
	struct node *ptr;
	
	ptr = (struct node*)malloc(sizeof(struct node));
	if(ptr == NULL)
		printf("\n\t MEMORY OVERFLOW..");
	else
	{
		ptr->data = item;
		
		if(head == NULL)
		{
			head = ptr;
			tell = ptr;
			ptr->next = NULL;
		}
		else
		{
			tell->next = ptr;
			ptr->next = NULL;
			tell = ptr;
		}
		
	}
}

void display()
{
	struct node *ptr;
	ptr=head;
	
	if(ptr==NULL)
	{
		printf("[]");
	}
	else
	{
		printf("[")	;
		while(ptr!=NULL)
		{
			printf(" %d",ptr->data);
			ptr = ptr->next;
		}
		printf(" ]")	;
	}
}

void swap_node()
{
	struct node *ptr1,*ptr2,*ptr3,*temp;
	int c=0;
	
	if(head == NULL)
		return;
	else if(head->next == NULL)
		return;
	else
	{
		ptr1 = head;
		head = head->next;
		while(ptr1->next != NULL)
		{
			ptr2 = ptr1->next;
			ptr3 = ptr1->next->next;
			if(ptr2 == NULL)
				return;
			else if(ptr3 == NULL)
			{
				ptr2->next = ptr1;
				ptr1->next = ptr3;
				if(c>0)
					temp->next = ptr2;
				c++;
				return;
			}
			else
			{
				ptr2->next = ptr1;
				ptr1->next = ptr3;
				if(c>0)
					temp->next = ptr2;
				c++;
				temp = ptr1;
				ptr1 = ptr3;
			}
		}
	}
}

int main()
{	
	insert_list(1);
	insert_list(2);
	insert_list(3);
	insert_list(4);
	insert_list(5);
	insert_list(6);
	printf("INPUT	: ");
	display();
	
	swap_node();
	printf("\nOUTPUT	: ");
	display();
}
