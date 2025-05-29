import java.util.*;

class Person {
    String name, gender, address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    String company, qualification;
    double salary;

    Employee(String name, String gender, String address, int age,
             int empId, String company, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.company = company;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teachers extends Employee {
    String subject, department;
    int teacherId;

    Teachers(String name, String gender, String address, int age,
            int empId, String company, String qualification, double salary,
            String subject, String department, int teacherId) {

        super(name, gender, address, age, empId, company, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    void display() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Emp ID: " + empId);
        System.out.println("Company: " + company);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teachers[] teachers = new Teachers[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Emp ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Company: ");
            String company = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Teacher ID: ");
            int teacherId = sc.nextInt();
            sc.nextLine();

            teachers[i] = new Teachers(name, gender, address, age, empId, company, qualification, salary, subject, department, teacherId);
        }

        for (Teachers t : teachers) {
            t.display();
        }
    }
}