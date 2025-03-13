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
        Cpu c = new Cpu(40000);
        Cpu.Processor p = c.new Processor(4, "Intel");
        Cpu.Ram r = new Cpu.Ram("8GB", "Crucial");

        c.display();
        p.display();
        r.display();
    }
}
