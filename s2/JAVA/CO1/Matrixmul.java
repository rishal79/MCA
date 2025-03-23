import java.util.Scanner;
class Matrixmul{
public static void main(String[] args)
{
int a[][]={{1,4},{3,2}};
int b[][]={{1,2},{4,5}};
int mul[][]=new int[2][2];
int i,j,k;

for(i=0;i<2;i++){
        for(j=0;j<2;j++){
            mul[i][j]=0;
            for(k=0;k<2;k++){
                mul[i][j]+=a[i][k]*b[k][j];
        }
        }
   }

System.out.println("multiplication of matrix:");
for(i=0;i<2;i++){
for(j=0;j<2;j++)
{
System.out.print(mul[i][j]+" ");
}
System.out.println();
}
}
}
