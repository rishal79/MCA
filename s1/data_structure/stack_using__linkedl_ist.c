#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
};
struct node *head;
void push();
void pop();
void display();
void main()
{
    int ch=0;
    while(ch!=4){
        printf("1.push\n");
        printf("2.pop\n");
        printf("3.display\n");
        printf("enter your choice\n");
        scanf("%d",&ch);

        switch(ch)
        {
            case 1:
            {
                push();
                break;
            }
            case 2:{
                pop();
                break;
            }
            case 3:{
                display();
                break;
            }
            default:
            {
                printf("invalid choice");
            }
        }
    }
}
void push()
{
    int val;
    struct node *ptr=(struct node *)malloc(sizeof(struct node));
    if(ptr==NULL)
    {
        printf("unable to push");
    }
    else{
        printf("enter the value");
        scanf("%d",&val);
        if(head==NULL)
        {
            ptr->data=val;
            ptr->next=NULL;
            head=ptr;
        }
        else{
            ptr->data=val;
            ptr->next=head;
            head=ptr;
        }
        printf("item pushed\n");
    }
}
void pop()
{
    int val;
    struct node *ptr;
    if(head==NULL){
        printf("underflow\n");
    }
    else{
        ptr=head;
        val=head->data;
        head=head->next;
        free(ptr);
        printf("item poped:%d\n",val);
    }
}
void display()
{
    int i;
    struct node *ptr;
    ptr=head;
    if(ptr==NULL)
    {
        printf("stack empty");
    }
    else{
        printf("printing stack elements:\n");
        while(ptr!=NULL)
        {
            printf("%d\n",ptr->data);
            ptr=ptr->next;
        }
    }
}