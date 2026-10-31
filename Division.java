import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b != 0) {
            System.out.println("Division = " + (a / (double)b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
