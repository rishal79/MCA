#include<stdio.h>  
#include<stdlib.h>  

struct node  
{  
    struct node *prev;  
    struct node *next;  
    int data;  
};  

struct node *head;  

void insertion_beginning();  
void insertion_last();  
void insertion_specified();  
void deletion_beginning();  
void deletion_last();  
void deletion_specified();  
void display();  

void main ()  
{  
    int choice = 0;  
    while(choice != 8)  
    {  
        printf("\n*********Main Menu*********\n");  
        printf("\nChoose one option from the following list ...\n");  
        printf("\n===============================================\n");  
        printf("\n1.insert_beg\n2.insert_last\n3.insert_position\n4.delete_beg\n5.delete_last\n6.delete_specified\n7.display\n8.exit");  
        printf("\nEnter your choice?\n");  
        scanf("\n%d", &choice);  
        switch(choice)  
        {  
            case 1:  
                insertion_beginning();  
                break;  
            case 2:  
                insertion_last();  
                break;  
            case 3:  
                insertion_specified();  
                break;  
            case 4:  
                deletion_beginning();  
                break;  
            case 5:  
                deletion_last();  
                break;  
            case 6:  
                deletion_specified();  
                break;  
            case 7:  
                display();  
                break;  
            case 8:  
                exit(0);  
                break;  
            default:  
                printf("Please enter valid choice..\n");  
        }  
    }  
}  

void insertion_beginning()  
{  
    struct node *ptr;   
    int item;  
    ptr = (struct node *)malloc(sizeof(struct node));  
    if(ptr == NULL)  
    {  
        printf("\nOVERFLOW\n");  
    }  
    else  
    {  
        printf("\nEnter Item value: ");  
        scanf("%d", &item);  

        if(head == NULL)  
        {  
            ptr->next = NULL;  
            ptr->prev = NULL;  
            ptr->data = item;  
            head = ptr;  
        }  
        else  
        {  
            ptr->data = item;  
            ptr->prev = NULL;  
            ptr->next = head;  
            head->prev = ptr;  
            head = ptr;  
        }  
        printf("\nNode inserted\n");  
    }  
}  

void insertion_last()  
{  
    struct node *ptr, *temp;  
    int item;  
    ptr = (struct node *)malloc(sizeof(struct node));  
    if(ptr == NULL)  
    {  
        printf("\nOVERFLOW\n");  
    }  
    else  
    {  
        printf("\nEnter value: ");  
        scanf("%d", &item);  
        ptr->data = item;  

        if(head == NULL)  
        {  
            ptr->next = NULL;  
            ptr->prev = NULL;  
            head = ptr;  
        }  
        else  
        {  
            temp = head;  
            while(temp->next != NULL)  
            {  
                temp = temp->next;  
            }  
            temp->next = ptr;  
            ptr->prev = temp;  
            ptr->next = NULL;  
        }  
        printf("\nNode inserted\n");  
    }  
}  

void insertion_specified()  
{  
    struct node *ptr, *temp;  
    int item, loc, i;  
    ptr = (struct node *)malloc(sizeof(struct node));  
    if(ptr == NULL)  
    {  
        printf("\nOVERFLOW\n");  
    }  
    else  
    {  
        temp = head;  
        printf("Enter the location: ");  
        scanf("%d", &loc);  
        for(i = 0; i < loc; i++)  
        {  
            temp = temp->next;  
            if(temp == NULL)  
            {  
                printf("\nThere are less than %d elements\n", loc);  
                return;  
            }  
        }  
        printf("Enter value: ");  
        scanf("%d", &item);  
        ptr->data = item;  
        ptr->next = temp->next;  
        ptr->prev = temp;  
        temp->next = ptr;  
        if(ptr->next != NULL)  
        {  
            ptr->next->prev = ptr;  
        }  
        printf("\nNode inserted\n");  
    }  
}  

void deletion_beginning()  
{  
    struct node *ptr;  
    if(head == NULL)  
    {  
        printf("\nUNDERFLOW\n");  
    }  
    else if(head->next == NULL)  
    {  
        head = NULL;   
        free(head);  
        printf("\nNode deleted\n");  
    }  
    else  
    {  
        ptr = head;  
        head = head->next;  
        head->prev = NULL;  
        free(ptr);  
        printf("\nNode deleted\n");  
    }  
}  

void deletion_last()  
{  
    struct node *ptr;  
    if(head == NULL)  
    {  
        printf("\nUNDERFLOW\n");  
    }  
    else if(head->next == NULL)  
    {  
        head = NULL;   
        free(head);   
        printf("\nNode deleted\n");  
    }  
    else   
    {  
        ptr = head;   
        while(ptr->next != NULL)  
        {  
            ptr = ptr->next;   
        }  
        ptr->prev->next = NULL;   
        free(ptr);  
        printf("\nNode deleted\n");  
    }  
}  

void deletion_specified()  
{  
    struct node *ptr, *temp;  
    int val;  
    printf("\nEnter the data after which the node is to be deleted: ");  
    scanf("%d", &val);  
    ptr = head;  
    while(ptr != NULL && ptr->data != val)  
    {  
        ptr = ptr->next;  
    }  
    if(ptr == NULL)  
    {  
        printf("\nNode with the specified value not found.\n");  
    }  
    else if(ptr->next == NULL)  
    {  
        printf("\nCan't delete last node with specified data.\n");  
    }  
    else  
    {  
        temp = ptr->next;  
        ptr->next = temp->next;  
        if(temp->next != NULL)  
        {  
            temp->next->prev = ptr;  
        }  
        free(temp);  
        printf("\nNode deleted\n");  
    }  
}  

void display()  
{  
    struct node *ptr;  
    printf("\nPrinting values...\n");  
    ptr = head;  
    while(ptr != NULL)  
    {  
        printf("%d\n", ptr->data);  
        ptr = ptr->next;  
    }  
}  
