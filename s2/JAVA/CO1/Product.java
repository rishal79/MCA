import java.util.Scanner;
class Product{
    int pcode,price;
    String pname;
    Product(){
        Scanner sc=new Scanner(System.in);
        pcode=sc.nextInt();
        pname=sc.next();
        price=sc.nextInt();
    }
    public static void main(String[] args){
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();

        if(p1.price<p2.price && p1.price<p3.price){
            System.out.println(p1.pname+" "+p1.price);
        }else if(p2.price<p3.price){
            System.out.println(p2.pname+" "+p2.price);
        }else{
            System.out.println(p3.pname+" "+p3.price);
        }

    }
}
