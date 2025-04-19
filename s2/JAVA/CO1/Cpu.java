import java.util.Scanner;
class Cpu {
    int price;

    Cpu(int p) {
        this.price = p;
    }

    class Processor {
        int cores;
        String manufacturer;

        Processor(int c, String m) {
            this.cores = c;
            this.manufacturer = m;
        }

        void display() {
            System.out.println(this.cores + " cores, Manufacturer: " + this.manufacturer);
        }
    }

    static class Ram {
        String memory;
        String manufacturer;

        Ram(String m, String ma) {
            this.memory = m;
            this.manufacturer = ma;
        }

        void display() {
            System.out.println("Memory: " + this.memory + ", Manufacturer: " + this.manufacturer);
        }
    }

    void display() {
        System.out.println("CPU Price: " + this.price);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter CPU price: ");
        int price = sc.nextInt();
        Cpu c = new Cpu(price);
        System.out.print("Enter number of cores and manufacturer: ");
        int core = sc.nextInt();
        String manufacturer = sc.next();
        Cpu.Processor p = c.new Processor(core,manufacturer);
        System.out.print("Enter RAM size and manufacturer: ");
        String memory = sc.next();
        String manu=sc.next();
        Cpu.Ram r = new Cpu.Ram(memory,manu);

        c.display();
        p.display();
        r.display();
    }
}
