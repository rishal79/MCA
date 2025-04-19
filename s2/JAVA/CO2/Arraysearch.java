import java.util.Scanner;
class Arraysearch {
    public static void main(String[] args) {
        int i,n,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        s=sc.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==s){
                System.out.println("element found at"+(i+1));
                break;
            }
        }
        if(i==n){
            System.out.println("not found");
        }
        sc.close();
    }
}
