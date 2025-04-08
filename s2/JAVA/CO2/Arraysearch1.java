import java.util.Scanner;

class Arraysearch {
    int n;
    int[] a;

    
    Arraysearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n = sc.nextInt();
        a = new int[n];
    }

    public static void main(String[] args) {
        
        Arraysearch a1 = new Arraysearch();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for (int i = 0; i < a1.n; i++) {
            a1.a[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search:");
        int s = sc.nextInt();

        for (int i = 0; i < a1.n; i++) {
            if (a1.a[i] == s) {
                System.out.println("Element found at position " + (i + 1));
                return;
            }
        }

        System.out.println("Element not found");
    }
}