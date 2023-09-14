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

void removeDuplicateNode()
{
	struct node *ptr;
	ptr = head;
	
	while(ptr->next != NULL) 
	{
		if(ptr->data == ptr->next->data)
		{
			ptr->next = ptr->next->next;
		}
		else 
		{
			ptr = ptr->next;
		}
	}
}

int main()
{	
	insert_list(1);
	insert_list(1);
	insert_list(2);
	insert_list(3);
	insert_list(3);
	insert_list(3);
	printf("INPUT	: ");
	display();
	
	removeDuplicateNode();
	printf("\nOUTPUT	: ");
	display();
}
