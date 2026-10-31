class Staff {
    int id = 102;
    String name = "Rahul";
    double salary = 25000;
}

class PermanentStaff extends Staff {
    void display() {
        double hra = salary * 0.20;
        double da = salary * 0.10;
        double gross = salary + hra + da;

        System.out.println("Staff ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
    }
}

class StaffDemo {
    public static void main(String[] args) {
        PermanentStaff s = new PermanentStaff();
        s.display();
    }
}
