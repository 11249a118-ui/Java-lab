class Employee {
    int id = 101;
    String name = "Arun";
    double salary = 30000;
}
class PermanentEmployee extends Employee {
    void display() {
        double hra = salary * 0.20;
        double da = salary * 0.10;

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + (salary + hra + da));
    }
}

class Main {
    public static void main(String[] args) {
        PermanentEmployee e = new PermanentEmployee();
        e.display();
    }
}
