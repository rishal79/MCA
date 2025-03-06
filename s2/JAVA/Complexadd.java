import java.util.Scanner;
class Complexadd{
        int r,i;
        Complexadd(int real,int image){
        this.r=real;
        this.i=image;
}

void add(Complexadd others){
        int real=this.r+others.r;
        int image=this.i+others.i;
        System.out.println(real+"+i"+image);
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter first complex number");
System.out.println("enter real part:");
int real=s.nextInt();
System.out.println("enter the imaginary part:");
int image=s.nextInt();
System.out.println("enter second complex number");
System.out.println("enter real part:");
int real1=s.nextInt();
System.out.println("enter the imaginary part:");
int image1=s.nextInt();

Complexadd c1=new Complexadd(real,image);
Complexadd c2=new Complexadd(real1,image1);
c1.add(c2);

}
}
