class Student {
    int rollNo = 101;
    String name = "Arun";
}

class Marks extends Student {
    int m1 = 90, m2 = 85, m3 = 80, m4 = 95, m5 = 90;
}

class Result extends Marks {
    void display() {
        int total = m1 + m2 + m3 + m4 + m5;
        double avg = total / 5.0;

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if (avg >= 90)
            System.out.println("Grade: A");
        else if (avg >= 80)
            System.out.println("Grade: B");
        else if (avg >= 70)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
    }
}

class StudentResult {
    public static void main(String[] args) {
        Result r = new Result();
        r.display();
    }
}
