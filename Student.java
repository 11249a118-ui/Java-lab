class Student {
    String name;
    int rollNo;
    int marks;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }

    String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 80)
            return "B";
        else if (marks >= 70)
            return "C";
        else if (marks >= 60)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Arun";
        s1.rollNo = 101;
        s1.marks = 95;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.rollNo = 102;
        s2.marks = 78;

        s1.display();
        s2.display();
    }
}
